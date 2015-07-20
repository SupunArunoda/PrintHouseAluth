/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;


/**
 *
 * @author sranga
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer employeeId;
    private String name;
    private String nic;
    private double basicSalary;
    private String telephone;
    private String eMail;
    private String address;
    private int dueDate;
    private double totalAdition;
    private double totalDeduction;

    public Employee() {
    }

    public Employee(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(Integer employeeId, String name, String nic, double basicSalary, String telephone, String eMail, String address, int dueDate, double totalAdition, double totalDeduction) {
        this.employeeId = employeeId;
        this.name = name;
        this.nic = nic;
        this.basicSalary = basicSalary;
        this.telephone = telephone;
        this.eMail = eMail;
        this.address = address;
        this.dueDate = dueDate;
        this.totalAdition = totalAdition;
        this.totalDeduction = totalDeduction;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public double getTotalAdition() {
        return totalAdition;
    }

    public void setTotalAdition(double totalAdition) {
        this.totalAdition = totalAdition;
    }

    public double getTotalDeduction() {
        return totalDeduction;
    }

    public void setTotalDeduction(double totalDeduction) {
        this.totalDeduction = totalDeduction;
    }
    
}
