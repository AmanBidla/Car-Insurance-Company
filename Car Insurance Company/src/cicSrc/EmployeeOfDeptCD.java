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
import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class EmployeeOfDeptCD extends User{
    
        //scanner for the update method 
        //might delete after the GUI implementation
    Scanner scanner = new Scanner(System.in);
    
        // new instance of Date class
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
    
        public EmployeeOfDeptCD(){}
        
        public EmployeeOfDeptCD(String name, String surname, String username, String password){
                this.name = name;
                this.surname = surname;
		this.username = username;
		this.password = password;
    }
        public void updateDamageHistory(Claimant a){
            
            a.AccidentDate.add(new String(scanner.next())); 
            a.AccidentTime.add(new String(scanner.next())); 
            a.AccidentLocation.add(new String(scanner.next()));
            a.AccidentDamage.add(new String(scanner.next()));
            a.AccidentCost.add(scanner.nextInt()); 
            
        }
        
        public void updateInsuranceDetails(Claimant a){
            a.costOfInsurance=scanner.nextInt();
            a.expiringDateOfInsurance=scanner.next();
            a.plateNumber=scanner.next();
            a.priceOfCar=scanner.nextInt();
        
        
        }
        
         
        public boolean phoneGarage(Claimant a, GarageOwner b){
            
             return true;
    }
        
        //Checking if the expiration date exceeds today's date
        public boolean checkInsurance(Claimant a){
            if ((a.getExpiringDateOfInsurance().compareTo(dateFormat.format(date))) > 0)
            {
                return true;
            }
           else
                return false;
    }
     
        public boolean checkDmgHistory(Claimant a){
            a.getDmgHistory();
            return true;
    }
        
      public int checkCostOfDmg(Claim c){
        return c.claimCostOfDmg;
    }
    
        public void informClaimant(Claimant a){
            if (checkInsurance(a)== true)
                    {
                //TODO
                        //inform Claimant that his claim has been accepted.
                    }
            else
            {
            //TODO
                //inform Claimant that his claim must be rejected
            }
        }
        
        public void classifyClaim(Claim a, Claimant b){
        if ((b.priceOfCar > 30000) || (a.claimCostOfDmg > 5000) || (b.AccidentCost.size() > 3))
        {
        a.claimCategory="complex";
        }
        else{
                 a.claimCategory="simple";
                }
        
        //here we can add a.setClaimStatus("classified");
        }
        
        public Form createForm(Claim a){
            
            Form form1 = new Form();
            if (a.claimCategory.equals("Simple")){
            form1.formStatus ="Created";
            form1.formType ="Simple Form";
            return form1;
            }
            else if (a.claimCategory.equals("Complex")){
           
            form1.formStatus ="Created";
            form1.formType= "Complex Form";
                  
            }
            return form1;
            
        }
        public void checkForm(Claim a,Claimant c,Form f){
            boolean val;
        
        if (f.formStatus.equals("Filled in-Needs to be checked!")){
            val=(f.formName.equals(a.claimantName)) && (f.formSurname.equals(a.claimantSurname)) && (f.formDateOfAccident.equals(a.claimDate))
                    &&(f.formLocationOfAccident.equals(a.claimantLocation)) && (f.formInsuredPersonPlate.equals(c.plateNumber));
            if (val)
                f.formStatus= "Filled in correctly!";
            else
                f.formStatus= "Not filled in correctly!";
                     
        }
            
        
        }

    
    public void setClaimDecision(Claim a,String claimDecision){
        a.claimDecision = claimDecision;
        
    }
    
  
    
    public void setClaimStatus (Claim a,String claimStatus){
        a.claimStatus= claimStatus;
    
    
    }
    
     public int getPriceOfCar(Claimant a){
         return a.priceOfCar;
     }
     
         public String getExpiringDateOfInsurance(Claimant a){
         return a.expiringDateOfInsurance;
            
         }
     public int getCostOfInsurance(Claimant a) {
            return a.costOfInsurance;
         }
     public String getPlateNumber(Claimant a){
         return a.plateNumber;
      }
       
         public void setPriceOfCar(Claimant a, int k){
         a.priceOfCar=k;
     }
     
         public void setExpiringDateOfInsurance(Claimant a, String date){
         a.expiringDateOfInsurance=date;
            
         }
        public void setCostOfInsurance(Claimant a, int cost) {
          a.costOfInsurance=cost;
         }
        public void setPlateNumber(Claimant a, String plate){
         a.plateNumber = plate;
      }
        
        public String getDateHistory(Claimant a){
            return a.AccidentDate.get(a.AccidentDate.size()-1);
        }
        
        public String getLocationHistory(Claimant a){
            return a.AccidentLocation.get(a.AccidentDate.size()-1);
        }
        
        public int getCostHistory(Claimant a){
            int id= Integer.parseInt(a.AccidentCost.get(a.AccidentCost.size()-1).toString());
            return id;
        }
    }

