package Pom_Class;

import org.testng.annotations.Test;

public class Test_facebook extends Facebook_generic {
	
	@Test
	
	public void signup() throws interruptedException
	
	{
		Facebook_login fl=new Facebook_login(driver);
		
		fl.signup1(MSK, Mangalore, mskmangalore@gmail.com, 12345abcde, mskmangalore@gmail.com, 12, 04, 1993);
	}

}
