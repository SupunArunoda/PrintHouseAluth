/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.impl;

import controller.JobController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Job;
import printhouseserver.dbaccess.JobDBAccess;

/**
 *
 * @author Buddhi
 */
public class JobControllerImpl extends UnicastRemoteObject implements JobController {

    JobDBAccess jobDBAccess;
    public JobControllerImpl() throws RemoteException {
        super();
        jobDBAccess=new JobDBAccess();
    }

    @Override
    public int addJob(Job job) throws RemoteException, SQLException {
        int rs=jobDBAccess.addJob(job);
        return rs;
    }

    @Override
    public ArrayList<Job> getJobFullDetailsList() throws RemoteException, SQLException {
        ArrayList<Job> jobs=jobDBAccess.getJobFullDetailsList();
        return jobs;
    }

    @Override
    public int updateState(Job job, String state) throws RemoteException, SQLException {
        int rs=jobDBAccess.updateState(job, state);
        return rs;
    }

    @Override
    public int updatestartTime(Job job) throws RemoteException, SQLException {
        int rs=jobDBAccess.updatestartTime(job);
        return rs;
    }

    @Override
    public int updatedeliverTime(Job job) throws RemoteException, SQLException {
        int rs=jobDBAccess.updatedeliverTime(job);
        return rs;
    }

    @Override
    public int updateemployeeid(Job job) throws RemoteException, SQLException {
        int rs=jobDBAccess.updateemployeeid(job);
        return rs;
    }

    @Override
    public int updateemployeeworkingTime(Job job) throws RemoteException, SQLException {
        int rs=jobDBAccess.updateemployeeworkingTime(job);
        return rs;
    }

    @Override
    public int updateemployeeDescription(Job job) throws RemoteException, SQLException {
        int rs=jobDBAccess.updateemployeeDescription(job);
        return rs;
    }

    
}
