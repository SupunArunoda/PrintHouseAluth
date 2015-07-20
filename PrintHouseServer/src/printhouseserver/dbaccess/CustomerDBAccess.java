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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import printhouseserver.connection.DBConnection;

/**
 *
 * @author Buddhi
 */
public class CustomerDBAccess {

    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public int addCustomer(Customer customer) throws SQLException {
        try {
            reentrantReadWriteLock.writeLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "INSERT INTO customer VALUES (DEFAULT, '" + customer.getName() + "','"
                    + customer.getNic() + "','" + customer.getTelephone() + "','" + customer.getEmail()
                    + "','" + customer.getAddress() + "');";

            int res = connection.createStatement().executeUpdate(sql);
            return res;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public ArrayList<Customer> getCustomersFullDetailsList() throws SQLException {
        try {
            reentrantReadWriteLock.readLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "SELECT * FROM customer";

            ResultSet resultSet = connection.createStatement().executeQuery(sql);
            ArrayList<Customer> customers = new ArrayList<>();
            while (resultSet.next()) {
                customers.add(new Customer(resultSet.getInt("customer_id"), resultSet.getString("name"), resultSet.getString("nic"), resultSet.getString("telephone"), resultSet.getString("email"), resultSet.getString("address")));
            }
            return customers;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public ArrayList<Customer> getRecentCustomersList() throws SQLException {
        try {
            reentrantReadWriteLock.readLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "SELECT * FROM customer ORDER BY name";

            ResultSet resultSet = connection.createStatement().executeQuery(sql);
            ArrayList<Customer> customers = new ArrayList<>();
            while (resultSet.next()) {
                customers.add(new Customer(resultSet.getInt("customer_id"), resultSet.getString("name"), resultSet.getString("nic"), resultSet.getString("telephone"), resultSet.getString("email"), resultSet.getString("address")));
            }
            return customers;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public Customer getCustomerDetailsById(int id) throws SQLException {
        try {
            reentrantReadWriteLock.readLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "SELECT * FROM customer WHERE customer_id = " + id + ";";

            ResultSet resultSet = connection.createStatement().executeQuery(sql);
            if (resultSet.first()) {
                Customer customer = new Customer(resultSet.getInt("customer_id"), resultSet.getString("name"), resultSet.getString("nic"), resultSet.getString("telephone"), resultSet.getString("email"), resultSet.getString("address"));
                return customer;
            }
            return null;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public Customer getUniqueCustomer(String job_id) throws SQLException {
        try {
            reentrantReadWriteLock.readLock().lock();
            Customer customer = null;
            Connection connection = DBConnection.getConnection();
            String sql = "SELECT c.customer_id,c.name,c.nic,c.telephone,c.email,c.address FROM customer c,job j, customer_order co WHERE j.customer_order_id=co.customer_order_id AND co.customer_id=c.customer_id AND job_id =" + job_id;

            ResultSet resultSet = connection.createStatement().executeQuery(sql);

            while (resultSet.next()) {
                customer = new Customer(Integer.parseInt(resultSet.getString("customer_id")), resultSet.getString("name"), resultSet.getString("nic"), resultSet.getString("address"), resultSet.getString("telephone"), resultSet.getString("email"));
            }
            return customer;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

}
