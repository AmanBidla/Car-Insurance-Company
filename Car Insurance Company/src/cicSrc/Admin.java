package cicSrc;


import static java.lang.System.out;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author george
 */
public class Admin extends User {
    
    
    public Admin(){}
    
    /*method for the registration of users by the admin */
    protected void register(){
        
        Scanner input = new Scanner(System.in);
        
        out.println("Give role");
        this.role = input.next();
        out.println("Give name");
        this.name = input.next();
        out.println("Give surname");
        this.surname = input.next();
        out.println("Give username");
        this.username = input.next();
        out.println("Give password");
        this.password = input.next();
        
        input.close();
}
    
}
