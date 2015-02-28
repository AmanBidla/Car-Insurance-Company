import static org.junit.Assert.*;


import org.junit.Test;


public class Registration_Test {
	
	User Papakwstas = new User("A","Papakwstas","Ioannis");
	
	//User Dikaros = new User();
	//User Andreas = new User();
	//User Bill = new User();
	//User Lianos= new User();

	@Test
	public void create_registration_test() {
		
		assertEquals("A",Papakwstas.getrole());
		assertEquals("Papakwstas",Papakwstas.getusername());
	//ssertEquals("A",Papakwstas.getrole())
		
		
		
		
	}

}
