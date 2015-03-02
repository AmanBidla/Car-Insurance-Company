
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
public class Application {
    public static void main (String[] args){
        
        boolean value=false;    
        
         Scanner input = new Scanner(System.in);
        
	User Papakwstas = new User();
        out.println("Give role");
        Papakwstas.role = input.next();
        out.println("Give name");
        Papakwstas.name = input.next();
        out.println("Give surname");
        Papakwstas.surname = input.next();
        out.println("Give username");
        Papakwstas.username = input.next();
        out.println("Give password");
        Papakwstas.password = input.next();
        
        input.close();
    
        User user1 = new User("customer","Charlie","Hebdo","IamCharlie","13579");
        
        while (value==false){
        System.out.println("Give username");
        Scanner username= new Scanner(System.in);
        String user= username.next();
        
        System.out.println("Give password");
        Scanner password= new Scanner(System.in);
        String pass=password.next();
        
        
        value= user1.login(user, pass);
        }
        
        
                
    }
    
}

