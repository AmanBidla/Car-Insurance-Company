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
		
                User paparis = new User();
                paparis.role = "claimant";
                if (paparis.role.equals("claimant")){
                    
                Claimant a =new Claimant("Ioannis","Papakostas","johnnyaoua", "12345");
		assertEquals("Ioannis",a.getname());
                assertEquals("Papakostas",a.getsurname());
                assertEquals("johnnyaoua",a.getusername());
                assertEquals("12345",a.getpassword());	
	}
                else if (paparis.role.equals("claimant"))

}
