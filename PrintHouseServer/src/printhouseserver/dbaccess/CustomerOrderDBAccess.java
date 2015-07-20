/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.dbaccess;

import java.sql.Connection;
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

}
