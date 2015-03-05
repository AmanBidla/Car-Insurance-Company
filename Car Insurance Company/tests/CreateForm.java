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
public class CreateForm {
    
    public CreateForm() {
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
    public void createClaimForm_test() {
       
        Claim claim1 =new Claim();
        Form form1 =new Form();
        
        claim1.claimCategory="Complex";
        
        if (claim1.claimCategory.equals("Simple")){
            form1.formType ="Simple Form";
            form1.formStatus ="Created";
                       
        }
        else if (claim1.claimCategory.equals("Complex")){
            form1.formType= "Complex Form";
            form1.formStatus ="Created";
                    
        }
        
        
        assertFalse(form1.formType.equals("Complex"));
        assertEquals(form1.formStatus,"Created");
        
            
         
        }
       
}
