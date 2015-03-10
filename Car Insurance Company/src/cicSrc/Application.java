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
    
    public static Claimant claimant1;
    public static Claim claim1;
    public static ClaimHandlerA claimHandlerA;
    public static EmployeeOfDeptCD employeeCD;
    
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
        

        claimant1 = new Claimant("Charlie","Hebdo","IamCharlie","13579");
        
        claim1 = new Claim("Charlie","Hebdo","Kungsgatan 17,Stockholm","2014/12/11",1000);
        
        claimHandlerA = new ClaimHandlerA("Yanni","The Pimp","johnny","aoua");

        
        
    
    
    
    }    
        
        
        
        
                
   
    
    
}

