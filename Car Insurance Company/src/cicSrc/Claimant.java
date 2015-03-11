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
    
    //Insurance details
    public int costOfInsurance;
    public String expiringDateOfInsurance;
    public String plateNumber;
    public int priceOfCar;
    
    //Accident History
    public List<String> AccidentDate = new ArrayList<String>();
    public List<String> AccidentTime = new ArrayList<String>();
    public List<String> AccidentLocation = new ArrayList<String>();
    public List<String> AccidentDamage = new ArrayList<String>();
    public List AccidentCost = new ArrayList();
    
    
    
    
    public Claimant(){}
    
    public Claimant(String name, String surname, String username, String password,String plate,String expDateOfIns){
                this.name = name;
                this.surname = surname;
		this.username = username;
		this.password = password;
                this.plateNumber = plate;
                this.expiringDateOfInsurance=expDateOfIns;
    }
    
    
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
     public int getCostOfInsurance() {
            return this.costOfInsurance;
         }
     public String getPlateNumber(){
         return this.plateNumber;
      }
     public int getPriceOfCar(){
         return this.priceOfCar;
     }
     
     public Claim reportClaim(Claimant claimant){
         
         Scanner location= new Scanner(System.in);
         String claimLoc=location.next();
         Scanner date= new Scanner(System.in);
         String claimDate=date.next();
         Scanner cost= new Scanner(System.in);
         int claimCost=cost.nextInt();
         
         Claim claim=new Claim(claimant.name,claimant.surname,claimLoc,claimDate,claimCost);
         
         claim.claimStatus="Reported";
         
         return claim;
         
         
    }
     
    public void fillinForm(Form form) {
        
        
        
        if ((form.formStatus.equals("Created!") || form.formStatus.equals("Not filled correctly!"))&& form.formType.equals("Simple Form")){
            
            System.out.println("Name");
            Scanner name=new Scanner(System.in);
            form.formName= name.next();
            
            System.out.println("Surname");
            Scanner surname=new Scanner(System.in);
            form.formSurname=surname.next();
            
            System.out.println("Date of Accident");
            Scanner date=new Scanner(System.in);
            form.formDateOfAccident=date.next();
            
            System.out.println("Location");
            Scanner location=new Scanner(System.in);
            form.formLocationOfAccident=location.next();
            
            System.out.println("Your plate number");
            Scanner plate=new Scanner(System.in);
            form.formInsuredPersonPlate = plate.next();
            
            form.formStatus = "Filled in-Needs to be checked!";
            
        }
        else if ((Application.form1.formStatus.equals("Created!") || Application.form1.formStatus.equals("Not filled correctly!"))&& Application.form1.formType.equals("Complex Form")){
            
            System.out.println("Name");
            Scanner name=new Scanner(System.in);
            form.formName= name.next();
            
            System.out.println("Surname");
            Scanner surname=new Scanner(System.in);
            form.formSurname=surname.next();
            
            System.out.println("Date of Accident");
            Scanner date=new Scanner(System.in);
            form.formDateOfAccident=date.next();
            
            System.out.println("Location");
            Scanner location=new Scanner(System.in);
            form.formLocationOfAccident=location.next();
            
            System.out.println("Your plate number");
            Scanner plate=new Scanner(System.in);
            form.formInsuredPersonPlate = plate.next();
           
            System.out.println("Do you agree with a 5% increase in your monthly instalments?");
            Scanner answer=new Scanner(System.in);
            form.formAgreementOnIncreaseInPremiums = answer.next();
            
            
            form.formStatus = "Filled in-Needs to be checked!";
            
        
         }
    }

}
