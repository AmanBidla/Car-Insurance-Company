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
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void checkForm_test() {
        Form form1 = new Form();
        boolean val;
        form1.formStatus="Filled in-Needs to be checked!";
        if (form1.formStatus.equals("Filled in-Needs to be checked!")){
            val=(form1.formName.equals("Charlie")) && (form1.formSurname.equals("Hebdo")) && (form1.formDateOfAccident.equals("11/12/2014"))
                    &&(form1.formInsuranceExpiringDate.equals("03/2018")) && (form1.formInsuredPersonPlate.equals("IK 3546"));
            if (val)
                form1.formStatus= "Filled in correctly!";
            else
                form1.formStatus= "Not filled in correctly!";
                     
        }
        
        assertEquals(form1.formStatus,"Filled in correctly!");
        
    
    
    
    }
}
