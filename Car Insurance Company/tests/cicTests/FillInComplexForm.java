/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicTests;

import cicSrc.Application;
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
public class FillInComplexForm {
    
    public FillInComplexForm() {
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
    public void fillInComplexForm() 
    {
         Application.claimant1.fillinComplexForm(Application.form1, "Paul", "Johnson", "5/3/14", "Elliniko", "4322","Yes");
           
       
            assertEquals(Application.form1.getFormName(),"Paul");
            assertEquals(Application.form1.getFormSurname(),"Johnson");
            assertEquals(Application.form1.getFormDateOfAccident(),"5/3/14");
            assertEquals(Application.form1.getFormLocationOfAccident(),"Elliniko");
            assertEquals(Application.form1.getFormInsuredPersonPlate(),"4322");
            assertEquals(Application.form1.getFormAgreementOnIncrease(),"Yes");
    
    }
}
