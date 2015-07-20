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
import model.Job;

/**
 *
 * @author Buddhi
 */
public interface JobController extends Remote {

    public int addJob(Job job) throws RemoteException, SQLException;

    public ArrayList<Job> getJobFullDetailsList() throws RemoteException, SQLException;

    public int updateState(Job job, String state) throws RemoteException, SQLException;

    public int updatestartTime(Job job) throws RemoteException, SQLException;

    public int updatedeliverTime(Job job) throws RemoteException, SQLException;

    public int updateemployeeid(Job job) throws RemoteException, SQLException;

    public int updateemployeeworkingTime(Job job) throws RemoteException, SQLException;

    public int updateemployeeDescription(Job job) throws RemoteException, SQLException;
}
