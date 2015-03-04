/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author george
 */
import java.util.ArrayList;
import java.util.*;

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
    
   
    
    public boolean CheckDmgHistory(Claimant a){  
            //printing the the lists for Damage History
         for(String s:a.Date){
            System.out.println(s);
         }
         
          for(String s:a.Time){
            System.out.println(s);
         }
          
           for(String s:a.Location){
            System.out.println(s);
         }
           
            for(String s:a.Damage){
            System.out.println(s);
         }
            
             for(String s:a.Cost){
            System.out.println(s);
         }
            
         // Validation process for Damage History starts here
        
         return true;
         
        }
 
    public boolean PhoneGarage(GarageOwner a){
        return true;
    }
        
    public boolean CheckInsurance(Claimant a){
        return true;
    }
}
