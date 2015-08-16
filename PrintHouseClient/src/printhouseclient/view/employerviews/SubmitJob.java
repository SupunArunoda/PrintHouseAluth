package printhouseclient.view.employerviews;


import controller.*;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.Job;
import printhouseclient.connection.ServerConnector;

public class SubmitJob extends javax.swing.JInternalFrame {

    ServerConnector serverConnector;
    JobController jobController;
    CustomerController customerController;
    ArrayList<Job> jobs;
    public SubmitJob() {
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
                if (job.getState().equals("ASSIGNED")) {
                    arr.add(job);
                }
            } } catch (RemoteException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        DefaultTableModel model = (DefaultTableModel)submissiontable.getModel();
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i).getJobId());
           Object[] objects = {arr.get(i).getJobId(),arr.get(i).getCustomerOrderId(),arr.get(i).getStarttime(),printhouseclient.extra.DateConfigure.getDateDifference(arr.get(i).getExpecteddeliverdate().replaceAll("-", "/"))};
                model.insertRow(submissiontable.getRowCount(), objects);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        acceptedTimeText = new javax.swing.JTextField();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        submissiontable = new javax.swing.JTable();

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Details"));

        customerIDLabel.setText("ID");

        customerIDText.setEditable(false);
        customerIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDTextActionPerformed(evt);
            }
        });

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
                    .addComponent(customerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewcustomerButton))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLable)
                    .addComponent(customerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewcustomerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Job Details"));

        jobIdLabel.setText("Job ID");

        customerOrderIDLabel.setText("Customer Order ID");

        customerOrderIDText.setEditable(false);

        jobIDText.setEditable(false);

        jobreceivedDateLable.setText("Accepted Date");

        userRemainTimeLable.setText("Remaining Time");

        acceptedDateText.setEditable(false);

        acceptedTimeText.setEditable(false);
        acceptedTimeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptedTimeTextActionPerformed(evt);
            }
        });

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
                    .addComponent(remainingTimeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(acceptedDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(acceptedTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobreceivedDateLable)
                    .addComponent(acceptedDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acceptedTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customerOrderIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customerOrderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userRemainTimeLable))
                    .addComponent(remainingTimeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                            .addComponent(employeeWorkinghoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeWorkinghoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(minutesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeSubmissiondescriptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningLable, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
        );

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        submitButton.setForeground(new java.awt.Color(204, 0, 0));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        submissiontable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Customer Order ID", "Accepted Date", "Remaining Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        submissiontable.getTableHeader().setReorderingAllowed(false);
        submissiontable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submissiontableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(submissiontable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            for (Job job : jobs) {
                if (job.getState().equals("ASSIGNED")&&job.getJobId()==Integer.parseInt(jobIDText.getText())) {
                    job.setEmployeedescription(description);
                    job.setEmployeeworkingtime(hour+":"+minutes);
                    jobController.updateState(job, "COMPLETE");
                    jobController.updatedeliverTime(job);
                    jobController.updateemployeeDescription(job);
                    jobController.updateemployeeworkingTime(job);
                    JOptionPane.showMessageDialog(rootPane, "You have successfully Submitted the job","Submission" , JOptionPane.INFORMATION_MESSAGE);
                    
                }
            }
           
        } catch (NotBoundException ex) {
            Logger.getLogger(SubmitJob.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SubmitJob.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException|RemoteException ex) {
            Logger.getLogger(SubmitJob.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_submitButtonActionPerformed

    private void customerIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDTextActionPerformed

    private void acceptedTimeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptedTimeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acceptedTimeTextActionPerformed
void setDesign(Job job,Customer cus){
     
    jobIDText.setText(String.valueOf(job.getJobId()));
    customerOrderIDText.setText(String.valueOf(job.getCustomerOrderId()));
    customerIDText.setText(Integer.toString(cus.getId()));
    customerNameText.setText(cus.getName());
    
    acceptedDateText.setText(job.getStarttime().substring(0, 11));
    acceptedTimeText.setText(job.getStarttime().substring(11,16));
    
    remainingTimeLable.setText(printhouseclient.extra.DateConfigure.getDateDifference(job.getExpecteddeliverdate().replaceAll("-", "/")));
}
    private void submissiontableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submissiontableMousePressed
       String customerOrderId=null,customerId=null;
        int noofclicks;
        String selectedJobID;
        int jobId;
        noofclicks=evt.getClickCount();
        if(noofclicks==2){

            selectedJobID=String.valueOf(submissiontable.getModel().getValueAt(submissiontable.getSelectedRow(), 0));
            jobId=Integer.parseInt(selectedJobID);
            System.out.println(jobId);
            try {
                serverConnector = ServerConnector.getServerConnector();
                jobController = serverConnector.getJobController();
                customerController=serverConnector.getCustomerController();
            } catch (RemoteException | NotBoundException | MalformedURLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                 jobs=jobController.getJobFullDetailsList();
                for(Job job:jobs){
                    if(jobId==job.getJobId()){
                        System.out.println(selectedJobID);
                        job=new Job(job.getJobId(), job.getDescription(), job.getExpecteddeliverdate(), job.getReceivedDate(), job.getState(), job.getStarttime(), job.getDelivertime(), job.getEmployeeid(), job.getCustomerOrderId(), job.getEmployeeworkingtime(), job.getEmployeedescription());
                        Customer custs=customerController.getCustomerassignedToJob(selectedJobID);
                        System.out.println(custs.getName()+" "+custs.getId());
                        setDesign(job, custs);
                    }
                }
            } catch (RemoteException ex) {
                System.out.println(ex.getMessage());
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_submissiontableMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acceptedDateText;
    private javax.swing.JTextField acceptedTimeText;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jobIDText;
    private javax.swing.JLabel jobIdLabel;
    private javax.swing.JLabel jobreceivedDateLable;
    private javax.swing.JSpinner minutesSpinner;
    private javax.swing.JLabel remainingTimeLable;
    public static javax.swing.JTable submissiontable;
    private javax.swing.JButton submitButton;
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
        return acceptedTimeText;
    }

    /**
     * @param receivedTimeText the receivedTimeText to set
     */
    public void setReceivedTimeText(javax.swing.JTextField receivedTimeText) {
        this.acceptedTimeText = receivedTimeText;
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
