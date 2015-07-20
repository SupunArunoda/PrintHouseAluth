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
import java.util.concurrent.locks.ReentrantReadWriteLock;
import model.Employee;
import printhouseserver.connection.DBConnection;

/**
 *
 * @author Buddhi
 */
public class EmployeeDBAccess {

    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

   
    public int addEmployee(Employee employee) throws SQLException {
        try {
            reentrantReadWriteLock.writeLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "INSERT INTO customer VALUES (" + Integer.toString(employee.getEmployeeId()) + ",'" + employee.getName() + "','"
                    + employee.getNic() + "'," + Double.toString(employee.getBasicSalary()) + ",'" + employee.getTelephone()
                    + "','" + employee.getEMail() + "'," + Integer.toString(employee.getDueDate()) + "," + Double.toString(employee.getTotalAdition())
                    + "," + Double.toString(employee.getTotalDeduction()) + ");";

            int res = connection.createStatement().executeUpdate(sql);
            return res;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public ArrayList<Employee> getEmployeesFullDetailsList() throws SQLException {
        try {
            reentrantReadWriteLock.readLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "SELECT * FROM employee;";

            ResultSet resultSet = connection.createStatement().executeQuery(sql);
            ArrayList<Employee> employees = new ArrayList<>();
            while (resultSet.next()) {

                int id = resultSet.getInt("Employee_Id");
                String name = resultSet.getString("Name");
                String nic = resultSet.getString("NIC");
                Double basicSalary = resultSet.getDouble("Basic_Salary");
                String telephone = resultSet.getString("Telephone");
                String email = resultSet.getString("E-Mail");
                String address = resultSet.getString("Address");
                int dueDate = resultSet.getInt("Due_Date");
                double totAdd = resultSet.getDouble("totalAdition");
                double totDed = resultSet.getDouble("totalDeduction");

                Employee employee = new Employee(id, name, nic, basicSalary, telephone, email, address, dueDate, totAdd, totDed);
                employees.add(employee);
            }
            return employees;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

}
