package cicTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cicSrc.Form;
import cicSrc.Claim;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import cicSrc.Application;

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
        Application.initialize();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createClaimForm_test() {
       
        
        Form form1 =new Form();
        
        Application.claim1.claimStatus="Claimant Insured";
        Application.claim1.claimCategory="Complex";
        
        if (Application.claim1.claimStatus.equals("Claimant Insured") && Application.claim1.claimCategory.equals("Simple")){
            form1.formStatus ="Created";
            form1.formType ="Simple Form";
            
                       
        }
        else if (Application.claim1.claimStatus.equals("Claimant Insured") && Application.claim1.claimCategory.equals("Complex")){
            form1.formStatus ="Created";
            form1.formType= "Complex Form";
                    
        }
        
        assertEquals(form1.formStatus,"Created");
        assertTrue(form1.formType.equals("Complex Form"));
        
        
        }
       
}
