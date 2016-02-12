/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicTests;

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
public class CDEmployeeSendMsgToClaimant {
    
    public CDEmployeeSendMsgToClaimant() {
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
        public void employeeCDSendMsgToClaimant() {
            
            String msg="Hey man!";
            String recipientRole="Claimant";
            Application.employeeCD.sendMSg(recipientRole, msg);
            assertEquals(Application.claimant1.readMsg(),msg);
            
            
            
            
        }
}
