
import static java.lang.System.out;
import java.util.Scanner;
import static org.junit.Assert.*;

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
    public static void main (String[] args){
        
        boolean value=false; 
        
        //apo dw kai meta testarw
        Claim claim = new Claim();
        Claimant a = new Claimant();
        
         
        value = claim.CheckDmgHistory(a);
        
        assertTrue("everything is ok",value);
        
        // edw teleiwneit to test space mou
        
        /*administrator created */
       /* User admin = new User();
        admin.username = "admin";
        admin.password = "admin";
         
        admin.register();
        
        User user1 = new User("customer","Charlie","Hebdo","IamCharlie","13579");
        
        while (value==false){
        System.out.println("Give username");
        Scanner username= new Scanner(System.in);
        String user= username.next();
        
        System.out.println("Give password");
        Scanner password= new Scanner(System.in);
        String pass=password.next();
        
        
        value= user1.login(user, pass);
        }
        
        */
                
    }
    
}

