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
public class Attendance implements Serializable {
    private Integer attendanceId;
    private int employeeId;
    private Date date;
    private Date arrivalTime;
    private Date departureTime;

    public Attendance() {
    }

    public Attendance(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Attendance(Integer attendanceId, int employeeId, Date date, Date arrivalTime, Date departureTime) {
        this.attendanceId = attendanceId;
        this.employeeId = employeeId;
        this.date = date;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }    
}
