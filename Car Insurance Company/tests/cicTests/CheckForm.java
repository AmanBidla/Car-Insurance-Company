package cicTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cicSrc.Form;
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
public class CheckForm {
    
    public CheckForm() {
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
    public void checkForm_test() {
        
        boolean val;
        
        if (Application.form2.formStatus.equals("Filled in-Needs to be checked!")){
            val=(Application.form2.formName.equals(Application.claimant2.name)) && (Application.form2.formSurname.equals(Application.claimant2.surname)) && (Application.form2.formDateOfAccident.equals(Application.claim2.claimDate))
                    &&(Application.form2.formInsuranceExpiringDate.equals(Application.claimant2.expiringDateOfInsurance)) && (Application.form2.formInsuredPersonPlate.equals(Application.claimant2.plateNumber));
            if (val)
                Application.form2.formStatus= "Filled in correctly!";
            else
                Application.form2.formStatus= "Not filled in correctly!";
                     
        }
        
        assertEquals(Application.form2.formStatus,"Filled in correctly!");
        
    
    
    
    }
}
