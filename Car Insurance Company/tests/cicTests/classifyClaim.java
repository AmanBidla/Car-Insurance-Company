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
             
           //  Claim b = Application.claimant1.reportClaim(Application.claimant1);// price of car >30000
             Application.employeeCD.classifyClaim(Application.claim1,Application.claimant1);
             assertEquals(Application.claim1.getClaimCategory(),"complex");
            // a.reportClaim(c, a);// where cost of damage >5000
            Application.employeeCD.classifyClaim(c,Application.claimant1);
             assertEquals(c.getClaimCategory(),"complex");
            // a.reportClaim(d, a);//  where total number of accidents >3
             Application.employeeCD.classifyClaim(d,Application.claimant1);
             assertEquals(d.getClaimCategory(),"complex");
           //  a.reportClaim(e, a);// where everything is ok
             Application.employeeCD.classifyClaim(e,Application.claimant1);
             assertEquals(e.getClaimCategory(),"simple");
             
         }
}
