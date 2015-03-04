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
    
    public void IssuePaymentOrder(Claim a, Claimant b){
        
        
    }
    
}
