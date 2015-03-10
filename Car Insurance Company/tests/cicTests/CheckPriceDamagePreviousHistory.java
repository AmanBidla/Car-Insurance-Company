package cicTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cicSrc.Application;
import cicSrc.Claim;
import cicSrc.Claimant;

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
public class CheckPriceDamagePreviousHistory {
    
    public CheckPriceDamagePreviousHistory() {
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
     public void check_Price_DmgCost_PreviousHistory() {
        
         assertEquals(Application.claimant1.AccidentCost.get(0), 1000);
         assertEquals(Application.claimant1.AccidentDamage.get(0), "right wing");
         assertEquals(Application.claimant1.AccidentLocation.get(0), "Kungsgatan 17,Stockholm");
         assertEquals(Application.claimant1.AccidentDate.get(0), "2014/12/11");
         assertEquals(Application.claimant1.priceOfCar,32000);
         assertEquals(Application.claim1.claimCostOfDmg, 1000);
         
     }
}
