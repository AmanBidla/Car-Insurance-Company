
public class User {
	String role;
	String name;
	String surname;
	String username;
	String password;
        boolean val;
	
	public User(String role, String username, String password){
		this.role = role;
		this.username = username;
		this.password = password;
	}
	
	public String getrole(){
		return this.role;
	}
	
	public String getusername(){
		return this.username;
	}

	public String getpassword(){
		return this.password;
	}
        
        public boolean login(String username, String password) {
            val= (this.username==username) && (this.password==password);
            if (val)
                System.out.println("Login successful!");
            else
                System.out.println("Login failed!");
            return val;
        }

}

