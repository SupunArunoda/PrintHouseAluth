/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseclient.view.employerviews;

import controller.CustomerController;
import controller.JobController;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Job;
import printhouseclient.connection.ServerConnector;


/**
 *
 * @author Supun
 */
public class Complete extends javax.swing.JInternalFrame {

    ServerConnector serverConnector;
    JobController jobController;
    CustomerController customerController;
    ArrayList<Job> jobs;
    /**
     * Creates new form Complete
     */
    public Complete() {
        initComponents();
        try {
            serverConnector = ServerConnector.getServerConnector();
            jobController = serverConnector.getJobController();
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            System.out.println(ex.getMessage());
        }
        ArrayList<Job> arr = new ArrayList<>();
        try {
            ArrayList<Job> jobList = jobController.getJobFullDetailsList();

            for (Job job : jobList) {
                if (job.getState().equals("COMPLETE")) {
                    arr.add(job);
                }
            }
        } catch (RemoteException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        DefaultTableModel model = (DefaultTableModel) completetable.getModel();
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getJobId());
            Object[] objects = {arr.get(i).getJobId(), arr.get(i).getCustomerOrderId(), arr.get(i).getStarttime(), arr.get(i).getDelivertime(),arr.get(i).getEmployeeworkingtime(),arr.get(i).getEmployeedescription()};
            model.insertRow(completetable.getRowCount(), objects);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        completetable = new javax.swing.JTable();

        completetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Customer Order ID", "Accepted Date", "Delivered Date", "Working Hours", "My Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        completetable.getTableHeader().setReorderingAllowed(false);
        completetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                completetableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(completetable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void completetableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completetableMousePressed
      
    }//GEN-LAST:event_completetableMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable completetable;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
