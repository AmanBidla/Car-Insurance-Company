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

import static cicInterface.ClaimsApprovedForPaymentPage.approvedforpayment;
import static cicInterface.NewClaimsPage.pendingClaimsNumber;
import static cicSrc.Application.unclassifiedClaims;
import static cicSrc.Application.unclassifiedIndex;
/*import static cicSrc.Application.Complex;
import static cicSrc.Application.DmgHistory;
import static cicSrc.Application.Insured;
import static cicSrc.Application.Negative;
import static cicSrc.Application.NotInsured;
import static cicSrc.Application.PhoneGarage;
import static cicSrc.Application.Positive;
import static cicSrc.Application.Simple;*/
import cicSrc.Application;
import static cicSrc.Application.ClaimsForClassification;
import static cicSrc.Application.newClaim;
import cicSrc.Claim;
import static cicSrc.Application.registeredIndex;
import static cicSrc.Application.registeredClaims;
import static cicSrc.Claim.pending;

public class PendingClaimsPage extends javax.swing.JFrame {

    /**
     * Creates new form PendingClaimsPage
     */
    
     //boolean variables checking when the positive button is pressed.
        /*boolean positive1=false;
        boolean positive2=false;
        boolean positive3=false;
        boolean positive4=false;*/
    public static boolean InsuranceChecked=false;
    public static boolean ClaimClassified=false;
    public static boolean DmgHistoryChecked=false;
    public static boolean GaragePhoned=false;
    public static boolean ClaimMarked=false;
    
    
    
        
        
        
        
    
    
    //number of approved payments (is subject to change depending on the approved payments each time)
    public static int approved_payments = 0;
    
