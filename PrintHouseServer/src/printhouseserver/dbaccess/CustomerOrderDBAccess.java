/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.dbaccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import model.CustomerOrder;
import model.CustomerOrderDetail;
import printhouseserver.connection.DBConnection;

/**
 *
 * @author Buddhi
 */
public class CustomerOrderDBAccess {

    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public int addNewCustomerOrder(CustomerOrder customerOrder, ArrayList<CustomerOrderDetail> customerOrderDetails) throws SQLException {
        try {
            reentrantReadWriteLock.writeLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql1 = "INSERT INTO customer_order VALUES (DEFAULT, '" + customerOrder.getDescription() + "','"
                    + customerOrder.getDate() + "','" + customerOrder.getDueDate() + "'," + customerOrder.getCustomerId()
                    + ",'" + customerOrder.getState() + "');";

            int res1 = connection.createStatement().executeUpdate(sql1);

            if (res1 == 1) {
                for (CustomerOrderDetail customerOrderDetail : customerOrderDetails) {
                    String sql2 = "INSERT INTO customer_order_detail VALUES (" + customerOrderDetail.getOrderId() + ", '"
                            + customerOrderDetail.getDescription() + "', " + customerOrderDetail.getQuantity()
                            + ", " + customerOrderDetail.getPrice() + ", " + customerOrderDetail.getDiscount() + ");";

                    int res2 = connection.createStatement().executeUpdate(sql2);
                    if (res2 == 0) {
                        break;
                    }
                }
                return 1;
            } else {
                return 0;
            }

        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public ArrayList<CustomerOrder> getCustomerOrderDetailsList() throws SQLException {
        try {
            reentrantReadWriteLock.readLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "SELECT * FROM customer_order WHERE state='required'";

            ResultSet resultSet = connection.createStatement().executeQuery(sql);
            ArrayList<CustomerOrder> orders = new ArrayList<>();
            while (resultSet.next()) {
                orders.add(new CustomerOrder(resultSet.getInt("customer_order_id"), resultSet.getInt("customer_id"), resultSet.getString("description"), resultSet.getString("date"), resultSet.getString("due_date"), resultSet.getString("state")));
            }

            return orders;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

}
