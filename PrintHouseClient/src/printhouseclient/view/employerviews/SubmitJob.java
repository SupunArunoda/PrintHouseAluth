package printhouseclient.view.employerviews;


import controller.JobController;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.swing.*;
import model.Job;
import printhouseclient.connection.ServerConnector;

public class SubmitJob extends javax.swing.JInternalFrame {

    ServerConnector serverConnector;
    JobController jobController;
    public SubmitJob() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        customerIDLabel = new javax.swing.JLabel();
        customerIDText = new javax.swing.JTextField();
        customerNameLable = new javax.swing.JLabel();
        customerNameText = new javax.swing.JTextField();
        viewcustomerButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jobIdLabel = new javax.swing.JLabel();
        customerOrderIDLabel = new javax.swing.JLabel();
        customerOrderIDText = new javax.swing.JTextField();
        jobIDText = new javax.swing.JTextField();
        jobreceivedDateLable = new javax.swing.JLabel();
        userRemainTimeLable = new javax.swing.JLabel();
        acceptedDateText = new javax.swing.JTextField();
        receivedTimeText = new javax.swing.JTextField();
        remainingTimeLable = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        employeeWorkinghoursLabel = new javax.swing.JLabel();
        hourSpinner = new javax.swing.JSpinner();
        minutesSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        employeeSubmissiondescriptLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeDescriptArea = new javax.swing.JTextArea();
        warningLable = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Submit Job");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Details"));

        customerIDLabel.setText("ID");

        customerIDText.setEditable(false);

        customerNameLable.setText("Name");

        customerNameText.setEditable(false);

        viewcustomerButton.setText("View Customer");
        viewcustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewcustomerButton)
                    .addComponent(customerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameLable))
                .addGap(36, 36, 36)
                .addComponent(viewcustomerButton)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Job Details"));

        jobIdLabel.setText("Job ID");

        customerOrderIDLabel.setText("Customer Order ID");

        customerOrderIDText.setEditable(false);

        jobIDText.setEditable(false);

        jobreceivedDateLable.setText("Accepted Date");

        userRemainTimeLable.setText("Remaining Time");

        acceptedDateText.setEditable(false);

        receivedTimeText.setEditable(false);

        remainingTimeLable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        remainingTimeLable.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(customerOrderIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customerOrderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jobIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jobIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, 125)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jobreceivedDateLable)
                    .addComponent(userRemainTimeLable))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(acceptedDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(receivedTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(remainingTimeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobreceivedDateLable)
                    .addComponent(acceptedDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receivedTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remainingTimeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userRemainTimeLable)
                        .addComponent(customerOrderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customerOrderIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee"));

        employeeWorkinghoursLabel.setText("Working Hours");

        hourSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        minutesSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jLabel1.setText("hours");

        jLabel2.setText("minutes");

        employeeSubmissiondescriptLabel.setText("Submission Description");

        employeeDescriptArea.setColumns(20);
        employeeDescriptArea.setRows(5);
        jScrollPane1.setViewportView(employeeDescriptArea);

        warningLable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        warningLable.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeSubmissiondescriptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeWorkinghoursLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(hourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(minutesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(warningLable, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeWorkinghoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(minutesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeSubmissiondescriptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningLable, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addContainerGap())
        );

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        submitButton.setForeground(new java.awt.Color(204, 0, 0));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewcustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcustomerButtonActionPerformed
        // TODO add your handling code here:
        ViewCustomer viewCustomer=new ViewCustomer(null, closable);
         try{
         
         
         }catch(Exception ex){
             System.out.println(ex.getMessage());
                     
         }
    }//GEN-LAST:event_viewcustomerButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String hour, minutes,description;
        hour=String.valueOf(hourSpinner.getValue());
        minutes=String.valueOf(minutesSpinner.getValue());
        description=employeeDescriptArea.getText();
        try {
            serverConnector = ServerConnector.getServerConnector();
            jobController = serverConnector.getJobController();
        } catch (NotBoundException ex) {
            Logger.getLogger(SubmitJob.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SubmitJob.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(SubmitJob.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        if(description.equals("")==false){
            try {
               Job job=new Job(hour, description, title, description, title, title, description, minutes, description, description, description, description);
              job.setState("COMPLETED");
              job.setDelivertime(String.valueOf(new Timestamp(new Date().getTime())));
              job.setEmployeeid("wr345");//This should be get automatically by system
              job.setEmployeeworkingtime(hour+":"+minutes);
              job.setEmployeedescription(description);
              job.setJobId(customerIDText.getText());
                System.out.println(job.getState()+" "+job.getDelivertime());
              jobController.updateState(job, "COMPLETED");
              jobController.updatedeliverTime(job);
              //jobController.updateemployeeid(job);
              //jobController.updateemployeeworkingTime(job);
              //jobController.updateemployeeDescription(job);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            warningLable.setText("");
            JOptionPane.showMessageDialog(rootPane, "Sucessfully submitted the job", "Job Submision", JOptionPane.NO_OPTION);
            
        }else {
            warningLable.setText("Sorry.....Process Abort...Description should be filled");
        }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acceptedDateText;
    private javax.swing.JLabel customerIDLabel;
    private javax.swing.JTextField customerIDText;
    private javax.swing.JLabel customerNameLable;
    private javax.swing.JTextField customerNameText;
    private javax.swing.JLabel customerOrderIDLabel;
    private javax.swing.JTextField customerOrderIDText;
    private javax.swing.JTextArea employeeDescriptArea;
    private javax.swing.JLabel employeeSubmissiondescriptLabel;
    private javax.swing.JLabel employeeWorkinghoursLabel;
    private javax.swing.JSpinner hourSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jobIDText;
    private javax.swing.JLabel jobIdLabel;
    private javax.swing.JLabel jobreceivedDateLable;
    private javax.swing.JSpinner minutesSpinner;
    private javax.swing.JTextField receivedTimeText;
    private javax.swing.JLabel remainingTimeLable;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userRemainTimeLable;
    private javax.swing.JButton viewcustomerButton;
    private javax.swing.JLabel warningLable;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the customerIDLabel
     */
    public javax.swing.JLabel getCustomerIDLabel() {
        return customerIDLabel;
    }

    /**
     * @param customerIDLabel the customerIDLabel to set
     */
    public void setCustomerIDLabel(javax.swing.JLabel customerIDLabel) {
        this.customerIDLabel = customerIDLabel;
    }

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
     * @return the discardButton
     */
    

    /**
     * @param discardButton the discardButton to set
     */
   

    /**
     * @return the employeeDescriptArea
     */
    public javax.swing.JTextArea getEmployeeDescriptArea() {
        return employeeDescriptArea;
    }

    /**
     * @param employeeDescriptArea the employeeDescriptArea to set
     */
    public void setEmployeeDescriptArea(javax.swing.JTextArea employeeDescriptArea) {
        this.employeeDescriptArea = employeeDescriptArea;
    }

    /**
     * @return the employeeIDLabel
     */
   
    /**
     * @param employeeIDLabel the employeeIDLabel to set
     */
   

    /**
     * @return the employeeIDText
     */
   

    /**
     * @param employeeIDText the employeeIDText to set
     */
    

    /**
     * @return the employeeSubmissiondescriptLabel
     */
    public javax.swing.JLabel getEmployeeSubmissiondescriptLabel() {
        return employeeSubmissiondescriptLabel;
    }

    /**
     * @param employeeSubmissiondescriptLabel the employeeSubmissiondescriptLabel to set
     */
    public void setEmployeeSubmissiondescriptLabel(javax.swing.JLabel employeeSubmissiondescriptLabel) {
        this.employeeSubmissiondescriptLabel = employeeSubmissiondescriptLabel;
    }

    /**
     * @return the employeeWorkinghoursLabel
     */
    public javax.swing.JLabel getEmployeeWorkinghoursLabel() {
        return employeeWorkinghoursLabel;
    }

    /**
     * @param employeeWorkinghoursLabel the employeeWorkinghoursLabel to set
     */
    public void setEmployeeWorkinghoursLabel(javax.swing.JLabel employeeWorkinghoursLabel) {
        this.employeeWorkinghoursLabel = employeeWorkinghoursLabel;
    }

    /**
     * @return the hourSpinner
     */
    public javax.swing.JSpinner getHourSpinner() {
        return hourSpinner;
    }

    /**
     * @param hourSpinner the hourSpinner to set
     */
    public void setHourSpinner(javax.swing.JSpinner hourSpinner) {
        this.hourSpinner = hourSpinner;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
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
    public javax.swing.JPanel getjPanel6() {
        return jPanel6;
    }

    /**
     * @param jPanel6 the jPanel6 to set
     */
    public void setjPanel6(javax.swing.JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

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
     * @return the minutesSpinner
     */
    public javax.swing.JSpinner getMinutesSpinner() {
        return minutesSpinner;
    }

    /**
     * @param minutesSpinner the minutesSpinner to set
     */
    public void setMinutesSpinner(javax.swing.JSpinner minutesSpinner) {
        this.minutesSpinner = minutesSpinner;
    }

    /**
     * @return the receivedDateText
     */
    public javax.swing.JTextField getReceivedDateText() {
        return getAcceptedDateText();
    }

    /**
     * @param receivedDateText the receivedDateText to set
     */
    public void setReceivedDateText(javax.swing.JTextField receivedDateText) {
        this.setAcceptedDateText(receivedDateText);
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
     * @return the submitButton
     */
    public javax.swing.JButton getSubmitButton() {
        return submitButton;
    }

    /**
     * @param submitButton the submitButton to set
     */
    public void setSubmitButton(javax.swing.JButton submitButton) {
        this.submitButton = submitButton;
    }

    /**
     * @return the titleLabel
     */
    public javax.swing.JLabel getTitleLabel() {
        return titleLabel;
    }

    /**
     * @param titleLabel the titleLabel to set
     */
    public void setTitleLabel(javax.swing.JLabel titleLabel) {
        this.titleLabel = titleLabel;
    }

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
     * @return the viewcustomerButton
     */
    public javax.swing.JButton getViewcustomerButton() {
        return viewcustomerButton;
    }

    /**
     * @param viewcustomerButton the viewcustomerButton to set
     */
    public void setViewcustomerButton(javax.swing.JButton viewcustomerButton) {
        this.viewcustomerButton = viewcustomerButton;
    }

    /**
     * @return the acceptedDateText
     */
    public javax.swing.JTextField getAcceptedDateText() {
        return acceptedDateText;
    }

    /**
     * @param acceptedDateText the acceptedDateText to set
     */
    public void setAcceptedDateText(javax.swing.JTextField acceptedDateText) {
        this.acceptedDateText = acceptedDateText;
    }
}
