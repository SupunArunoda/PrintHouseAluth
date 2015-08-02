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
import model.CustomerOrder;
import model.CustomerOrderDetail;
import model.Job;

/**
 *
 * @author Buddhi
 */
public interface CustomerOrderController extends Remote {

    public int addNewCustomerOrder(CustomerOrder customerOrder, ArrayList<CustomerOrderDetail> customerOrderDetails) throws RemoteException, SQLException;

    public ArrayList<CustomerOrder> getCustomerOrderDetailsList() throws RemoteException, SQLException;

}
