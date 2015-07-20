/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.impl;

import controller.CustomerController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;
import printhouseserver.dbaccess.CustomerDBAccess;

/**
 *
 * @author Buddhi
 */
public class CustomerControllerImpl extends UnicastRemoteObject implements CustomerController {

    private final CustomerDBAccess customerDBAccess;

    public CustomerControllerImpl() throws RemoteException {
        super();
        customerDBAccess = new CustomerDBAccess();
    }

    @Override
    public int addCustomer(Customer customer) throws RemoteException, SQLException {
        return customerDBAccess.addCustomer(customer);
    }

    @Override
    public ArrayList<Customer> getCustomersFullDetailsList() throws RemoteException, SQLException {
        return customerDBAccess.getCustomersFullDetailsList();
    }

    @Override
    public Customer getCustomerDetailsById(int id) throws RemoteException, SQLException {
        return customerDBAccess.getCustomerDetailsById(id);
    }

    @Override
    public ArrayList<Customer> getRecentCustomersList() throws RemoteException, SQLException {
        return customerDBAccess.getRecentCustomersList();
    }

    @Override
    public Customer getCustomerassignedToJob(String jobId) throws RemoteException, SQLException {
        return customerDBAccess.getUniqueCustomer(jobId);
    }
}
