/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author Buddhi
 */
public interface CustomerController extends Remote {

    public int addCustomer(Customer customer) throws RemoteException, SQLException;

    public ArrayList<Customer> getCustomersFullDetailsList() throws RemoteException, SQLException;

    public Customer getCustomerDetailsById(int id) throws RemoteException, SQLException;

    public ArrayList<Customer> getRecentCustomersList() throws RemoteException, SQLException;
    
    public Customer getCustomerassignedToJob(String jobId) throws RemoteException, SQLException;

}
