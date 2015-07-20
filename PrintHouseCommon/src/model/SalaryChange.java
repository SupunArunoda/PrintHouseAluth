/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author sranga
 */
public class SalaryChange implements Serializable {

    private Integer salaryChangeId;
    private Date date;
    private String discription;
    private String state;
    private double amount;
    private int employeeId;

    public SalaryChange() {
    }

    public SalaryChange(Integer slaryChangeId) {
        this.salaryChangeId = slaryChangeId;
    }

    public SalaryChange(Integer salaryChangeId, Date date, String discription, String state, double amount, int employeeId) {
        this.salaryChangeId = salaryChangeId;
        this.date = date;
        this.discription = discription;
        this.state = state;
        this.amount = amount;
        this.employeeId = employeeId;
    }

    public SalaryChange(String discription, String state, double amount, int employeeId) {
        this.discription = discription;
        this.state = state;
        this.amount = amount;
        this.employeeId = employeeId;
    }
    
    

    public Integer getSalaryChangeId() {
        return salaryChangeId;
    }

    public void setSalaryChangeId(Integer salaryChangeId) {
        this.salaryChangeId = salaryChangeId;
    }

    public Date getDate() {
        
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDiscription() {
            return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
