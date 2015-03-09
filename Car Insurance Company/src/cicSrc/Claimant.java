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
import java.util.ArrayList;
import java.util.*;

public class Claimant extends User{
    
    
    public Claimant(){}
    
    public Claimant(String name, String surname, String username, String password){
                this.name = name;
                this.surname = surname;
		this.username = username;
		this.password = password;
    }
    
    //Insurance details
    float costOfInsurance;
    String expiringDateOfInsurance;
    String plateNumber;
    float priceOfCar;
    
    
    //Accident History
    List<String> AccidentDate = new ArrayList<String>();
    List<String> AccidentTime = new ArrayList<String>();
    List<String> AccidentLocation = new ArrayList<String>();
    List<String> AccidentDamage = new ArrayList<String>();
    List AccidentCost = new ArrayList();
    

    
    
     public void getDmgHistory(){  
            //printing the the lists for Damage History
         for(String s:this.AccidentDate){
            System.out.println(s);
         }
         
          for(String s:this.AccidentTime){
            System.out.println(s);
         }
          
           for(String s:this.AccidentLocation){
            System.out.println(s);
         }
           
            for(String s:this.AccidentDamage){
            System.out.println(s);
         }
            
             for(int s=0; s < this.AccidentCost.size(); s++)
             {
            System.out.println(this.AccidentCost.get(s));
         }
         
        }
    
     public String getExpiringDateOfInsurance(){
         return this.expiringDateOfInsurance;
            
         }
     public float getCostOfInsurance() {
            return this.costOfInsurance;
         }
     public String getPlateNumber(){
         return this.plateNumber;
      }
     public float getPriceOfCar(){
         return this.priceOfCar;
     }
     
     

}
