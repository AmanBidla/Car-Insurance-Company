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
public class FillinForm {
    
    public FillinForm() {
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
    public void fillinForm_test() {
        
        
            Application.form1.formName= Application.claimant1.name;
            Application.form1.formSurname=Application.claimant1.surname;
            Application.form1.formDateOfAccident=Application.claim1.claimDate;
            Application.form1.formLocationOfAccident=Application.claim1.claimantLocation;
            Application.form1.formInsuredPersonPlate = Application.claimant1.plateNumber;
            
            assertEquals(Application.form1.getFormName(),Application.form1.formName);
            assertEquals(Application.form1.getFormSurname(),Application.form1.formSurname);
            assertEquals(Application.form1.getFormDateOfAccident(),Application.form1.formDateOfAccident);
            assertEquals(Application.form1.getFormLocationOfAccident(),Application.form1.formLocationOfAccident);
            assertEquals(Application.form1.getFormInsuredPersonPlate(),Application.form1.formInsuredPersonPlate);
    
    
    
    }
}
