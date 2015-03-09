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
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
        public void keep_personal_records_of_customers_test(Claimant a) {
            a.costOfInsurance = 347;
            a.priceOfCar = 20000;
            a.plateNumber = "IEA 5839";
            a.expiringDateOfInsurance = "13/08/2016";
            
            System.out.println(a.getExpiringDateOfInsurance());
            System.out.println(a.getCostOfInsurance());
            System.out.println(a.getPlateNumber());
            System.out.println(a.getPriceOfCar());
            a.getDmgHistory();
        }
}
