/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ioannis Papakostas
 */
import java.util.ArrayList;
import java.util.*;

public class Claimant extends User{
    
    String string;
    
    public Claimant(){}
    
    public Claimant(String name, String surname, String username, String password){
                this.name = name;
                this.surname = surname;
		this.username = username;
		this.password = password;
    }
    
     public String getString() {
        return string;
    }
    
    List<String> Date = new ArrayList<String>();
    List<String> Time = new ArrayList<String>();
    List<String> Location = new ArrayList<String>();
    List<String> Damage = new ArrayList<String>();
    List<String> Cost = new ArrayList<String>();
    
    
    


}
