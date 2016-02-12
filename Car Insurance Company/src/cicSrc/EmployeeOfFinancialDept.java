package cicSrc;


import static cicSrc.Application.claim1;
import static cicSrc.Application.claimant1;
import java.util.ArrayList;
import java.util.List;
import cicSrc.Claim;
import cicSrc.Records;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ioannis Papakostas
 */
public class EmployeeOfFinancialDept extends User {
    
    public static String FDreceivedMessage;
    
    public EmployeeOfFinancialDept(){}
    
    public EmployeeOfFinancialDept(String name, String surname, String username, String password){
                this.name = name;
                this.surname = surname;
		this.username = username;
		this.password = password;
    }
    
    
    //method for issuing a payment for a claim "a"
    public void IssuePaymentOrder(Claim a){
        
       // a.amount_of_payment = b.AccidentCost.get(b.AccidentCost.size()-1);
        a.payment = true;
    }
    
    protected void AddPaymentToRecordsOfPayments(Claim a, Claimant b, Records c){
        
        c.Name.add(new String(b.name));
        c.Surname.add(new String(b.surname));
        c.AmountOfPayment.add(b.AccidentCost.get(b.AccidentCost.size()-1)) ;
        c.Date.add(b.AccidentDate.get(b.AccidentDate.size() - 1));
        
    }
    
    public void setRecord(Claimant b, Claim a){
        
        b.AccidentDate.add(new String(a.claimDate));
        b.AccidentLocation.add(new String(a.claimantLocation));
        b.AccidentCost.add(a.amount_of_payment);
        
    }
    
     public String readMsg(){
         
      if (Application.MessageFromCDEmployee>0){
           
          FDreceivedMessage=EmployeeOfDeptCD.CDSentMessage;
            Application.MessageFromCDEmployee--;
            Application.MessageToFinanceDeptEmployee--;

        }
        
      return FDreceivedMessage;
    
     }     
}

