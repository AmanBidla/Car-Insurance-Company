/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicTests;

import cicSrc.Application;
import static cicSrc.Application.claim1;
import static cicSrc.Application.claimant1;
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
public class CheckDmgHistory {
    
    public CheckDmgHistory() {
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
     public void checkDmgPreviousHistory() {
        
         assertEquals(Application.employeeCD.getDateHistory(Application.claimant1), "2014/12/11");
         assertEquals(Application.employeeCD.getLocationHistory(Application.claimant1),"Kungsgatan 17,Stockholm");
         assertEquals(Application.employeeCD.getCostHistory(Application.claimant1), claim1.amount_of_payment);
     }
}
