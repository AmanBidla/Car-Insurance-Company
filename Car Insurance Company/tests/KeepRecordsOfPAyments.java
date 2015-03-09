/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class KeepRecordsOfPAyments {
    
    public KeepRecordsOfPAyments() {
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
        public void keep_records_of_payments(Records a){
             for(String s:a.Name){
            assertEquals(s,"04/03/2015");
         }
         
          for(String s:a.Surname){
            assertEquals(s,"20:55");
         }
          
           for(String s:a.Date){
            assertEquals(s,"Stockholm");
         }
           
           for(int s=0; s < a.AmountOfPayment.size(); s++)
             {
            System.out.println(a.AmountOfPayment.get(s));
         }
        }
}
