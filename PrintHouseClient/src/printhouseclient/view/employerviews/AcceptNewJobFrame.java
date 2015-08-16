package printhouseclient.view.employerviews;

import controller.CustomerController;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.*;
import javax.swing.*;
import printhouseclient.connection.ServerConnector;
import controller.JobController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.Job;


public class AcceptNewJobFrame extends javax.swing.JInternalFrame {

    ServerConnector serverConnector;
    JobController jobController;
    CustomerController customerController;
    ArrayList<Job> jobs;

    public AcceptNewJobFrame() {

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
                if (job.getState().equals("NOT ASSIGNED")) {
                    arr.add(job);
                }
            }
        } catch (RemoteException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        DefaultTableModel model = (DefaultTableModel) awaitingTable.getModel();
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getJobId());
            Object[] objects = {arr.get(i).getJobId(), arr.get(i).getCustomerOrderId(), arr.get(i).getExpecteddeliverdate(), arr.get(i).getReceivedDate()};
            model.insertRow(awaitingTable.getRowCount(), objects);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jobIdLabel = new javax.swing.JLabel();
        customerOrderIDLabel = new javax.swing.JLabel();
        customerOrderIDText = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        jobIDText = new javax.swing.JTextField();
        jobreceivedDateLable = new javax.swing.JLabel();
        jobSubmissionDateLable = new javax.swing.JLabel();
        userRemainTimeLable = new javax.swing.JLabel();
        receivedDateText = new javax.swing.JTextField();
        submissionDateText = new javax.swing.JTextField();
        receivedTimeText = new javax.swing.JTextField();
        submissionTimeText = new javax.swing.JTextField();
        remainingTimeLable = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jobdescriptionArea = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        customerIDText = new javax.swing.JTextField();
        customerNameLable = new javax.swing.JLabel();
        customerNameText = new javax.swing.JTextField();
        customerIDLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        awaitingTable = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setMinimumSize(new java.awt.Dimension(38, 33));
        setPreferredSize(new java.awt.Dimension(1059, 613));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Job Details"));

        jobIdLabel.setText("Job ID");

        customerOrderIDLabel.setText("Customer Order ID");

        customerOrderIDText.setEditable(false);

        descriptionLabel.setText("Description");

        jobIDText.setEditable(false);

        jobreceivedDateLable.setText("Received Date & Time");

        jobSubmissionDateLable.setText("Date & Time to Submission");

        userRemainTimeLable.setText("Remaining Time");

        receivedDateText.setEditable(false);

        submissionDateText.setEditable(false);

        receivedTimeText.setEditable(false);

        submissionTimeText.setEditable(false);

        remainingTimeLable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        remainingTimeLable.setForeground(new java.awt.Color(0, 0, 204));

        jobdescriptionArea.setEditable(false);
        jobdescriptionArea.setColumns(20);
        jobdescriptionArea.setRows(5);
        jScrollPane2.setViewportView(jobdescriptionArea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(customerOrderIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(customerOrderIDText))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jobIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jobIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(125, 125, 125)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userRemainTimeLable)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jobreceivedDateLable)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(receivedDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(receivedTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jobSubmissionDateLable)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(remainingTimeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(submissionDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(submissionTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobreceivedDateLable)
                    .addComponent(receivedDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receivedTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerOrderIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerOrderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobSubmissionDateLable)
                    .addComponent(submissionDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submissionTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userRemainTimeLable)
                    .addComponent(remainingTimeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Details"));

        customerIDText.setEditable(false);
        customerIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDTextActionPerformed(evt);
            }
        });

        customerNameLable.setText("Name");

        customerNameText.setEditable(false);

        customerIDLabel1.setText("ID");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerIDLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(customerNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerIDLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Details"));

        awaitingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Customer Order ID", "Expected Deliver Date", "Received Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        awaitingTable.getTableHeader().setReorderingAllowed(false);
        awaitingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                awaitingTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(awaitingTable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDTextActionPerformed

    private void awaitingTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_awaitingTableMousePressed
        String customerOrderId = null, customerId = null;
        int noofclicks;
        String selectedJobID;
        int jobId;
        noofclicks = evt.getClickCount();
        if (noofclicks == 2) {

            selectedJobID = String.valueOf(awaitingTable.getModel().getValueAt(awaitingTable.getSelectedRow(), 0));
            jobId = Integer.parseInt(selectedJobID);
            System.out.println(jobId);
            try {
                serverConnector = ServerConnector.getServerConnector();
                jobController = serverConnector.getJobController();
                customerController = serverConnector.getCustomerController();
            } catch (RemoteException | NotBoundException | MalformedURLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                jobs = jobController.getJobFullDetailsList();
                for (Job job : jobs) {
                    if (jobId == job.getJobId()) {
                        System.out.println(selectedJobID);
                        job = new Job(job.getJobId(), job.getDescription(), job.getExpecteddeliverdate(), job.getReceivedDate(), job.getState(), job.getStarttime(), job.getDelivertime(), job.getEmployeeid(), job.getCustomerOrderId(), job.getEmployeeworkingtime(), job.getEmployeedescription());
                        Customer custs = customerController.getCustomerassignedToJob(selectedJobID);
                        setDesign(job, custs);
                    }
                }
            } catch (RemoteException ex) {
                System.out.println(ex.getMessage());
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        noofclicks = 0;
    }//GEN-LAST:event_awaitingTableMousePressed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int employeeId = 478;//This should be get when user log into the system
        try {
            serverConnector = ServerConnector.getServerConnector();
            jobController = serverConnector.getJobController();
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            for (Job job : jobs) {
                if (job.getState().equals("NOT ASSIGNED") && job.getJobId() == Integer.parseInt(jobIDText.getText())) {
                    job.setEmployeeid(employeeId);
                    jobController.updateState(job, "ASSIGNED");
                    jobController.updatestartTime(job);
                    jobController.updateemployeeid(job);
                    JOptionPane.showMessageDialog(rootPane, "You have successfully accepted the job", "Confirmation", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        } catch (RemoteException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error occured in accepting the job", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAcceptActionPerformed
    void setDesign(Job job, Customer cus) {

        jobIDText.setText(String.valueOf(job.getJobId()));
        customerOrderIDText.setText(String.valueOf(job.getCustomerOrderId()));
        jobdescriptionArea.setText(job.getDescription());
        customerIDText.setText(Integer.toString(cus.getId()));
        customerNameText.setText(cus.getName());
        receivedDateText.setText(job.getReceivedDate().toString().substring(0, 11));
        receivedTimeText.setText(job.getReceivedDate().toString().substring(11, 16));
        submissionDateText.setText(job.getExpecteddeliverdate().toString().substring(0, 11));
        submissionTimeText.setText(job.getExpecteddeliverdate().toString().substring(11, 16));
        remainingTimeLable.setText(printhouseclient.extra.DateConfigure.getDateDifference(job.getExpecteddeliverdate().toString().replaceAll("-", "/")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable awaitingTable;
    private javax.swing.JButton btnAccept;
    private javax.swing.JLabel customerIDLabel1;
    private javax.swing.JTextField customerIDText;
    private javax.swing.JLabel customerNameLable;
    private javax.swing.JTextField customerNameText;
    private javax.swing.JLabel customerOrderIDLabel;
    private javax.swing.JTextField customerOrderIDText;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jobIDText;
    private javax.swing.JLabel jobIdLabel;
    private javax.swing.JLabel jobSubmissionDateLable;
    private javax.swing.JTextArea jobdescriptionArea;
    private javax.swing.JLabel jobreceivedDateLable;
    private javax.swing.JTextField receivedDateText;
    private javax.swing.JTextField receivedTimeText;
    private javax.swing.JLabel remainingTimeLable;
    private javax.swing.JTextField submissionDateText;
    private javax.swing.JTextField submissionTimeText;
    private javax.swing.JLabel userRemainTimeLable;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the asignedEmployeeTable
     */
    /**
     * @param asignedEmployeeTable the asignedEmployeeTable to set
     */
    /**
     * @return the customerIDLabel
     */
    /**
     * @param customerIDLabel the customerIDLabel to set
     */
    /**
     * @return the customerIDText
     */
    public javax.swing.JTextField getCustomerIDText() {
        return customerIDText;
    }

    /**
     * @param customerIDText the customerIDText to set
     */
    public void setCustomerIDText(javax.swing.JTextField customerIDText) {
        this.customerIDText = customerIDText;
    }

    /**
     * @return the customerNameLable
     */
    public javax.swing.JLabel getCustomerNameLable() {
        return customerNameLable;
    }

    /**
     * @param customerNameLable the customerNameLable to set
     */
    public void setCustomerNameLable(javax.swing.JLabel customerNameLable) {
        this.customerNameLable = customerNameLable;
    }

    /**
     * @return the customerNameText
     */
    public javax.swing.JTextField getCustomerNameText() {
        return customerNameText;
    }

    /**
     * @param customerNameText the customerNameText to set
     */
    public void setCustomerNameText(javax.swing.JTextField customerNameText) {
        this.customerNameText = customerNameText;
    }

    /**
     * @return the customerOrderIDLabel
     */
    public javax.swing.JLabel getCustomerOrderIDLabel() {
        return customerOrderIDLabel;
    }

    /**
     * @param customerOrderIDLabel the customerOrderIDLabel to set
     */
    public void setCustomerOrderIDLabel(javax.swing.JLabel customerOrderIDLabel) {
        this.customerOrderIDLabel = customerOrderIDLabel;
    }

    /**
     * @return the customerOrderIDText
     */
    public javax.swing.JTextField getCustomerOrderIDText() {
        return customerOrderIDText;
    }

    /**
     * @param customerOrderIDText the customerOrderIDText to set
     */
    public void setCustomerOrderIDText(javax.swing.JTextField customerOrderIDText) {
        this.customerOrderIDText = customerOrderIDText;
    }

    /**
     * @return the descriptionLabel
     */
    public javax.swing.JLabel getDescriptionLabel() {
        return descriptionLabel;
    }

    /**
     * @param descriptionLabel the descriptionLabel to set
     */
    public void setDescriptionLabel(javax.swing.JLabel descriptionLabel) {
        this.descriptionLabel = descriptionLabel;
    }

    /**
     * @return the jPanel4
     */
    public javax.swing.JPanel getjPanel4() {
        return jPanel4;
    }

    /**
     * @param jPanel4 the jPanel4 to set
     */
    public void setjPanel4(javax.swing.JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    /**
     * @return the jPanel5
     */
    public javax.swing.JPanel getjPanel5() {
        return jPanel5;
    }

    /**
     * @param jPanel5 the jPanel5 to set
     */
    public void setjPanel5(javax.swing.JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    /**
     * @return the jPanel6
     */
    /**
     * @param jPanel6 the jPanel6 to set
     */
    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the jScrollPane3
     */
    /**
     * @param jScrollPane3 the jScrollPane3 to set
     */
    /**
     * @return the jobIDText
     */
    public javax.swing.JTextField getJobIDText() {
        return jobIDText;
    }

    /**
     * @param jobIDText the jobIDText to set
     */
    public void setJobIDText(javax.swing.JTextField jobIDText) {
        this.jobIDText = jobIDText;
    }

    /**
     * @return the jobIdLabel
     */
    public javax.swing.JLabel getJobIdLabel() {
        return jobIdLabel;
    }

    /**
     * @param jobIdLabel the jobIdLabel to set
     */
    public void setJobIdLabel(javax.swing.JLabel jobIdLabel) {
        this.jobIdLabel = jobIdLabel;
    }

    /**
     * @return the jobSubmissionDateLable
     */
    public javax.swing.JLabel getJobSubmissionDateLable() {
        return jobSubmissionDateLable;
    }

    /**
     * @param jobSubmissionDateLable the jobSubmissionDateLable to set
     */
    public void setJobSubmissionDateLable(javax.swing.JLabel jobSubmissionDateLable) {
        this.jobSubmissionDateLable = jobSubmissionDateLable;
    }

    /**
     * @return the jobdescriptionArea
     */
    public javax.swing.JTextArea getJobdescriptionArea() {
        return jobdescriptionArea;
    }

    /**
     * @param jobdescriptionArea the jobdescriptionArea to set
     */
    public void setJobdescriptionArea(javax.swing.JTextArea jobdescriptionArea) {
        this.jobdescriptionArea = jobdescriptionArea;
    }

    /**
     * @return the jobreceivedDateLable
     */
    public javax.swing.JLabel getJobreceivedDateLable() {
        return jobreceivedDateLable;
    }

    /**
     * @param jobreceivedDateLable the jobreceivedDateLable to set
     */
    public void setJobreceivedDateLable(javax.swing.JLabel jobreceivedDateLable) {
        this.jobreceivedDateLable = jobreceivedDateLable;
    }

    /**
     * @return the receivedDateText
     */
    public javax.swing.JTextField getReceivedDateText() {
        return receivedDateText;
    }

    /**
     * @param receivedDateText the receivedDateText to set
     */
    public void setReceivedDateText(javax.swing.JTextField receivedDateText) {
        this.receivedDateText = receivedDateText;
    }

    /**
     * @return the receivedTimeText
     */
    public javax.swing.JTextField getReceivedTimeText() {
        return receivedTimeText;
    }

    /**
     * @param receivedTimeText the receivedTimeText to set
     */
    public void setReceivedTimeText(javax.swing.JTextField receivedTimeText) {
        this.receivedTimeText = receivedTimeText;
    }

    /**
     * @return the remainingTimeLable
     */
    public javax.swing.JLabel getRemainingTimeLable() {
        return remainingTimeLable;
    }

    /**
     * @param remainingTimeLable the remainingTimeLable to set
     */
    public void setRemainingTimeLable(javax.swing.JLabel remainingTimeLable) {
        this.remainingTimeLable = remainingTimeLable;
    }

    /**
     * @return the submissionDateText
     */
    public javax.swing.JTextField getSubmissionDateText() {
        return submissionDateText;
    }

    /**
     * @param submissionDateText the submissionDateText to set
     */
    public void setSubmissionDateText(javax.swing.JTextField submissionDateText) {
        this.submissionDateText = submissionDateText;
    }

    /**
     * @return the submissionTimeText
     */
    public javax.swing.JTextField getSubmissionTimeText() {
        return submissionTimeText;
    }

    /**
     * @param submissionTimeText the submissionTimeText to set
     */
    public void setSubmissionTimeText(javax.swing.JTextField submissionTimeText) {
        this.submissionTimeText = submissionTimeText;
    }

    /**
     * @return the titleLabel
     */
    /**
     * @return the userRemainTimeLable
     */
    public javax.swing.JLabel getUserRemainTimeLable() {
        return userRemainTimeLable;
    }

    /**
     * @param userRemainTimeLable the userRemainTimeLable to set
     */
    public void setUserRemainTimeLable(javax.swing.JLabel userRemainTimeLable) {
        this.userRemainTimeLable = userRemainTimeLable;
    }

    /**
     * @return the addressArea
     */
    /**
     * @return the customerIDLabel1
     */
    public javax.swing.JLabel getCustomerIDLabel1() {
        return customerIDLabel1;
    }

    /**
     * @param customerIDLabel1 the customerIDLabel1 to set
     */
    public void setCustomerIDLabel1(javax.swing.JLabel customerIDLabel1) {
        this.customerIDLabel1 = customerIDLabel1;
    }

    /**
     * @return the customerIDLabel2
     */
    /**
     * @param customerIDLabel2 the customerIDLabel2 to set
     */
    /**
     * @return the customerIDLabel3
     */
    /**
     * @param customerNICText the customerNICText to set
     */
    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    /**
     * @param jScrollPane2 the jScrollPane2 to set
     */
    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    /**
     * @return the jobdescriptionArea1
     */
    public javax.swing.JTextArea getJobdescriptionArea1() {
        return getJobdescriptionArea();
    }

    /**
     * @param jobdescriptionArea1 the jobdescriptionArea1 to set
     */
    public void setJobdescriptionArea1(javax.swing.JTextArea jobdescriptionArea1) {
        this.setJobdescriptionArea(jobdescriptionArea1);
    }

    /**
     * @return the viewcustomerButton
     */
    /**
     * @param viewcustomerButton the viewcustomerButton to set
     */
}
