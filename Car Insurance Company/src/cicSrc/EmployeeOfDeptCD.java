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
        if ((b.priceOfCar > 30000) || (a.costOfDmg > 5000) || (b.AccidentCost.size() > 3))
        {
        a.setClaimCategory("complex");
    }
        else{
                 a.setClaimCategory("simple");
                }
    }
        
    }

