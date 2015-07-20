/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.dbaccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import model.SalaryChange;
import printhouseserver.connection.DBConnection;

/**
 *
 * @author sranga
 */
public class SalaryChangeDBAccess {

    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public int addSalaryChange(SalaryChange salaryChange) throws SQLException {
        try {
            reentrantReadWriteLock.writeLock().lock();
            Connection connection = DBConnection.getConnection();
            
            String sql = "INSERT INTO customer (discription,state,amount,employeeId) VALUES ("
                    + salaryChange.getDiscription() + "','" + salaryChange.getState() + "'," + Double.toString(salaryChange.getAmount()) + ","
                    + Integer.toString(salaryChange.getEmployeeId()) + ");";
            int res = connection.createStatement().executeUpdate(sql);
            return res;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public ArrayList<SalaryChange> getEmployeeSalaryChangeFullDetailsList( int emplId ) throws SQLException {
        try {
            reentrantReadWriteLock.writeLock().lock();
            Connection connection = DBConnection.getConnection();
            String sql = "SELECT * FROM salarychange where employeeId ="+emplId;
            ResultSet resultSet = connection.createStatement().executeQuery(sql);
            ArrayList<SalaryChange> salaryChanges = new ArrayList<>();
            while (resultSet.next()) {
                int salayrChangeId = resultSet.getInt("salaryChangeId");
                Date date = resultSet.getDate("date");
                String discription = resultSet.getString("discription");
                String state = resultSet.getString("state");
                Double amount = resultSet.getDouble("amount");
                //int employeeId = resultSet.getInt("employeeId");
                SalaryChange salaryChange = new SalaryChange(salayrChangeId, date, discription, state, amount, 0);
                salaryChanges.add(salaryChange);
            }
            return salaryChanges;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();

        }

    }

}
