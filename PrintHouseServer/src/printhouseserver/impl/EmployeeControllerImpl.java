/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.impl;

import controller.EmployeeController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Employee;
import printhouseserver.dbaccess.EmployeeDBAccess;

/**
 *
 * @author Buddhi
 */
public class EmployeeControllerImpl extends UnicastRemoteObject implements EmployeeController {

    private final EmployeeDBAccess employeeDBAccess;

    public EmployeeControllerImpl() throws RemoteException {
        super();
        employeeDBAccess = new EmployeeDBAccess();
    }

    @Override
    public int addEmployee(Employee employee) throws RemoteException, SQLException {
        return employeeDBAccess.addEmployee(employee);
    }

    @Override
    public ArrayList<Employee> getEmployeesFullDetailsList() throws RemoteException, SQLException {
        return employeeDBAccess.getEmployeesFullDetailsList();
    }
}
