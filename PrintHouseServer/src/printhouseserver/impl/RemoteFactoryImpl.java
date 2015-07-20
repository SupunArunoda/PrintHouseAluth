/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.impl;

import controller.AttendanceController;
import controller.CustomerController;
import controller.CustomerOrderController;
import controller.EmployeeController;
import controller.ItemController;
import controller.JobController;
import controller.SalaryChangeController;
import controller.SupplierController;
import controller.SupplyOrderController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import remotefactory.RemoteFactory;

/**
 *
 * @author Buddhi
 */
public class RemoteFactoryImpl extends UnicastRemoteObject implements RemoteFactory {

    public RemoteFactoryImpl() throws RemoteException {
        super();
    }

    @Override
    public CustomerController getCustomerController() throws RemoteException {
        return new CustomerControllerImpl();
    }
    
    @Override
    public CustomerOrderController getCustomerOrderController() throws RemoteException {
        return new CustomerOrderControllerImpl();
    }
    

    @Override
    public ItemController getItemController() throws RemoteException {
        return new ItemControllerImpl();
    }

    @Override
    public JobController getJobController() throws RemoteException {
        return new JobControllerImpl();
    }

    @Override
    public EmployeeController getEmployeeController() throws RemoteException {
        return new EmployeeControllerImpl();
    }

    @Override
    public SalaryChangeController getSalaryChangeController() throws RemoteException {
        return new SalaryChangeControllerImpl();
    }

    @Override
    public AttendanceController getAttendanceController() throws RemoteException {
        return new AttendanceControllerImpl();
    }

    @Override
    public SupplierController getSupplierController() throws RemoteException {
        return  new SupplierControllerImpl();
    }

    @Override
    public SupplyOrderController getSupplyOrderController() throws RemoteException {
        return new SupplyOrderControllerImpl();
    }
}
