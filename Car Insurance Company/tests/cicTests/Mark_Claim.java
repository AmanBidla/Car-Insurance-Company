package cicTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cicSrc.Claimant;
import cicSrc.ClaimHandlerA;
import cicSrc.Claim;
import cicSrc.GarageOwner;
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
public class Mark_Claim {
    
    public Mark_Claim() {
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
        public void mark_claim_as_positive_or_negative_test(){
            
            Claim a = new Claim();
            ClaimHandlerA handler = new ClaimHandlerA();
            Claimant b = new Claimant();
            GarageOwner c = new GarageOwner();
            handler.mark_claim(a,b,c);
            
            //a.setClaimDecision("positive");
            
            
            
           
              assertTrue(handler.checkInsurance(b));
              assertTrue(handler.checkDmgHistory(b));
              assertTrue(handler.phoneGarage(b,c));
                          
 
           
        
}
}
