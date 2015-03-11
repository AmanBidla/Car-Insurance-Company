package cicTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cicSrc.Application;
import cicSrc.Claimant;
import cicSrc.EmployeeOfDeptCD;
import cicSrc.ClaimHandlerA;
import cicSrc.GarageOwner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Ioannis Papakostas
 */
public class Registration {
     
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
      Application.initialize();
    }
                
    
    @After
    public void tearDown() {
    }

 @Test
	public void create_registration_test() {
            
               	assertEquals("Charlie",Application.claimant1.getname());
                assertEquals("Hebdo",Application.claimant1.getsurname());
                assertEquals("IamCharlie",Application.claimant1.getusername());
                assertEquals("13579",Application.claimant1.getpassword());	
                
                assertEquals("Georgie",Application.employeeCD.getname());
                assertEquals("The Ge(r)m",Application.employeeCD.getsurname());
                assertEquals("Billy",Application.employeeCD.getusername());
                assertEquals("Elliot",Application.employeeCD.getpassword());
                
                assertEquals("Yanni",Application.claimHandlerA.getname());
                assertEquals("The Pimp",Application.claimHandlerA.getsurname());
                assertEquals("johnny",Application.claimHandlerA.getusername());
                assertEquals("aoua",Application.claimHandlerA.getpassword());
                
                assertEquals("Ioannis",Application.garage1.getname());
                assertEquals("Papakostas",Application.garage1.getsurname());
                assertEquals("johnnyaoua",Application.garage1.getusername());
                assertEquals("12345",Application.garage1.getpassword());
	}
        
                

}
