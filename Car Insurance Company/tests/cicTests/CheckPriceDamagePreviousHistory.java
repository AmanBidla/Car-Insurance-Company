package cicTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void check_Price_DmgCost_PreviousHistory(Claimant a,Claim b) {
         a.getDmgHistory();
         System.out.println(a.priceOfCar);
         System.out.println(b.amount_of_payment);
     }
}
