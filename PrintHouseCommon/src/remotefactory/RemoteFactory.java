/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotefactory;

import controller.AttendanceController;
import controller.CustomerController;
import controller.CustomerOrderController;
import controller.EmployeeController;
import controller.ItemController;
import controller.JobController;
import controller.SalaryChangeController;
import controller.SupplierController;
import controller.SupplyOrderController;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Buddhi
 */
public interface RemoteFactory extends Remote {

    
    // Buddhi  
    public CustomerController getCustomerController() throws RemoteException;

    public CustomerOrderController getCustomerOrderController() throws RemoteException;
    
    public ItemController getItemController() throws RemoteException;

    
    // Supun
    public JobController getJobController() throws RemoteException;
    
    public EmployeeController getEmployeeController() throws RemoteException;
    
    
    //Saranga
    
    public SalaryChangeController getSalaryChangeController()throws RemoteException ;
    
    public AttendanceController getAttendanceController() throws RemoteException;
    
    
    // Sugeesh
    public SupplierController getSupplierController()throws RemoteException ;
    
    public SupplyOrderController getSupplyOrderController() throws RemoteException ;
    
}
