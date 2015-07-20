
package printhouseclient.view.employerviews;

import controller.*;
import controller.JobController;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.*;
import model.Job;
import printhouseclient.connection.ServerConnector;




public class JobsToBeDone extends javax.swing.JDialog {

    ServerConnector serverConnector;
    JobController jobController;
    CustomerOrderController customerOrdercontrol;
    CustomerController customerController;
    
    private Job job;
    public JobsToBeDone(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
       buttonGroup.add(customerorderIDradio);
       buttonGroup.add(jobIDradio);
       awaitingTable.getColumnModel().getColumn(0).setPreferredWidth(35);
       awaitingTable.getColumnModel().getColumn(1).setPreferredWidth(35);
       awaitingTable.getColumnModel().getColumn(3).setPreferredWidth(65);
       awaitingTable.getColumnModel().getColumn(2).setPreferredWidth(65);
     
 DefaultTableModel model = (DefaultTableModel)awaitingTable.getModel();
        try {
            serverConnector = ServerConnector.getServerConnector();
            jobController = serverConnector.getJobController();
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(JobsToBeDone.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            ArrayList<Job> jobList = jobController.getJobFullDetailsList();

            for (Job job : jobList) {
                if(job.getState().equals("NOT ASSIGNED")){
                    Object[] objects = {job.getJobId(),job.getCustomerOrderId(),job.getExpecteddeliverdate(),job.getReceivedDate()};
                model.insertRow(awaitingTable.getRowCount(), objects);
                
                
                }
        }
        } catch (RemoteException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        lableJobTopic = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        customerorderIDradio = new javax.swing.JRadioButton();
        jobIDradio = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        awaitingTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(585, 400));

        lableJobTopic.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lableJobTopic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lableJobTopic.setText("Awaiting Jobs");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        customerorderIDradio.setText("Customer ID");

        jobIDradio.setText("Job ID");

        awaitingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Customer Order ID", "Submission Date", "Received Date"
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
        if (awaitingTable.getColumnModel().getColumnCount() > 0) {
            awaitingTable.getColumnModel().getColumn(0).setResizable(false);
            awaitingTable.getColumnModel().getColumn(1).setResizable(false);
            awaitingTable.getColumnModel().getColumn(2).setResizable(false);
            awaitingTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            awaitingTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(customerorderIDradio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jobIDradio)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lableJobTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lableJobTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerorderIDradio)
                    .addComponent(jobIDradio)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void awaitingTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_awaitingTableMousePressed
        
        String customerOrderId=null,customerId=null;
  int noofclicks;  
  String selectedJobID;
  noofclicks=evt.getClickCount();
 if(noofclicks==2){
  
 selectedJobID=(String) awaitingTable.getModel().getValueAt(awaitingTable.getSelectedRow(), 0);
  try {
            serverConnector = ServerConnector.getServerConnector();
            jobController = serverConnector.getJobController();
            customerController=serverConnector.getCustomerController();
        } catch (RemoteException | NotBoundException | MalformedURLException ex) {
            System.out.println(ex.getMessage());
        }
            try {
                ArrayList<Job> jobs=jobController.getJobFullDetailsList();
                for(Job job:jobs){
                    if(selectedJobID.equals(job.getJobId())){
                        job=new Job(job.getJobId(), job.getDescription(), job.getExpecteddeliverdate(), job.getReceivedDate(), job.getState(), job.getStarttime(), job.getDelivertime(), job.getEmployeeid(), job.getCustomerOrderId(), job.getRemainaingtime(), job.getEmployeeworkingtime(), job.getEmployeedescription());
                        Customer custs=customerController.getCustomerassignedToJob(selectedJobID);
                    }
                }
                ArrayList<Customer> custom=customerController.getCustomersFullDetailsList();
                    
            } catch (RemoteException ex) {
                Logger.getLogger(JobsToBeDone.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(JobsToBeDone.class.getName()).log(Level.SEVERE, null, ex);
            }
}
noofclicks=0;

    }//GEN-LAST:event_awaitingTableMousePressed
private  void radioSelections(String table,String query,String value){
        
}
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        if(searchText.getText()!=null){
           if(customerorderIDradio.isSelected()){
               radioSelections("job","customerOrderId",searchText.getText());
           }else if(jobIDradio.isSelected()){
               radioSelections("job","jobId",searchText.getText());
           } 
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable awaitingTable;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton customerorderIDradio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jobIDradio;
    private javax.swing.JLabel lableJobTopic;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the awaitingTable
     */
    public javax.swing.JTable getAwaitingTable() {
        return awaitingTable;
    }

    /**
     * @param awaitingTable the awaitingTable to set
     */
    public void setAwaitingTable(javax.swing.JTable awaitingTable) {
        this.awaitingTable = awaitingTable;
    }

    /**
     * @return the job
     */
    public Job getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(Job job) {
        this.job = job;
    }
}
