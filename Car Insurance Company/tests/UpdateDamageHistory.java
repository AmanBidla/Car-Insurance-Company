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
            
            Claim a = new Claim();
            Claimant b = new Claimant();
            
            b.Date.add(new String("04/03/2015")); 
            b.Time.add(new String("20:55")); 
            b.Location.add(new String("Stockholm"));
            b.Damage.add(new String("Right Door"));
            b.Cost.add(new String("$2000")); 
            
            for(String s:b.Date){
            assertEquals(s,"04/03/2015");
         }
         
          for(String s:b.Time){
            assertEquals(s,"20:55");
         }
          
           for(String s:b.Location){
            assertEquals(s,"Stockholm");
         }
           
            for(String s:b.Damage){
            assertEquals(s,"Right Door");
         }
            
             for(String s:b.Cost){
            assertEquals(s,"$2000");
         }
            

        }
}