    public PendingClaimsPage() {
        initComponents();
        /*this.CheckInsurance_Button.setVisible(false);
        this.ClassifyClaim_Button.setVisible(false);
        this.DamageHistory_Button.setVisible(false);
        this.ContactGarage_Button.setVisible(false);
        this.InsuranceProceed_Button.setVisible(false);
        this.ClassificationProceed_Button.setVisible(false);
        this.DamageHistoryProceed_Button.setVisible(false);
        this.GarageProceed_Button.setVisible(false);
        this.DecisionProceed_Button.setVisible(false);
        this.MoveToHistory_Button.setVisible(false);
        this.jLabel1.setVisible(false);*/
        this.InsuranceNotChecked_Label.setVisible(false);
        this.DmgHistory_Label.setVisible(false);
        this.Garage_Label.setVisible(false);
        this.Decision_Label.setVisible(false);
        this.ClaimHandlerA_Label.setVisible(false);
        this.History_Label.setVisible(false);
        this.NotInsured_Label.setVisible(false);
        
        LoginPage login = new LoginPage();
        if ((login.userRole=="Claimant") || (login.userRole=="GarageOwner") || (login.userRole=="FinanceDeptEmployee")){
          this.CheckInsurance_Button.setVisible(false);
          this.ClassifyClaim_Button.setVisible(false);
          this.DamageHistory_Button.setVisible(false);
          this.ContactGarage_Button.setVisible(false);
          this.InsuranceProceed_Button.setVisible(false);
          this.ClassificationProceed_Button.setVisible(false);
          this.DamageHistoryProceed_Button.setVisible(false);
          this.GarageProceed_Button.setVisible(false);
          this.DecisionProceed_Button.setVisible(false);
          this.MoveToHistory_Button.setVisible(false);
            
        }
        
        if (NewClaimsPage.pendingClaimsNumber>0){
            for (int i=0;i<NewClaimsPage.pendingClaimsNumber;i++){
                this.pendingClaims_Table.getModel().setValueAt((int)NewClaimsPage.pendingClaims[i], i, 0);
            
            
            }
            this.CheckInsurance_Button.setVisible(true);
            this.InsuranceProceed_Button.setVisible(true);
        
        }
        
        
        
        for (int i=0;i<pendingClaimsNumber;i++){
            this.pendingClaims_Table.getModel().setValueAt(Application.Insured[i],i,1);
            this.pendingClaims_Table.getModel().setValueAt(Application.NotInsured[i],i,2);
            this.pendingClaims_Table.getModel().setValueAt(Application.Simple[i],i,3);
            this.pendingClaims_Table.getModel().setValueAt(Application.Complex[i],i,4);
            this.pendingClaims_Table.getModel().setValueAt(Application.DmgHistory[i],i,5);
            this.pendingClaims_Table.getModel().setValueAt(Application.PhoneGarage[i],i,6);
            this.pendingClaims_Table.getModel().setValueAt(Application.Positive[i],i,7);
            this.pendingClaims_Table.getModel().setValueAt(Application.Negative[i],i,8);
            this.pendingClaims_Table.getModel().setValueAt((String)pending[i].claimStatus,i,9);
            
            
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

        BackToPage = new javax.swing.JButton();
        CheckInsurance_Button = new javax.swing.JButton();
        ClassifyClaim_Button = new javax.swing.JButton();
        DamageHistory_Button = new javax.swing.JButton();
        ContactGarage_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingClaims_Table = new javax.swing.JTable();
        InsuranceProceed_Button = new javax.swing.JButton();
        ClassificationProceed_Button = new javax.swing.JButton();
        DamageHistoryProceed_Button = new javax.swing.JButton();
        GarageProceed_Button = new javax.swing.JButton();
        DecisionProceed_Button = new javax.swing.JButton();
        MoveToHistory_Button = new javax.swing.JButton();
        InsuranceNotChecked_Label = new javax.swing.JLabel();
        DmgHistory_Label = new javax.swing.JLabel();
        Garage_Label = new javax.swing.JLabel();
        Decision_Label = new javax.swing.JLabel();
        History_Label = new javax.swing.JLabel();
        ClaimHandlerA_Label = new javax.swing.JLabel();
        NotInsured_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackToPage.setText("Back To Page ");
        BackToPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToPageActionPerformed(evt);
            }
        });

        CheckInsurance_Button.setText("Check Insurance");
        CheckInsurance_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInsurance_ButtonActionPerformed(evt);
            }
        });

        ClassifyClaim_Button.setText("Classify Claim");
        ClassifyClaim_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassifyClaim_ButtonActionPerformed(evt);
            }
        });

        DamageHistory_Button.setText(" Damage History");
        DamageHistory_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DamageHistory_ButtonActionPerformed(evt);
            }
        });

        ContactGarage_Button.setText("Contact Garage");
        ContactGarage_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactGarage_ButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(51, 23));

        pendingClaims_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Claim ID", "Insured", "Not Insured", "Simple", "Complex", "Damage History Checked", "Garage Owner Phoned", "Positive", "Negative", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        pendingClaims_Table.setRowHeight(22);
        jScrollPane1.setViewportView(pendingClaims_Table);

        InsuranceProceed_Button.setText("Proceed");
        InsuranceProceed_Button.setPreferredSize(new java.awt.Dimension(31, 23));
        InsuranceProceed_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsuranceProceed_ButtonActionPerformed(evt);
            }
        });

        ClassificationProceed_Button.setText("Proceed");
        ClassificationProceed_Button.setPreferredSize(new java.awt.Dimension(51, 23));
        ClassificationProceed_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassificationProceed_ButtonActionPerformed(evt);
            }
        });

        DamageHistoryProceed_Button.setText("Proceed");
        DamageHistoryProceed_Button.setPreferredSize(new java.awt.Dimension(51, 23));
        DamageHistoryProceed_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DamageHistoryProceed_ButtonActionPerformed(evt);
            }
        });

        GarageProceed_Button.setText("Proceed");
        GarageProceed_Button.setPreferredSize(new java.awt.Dimension(51, 23));
        GarageProceed_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GarageProceed_ButtonActionPerformed(evt);
            }
        });

        DecisionProceed_Button.setText("Proceed");
        DecisionProceed_Button.setPreferredSize(new java.awt.Dimension(51, 23));
        DecisionProceed_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecisionProceed_ButtonActionPerformed(evt);
            }
        });

        MoveToHistory_Button.setText("Move to History");
        MoveToHistory_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveToHistory_ButtonActionPerformed(evt);
            }
        });

        InsuranceNotChecked_Label.setText("Insurance not checked!");

        DmgHistory_Label.setText("Claim not classified!");

        Garage_Label.setText("Damage history not checked!");

        Decision_Label.setText("Garage owner not messaged!");

        History_Label.setText("Claim not marked!");

        ClaimHandlerA_Label.setText("Only claim handler A!");

        NotInsured_Label.setText("Claimant not insured!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NotInsured_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InsuranceNotChecked_Label)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(InsuranceProceed_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addGap(195, 195, 195)
                        .addComponent(ClassificationProceed_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DamageHistoryProceed_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DmgHistory_Label))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Garage_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GarageProceed_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addGap(155, 155, 155)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(DecisionProceed_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(358, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Decision_Label)
                            .addComponent(ClaimHandlerA_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(228, 228, 228)
                            .addComponent(CheckInsurance_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(172, 172, 172)
                            .addComponent(ClassifyClaim_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(129, 129, 129)
                            .addComponent(DamageHistory_Button)
                            .addGap(45, 45, 45)
                            .addComponent(ContactGarage_Button))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(History_Label)
                        .addComponent(MoveToHistory_Button))
                    .addComponent(BackToPage))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckInsurance_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClassifyClaim_Button)
                    .addComponent(DamageHistory_Button)
                    .addComponent(ContactGarage_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsuranceProceed_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClassificationProceed_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DamageHistoryProceed_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GarageProceed_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DecisionProceed_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoveToHistory_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsuranceNotChecked_Label)
                    .addComponent(DmgHistory_Label)
                    .addComponent(Garage_Label)
                    .addComponent(History_Label)
                    .addComponent(Decision_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClaimHandlerA_Label)
                    .addComponent(NotInsured_Label))
                .addGap(63, 63, 63)
                .addComponent(BackToPage)
                .addGap(217, 217, 217))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                  
        
    private void BackToPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToPageActionPerformed
        // TODO add your handling code here:
        
        LoginPage login = new LoginPage();
        if (login.userRole == "EmployeeOfCD")
        {
            EmployeeOfCDPage e = new EmployeeOfCDPage();
            e.setVisible(true);
            this.dispose();
        }
        
        else if (login.userRole == "ClaimHandlerA")
        {
            ClaimHandlerAPage c = new ClaimHandlerAPage();
            c.setVisible(true);
            this.dispose();
        }
        
        else if (login.userRole == "Claimant")
        {
            ClaimantPage p = new ClaimantPage();
            p.setVisible(true);
            this.dispose();
        }
        
        else if (login.userRole == "FinanceDeptEmployee")
        {
            FinanceDeptEmployeePage f = new FinanceDeptEmployeePage();
            f.setVisible(true);
            this.dispose();
        }
        
        else 
        {
            GarageOwnerPage g=new GarageOwnerPage();
            g.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BackToPageActionPerformed

    private void ClassifyClaim_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassifyClaim_ButtonActionPerformed
        for (int i=0;i<pendingClaimsNumber;i++)
        {
        
        
            for (int j=0;j<10;j++)
            {
                if (((int)this.pendingClaims_Table.getModel().getValueAt(i,0))== pending[j].claim_ID)
                { 
                    
                    unclassifiedClaims[unclassifiedIndex] = pending[j];
                    unclassifiedIndex++;
                    ClaimsForClassification++;
                }
            }
        }
        ClassifyClaimsPage classifyClaims=new ClassifyClaimsPage();
        classifyClaims.setVisible(true);
    }//GEN-LAST:event_ClassifyClaim_ButtonActionPerformed

    private void ContactGarage_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactGarage_ButtonActionPerformed
        // TODO add your handling code here:
        LoginPage login = new LoginPage();
        if (login.userRole == "EmployeeOfCD")
        {
            EmployeeCDOutboxPage employeeOutbox = new EmployeeCDOutboxPage();
            employeeOutbox.setVisible(true);
 
        }
        
        else if (login.userRole == "ClaimHandlerA")
        {
            ClaimHandlerAOutboxPage chAOutbox = new ClaimHandlerAOutboxPage();
            chAOutbox.setVisible(true);
            
        }
        
    }//GEN-LAST:event_ContactGarage_ButtonActionPerformed

    private void CheckInsurance_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInsurance_ButtonActionPerformed
        // TODO add your handling code here:
        ClaimantRecordsPage claimantRecords=new ClaimantRecordsPage();
        claimantRecords.setVisible(true);
       
        
    }//GEN-LAST:event_CheckInsurance_ButtonActionPerformed

    private void DamageHistory_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DamageHistory_ButtonActionPerformed
        // TODO add your handling code here:
        ClaimHistoryPage claimHistory=new ClaimHistoryPage();
        claimHistory.setVisible(true);
    }//GEN-LAST:event_DamageHistory_ButtonActionPerformed

    private void InsuranceProceed_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceProceed_ButtonActionPerformed
        
        for (int i=0;i<pendingClaimsNumber;i++){
        
            if ((Boolean)this.pendingClaims_Table.getModel().getValueAt(i, 1)==true){
                Application.Insured[i]=true;
                pending[i].claimStatus = "Insured";
                this.pendingClaims_Table.getModel().setValueAt(pending[i].claimStatus,i,9);
                
                
            
            }
            else if ((Boolean)this.pendingClaims_Table.getModel().getValueAt(i, 2)==true){
                Application.NotInsured[i]=true;
                this.pendingClaims_Table.getModel().setValueAt("Rejected!",i,9);
                
            
            
            }
            
        
        }
        
    }//GEN-LAST:event_InsuranceProceed_ButtonActionPerformed

    private void ClassificationProceed_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassificationProceed_ButtonActionPerformed
        
        for (int i=0;i<pendingClaimsNumber;i++){
            if ((Boolean)this.pendingClaims_Table.getModel().getValueAt(i, 3)==true){
                
                
            
                if (Application.Insured[i]==true){
                    InsuranceChecked=true;
                    this.InsuranceNotChecked_Label.setVisible(false);
                    this.NotInsured_Label.setVisible(false);
                    Application.Simple[i]=true;
                    this.pendingClaims_Table.getModel().setValueAt(true,i,5);
                    pending[i].claimStatus="Classified As Simple";
                    this.pendingClaims_Table.getModel().setValueAt((String)pending[i].claimStatus,i,9);
                }
                else if (Application.NotInsured[i]==true){
                    InsuranceChecked=true;
                    this.InsuranceNotChecked_Label.setVisible(false);
                    this.NotInsured_Label.setVisible(true);
                    
                }
                
                if (InsuranceChecked==false){
                    this.InsuranceNotChecked_Label.setVisible(true);
                }
                InsuranceChecked=false;
            
            } 
            else if((Boolean)this.pendingClaims_Table.getModel().getValueAt(i, 4)==true){
                if (Application.Insured[i]==true){
                    InsuranceChecked=true;
                    Application.Complex[i]=true;
                    pending[i].claimStatus="Classified As Complex";
                    this.pendingClaims_Table.getModel().setValueAt((String)pending[i].claimStatus,i,9);
                }
                else if (Application.NotInsured[i]==true){
                    InsuranceChecked=true;
                    this.NotInsured_Label.setVisible(true);
                    
                }
                
                if (InsuranceChecked==false){
                    this.InsuranceNotChecked_Label.setVisible(true);
                }
                InsuranceChecked=false;
                
            }
           
            
           
        
        }
        
    }//GEN-LAST:event_ClassificationProceed_ButtonActionPerformed

    private void DamageHistoryProceed_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DamageHistoryProceed_ButtonActionPerformed
        // TODO add your handling code here:
        for (int i=0;i<pendingClaimsNumber;i++){
            if ((Boolean)this.pendingClaims_Table.getModel().getValueAt(i, 5)==true){
                
                
            
                if ((Application.Complex[i]==true)||(Application.Simple[i]==true)){
                    ClaimClassified=true;
                    this.DmgHistory_Label.setVisible(false);
                    Application.DmgHistory[i]=true;
                    pending[i].claimStatus="Damage History Checked";
                    this.pendingClaims_Table.getModel().setValueAt((String)pending[i].claimStatus,i,9);
               
                }
       
                
                if (ClaimClassified==false){
                    this.DmgHistory_Label.setVisible(true);
                }
                ClaimClassified=false;
            
            } 
            
        }
       
       
        
    }//GEN-LAST:event_DamageHistoryProceed_ButtonActionPerformed

    private void GarageProceed_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GarageProceed_ButtonActionPerformed
        
        for (int i=0;i<pendingClaimsNumber;i++){
            if ((Boolean)this.pendingClaims_Table.getModel().getValueAt(i, 6)==true){
                
                
            
                if ((Application.DmgHistory[i]==true)){
                    DmgHistoryChecked=true;
                    this.Garage_Label.setVisible(false);
                    Application.PhoneGarage[i]=true;
                    pending[i].claimStatus="Garage Owner Phoned";
                    this.pendingClaims_Table.getModel().setValueAt((String)pending[i].claimStatus,i,9);
               
                }
       
                
                if (DmgHistoryChecked==false){
                    this.Garage_Label.setVisible(true);
                }
                DmgHistoryChecked=false;
            
            } 
            
        }
        
        
        
    }//GEN-LAST:event_GarageProceed_ButtonActionPerformed

    private void DecisionProceed_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecisionProceed_ButtonActionPerformed
        LoginPage login=new LoginPage();
        
        if (login.userRole == "EmployeeOfCD"){
            this.ClaimHandlerA_Label.setVisible(true);
        
        }
        else if (login.userRole=="ClaimHandlerA"){
            this.ClaimHandlerA_Label.setVisible(false);
        
            for (int i=0;i<pendingClaimsNumber;i++){
        
            if ((Boolean)this.pendingClaims_Table.getModel().getValueAt(i, 7)==true){
                
                if (Application.PhoneGarage[i]==true){
                    GaragePhoned=true;
                    this.Decision_Label.setVisible(false);
                    pending[i].claimStatus="Approved For Payment";
                    this.pendingClaims_Table.getModel().setValueAt((String)pending[i].claimStatus,i,9);
                    approvedforpayment[approved_payments]=pending[i];
                    Application.Positive[i]=true;
                    approved_payments++;
                }
                
                if(GaragePhoned==false){
                    this.Decision_Label.setVisible(true);
                
                }
                GaragePhoned=false;
                //insert this claim in an array with the approved claims-it's easier if this array has some or all of the columns of the newClaims array
            }
            else if((Boolean)this.pendingClaims_Table.getModel().getValueAt(i, 8)==true){
                
                if (Application.PhoneGarage[i]==true){
                   GaragePhoned=true; 
                   pending[i].claimStatus = "Rejected!";
                   this.pendingClaims_Table.getModel().setValueAt((String)pending[i].claimStatus,i,9);
                   Application.Negative[i]=true;
                }
                
                if(GaragePhoned==false){
                    this.Decision_Label.setVisible(true);
                
                }
                GaragePhoned=false;
            }
            
        }
      }
    }//GEN-LAST:event_DecisionProceed_ButtonActionPerformed

    private void MoveToHistory_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveToHistory_ButtonActionPerformed
        // TODO add your handling code here:
        for (int i=0;i<pendingClaimsNumber;i++){
        
            if (((String)this.pendingClaims_Table.getModel().getValueAt(i, 9)=="Approved For Payment!")||((String)this.pendingClaims_Table.getModel().getValueAt(i, 9)=="Rejected!"))
            {
                
                //register claim to the array of ClaimsHistoryPage
                pending[i].claimStatus = "Registered!";
                this.pendingClaims_Table.getModel().setValueAt((String)pending[i].claimStatus,i,9);
                for (int j=0;j<10;j++)
                {
                if (((int)this.pendingClaims_Table.getModel().getValueAt(i,0))== pending[j].claim_ID)
                {
                    registeredClaims[registeredIndex] = pending[j];
                    registeredIndex++;
                }
                }
                
                
                
            
            }
        }
        ClaimHistoryPage claimHistory=new ClaimHistoryPage();
        claimHistory.setVisible(true);
    }//GEN-LAST:event_MoveToHistory_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PendingClaimsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendingClaimsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendingClaimsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendingClaimsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendingClaimsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToPage;
    private javax.swing.JButton CheckInsurance_Button;
    private javax.swing.JLabel ClaimHandlerA_Label;
    private javax.swing.JButton ClassificationProceed_Button;
    private javax.swing.JButton ClassifyClaim_Button;
    private javax.swing.JButton ContactGarage_Button;
    private javax.swing.JButton DamageHistoryProceed_Button;
    private javax.swing.JButton DamageHistory_Button;
    private javax.swing.JButton DecisionProceed_Button;
    private javax.swing.JLabel Decision_Label;
    private javax.swing.JLabel DmgHistory_Label;
    private javax.swing.JButton GarageProceed_Button;
    private javax.swing.JLabel Garage_Label;
    private javax.swing.JLabel History_Label;
    private javax.swing.JLabel InsuranceNotChecked_Label;
    private javax.swing.JButton InsuranceProceed_Button;
    private javax.swing.JButton MoveToHistory_Button;
    private javax.swing.JLabel NotInsured_Label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pendingClaims_Table;
    // End of variables declaration//GEN-END:variables
}
