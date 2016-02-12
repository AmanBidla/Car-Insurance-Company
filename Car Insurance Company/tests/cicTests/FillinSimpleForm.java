package cicTests;

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

import cicSrc.Application;

/**
 *
 * @author george
 */
public class FillinSimpleForm {
    
    public FillinSimpleForm() {
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
    public void fillinSimpleForm_test() {
        
        
            Application.claimant1.fillinSimpleForm(Application.form1, "John", "Paris", "3/2/15", "Kareas", "2134");
           
       
            assertEquals(Application.form1.getFormName(),"John");
            assertEquals(Application.form1.getFormSurname(),"Paris");
            assertEquals(Application.form1.getFormDateOfAccident(),"3/2/15");
            assertEquals(Application.form1.getFormLocationOfAccident(),"Kareas");
            assertEquals(Application.form1.getFormInsuredPersonPlate(),"2134");
    
    
    
    }
}
