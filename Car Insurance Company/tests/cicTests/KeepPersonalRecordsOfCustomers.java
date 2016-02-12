package cicTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import cicSrc.Claimant;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import cicSrc.Application;

/**
 *
 * @author Ioannis Papakostas
 */
public class KeepPersonalRecordsOfCustomers {
    
    public KeepPersonalRecordsOfCustomers() {
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
        public void keep_personal_records_of_customers_test() {
                        
            Application.employeeCD.setPriceOfCar(Application.claimant1,20000);
            Application.employeeCD.setExpiringDateOfInsurance(Application.claimant1,"13/08/2016" );
            Application.employeeCD.setPlateNumber(Application.claimant1,"IEA 5839");
            Application.employeeCD.setCostOfInsurance(Application.claimant1,347);
            
            assertEquals(Application.claimant1.getExpiringDateOfInsurance(),"13/08/2016" );
            assertEquals(Application.claimant1.getCostOfInsurance(),347);
            assertEquals(Application.claimant1.getPlateNumber(),"IEA 5839");
            assertEquals(Application.claimant1.getPriceOfCar(),20000);
        }
}
