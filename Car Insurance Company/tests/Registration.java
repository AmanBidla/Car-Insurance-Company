/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    }
    
     
        
    
    @After
    public void tearDown() {
    }

 @Test
	public void create_registration_test() {
            
                
                Claimant a = new Claimant("Ioannis","Papakostas","johnnyaoua", "12345");
		assertEquals("Ioannis",a.getname());
                assertEquals("Papakostas",a.getsurname());
                assertEquals("johnnyaoua",a.getusername());
                assertEquals("12345",a.getpassword());	
                
                EmployeeOfDeptCD b = new EmployeeOfDeptCD("Ioannis","Papakostas","johnnyaoua", "12345");
                assertEquals("Ioannis",b.getname());
                assertEquals("Papakostas",b.getsurname());
                assertEquals("johnnyaoua",b.getusername());
                assertEquals("12345",b.getpassword());
                
                ClaimHandlerA c = new ClaimHandlerA("Ioannis","Papakostas","johnnyaoua", "12345");
                assertEquals("Ioannis",c.getname());
                assertEquals("Papakostas",c.getsurname());
                assertEquals("johnnyaoua",c.getusername());
                assertEquals("12345",c.getpassword());
                
                GarageOwner d = new GarageOwner("Ioannis","Papakostas","johnnyaoua", "12345");
                assertEquals("Ioannis",d.getname());
                assertEquals("Papakostas",d.getsurname());
                assertEquals("johnnyaoua",d.getusername());
                assertEquals("12345",d.getpassword());
	}
        
                

}
