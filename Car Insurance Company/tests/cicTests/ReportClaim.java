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
                   
        String name="x";
        String surname="y";
        String location ="a";
        String date="2/3";
        int cost=3;
        
        Claim claim = new Claim(name,surname,location,date,cost);
        claim.claimStatus="Reported";
        
        assertEquals(claim.claimantName,name);
        assertEquals(claim.claimantSurname,surname);
        assertEquals(claim.claimantLocation,location);
        assertEquals(claim.claimDate,date);
        assertEquals(claim.claimCostOfDmg,cost);
        assertEquals(claim.claimStatus,"Reported");
        
    
    }
}
