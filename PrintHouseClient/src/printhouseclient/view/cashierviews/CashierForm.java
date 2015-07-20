/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printhouseclient.view.cashierviews;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Buddhi
 */
public class CashierForm extends javax.swing.JFrame {

    private AddNewOrderFrame addNewOrderFrame;
    private AddNewJobFrame addNewJobFrame;
    private AddNewCustomerFrame addNewCustomerFrame;
    private ViewCustomersFrame viewCustomersFrame;

    /**
     * Creates new form CashierForm
     */
    public CashierForm() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CashierForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();

        jTabbedPane1.setTitleAt(0, "<html><body style=\"width:100px;height:15px;margin-top:3px;text-align:center\">ORDERS</body></html>");
        jTabbedPane1.setTitleAt(1, "<html><body style=\"width:100px;height:15px;margin-top:3px;text-align:center\">CUSTOMERS</body></html>");
        jTabbedPane1.setTitleAt(2, "<html><body style=\"width:100px;height:15px;margin-top:3px;text-align:center\">FINANCE</body></html>");

        setExtendedState(MAXIMIZED_BOTH);

        addNewOrderButtonActionPerformed(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        addNewOrderButton = new javax.swing.JButton();
        addNewJobButton = new javax.swing.JButton();
        viewOrdersButton = new javax.swing.JButton();
        viewJobsButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        addNewCustomerButton = new javax.swing.JButton();
        viewCustomersButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        mainDesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kingmark Print House");

        addNewOrderButton.setText("New Order");
        addNewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewOrderButtonActionPerformed(evt);
            }
        });

        addNewJobButton.setText("New Job");
        addNewJobButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewJobButtonActionPerformed(evt);
            }
        });

        viewOrdersButton.setText("View Orders");

        viewJobsButton.setText("View Jobs");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(addNewOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addNewJobButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewJobsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 856, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addNewOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(addNewJobButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewOrdersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewJobsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ORDERS", jPanel2);

        addNewCustomerButton.setText("Add new");
        addNewCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewCustomerButtonActionPerformed(evt);
            }
        });

        viewCustomersButton.setText("View all");
        viewCustomersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(addNewCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewCustomersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1068, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addNewCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(viewCustomersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CUSTOMERS", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1274, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("FINANCE", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setText("jLabel2");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Notifications"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainDesktopPaneLayout = new javax.swing.GroupLayout(mainDesktopPane);
        mainDesktopPane.setLayout(mainDesktopPaneLayout);
        mainDesktopPaneLayout.setHorizontalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainDesktopPaneLayout.setVerticalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainDesktopPane))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainDesktopPane)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewOrderButtonActionPerformed
        if (addNewOrderFrame == null) {
            addNewOrderFrame = new AddNewOrderFrame();
            ((javax.swing.plaf.basic.BasicInternalFrameUI) addNewOrderFrame.getUI()).setNorthPane(null);
            addNewOrderFrame.setBorder(null);
            mainDesktopPane.add(addNewOrderFrame);

            addNewOrderFrame.setVisible(true);
        } else {
            addNewOrderFrame.moveToFront();
        }

        try {
            addNewOrderFrame.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CashierForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addNewOrderButtonActionPerformed

    private void addNewJobButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewJobButtonActionPerformed
        if (addNewJobFrame == null) {
            addNewJobFrame = new AddNewJobFrame();
            ((javax.swing.plaf.basic.BasicInternalFrameUI) addNewJobFrame.getUI()).setNorthPane(null);
            addNewJobFrame.setBorder(null);
            mainDesktopPane.add(addNewJobFrame);

            addNewJobFrame.setVisible(true);
        } else {
            addNewJobFrame.moveToFront();
        }

        try {
            addNewJobFrame.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CashierForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addNewJobButtonActionPerformed

    private void addNewCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewCustomerButtonActionPerformed
        if (addNewCustomerFrame == null) {
            addNewCustomerFrame = new AddNewCustomerFrame();
            ((javax.swing.plaf.basic.BasicInternalFrameUI) addNewCustomerFrame.getUI()).setNorthPane(null);
            addNewCustomerFrame.setBorder(null);
            mainDesktopPane.add(addNewCustomerFrame);

            addNewCustomerFrame.setVisible(true);
        } else {
            addNewCustomerFrame.moveToFront();
        }

        try {
            addNewCustomerFrame.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CashierForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addNewCustomerButtonActionPerformed

    private void viewCustomersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomersButtonActionPerformed
        if (viewCustomersFrame == null) {
            viewCustomersFrame = new ViewCustomersFrame();
            ((javax.swing.plaf.basic.BasicInternalFrameUI) viewCustomersFrame.getUI()).setNorthPane(null);
            viewCustomersFrame.setBorder(null);
            mainDesktopPane.add(viewCustomersFrame);

            viewCustomersFrame.setVisible(true);
        } else {
            viewCustomersFrame.moveToFront();
        }

        try {
            viewCustomersFrame.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CashierForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewCustomersButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CashierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewCustomerButton;
    private javax.swing.JButton addNewJobButton;
    private javax.swing.JButton addNewOrderButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDesktopPane mainDesktopPane;
    private javax.swing.JButton viewCustomersButton;
    private javax.swing.JButton viewJobsButton;
    private javax.swing.JButton viewOrdersButton;
    // End of variables declaration//GEN-END:variables
}
