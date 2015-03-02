import static org.junit.Assert.*;
import java.util.Scanner;
import static java.lang.System.*;


import org.junit.Test;


public class Registration_Test {
	

	@Test
	public void create_registration_test() {
		
            
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
	
		assertEquals("A",Papakwstas.getrole());
		assertEquals("Ioannis",Papakwstas.getname());
                assertEquals("Papakostas",Papakwstas.getsurname());
                assertEquals("johnnyaoua",Papakwstas.getusername());
                assertEquals("12345",Papakwstas.getpassword());
		
		
		
	}

}
