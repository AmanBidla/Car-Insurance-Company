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
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
        public void update_dmg_history_test(){
            
            
            Claimant b = new Claimant();
            
            b.AccidentDate.add(new String("04/03/2015")); 
            b.AccidentTime.add(new String("20:55")); 
            b.AccidentLocation.add(new String("Stockholm"));
            b.AccidentDamage.add(new String("Right Door"));
            b.AccidentCost.add(new String("$2000")); 
            
            for(String s:b.AccidentDate){
            assertEquals(s,"04/03/2015");
         }
         
          for(String s:b.AccidentTime){
            assertEquals(s,"20:55");
         }
          
           for(String s:b.AccidentLocation){
            assertEquals(s,"Stockholm");
         }
           
            for(String s:b.AccidentDamage){
            assertEquals(s,"Right Door");
         }
            
             for(String s:b.AccidentCost){
            assertEquals(s,"$2000");
         }
            

        }
}
