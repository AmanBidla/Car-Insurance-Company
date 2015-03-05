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
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void fillinForm_test() {
        Form form1 = new Form();
        form1.formType="Simple Form";
        form1.formStatus="Created!";
        
        if ((form1.formStatus.equals("Created!") || form1.formStatus.equals("Not filled correctly!"))&& form1.formType.equals("Simple Form")){
            form1.formName= "Name1";
            form1.formSurname="Surname1";
            form1.formDateOfAccident="Date1";
            form1.formInsuranceExpiringDate="ExpiringDate1";
            form1.formInsuredPersonPlate = "InsuredPlate1";
            form1.formPersonInvolvedInTheAccidentPlate = "InvolvedPlate1";
            
            form1.formStatus = "Filled in-Needs to be checked!";
            
        }
        else if ((form1.formStatus.equals("Created!") || form1.formStatus.equals("Not filled correctly!"))&& form1.formType.equals("Complex Form")){
            form1.formName= "Name2";
            form1.formSurname="Surname2";
            form1.formDateOfAccident="Date2";
            form1.formInsuranceExpiringDate="ExpiringDate2";
            form1.formInsuredPersonPlate = "InsuredPlate2";
            form1.formPersonInvolvedInTheAccidentPlate = "InvolvedPlate2";
            form1.formAgreementOnIncreaseInPremiums = "Agree";
            
            form1.formStatus = "Filled in-Needs to be checked!";
            
        
         }
        
         assertEquals(form1.formStatus, "Filled in-Needs to be checked!");
    
    
    
    }
}
