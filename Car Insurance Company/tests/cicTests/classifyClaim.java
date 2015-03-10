/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicTests;

import cicSrc.EmployeeOfDeptCD;
import cicSrc.Claimant;
import cicSrc.Claim;
import cicSrc.Application;
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
public class classifyClaim {
    
    public classifyClaim() {
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
         public void classify_claim_test() {
             
           // price of car >30000
             Application.employeeCD.classifyClaim(Application.claim1,Application.claimant1);
             assertEquals(Application.claim1.getClaimCategory(),"complex");
           // everything is ok
             Application.employeeCD.classifyClaim(Application.claim3,Application.claimant3);
             assertEquals(Application.claim3.getClaimCategory(),"simple");
            // cost of damage >5000
            Application.employeeCD.classifyClaim(Application.claim2,Application.claimant2);
             assertEquals(Application.claim2.getClaimCategory(),"complex");
            // where total number of accidents >3
             Application.claim2.claimCostOfDmg = 4000;
             Application.claimant2.AccidentCost.add(1000);
             Application.claimant2.AccidentCost.add(1000);
             Application.claimant2.AccidentCost.add(1000);
             Application.claimant2.AccidentCost.add(1000);
             Application.employeeCD.classifyClaim(Application.claim2,Application.claimant2);
             assertEquals(Application.claim2.getClaimCategory(),"complex");
           
             
         }
}
