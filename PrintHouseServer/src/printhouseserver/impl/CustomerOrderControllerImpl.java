/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.impl;

import controller.CustomerOrderController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import model.CustomerOrder;
import model.CustomerOrderDetail;
import printhouseserver.dbaccess.CustomerOrderDBAccess;

/**
 *
 * @author Buddhi
 */
public class CustomerOrderControllerImpl extends UnicastRemoteObject implements CustomerOrderController {

    private CustomerOrderDBAccess customerOrderDBAccess;

    public CustomerOrderControllerImpl() throws RemoteException {
        super();
        customerOrderDBAccess = new CustomerOrderDBAccess();
    }

    @Override
    public int addNewCustomerOrder(CustomerOrder customerOrder, ArrayList<CustomerOrderDetail> customerOrderDetails) throws RemoteException, SQLException {
        return customerOrderDBAccess.addNewCustomerOrder(customerOrder, customerOrderDetails);
    }

    @Override
    public ArrayList<CustomerOrder> getCustomerOrderDetailsList() throws RemoteException, SQLException {
        return customerOrderDBAccess.getCustomerOrderDetailsList();
    }

}
