package Pom_Class;

import org.testng.annotations.Test;

public class Test_gmail extends Gmail_generic {
	
	@Test
	
	public void signup()
	{
		Gmail_login gl=new Gmail_login();
		
		gl.Signup_arg(Manjith, suvarna, suvarnamanjith, suvarnamk, suvarnamk);
	}

}
