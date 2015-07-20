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
import model.SalaryChange;

/**
 *
 * @author sranga
 */
public interface SalaryChangeController extends Remote {

    public int addSalaryChange(SalaryChange salaryChange) throws RemoteException, SQLException;

    public ArrayList<SalaryChange> getSalaryChangeFullDetailsList(int employeeID) throws RemoteException, SQLException;
}
