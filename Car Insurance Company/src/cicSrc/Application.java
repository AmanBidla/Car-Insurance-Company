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
<<<<<<< HEAD
    public static GarageOwner garage1;
=======
    public static Form form2;
>>>>>>> 2cce2cffb373da66b1a157c086c594ebe9285111
    
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
        
        
        //empoyee of CD Dept creation
        employeeCD = new EmployeeOfDeptCD("Georgie","The Ge(r)m","Billy","Elliot");
        
        //claimant creation
        claimant1 = new Claimant("Charlie","Hebdo","IamCharlie","13579","IK 5345","2018/03/12");
        claimant1.priceOfCar = 32000;
        claimant2 = new Claimant("Charles","Hebdos","IamCharles","13579","IM 3224","2015/04/22");
        claimant2.priceOfCar = 23000;
        claimant3 = new Claimant("Tsoutsounis","Paparopoulos","tsoutsou","megalh","ZN 1212","2014/08/31");
        claimant3.priceOfCar = 18000;
        
        //claim creation
        claim1 = new Claim("Charlie","Hebdo","Kungsgatan 17,Stockholm","2014/12/11",1000);
        claim1.amount_of_payment = claim1.claimCostOfDmg;
        claim2 = new Claim ("Charles","Hebdos","Emmyvagen 3,Solna","2015/01/05",6000);
        claim3 = new Claim ("Tsoutsounis","Paparopoulos","Elvagen 5,Solna","2014/09/07",3000);
        
        //claim Handler creation
        claimHandlerA = new ClaimHandlerA("Yanni","The Pimp","johnny","aoua");
        
        //form creation
        form1= new Form();
        form1.formType="Simple Form";
        form1.formStatus="Created!";      

        form2=new Form();
        form2.formType="Simple Form";
        form2.formName="Charles";
        form2.formSurname="Hebdos";
        form2.formDateOfAccident="2015/01/05";
        form2.formInsuranceExpiringDate="2015/04/22";
        form2.formInsuredPersonPlate="IM 3224";
        form2.formPersonInvolvedInTheAccidentPlate="LS 8665";   
        form2.formStatus="Filled in-Needs to be checked!";

        //claimant records
        claimant1.AccidentDate.add(new String("2014/12/11"));
        claimant1.AccidentDamage.add(new String("right wing"));
        claimant1.AccidentCost.add(claim1.amount_of_payment);
        claimant1.AccidentLocation.add(new String("Kungsgatan 17,Stockholm"));
        claimant1.AccidentTime.add(new String("18:55"));
        
        //garage owner creation
        garage1 = new GarageOwner("Ioannis","Papakostas","johnnyaoua", "12345");
    
    
    
    }    
        
        
        
        
                
   
    
    
}

