package cicTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cicSrc.Application;
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
public class UpdateDamageHistory {
    
    public UpdateDamageHistory() {
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
        public void update_dmg_history_test(){
                                    
           for(String s:Application.claimant1.AccidentDate){
            assertEquals(s,"2014/12/11");
         }
         
           for(String s:Application.claimant1.AccidentTime){
            assertEquals(s,"18:55");
         }
          
           for(String s:Application.claimant1.AccidentLocation){
            assertEquals(s,"Kungsgatan 17,Stockholm");
         }
           
            for(String s:Application.claimant1.AccidentDamage){
            assertEquals(s,"right wing");
         }
            
            for(int s=0; s < Application.claimant1.AccidentCost.size(); s++){
             assertEquals(Application.claimant1.AccidentCost.get(s),1000);
         }
            
        }
}
