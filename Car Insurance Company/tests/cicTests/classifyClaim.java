/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicTests;

import cicSrc.EmployeeOfDeptCD;
import cicSrc.Claimant;
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
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
         public void classify_claim_test() {
             Claimant a = new Claimant();
             EmployeeOfDeptCD f = new EmployeeOfDeptCD();
             //report claim (Claim b) where price of car > 30000
             f.classifyClaim(b);
             assertEquals(b.getClaimCategory(),"complex");
             //report claim (CLaim c) where cost of damage >5000
             f.classifyClaim(c);
             assertEquals(c.getClaimCategory(),"complex");
             //report claim (Claim d) where total number of accidents >3
             f.classifyClaim(d);
             assertEquals(d.getClaimCategory(),"complex");
             //report claim where everything is ok
             f.classifyClaim(e);
             assertEquals(e.getClaimCategory(),"simple");
             
         }
}
