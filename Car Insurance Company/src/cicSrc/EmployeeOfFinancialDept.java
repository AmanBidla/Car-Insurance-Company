package cicSrc;


import java.util.ArrayList;
import java.util.List;

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
    
    public EmployeeOfFinancialDept(){}
    
    public EmployeeOfFinancialDept(String name, String surname, String username, String password){
                this.name = name;
                this.surname = surname;
		this.username = username;
		this.password = password;
    }
    //Records Of Payments
    List<String> Name = new ArrayList<String>();
    List<String> Surname = new ArrayList<String>();
    List AmountOfPayment = new ArrayList();
    List<String> Date = new ArrayList<String>();
    
    //method for issuing a payment for a claim "a"
    public void IssuePaymentOrder(Claim a){
        
       // a.amount_of_payment = b.AccidentCost.get(b.AccidentCost.size()-1);
        a.payment = true;
    }
    
    protected void AddPaymentToRecordsOfPayments(Claim a, Claimant b){
        
        this.Name.add(new String(b.name));
        this.Surname.add(new String(b.surname));
        this.AmountOfPayment.add(b.AccidentCost.get(b.AccidentCost.size()-1)) ;
        this.Date.add(b.AccidentDate.get(b.AccidentDate.size() - 1));
        
    }
}
