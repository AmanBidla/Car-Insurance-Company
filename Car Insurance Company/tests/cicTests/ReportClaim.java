package cicTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class ReportClaim {
    
    public ReportClaim() {
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
     public void reportClaim_test() {
                   
        Application.claim1.setClaimStatus("Reported");
        
        assertEquals(Application.claim1.claimantName,"Charlie");
        assertEquals(Application.claim1.claimantSurname,"Hebdo");
        assertEquals(Application.claim1.claimantLocation,"Kungsgatan 17,Stockholm");
        assertEquals(Application.claim1.claimDate,"2014/12/11");
        assertEquals(Application.claim1.claimCostOfDmg,1000);
        
        assertEquals(Application.claim1.getClaimStatus(),"Reported");
        
    
    }
}
