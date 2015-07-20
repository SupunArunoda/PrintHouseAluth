/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package printhouseserver.impl;

import controller.AttendanceController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import model.Attendance;
import printhouseserver.dbaccess.AttendanceBDAccess;

/**
 *
 * @author sranga
 */


public class AttendanceControllerImpl extends UnicastRemoteObject implements AttendanceController{

    private final AttendanceBDAccess attendanceBDAccess;
    private  Attendance attendance;
    private ArrayList<Attendance> attendances;

    public AttendanceControllerImpl() throws RemoteException {
        super();
        attendanceBDAccess = new AttendanceBDAccess();
    }
    
    
    @Override
    public ArrayList<Attendance> getAttendanceFullDetailslist() {
        attendances = attendanceBDAccess.getAttendance();
        return  attendances;
    }

    @Override
    public int addAttendance(Attendance attendance) {
        return attendanceBDAccess.addAttendance(attendance);
    }
    
}
