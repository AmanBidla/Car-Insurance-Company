/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicInterface;

import cicInterface.LoginPage;

/**
 *
 * @author george
 */
public class EmployeeOfCDPage extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeOfCDPage
     */
    public EmployeeOfCDPage() {
        
        initComponents();       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        Upate = new javax.swing.JMenu();
        CheckRecords_MenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        EmployeeCDInbox_MenuItem = new javax.swing.JMenuItem();
        Outbox_MenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        NewClaims_MenuItem = new javax.swing.JMenuItem();
        ClaimHistory_MenuItem = new javax.swing.JMenuItem();
        PendingClaims_MenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        CheckForm_MenuItem = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Logout_MenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Upate.setText("Customers");

        CheckRecords_MenuItem.setText("Check/Update Records");
        CheckRecords_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckRecords_MenuItemActionPerformed(evt);
            }
        });
        Upate.add(CheckRecords_MenuItem);

        jMenuBar1.add(Upate);

        jMenu1.setText("Messages");

        EmployeeCDInbox_MenuItem.setText("Inbox");
        EmployeeCDInbox_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeCDInbox_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(EmployeeCDInbox_MenuItem);

        Outbox_MenuItem.setText("Outbox");
        Outbox_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Outbox_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(Outbox_MenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Claims");

        NewClaims_MenuItem.setText("New Claims");
        NewClaims_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewClaims_MenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(NewClaims_MenuItem);

        ClaimHistory_MenuItem.setText("Claim History");
        ClaimHistory_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaimHistory_MenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(ClaimHistory_MenuItem);

        PendingClaims_MenuItem.setText("Pending Claims");
        PendingClaims_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PendingClaims_MenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(PendingClaims_MenuItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Form");

        CheckForm_MenuItem.setText("Check Form");
        CheckForm_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckForm_MenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(CheckForm_MenuItem);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Logged");

        Logout_MenuItem.setText("Logout");
        Logout_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_MenuItemActionPerformed(evt);
            }
        });
        jMenu5.add(Logout_MenuItem);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckRecords_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckRecords_MenuItemActionPerformed
        ClaimantRecordsPage personalPage=new ClaimantRecordsPage();
                personalPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_CheckRecords_MenuItemActionPerformed

    private void EmployeeCDInbox_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeCDInbox_MenuItemActionPerformed
        EmployeeCDInboxPage employeeInboxPage=new EmployeeCDInboxPage();
                employeeInboxPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_EmployeeCDInbox_MenuItemActionPerformed

    private void Outbox_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Outbox_MenuItemActionPerformed
        EmployeeCDOutboxPage employeeOutboxPage=new EmployeeCDOutboxPage();
                employeeOutboxPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_Outbox_MenuItemActionPerformed

    private void Logout_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_MenuItemActionPerformed
        LoginPage loginPage=new LoginPage();
                loginPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_Logout_MenuItemActionPerformed

    private void NewClaims_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewClaims_MenuItemActionPerformed
        NewClaimsPage newClaimsPage=new NewClaimsPage();
                newClaimsPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_NewClaims_MenuItemActionPerformed

    private void ClaimHistory_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaimHistory_MenuItemActionPerformed
        ClaimHistoryPage claimHistoryPage=new ClaimHistoryPage();
                claimHistoryPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_ClaimHistory_MenuItemActionPerformed

    private void PendingClaims_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PendingClaims_MenuItemActionPerformed
        PendingClaimsPage pendingPage=new PendingClaimsPage();
                pendingPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_PendingClaims_MenuItemActionPerformed

    private void CheckForm_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckForm_MenuItemActionPerformed
        FormPage formPage=new FormPage();
                formPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_CheckForm_MenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeOfCDPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeOfCDPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeOfCDPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeOfCDPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeOfCDPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CheckForm_MenuItem;
    private javax.swing.JMenuItem CheckRecords_MenuItem;
    private javax.swing.JMenuItem ClaimHistory_MenuItem;
    private javax.swing.JMenuItem EmployeeCDInbox_MenuItem;
    private javax.swing.JMenuItem Logout_MenuItem;
    private javax.swing.JMenuItem NewClaims_MenuItem;
    private javax.swing.JMenuItem Outbox_MenuItem;
    private javax.swing.JMenuItem PendingClaims_MenuItem;
    private javax.swing.JMenu Upate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
