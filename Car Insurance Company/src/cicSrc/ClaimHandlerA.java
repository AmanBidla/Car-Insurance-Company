package cicSrc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ioannis Papakostas
 */
public class ClaimHandlerA extends EmployeeOfDeptCD{
    
    public ClaimHandlerA(){}
    
    public ClaimHandlerA(String name, String surname, String username, String password){
                this.name = name;
                this.surname = surname;
		this.username = username;
		this.password = password;
    }
    
  
    public void mark_claim(Claim a, Claimant b, GarageOwner c){
        
    
        if (checkInsurance(b) == true){a.claimStatus="claimantInsured";}
        else {a.claimStatus="rejected";}
        
        if ((a.claimStatus.equals("claimantInsured")) && (a.claimCostOfDmg<5000) && (phoneGarage(b,c) == true))
        {
        a.claimDecision="positive";
        //here we can add a.setClaimStatus("accepted");
        
        }
        else{
        a.claimDecision="negative";
        //here we can add a.setClaimStatus("rejected");
                }
    }
    
    
}
