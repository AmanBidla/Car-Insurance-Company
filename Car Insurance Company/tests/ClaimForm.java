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
public class ClaimForm {
    
    public ClaimForm() {
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
        Claim claim1 = new Claim();
        claim1.claimCategory="Complex";
        
        String claimCategory= claim1.getClaimCategory();
        if (claimCategory.equals("Simple")){
            claim1.formType ="Simple Form";
                       
        }
        else if (claimCategory.equals("Complex")){
            claim1.formType= "Complex Form";
                    
        }
        claim1.formStatus ="Created";
        
        assertFalse(claim1.formType.equals("Not decided"));
        assertEquals(claim1.formStatus,"Created");
        
            
         
        }
       
}
