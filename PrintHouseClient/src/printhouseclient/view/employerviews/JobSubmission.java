
package printhouseclient.view.employerviews;





import controller.CustomerController;
import controller.CustomerOrderController;
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
import model.Customer;
import model.Job;
import printhouseclient.connection.ServerConnector;
import static printhouseclient.view.employerviews.JobsToBeDone.awaitingTable;

public class JobSubmission extends javax.swing.JDialog {
    
     ServerConnector serverConnector;
    JobController jobController;
    CustomerOrderController customerOrdercontrol;
    CustomerController customerController;
    public JobSubmission(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        buttonGroup1.add(jobIdRadio);
        buttonGroup1.add(customerOrderIdRadio);
        submissionTable.getColumnModel().getColumn(0).setPreferredWidth(35);
       submissionTable.getColumnModel().getColumn(1).setPreferredWidth(35);
       submissionTable.getColumnModel().getColumn(3).setPreferredWidth(65);
       submissionTable.getColumnModel().getColumn(2).setPreferredWidth(65);
        DefaultTableModel model = (DefaultTableModel) submissionTable.getModel();
        try {
            serverConnector = ServerConnector.getServerConnector();
            jobController = serverConnector.getJobController();
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(JobsToBeDone.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            ArrayList<Job> jobList = jobController.getJobFullDetailsList();

            for (Job job : jobList) {
                if(job.getState().equals("ASSIGNED")){
                    Object[] objects = {job.getJobId(),job.getCustomerOrderId(),job.getStarttime(),job.getReceivedDate()};
                model.insertRow(submissionTable.getRowCount(), objects);
                
                
                }
        }
        } catch (RemoteException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lableJobTopic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        submissionTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        jobIdRadio = new javax.swing.JRadioButton();
        customerOrderIdRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(581, 387));

        lableJobTopic.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lableJobTopic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lableJobTopic.setText("Job Submission");

        submissionTable.setModel(new javax.swing.table.DefaultTableModel(
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
        submissionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submissionTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(submissionTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jobIdRadio.setText("Job ID");

        customerOrderIdRadio.setText("Customer Order ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jobIdRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerOrderIdRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchButton)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lableJobTopic, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lableJobTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(jobIdRadio)
                    .addComponent(customerOrderIdRadio))
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private  void radioSelections(String table,String query,String value){
        try{
                  
         
        }catch(Exception ex){
             System.out.println(ex.getMessage());
         }
}
    private void submissionTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submissionTableMousePressed

        String customerOrderId=null,customerId=null;
  int noofclicks; 
  String selectedJobID;
  noofclicks=evt.getClickCount();
 if(noofclicks==2){
  
 selectedJobID=(String) submissionTable.getModel().getValueAt(submissionTable.getSelectedRow(), 0);
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
                    MainView.setDesignSubmission(job, custs);
                    
                    }
                }
                    
            } catch (RemoteException ex) {
                Logger.getLogger(JobsToBeDone.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(JobsToBeDone.class.getName()).log(Level.SEVERE, null, ex);
            }
}
    }//GEN-LAST:event_submissionTableMousePressed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
         if(searchText.getText()!=null){
           if(customerOrderIdRadio.isSelected()){
               radioSelections("job","customerOrderId",searchText.getText());
           }else if(jobIdRadio.isSelected()){
               radioSelections("job","jobId",searchText.getText());
           } 
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton customerOrderIdRadio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jobIdRadio;
    private javax.swing.JLabel lableJobTopic;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JTable submissionTable;
    // End of variables declaration//GEN-END:variables
}
