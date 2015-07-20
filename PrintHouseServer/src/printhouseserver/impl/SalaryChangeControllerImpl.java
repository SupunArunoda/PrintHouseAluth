/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.impl;

import controller.SalaryChangeController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import model.SalaryChange;
import printhouseserver.dbaccess.SalaryChangeDBAccess;

/**
 *
 * @author sranga
 */
public class SalaryChangeControllerImpl extends UnicastRemoteObject implements SalaryChangeController {

    private final SalaryChangeDBAccess salaryChangeDBAccess;

    public SalaryChangeControllerImpl() throws RemoteException {
        super();
        salaryChangeDBAccess = new SalaryChangeDBAccess();
    }
    
    
    @Override
    public int addSalaryChange(SalaryChange salaryChange) throws RemoteException, SQLException {
        return salaryChangeDBAccess.addSalaryChange(salaryChange);
    }

    @Override
    public ArrayList<SalaryChange> getSalaryChangeFullDetailsList(int employeeId) throws RemoteException, SQLException {
        return salaryChangeDBAccess.getEmployeeSalaryChangeFullDetailsList(employeeId);
    }
}
