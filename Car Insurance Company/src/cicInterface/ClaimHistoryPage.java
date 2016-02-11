/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicInterface;

import cicSrc.Application;
import static cicSrc.Application.claimant1;
import static cicSrc.Application.claimant2;
import static cicSrc.Application.claimant3;
import static cicSrc.Application.registeredClaims;
import static cicInterface.PendingClaimsPage.damageHistory;
/**
 *
 * @author george
 */
public class ClaimHistoryPage extends javax.swing.JFrame {

    /**
     * Creates new form ClaimHistoryPage
     */
    public ClaimHistoryPage() {
        initComponents();
        
       //jScrollPane1.setVisible(false);
        LoginPage login = new LoginPage();
        if ((login.userRole == "EmployeeOfCD") || (login.userRole == "ClaimHandlerA"))
        {
            jTable1.setVisible(false);
        }
        else if (login.userRole == "Claimant")//if it is a claimant
        {   
            //hide all the buttons serving the selection of a claimant
            jTable1.setVisible(true);
            BackToPage_Button.setVisible(true);
            SelectCustomerBox.setVisible(false);
            Proceed_Button.setVisible(false);
            Select_Claimant.setVisible(false);
            //show different contents depending on the claimant
            switch(login.username){ 
                case "IamCharlie":
                    int j=0;
                    for (int i=0;i<10;i++)
                    {
                        if((registeredClaims[i].claimantName == claimant1.name) && (registeredClaims[i].claimantSurname== claimant1.surname))
                        {
                                   
                                  
                     jTable1.getModel().setValueAt(registeredClaims[i].claim_ID, j, 0); // ID
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantName, j, 1); // Name
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantSurname, j, 2); // Surname
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantLocation, j, 3); // Location
                     jTable1.getModel().setValueAt(registeredClaims[i].claimDate, j, 4); // Date
                     jTable1.getModel().setValueAt(registeredClaims[i].claimCostOfDmg, j, 5); // Cost of Dmg
                     jTable1.getModel().setValueAt(registeredClaims[i].claimDecision, j, 6); // Decision
                                 j++;
                        }
                        //testing 
                      /*  else
                        {
                     jTable1.getModel().setValueAt("", j, 0); // ID
                     jTable1.getModel().setValueAt("", j, 1); // Name
                     jTable1.getModel().setValueAt("", j, 2); // Surname
                     jTable1.getModel().setValueAt("", j, 3); // Location
                     jTable1.getModel().setValueAt("", j, 4); // Date
                     jTable1.getModel().setValueAt(0, j, 5); // Cost of Dmg
                     jTable1.getModel().setValueAt("", j, 6); // Decision
                                 j++;
                        } */
                    }
                break;
                case "IamCharles":
                    int k=0;
                    for (int i=0;i<16;i++)
                    {
                        if((registeredClaims[i].claimantName == claimant2.name) && (registeredClaims[i].claimantSurname== claimant2.surname))
                        {
                                
                                     
                     jTable1.getModel().setValueAt(registeredClaims[i].claim_ID, k, 0); // ID
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantName, k, 1); // Name
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantSurname, k, 2); // Surname
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantLocation, k, 3); // Location
                     jTable1.getModel().setValueAt(registeredClaims[i].claimDate, k, 4); // Date
                     jTable1.getModel().setValueAt(registeredClaims[i].claimCostOfDmg, k, 5); // Cost of Dmg
                     jTable1.getModel().setValueAt(registeredClaims[i].claimDecision, k, 6); // Decision
                                 k++;
                        }
                    }
                break;
                case "tsoutsou":
                    int l=0;
                   for (int i=0;i<16;i++)
                    {
                        if((registeredClaims[i].claimantName == claimant3.name) && (registeredClaims[i].claimantSurname== claimant3.surname))
                        {
                                 
                                     
                     jTable1.getModel().setValueAt(registeredClaims[i].claim_ID, l, 0); // ID
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantName, l, 1); // Name
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantSurname, l, 2); // Surname
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantLocation, l, 3); // Location
                     jTable1.getModel().setValueAt(registeredClaims[i].claimDate, l, 4); // Date
                     jTable1.getModel().setValueAt(registeredClaims[i].claimCostOfDmg, l, 5); // Cost of Dmg
                     jTable1.getModel().setValueAt(registeredClaims[i].claimDecision, l, 6); // Decision
                                 l++;
                        }
                    }
                break;
                default: 
                    int m=0;
                   for (int i=0;i<16;i++)
                    {
                        if((registeredClaims[i].claimantName == claimant3.name) && (registeredClaims[i].claimantSurname== claimant3.surname))
                        {
                                 
                                     
                     jTable1.getModel().setValueAt(registeredClaims[i].claim_ID, m, 0); // ID
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantName, m, 1); // Name
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantSurname, m, 2); // Surname
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantLocation, m, 3); // Location
                     jTable1.getModel().setValueAt(registeredClaims[i].claimDate, m, 4); // Date
                     jTable1.getModel().setValueAt(registeredClaims[i].claimCostOfDmg, m, 5); // Cost of Dmg
                     jTable1.getModel().setValueAt(registeredClaims[i].claimDecision, m, 6); // Decision
                                 m++;
                        }
                        
                    }
                break;
        }
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

        SelectCustomerBox = new javax.swing.JComboBox();
        Select_Claimant = new javax.swing.JLabel();
        Proceed_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackToPage_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        SelectCustomerBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Claimant 1", "Claimant 2", "Claimant 3", "Claimant 4" }));

        Select_Claimant.setText("Select Claimant");

        Proceed_Button.setText("Proceed");
        Proceed_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proceed_ButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Claim ID", "Name", "Surname", "Location", "Date", "Cost Of Damage", "Decision"
            }
        ));
        jTable1.setRowHeight(22);
        jScrollPane1.setViewportView(jTable1);

        BackToPage_Button.setText("Back To Page");
        BackToPage_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToPage_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Select_Claimant, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SelectCustomerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(Proceed_Button)
                .addContainerGap(380, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackToPage_Button)
                .addGap(48, 48, 48))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectCustomerBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Select_Claimant, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Proceed_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(BackToPage_Button)
                .addGap(28, 28, 28))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Proceed_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proceed_ButtonActionPerformed
        
        // show history of records
        jTable1.setVisible(true);    
       
        String claimant =(String)this.SelectCustomerBox.getSelectedItem();
        switch (claimant){
            case "Claimant 1":
                    int l=0;
                    for (int i=0;i<16;i++)
                    {
                        if((registeredClaims[i].claimantName == claimant1.name) && (registeredClaims[i].claimantSurname== claimant1.surname))
                        {
                            
                     jTable1.getModel().setValueAt((int)registeredClaims[i].claim_ID, l, 0); // ID
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantName, l, 1); // Name
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantSurname, l, 2); // Surname
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantLocation, l, 3); // Location
                     jTable1.getModel().setValueAt(registeredClaims[i].claimDate, l, 4); // Date
                     jTable1.getModel().setValueAt((int)registeredClaims[i].claimCostOfDmg, l, 5); // Cost of Dmg
                     jTable1.getModel().setValueAt((String)registeredClaims[i].claimDecision, l, 6); // Decision
                                 l++;
                        }
                    }
            break;
            case "Claimant 2":
                    int k=0;
                     for (int i=0;i<16;i++)
                    {
                        if((registeredClaims[i].claimantName == claimant2.name) && (registeredClaims[i].claimantSurname== claimant2.surname))
                        {
                            
                                     
                     jTable1.getModel().setValueAt((int)registeredClaims[i].claim_ID, k, 0); // ID
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantName, k, 1); // Name
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantSurname, k, 2); // Surname
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantLocation, k, 3); // Location
                     jTable1.getModel().setValueAt(registeredClaims[i].claimDate, k, 4); // Date
                     jTable1.getModel().setValueAt((int)registeredClaims[i].claimCostOfDmg, k, 5); // Cost of Dmg
                     jTable1.getModel().setValueAt((String)registeredClaims[i].claimDecision, k, 6); // Decision
                                 k++;
                        }
                    }
            break;
            case "Claimant 3":
                    int j=0;
                    for (int i=0;i<16;i++)
                    {
                        if((registeredClaims[i].claimantName == claimant3.name) && (registeredClaims[i].claimantSurname== claimant3.surname))
                        {
                        
                     jTable1.getModel().setValueAt((int)registeredClaims[i].claim_ID, j, 0); // ID
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantName, j, 1); // Name
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantSurname, j, 2); // Surname
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantLocation, j, 3); // Location
                     jTable1.getModel().setValueAt(registeredClaims[i].claimDate, j, 4); // Date
                     jTable1.getModel().setValueAt((int)registeredClaims[i].claimCostOfDmg, j, 5); // Cost of Dmg
                     jTable1.getModel().setValueAt((String)registeredClaims[i].claimDecision, j, 6); // Decision
                              j++;   
                        }
                    }
            break;
            case "Claimant 4":
                
                     int m=0;
                    for (int i=0;i<16;i++)
                    {
                        if((registeredClaims[i].claimantName == claimant3.name) && (registeredClaims[i].claimantSurname== claimant3.surname))
                        {
                        
                     jTable1.getModel().setValueAt((int)registeredClaims[i].claim_ID, m, 0); // ID
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantName, m, 1); // Name
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantSurname, m, 2); // Surname
                     jTable1.getModel().setValueAt(registeredClaims[i].claimantLocation, m, 3); // Location
                     jTable1.getModel().setValueAt(registeredClaims[i].claimDate, m, 4); // Date
                     jTable1.getModel().setValueAt((int)registeredClaims[i].claimCostOfDmg, m, 5); // Cost of Dmg
                     jTable1.getModel().setValueAt((String)registeredClaims[i].claimDecision, m, 6); // Decision
                              m++;   
                        }
                    }
             break;
            default: break;
        }

    }//GEN-LAST:event_Proceed_ButtonActionPerformed

    private void BackToPage_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToPage_ButtonActionPerformed

        LoginPage login = new LoginPage();
        if (damageHistory==true){
            PendingClaimsPage pen= new PendingClaimsPage();
            pen.setVisible(true);
            this.dispose();
        
        }
        else if (login.userRole == "EmployeeOfCD")
        {
            EmployeeOfCDPage e = new EmployeeOfCDPage();
            e.setVisible(true);
            this.setVisible(false);
        }

        else if (login.userRole == "ClaimHandlerA")
        {
            ClaimHandlerAPage chA = new ClaimHandlerAPage();
            chA.setVisible(true);
            this.setVisible(false);
        }
        
        else if (login.userRole == "Claimant")
        {
            ClaimantPage claimant = new ClaimantPage();
            claimant.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_BackToPage_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ClaimHistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClaimHistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClaimHistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClaimHistoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClaimHistoryPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToPage_Button;
    private javax.swing.JButton Proceed_Button;
    private javax.swing.JComboBox SelectCustomerBox;
    private javax.swing.JLabel Select_Claimant;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
