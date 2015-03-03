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
 * @author george
 */
public class Login {
    
    public Login() {
    }
    
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void login_successful_test() {
         
            String username= "IamCharlie";
            String password="13579";
            
            User user2 = new User("customer","Charlie","Hebdo","IamCharlie","13579");
            
            assertEquals(user2.username,username);
            assertEquals(user2.password,password);
        
        }
    
    @Test
    public void login_failed_test(){
            
            String username= "Charlie";
            String password="12345";
            
            User user2 = new User("customer","Charlie","Hebdo","IamCharlie","13579");
            
            assertFalse(user2.username.equals(username) || user2.password.equals(password));
           
    }
}
