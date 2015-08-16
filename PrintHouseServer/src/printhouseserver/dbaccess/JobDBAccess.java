/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseserver.dbaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import model.Job;
import printhouseserver.connection.DBConnection;
import java.util.Date;

public class JobDBAccess {
    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    public int addJob(Job job) throws SQLException {
        try {
            reentrantReadWriteLock.writeLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "INSERT INTO job VALUES ('" + job.getJobId() + "','" + job.getDescription() + "','"
                    + job.getExpecteddeliverdate() + "','" + job.getReceivedDate() + "','" + job.getState()
                    + "','" + job.getStarttime() + "','"+ job.getDelivertime() +"','"+job.getEmployeeid()+"','"
                    +job.getCustomerOrderId()+"','"+job.getEmployeeworkingtime()+"','"+job.getEmployeedescription()+"');";

            int res = connection.createStatement().executeUpdate(sql);
            return res;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
     public int updateState(Job job,String state) throws SQLException {
        try {
            reentrantReadWriteLock.writeLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "UPDATE job SET state=? WHERE jobId="+job.getJobId();
            System.out.println("Job id in update state"+job.getJobId());
            PreparedStatement pst=connection.prepareStatement(sql);
               pst.setString(1, state);
             int rs=  pst.executeUpdate();
             return rs;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
      public int updatestartTime(Job job) throws SQLException {
        try {
            reentrantReadWriteLock.writeLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "UPDATE job SET startTime=? WHERE jobId="+job.getJobId();
            PreparedStatement pst=connection.prepareStatement(sql);
               pst.setTimestamp(1, new java.sql.Timestamp(new Date().getTime()));
             int rs=  pst.executeUpdate();
             return rs;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
      public int updatedeliverTime(Job job) throws SQLException {
        try {
            reentrantReadWriteLock.writeLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "UPDATE job SET deliverTime=? WHERE jobId="+job.getJobId();
            PreparedStatement pst=connection.prepareStatement(sql);
               pst.setTimestamp(1, new Timestamp(new Date().getTime()));
             int rs=  pst.executeUpdate();
             return rs;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
      public int updateemployeeid(Job job) throws SQLException {
        try {
            reentrantReadWriteLock.writeLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "UPDATE job SET employeeId=? WHERE jobId="+job.getJobId();
            PreparedStatement pst=connection.prepareStatement(sql);
               pst.setInt(1, job.getEmployeeid());
             int rs=  pst.executeUpdate();
             return rs;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
      public int updateemployeeworkingTime(Job job) throws SQLException {
        try {
            reentrantReadWriteLock.writeLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "UPDATE job SET employeeworkingTime=? WHERE jobId="+job.getJobId();
            PreparedStatement pst=connection.prepareStatement(sql);
               pst.setString(1, job.getEmployeeworkingtime());
             int rs=  pst.executeUpdate();
             return rs;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
      public int updateemployeeDescription(Job job) throws SQLException {
        try {
            reentrantReadWriteLock.writeLock().lock();
            Connection connection = DBConnection.getConnection();
            
            
            String sql = "UPDATE job SET employeeDescription=? WHERE jobId="+job.getJobId();
            PreparedStatement pst=connection.prepareStatement(sql);
               pst.setString(1, job.getEmployeedescription());
             int rs=  pst.executeUpdate();
             return rs;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
       public ArrayList<Job> getJobFullDetailsList() throws SQLException {
        try {
            reentrantReadWriteLock.readLock().lock();

            Connection connection = DBConnection.getConnection();
            String sql = "SELECT * FROM job";
            ResultSet resultSet = connection.createStatement().executeQuery(sql);
            ArrayList<Job> jobs = new ArrayList<>();
            while (resultSet.next()) {
                jobs.add(new Job(Integer.parseInt(resultSet.getString("jobId")), resultSet.getString("description"), String.valueOf(resultSet.getTimestamp("expectedDeliverDate")), String.valueOf(resultSet.getTimestamp("receivedDate")), resultSet.getString("state"), String.valueOf(resultSet.getTimestamp("startTime")), String.valueOf(resultSet.getTimestamp("deliverTime")), Integer.parseInt(resultSet.getString("employeeId")), Integer.parseInt(resultSet.getString("customerOrderId")),resultSet.getString("employeeworkingTime"), resultSet.getString("employeeDescription")));
                System.out.println("In result set "+resultSet.getString("jobId"));
            }
            return jobs;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }
}
