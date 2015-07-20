/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseclient.connection;

import controller.CustomerController;
import controller.CustomerOrderController;
import controller.EmployeeController;
import controller.ItemController;
import controller.JobController;
import controller.SalaryChangeController;
import controller.SupplierController;
import controller.SupplyOrderController;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import remotefactory.RemoteFactory;

/**
 *
 * @author cmjd
 */
public class ServerConnector {

    private final RemoteFactory remoteFactory;
    private static ServerConnector serverConnector;
    private CustomerController customerController;
    private CustomerOrderController customerOrderController;
    private ItemController itemController;
    private JobController jobController;
    private EmployeeController employeeController;
    private SalaryChangeController salaryChangeController;
    private SupplierController supplierController;
    private SupplyOrderController supplyOrderController;
 
    public ServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
  //    System.setProperty("java.rmi.server.hostname","192.168.100.11");
  //    String lookupString = "rmi://192.168.100.10:1099/PrintHouseServer";
        
        System.setProperty("java.rmi.server.hostname","127.0.0.1");
        String lookupString = "rmi://localhost:1099/PrintHouseServer";
        remoteFactory = (RemoteFactory) Naming.lookup(lookupString);

        
    }

    public static ServerConnector getServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        if (serverConnector == null) {
            serverConnector = new ServerConnector();
        }
        return serverConnector;
    }

    public RemoteFactory getRemoteFactory() {
        return remoteFactory;
    }

    public CustomerController getCustomerController() throws RemoteException {
        if (customerController == null) {
            customerController = remoteFactory.getCustomerController();
        }
        return customerController;
    }
    

    public ItemController getItemController() throws RemoteException {
        if (itemController == null) {
            itemController = remoteFactory.getItemController();
        }
        return itemController;
    }

    public JobController getJobController() throws RemoteException {
        if (jobController == null) {
            jobController = remoteFactory.getJobController();
        }
        return jobController;
    }

    public EmployeeController getEmployeeController() throws RemoteException {
        if (employeeController == null) {
            employeeController = remoteFactory.getEmployeeController();
        }
        return employeeController;
    }
    
    public SalaryChangeController getSalaryChangeControler() throws RemoteException{
        if(salaryChangeController == null){
            salaryChangeController = remoteFactory.getSalaryChangeController();
        }
        return salaryChangeController;
    }
    
    public SupplierController getSupplierController() throws RemoteException {
        if (supplierController == null) {
            supplierController = remoteFactory.getSupplierController();
        }
        return supplierController;
    }
    
    
    public SupplyOrderController getSupplyOrderController() throws RemoteException {
        if (supplyOrderController == null) {
            supplyOrderController = remoteFactory.getSupplyOrderController();
        }
        return supplyOrderController;
    }
    
    
    public CustomerOrderController getCustomerOrderController() throws RemoteException {
        if (customerOrderController == null) {
            customerOrderController = remoteFactory.getCustomerOrderController();
        }
        return customerOrderController;
    }
}
