package cicTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cicSrc.Application;
import cicSrc.Claim;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ioannis Papakostas
 */
public class KeepRecordsOfPAyments {
    
    public KeepRecordsOfPAyments() {
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
        public void keep_records_of_payments(){
            //Claim a = new Claim();
           // a.claim_ID = 5;
            
             Application.financialDeptEmployee.setRecord(Application.claimant1,Application.claim1);
            assertEquals(Application.claimant1.AccidentCost.get(1),Application.claim1.amount_of_payment);
            assertEquals(Application.claimant1.AccidentLocation.get(1),Application.claim1.claimantLocation);
            
        }
}
