package printhouseclient.view.employerviews;

import controller.CustomerController;
import controller.JobController;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.Job;
import printhouseclient.connection.ServerConnector;
import printhouseclient.extra.DateConfigure;
import static printhouseclient.view.employerviews.JobsToBeDone.awaitingTable;

public class MainView extends javax.swing.JFrame {

    ServerConnector serverConnector;
    JobController jobController;
    CustomerController customerController;
    private JobsToBeDone jobsToBeDone;

    public MainView() {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setLocationRelativeTo(null);
        setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        awaitingJobsButton = new javax.swing.JButton();
        submittobeButton = new javax.swing.JButton();
        completedJobsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Notification Panel"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jDesktopPane2.setForeground(java.awt.Color.black);

        awaitingJobsButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        awaitingJobsButton.setText("Awaiting Jobs");
        awaitingJobsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awaitingJobsButtonActionPerformed(evt);
            }
        });

        submittobeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submittobeButton.setText("To be Submitted");
        submittobeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submittobeButtonActionPerformed(evt);
            }
        });

        completedJobsButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        completedJobsButton.setText("Completed Jobs");
        completedJobsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completedJobsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(awaitingJobsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submittobeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(completedJobsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(406, 406, 406))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(awaitingJobsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submittobeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completedJobsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static void setDesignSubmission(Job job, Customer customer) {

        SubmitJob submitJob = new SubmitJob();
        jDesktopPane2.add(submitJob);
        BasicInternalFrameUI ui = (BasicInternalFrameUI) submitJob.getUI();
        Component north = ui.getNorthPane();
        north.setPreferredSize(new Dimension(0, 0));
        north.validate();
        submitJob.setMaximumSize(null);
        submitJob.getJobIDText().setText(job.getJobId());
        submitJob.getCustomerOrderIDText().setText(job.getCustomerOrderId());
        submitJob.getAcceptedDateText().setText(job.getStarttime().substring(0, 11));
        submitJob.getReceivedTimeText().setText(job.getStarttime().substring(11, 16));
        submitJob.getCustomerOrderIDText().setText(job.getCustomerOrderId());

        submitJob.setMaximumSize(null);
        submitJob.getCustomerIDText().setText(Integer.toBinaryString(customer.getId()));
        submitJob.getCustomerNameText().setText(customer.getName());
        submitJob.setVisible(true);

    }

    static void setDesignTable(ArrayList<Job> arr) {
        AcceptNewJobFrame acceptNewJobFrame = new AcceptNewJobFrame(arr);
        jDesktopPane2.add(acceptNewJobFrame);
        BasicInternalFrameUI ui = (BasicInternalFrameUI) acceptNewJobFrame.getUI();
        Component north = ui.getNorthPane();
        north.setPreferredSize(new Dimension(0, 0));
        north.validate();
        acceptNewJobFrame.setMaximumSize(null);
        acceptNewJobFrame.setVisible(true);
    }

    private void awaitingJobsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_awaitingJobsButtonActionPerformed

        try {
            serverConnector = ServerConnector.getServerConnector();
            jobController = serverConnector.getJobController();
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            System.out.println("Sam " + ex.getMessage());
        }

        try {
            ArrayList<Job> jobList = jobController.getJobFullDetailsList();
            ArrayList<Job> newjobList = new ArrayList<>();
            for (Job job : jobList) {
                if (job.getState().equals("NOT ASSIGNED")) {
                    newjobList.add(job);
                }
            }
            setDesignTable(newjobList);
        } catch (RemoteException | SQLException ex) {
            System.out.println("sam  " + ex.getMessage());
        }
    }//GEN-LAST:event_awaitingJobsButtonActionPerformed

    private void submittobeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submittobeButtonActionPerformed

        JobSubmission jobSubmission = new JobSubmission(this, rootPaneCheckingEnabled);
        jobSubmission.setLocation(300, 130);
        jobSubmission.setVisible(true);
    }//GEN-LAST:event_submittobeButtonActionPerformed

    private void completedJobsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completedJobsButtonActionPerformed

        CompletedJobs completedJobs = new CompletedJobs(this, rootPaneCheckingEnabled);
        completedJobs.setLocation(300, 130);
        completedJobs.setConfigure();
        completedJobs.setVisible(true);

    }//GEN-LAST:event_completedJobsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton awaitingJobsButton;
    private javax.swing.JButton completedJobsButton;
    private static javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton submittobeButton;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jDesktopPane2
     */
    public javax.swing.JDesktopPane getjDesktopPane2() {
        return jDesktopPane2;
    }

    /**
     * @param jDesktopPane2 the jDesktopPane2 to set
     */
    public void setjDesktopPane2(javax.swing.JDesktopPane jDesktopPane2) {
        this.jDesktopPane2 = jDesktopPane2;
    }
}
