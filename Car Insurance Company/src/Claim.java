/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author george
 */
public class Claim {
    
    String claimantName;
    String claimantSurname;
    String claimantLocation;
    String claimCategory;
    String claimDecision;
    String claimStatus;
    String formType;
    String formStatus;
    
    public Claim(){}
    
    public void setClaimCategory(String claimCategory){
        this.claimCategory = claimCategory;
    }
    public String getClaimCategory(){
        return this.claimCategory;
    }
    
    public void setClaimDecision(String claimDecision){
        this.claimDecision = claimDecision;
        
    }
    
    public String getClaimDecision(){
        return this.claimDecision;
        
    }
    
    public void setClaimStatus (String claimStatus){
        this.claimStatus= claimStatus;
    
    
    }
    
    public String getClaimStatus (){
        return this.claimStatus;
    
    
    }
    
    public boolean CheckDmgHistory(){            
            return true;
        }
 
    public boolean PhoneGarage(){
        return true;
    }
        
    public boolean CheckInsurance(){
        return true;
    }
}
