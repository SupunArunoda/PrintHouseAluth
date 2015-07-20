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
import model.Employee;

/**
 *
 * @author sranga
 */
public interface EmployeeController extends Remote{
    
    public int addEmployee(Employee employee) throws RemoteException, SQLException;

    public ArrayList<Employee> getEmployeesFullDetailsList() throws RemoteException, SQLException;
    
}
