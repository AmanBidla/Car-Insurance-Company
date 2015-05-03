package cicSrc;


import cicSrc.Admin;
import static java.lang.System.out;
import java.util.Scanner;
import static org.junit.Assert.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import cicInterface.LoginPage;
import cicInterface.ReportClaimPage;
import static cicInterface.ReportClaimPage.last;
import static cicSrc.Claim.pending;

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

    public static GarageOwner garage1;

    public static Form form2;

    public static EmployeeOfFinancialDept financialDeptEmployee;
    
    public static int MessageToCDEmployee=0;
    public static int MessageToClaimant=0;
    public static int MessageToFinanceDeptEmployee=0;
    public static int MessageToGarage=0;
    public static int MessageToClaimHandlerA=0;
    
    public static int MessageFromCDEmployee=0;
    public static int MessageFromClaimant=0;
    public static int MessageFromFinanceDeptEmployee=0;
    public static int MessageFromGarage=0;
    public static int MessageFromClaimHandlerA=0;
    
    public static int NewClaims=0;
    
    public static int ClaimsForClassification=0;
    
    public static Claim[] newClaim=new Claim[10];
    
    public static Claim[] unclassifiedClaims=new Claim[10];
    public static int unclassifiedIndex=0;
    
    public static Claim[] simpleClaims=new Claim[10];
    public static int simpleIndex=0;
    
    public static Claim[] complexClaims=new Claim[10];
    public static int complexIndex=0;
    
    
    public static Claim[] registeredClaims = new Claim[16];
    public static int registeredIndex=0;
    
    public static int ID_number=1;
    
    public static boolean[] Insured= {false, false, false, false};
    public static boolean[] NotInsured={false, false, false, false};
    public static boolean[] Simple={false, false, false, false};
    public static boolean[] Complex={false, false, false, false};
    public static boolean[] DmgHistory={false, false, false, false};
    public static boolean[] PhoneGarage={false, false, false, false};
    public static boolean[] Positive={false, false, false, false};
    public static boolean[] Negative={false, false, false, false};
    
 
    
    

    
    public static void main (String[] args){
        
        
        
        //apo dw kai meta testarw
        
       
        
        // edw teleiwnei to test space mou
        
        initialize();
        LoginPage login=new LoginPage();
        
        login.setVisible(true);
        
        
        
        
         
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
        claimant1.costOfInsurance = 650;
        claimant2 = new Claimant("Charles","Hebdos","IamCharles","13579","IM 3224","2015/04/22");
        claimant2.priceOfCar = 23000;
        claimant2.costOfInsurance = 450;
        claimant3 = new Claimant("Tsoutsounis","Paparopoulos","tsoutsou","megalh","ZN 1212","2014/08/31");
        claimant3.priceOfCar = 18000;
        claimant3.costOfInsurance = 410;
        
        /*boolean value=false;
        while (value==false){
        value=claimant1.login(claimant1);
        }*/
        
        for (int i=0;i<10;i++){
            newClaim[i]=new Claim();
            unclassifiedClaims[i]=new Claim();
            simpleClaims[i]=new Claim();
            complexClaims[i]=new Claim();
            registeredClaims[i]=new Claim();
            pending[i]=new Claim();
        
        }
        
        //claim creation - I assume that claim1 coreesponds to claimant1,claim2 to claimant2 etc.
        claim1 = new Claim("Charlie","Hebdo","Kungsgatan 17,Stockholm","2014/12/11",1000);
        claim1.amount_of_payment = claim1.claimCostOfDmg;
        claim1.claim_ID = ID_number;
        ID_number++;
        newClaim[0]= claim1;
        Application.NewClaims++;
        last++;
        claim2 = new Claim ("Charles","Hebdos","Emmyvagen 3,Solna","2015/01/05",6000);
        claim2.claim_ID = ID_number;
        ID_number++;
        newClaim[1]= claim2;
        last++;
        Application.NewClaims++;
        claim3 = new Claim ("Tsoutsounis","Paparopoulos","Elvagen 5,Solna","2014/09/07",3000);
        claim3.claim_ID = ID_number;
        ID_number++;
        newClaim[2]= claim3; // append claim to new claims array
        Application.NewClaims++;
        last++;
        
        //claim Handler creation
        claimHandlerA = new ClaimHandlerA("Yanni","The Pimp","johnny","aoua");
        
        //form creation - form1 corresponds to claim1,form2 to claim2 etc.
        form1= new Form();
        form1.formType="Simple Form";
        form1.formStatus="Created!";      

        form2=new Form();
        form2.formType="Simple Form";
        form2.formName="Charles";
        form2.formSurname="Hebdos";
        form2.formDateOfAccident="2015/01/05";
        form2.formLocationOfAccident="Emmyvagen 3,Solna";
        form2.formInsuredPersonPlate="IM 3224";  
        form2.formStatus="Filled in-Needs to be checked!";

        //claimant records
        claimant1.AccidentDate.add(new String("2014/12/11"));
        claimant1.AccidentDamage.add(new String("right wing"));
        claimant1.AccidentCost.add(claim1.amount_of_payment);
        claimant1.AccidentLocation.add(new String("Kungsgatan 17,Stockholm"));

        
        //EmployeeOfFinancialDept
        
        financialDeptEmployee=new EmployeeOfFinancialDept("geo","dik","fin","emp");
        

       

        

        claimant1.AccidentTime.add(new String("18:55"));

        
        //garage owner creation
        garage1 = new GarageOwner("Ioannis","Papakostas","johnnyaoua", "12345");
        
       /* for (int i=0;i<4;i++){
            Insured[i]=false;
            NotInsured[i]=false;
            Simple[i]=false;
            Complex[i]=false;
            DmgHistory[i]=false;
            PhoneGarage[i]=false;
            Positive[i]=false;
            Negative[i]=false;
            
        }*/
    
    
    
    }    
        
        
        
        
                
   
    
    
}

