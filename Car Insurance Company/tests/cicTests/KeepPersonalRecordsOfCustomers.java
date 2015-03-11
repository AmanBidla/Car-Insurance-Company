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
            Application.claimant1.costOfInsurance = 347;
            Application.claimant1.priceOfCar = 20000;
            Application.claimant1.plateNumber = "IEA 5839";
            Application.claimant1.expiringDateOfInsurance = "13/08/2016";
            
            System.out.println(Application.claimant1.getExpiringDateOfInsurance());
            System.out.println(Application.claimant1.getCostOfInsurance());
            System.out.println(Application.claimant1.getPlateNumber());
            System.out.println(Application.claimant1.getPriceOfCar());
            Application.claimant1.getDmgHistory();
        }
}
