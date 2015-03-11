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
        
        
        
        if ((Application.form1.formStatus.equals("Created!") || Application.form1.formStatus.equals("Not filled correctly!"))&& Application.form1.formType.equals("Simple Form")){
            Application.form1.formName= Application.claimant1.name;
            Application.form1.formSurname=Application.claimant1.surname;
            Application.form1.formDateOfAccident=Application.claim1.claimDate;
            Application.form1.formLocationOfAccident=Application.claim1.claimantLocation;
            Application.form1.formInsuredPersonPlate = Application.claimant1.plateNumber;
            
            
            Application.form1.formStatus = "Filled in-Needs to be checked!";
            
        }
        else if ((Application.form1.formStatus.equals("Created!") || Application.form1.formStatus.equals("Not filled correctly!"))&& Application.form1.formType.equals("Complex Form")){
            Application.form1.formName= Application.claimant1.name;
            Application.form1.formSurname=Application.claimant1.surname;
            Application.form1.formDateOfAccident=Application.claim1.claimDate;
            Application.form1.formLocationOfAccident=Application.claim1.claimantLocation;
            Application.form1.formInsuredPersonPlate = Application.claimant1.plateNumber;
            
            Application.form1.formAgreementOnIncreaseInPremiums = "Agree";
            
            Application.form1.formStatus = "Filled in-Needs to be checked!";
            
        
         }
        
         assertEquals(Application.form1.formStatus, "Filled in-Needs to be checked!");
    
    
    
    }
}
