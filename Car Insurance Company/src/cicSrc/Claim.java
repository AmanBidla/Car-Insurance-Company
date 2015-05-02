package cicSrc;

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
    
    public String claimantName;
    public String claimantSurname;
    public String claimantLocation;
    public String claimDate;
    public String claimCategory;//simple, complex
    public String claimDecision;//positive, negative
    public String claimStatus; //reported, claimantInsured, classified, accepted, rejected, registered, sent for payment
    public Boolean payment;
    public int claim_ID; // ID number for claims - incrementing with every new claim
    public int amount_of_payment = 0;
    public int claimCostOfDmg;
    
    public static Claim[] pending = new Claim[10];
    public static Claim[] paid = new Claim[10];
   // public int priceOfCar;
    
    public Claim(){}
    
    public Claim(String name,String surname,String location,String date,int cost){
        this.claimantName=name;
        this.claimantSurname=surname;
        this.claimantLocation=location;
        this.claimDate=date;
        this.claimCostOfDmg=cost;
    
    
    }
    
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
        
}
