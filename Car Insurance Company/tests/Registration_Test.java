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
import java.util.Scanner;
import static java.lang.System.*;

/**
 *
 * @author Ioannis Papakostas
 */
public class Registration_Test {
     
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
		/*User paparis = new User();
                paparis.role = "A";
                paparis.name = "Ioannis";
                paparis.surname = "Papakostas";
                paparis.username = "johnnyaoua";
                paparis.password = "12345";*/
                User paparis = new User("A", "Ioannis", "Papakostas", "johnnyaoua", "12345");
		assertEquals("A",paparis.getrole());
		assertEquals("Ioannis",paparis.getname());
                assertEquals("Papakostas",paparis.getsurname());
                assertEquals("johnnyaoua",paparis.getusername());
                assertEquals("12345",paparis.getpassword());	
	}

}
