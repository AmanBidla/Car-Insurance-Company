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
		
            
        Scanner input = new Scanner(System.in);
        
	User Papakwstas = new User();
        out.println("Give role");
        Papakwstas.role = input.next();
        out.println("Give name");
        Papakwstas.name = input.next();
        out.println("Give surname");
        Papakwstas.surname = input.next();
        out.println("Give username");
        Papakwstas.username = input.next();
        out.println("Give password");
        Papakwstas.password = input.next();
        
        input.close();
	
		assertEquals("A",Papakwstas.getrole());
		assertEquals("Ioannis",Papakwstas.getname());
                assertEquals("Papakostas",Papakwstas.getsurname());
                assertEquals("johnnyaoua",Papakwstas.getusername());
                assertEquals("12345",Papakwstas.getpassword());
		
		
		
	}

}
