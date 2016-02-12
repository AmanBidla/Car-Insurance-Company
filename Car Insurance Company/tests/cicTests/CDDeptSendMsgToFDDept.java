/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicTests;

import cicSrc.Application;
import static cicSrc.Application.financialDeptEmployee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author george
 */
public class CDDeptSendMsgToFDDept {
    
    public CDDeptSendMsgToFDDept() {
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
     public void employeeCDMsgToFDDept() {
         
           String msg="Can you handle the payment?";
            String recipientRole="FinanceDept Employee";
            Application.employeeCD.sendMSg(recipientRole, msg);
            assertEquals(Application.financialDeptEmployee.readMsg(),msg);
     
     }
}
