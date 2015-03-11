package cicSrc;


import static java.lang.System.out;
import java.util.Scanner;



public class User {
	
        public String role;
	public String name;
	public String surname;
	public String username;
	public String password;
        
	
        
	public User(String role, String name, String surname, String username, String password){
		this.role = role;
                this.name = name;
                this.surname = surname;
		this.username = username;
		this.password = password;
	}
        
        
        public User(){
            
        }
	
	public String getrole(){
		return this.role;
	}
        
        public String getname(){
		return this.name;
	}
        
        public String getsurname(){
		return this.surname;
	}
	
	public String getusername(){
		return this.username;
	}

	public String getpassword(){
		return this.password;
	}
        
        /* method which enables the user to login to the system */
        public boolean login(User u) {
            boolean val;
            Scanner user = new Scanner(System.in);
            String nameOfUser=user.next();
            Scanner pass = new Scanner(System.in);
            String passwordOfUser= pass.next();
            val= (u.username.equals(nameOfUser)) && (u.password.equals(passwordOfUser));
            if (val)
                System.out.println("Login successful!");
            else
                System.out.println("Login failed!");
            return val;
        }
        
        
        
}
