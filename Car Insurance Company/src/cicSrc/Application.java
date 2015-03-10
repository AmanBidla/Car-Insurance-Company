package cicSrc;


import cicSrc.Admin;
import static java.lang.System.out;
import java.util.Scanner;
import static org.junit.Assert.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author george
 */
public class Application {
    
    public static Claimant claimant1,claimant2,claimant3;
    public static Claim claim1,claim2,claim3;
    public static ClaimHandlerA claimHandlerA;
    public static EmployeeOfDeptCD employeeCD;
    public static Form form1;
    
    public static void main (String[] args){
        
        boolean value=false; 
        
        //apo dw kai meta testarw
        
       
        
        // edw teleiwnei to test space mou
        
        /*administrator created */
        Admin admin = new Admin();
        admin.username = "admin";
        admin.password = "admin";
        
        
         
        //admin.register();
        
        //Claimant claimant1 = new Claimant("Charlie","Hebdo","IamCharlie","13579");
        //ClaimHandlerA claimHandlerA = new ClaimHandlerA("Yanni","The Pimp","johnny","aoua");
        /*
        while (value==false){
        System.out.println("Give username");
        Scanner username= new Scanner(System.in);
        String user= username.next();
        
        System.out.println("Give password");
        Scanner password= new Scanner(System.in);
        String pass=password.next();
        
        
        value= claimant1.login(user, pass);
        }*/
    }    
    
    public static void initialize(){
        
        
        
        employeeCD = new EmployeeOfDeptCD();
        

        claimant1 = new Claimant("Charlie","Hebdo","IamCharlie","13579","IK 5345","2018/03/12");
        claimant1.priceOfCar = 32000;
        claimant2 = new Claimant("Charles","Hebdos","IamCharles","13579","IM 3224","2015/04/22");
        claimant2.priceOfCar = 23000;
        claimant3 = new Claimant("Tsoutsounis","Paparopoulos","tsoutsou","megalh","ZN 1212","2014/08/31");
        claimant3.priceOfCar = 18000;
        
        claim1 = new Claim("Charlie","Hebdo","Kungsgatan 17,Stockholm","2014/12/11",1000);
        claim2 = new Claim ("Charles","Hebdos","Emmyvagen 3,Solna","2015/01/05",6000);
        claim3 = new Claim ("Tsoutsounis","Paparopoulos","Elvagen 5,Solna","2014/09/07",3000);
        claimHandlerA = new ClaimHandlerA("Yanni","The Pimp","johnny","aoua");
        
        form1= new Form();
        form1.formType="Simple Form";
        form1.formStatus="Created!";

        
        
    
    
    
    }    
        
        
        
        
                
   
    
    
}

