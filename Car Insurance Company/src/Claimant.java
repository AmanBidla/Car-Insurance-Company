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
    
    
    
    List<String> AccidentDate = new ArrayList<String>();
    List<String> AccidentTime = new ArrayList<String>();
    List<String> AccidentLocation = new ArrayList<String>();
    List<String> AccidentDamage = new ArrayList<String>();
    List<String> AccidentCost = new ArrayList<String>();
    List<String> InsuranceExpiration = new ArrayList<String>();
    List<String> InsuranceCost = new ArrayList<String>();
    
    
     public void GetDmgHistory(){  
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
            
             for(String s:this.AccidentCost){
            System.out.println(s);
         }
         
        }
    
     public void GetInsurance(){
         for(String s:this.InsuranceExpiration){
            System.out.println(s);
         }
         for(String s:this.InsuranceCost){
            System.out.println(s);
         }
     }

}
