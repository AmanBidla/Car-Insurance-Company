/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicInterface;

/**
 *
 * @author george
 */
public class ClaimantPage extends javax.swing.JFrame {

    /**
     * Creates new form ClaimantPage
     */
    public ClaimantPage() {
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
        PersonalDetails_Menu = new javax.swing.JMenu();
        CheckRecords_MenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        CustomerInbox_MenuItem = new javax.swing.JMenuItem();
        Outbox_MenuItem = new javax.swing.JMenuItem();
        Claim_Menu = new javax.swing.JMenu();
        ReportClaim_MenuItem = new javax.swing.JMenuItem();
        PendingClaims_MenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Form_Menu = new javax.swing.JMenu();
        FillInForm_MenuItem = new javax.swing.JMenuItem();
        Logged_Menu = new javax.swing.JMenu();
        Logout_MenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PersonalDetails_Menu.setText("Personal Details");
        PersonalDetails_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonalDetails_MenuActionPerformed(evt);
            }
        });

        CheckRecords_MenuItem.setText("Check Records");
        CheckRecords_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckRecords_MenuItemActionPerformed(evt);
            }
        });
        PersonalDetails_Menu.add(CheckRecords_MenuItem);

        jMenuBar1.add(PersonalDetails_Menu);

        jMenu1.setText("Messages");

        CustomerInbox_MenuItem.setText("Inbox");
        CustomerInbox_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerInbox_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(CustomerInbox_MenuItem);

        Outbox_MenuItem.setText("Outbox");
        Outbox_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Outbox_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(Outbox_MenuItem);

        jMenuBar1.add(jMenu1);

        Claim_Menu.setText("Claims");
        Claim_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Claim_MenuActionPerformed(evt);
            }
        });

        ReportClaim_MenuItem.setText("Report Claim");
        ReportClaim_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportClaim_MenuItemActionPerformed(evt);
            }
        });
        Claim_Menu.add(ReportClaim_MenuItem);

        PendingClaims_MenuItem.setText("Pending Claims");
        PendingClaims_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PendingClaims_MenuItemActionPerformed(evt);
            }
        });
        Claim_Menu.add(PendingClaims_MenuItem);

        jMenuItem1.setText("Claim History");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Claim_Menu.add(jMenuItem1);

        jMenuBar1.add(Claim_Menu);

        Form_Menu.setText("Form");
        Form_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_MenuActionPerformed(evt);
            }
        });

        FillInForm_MenuItem.setText("Fill in Form");
        FillInForm_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillInForm_MenuItemActionPerformed(evt);
            }
        });
        Form_Menu.add(FillInForm_MenuItem);

        jMenuBar1.add(Form_Menu);

        Logged_Menu.setText("Logged");

        Logout_MenuItem.setText("Logout");
        Logout_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_MenuItemActionPerformed(evt);
            }
        });
        Logged_Menu.add(Logout_MenuItem);

        jMenuBar1.add(Logged_Menu);

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

    private void Claim_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Claim_MenuActionPerformed
        
    }//GEN-LAST:event_Claim_MenuActionPerformed

    private void PersonalDetails_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonalDetails_MenuActionPerformed
        
    }//GEN-LAST:event_PersonalDetails_MenuActionPerformed

    private void Form_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_MenuActionPerformed
        
    }//GEN-LAST:event_Form_MenuActionPerformed

    private void CheckRecords_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckRecords_MenuItemActionPerformed
        ClaimantRecordsPage personalPage=new ClaimantRecordsPage();
                personalPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_CheckRecords_MenuItemActionPerformed

    private void PendingClaims_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PendingClaims_MenuItemActionPerformed
        PendingClaimsPage pendingPage=new PendingClaimsPage();
                pendingPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_PendingClaims_MenuItemActionPerformed

    private void ReportClaim_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportClaim_MenuItemActionPerformed
        ReportClaimPage reportPage=new ReportClaimPage();
                reportPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_ReportClaim_MenuItemActionPerformed

    private void FillInForm_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillInForm_MenuItemActionPerformed
        FormPage formPage=new FormPage();
                formPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_FillInForm_MenuItemActionPerformed

    private void Logout_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_MenuItemActionPerformed
        LoginPage loginPage=new LoginPage();
                loginPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_Logout_MenuItemActionPerformed

    private void CustomerInbox_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerInbox_MenuItemActionPerformed
        ClaimantInboxPage customerInboxPage=new ClaimantInboxPage();
                customerInboxPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_CustomerInbox_MenuItemActionPerformed

    private void Outbox_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Outbox_MenuItemActionPerformed
        ClaimantOutboxPage customerOutboxPage=new ClaimantOutboxPage();
                customerOutboxPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_Outbox_MenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
               ClaimHistoryPage claimHistoryPage=new ClaimHistoryPage();
                claimHistoryPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(ClaimantPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClaimantPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClaimantPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClaimantPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClaimantPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CheckRecords_MenuItem;
    private javax.swing.JMenu Claim_Menu;
    private javax.swing.JMenuItem CustomerInbox_MenuItem;
    private javax.swing.JMenuItem FillInForm_MenuItem;
    private javax.swing.JMenu Form_Menu;
    private javax.swing.JMenu Logged_Menu;
    private javax.swing.JMenuItem Logout_MenuItem;
    private javax.swing.JMenuItem Outbox_MenuItem;
    private javax.swing.JMenuItem PendingClaims_MenuItem;
    private javax.swing.JMenu PersonalDetails_Menu;
    private javax.swing.JMenuItem ReportClaim_MenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
