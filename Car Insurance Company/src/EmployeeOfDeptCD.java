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
public class EmployeeOfDeptCD extends User{
    
        //scanner for the update method 
        //might delete after the GUI implementation
    Scanner scanner = new Scanner(System.in);
    
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
            a.costOfInsurance=scanner.nextFloat();
            a.expiringDateOfInsurance=scanner.next();
            a.plateNumber=scanner.next();
            a.priceOfCar=scanner.nextFloat();
        
        
        }
         
<<<<<<< HEAD
        public boolean phoneGarage(Claimant a, GarageOwner b){
=======
        public boolean PhoneGarage(Claimant a, GarageOwner b){
            
>>>>>>> 4185ae3b72154515ef7207ccb353c852fe619fe4
             return true;
    }
        
        public boolean checkInsurance(Claimant a){
            a.GetInsurance();
            return true;
    }
     
        public boolean checkDmgHistory(Claimant a){
            a.GetDmgHistory();
            return true;
    }
    
    }

