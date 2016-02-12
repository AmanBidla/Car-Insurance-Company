package cicSrc;

import static cicSrc.EmployeeOfDeptCD.CDReceivedMessage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ioannis Papakostas
 */
public class GarageOwner extends User{
    
    public static String GOSentMessage;
    public static String GOReceivedMessage;
    
    public GarageOwner(){}
    
    public GarageOwner(String name, String surname, String username, String password){
                this.name = name;
                this.surname = surname;
		this.username = username;
		this.password = password;
    }
    
     public String readMsg(){
         
      if (Application.MessageFromClaimant>0){
           
          GOReceivedMessage=Claimant.CLSentMessage;
            Application.MessageFromClaimant--;
            Application.MessageToGarage--;

        }
        else if(Application.MessageFromCDEmployee>0) {
            GOReceivedMessage=EmployeeOfDeptCD.CDSentMessage;
            Application.MessageFromCDEmployee--;
            Application.MessageToGarage--;
        } 
      return GOReceivedMessage;
    
     }
}
