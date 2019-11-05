package Pom_Class;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic.Before_After;

public class fb_test extends Before_After
{
	@Test
	public void test() throws InterruptedException 
	{
		
		facebooksignup fb = new facebooksignup(driver);
		fb.firstname("MSK");
		fb.sname("Mangalore");
		fb.mobile("mskmangalore@gmail.com");
		fb.passwod("12345abcde");
		Thread.sleep(3000);
		fb.verifymobile("mskmangalore@gmail.com");
		Thread.sleep(3000);
		fb.day("12");
		Thread.sleep(3000);
		fb.month("Apr");
		Thread.sleep(3000);
		fb.year("1993");
		Thread.sleep(3000);
		fb.gender();
		fb.sinup();
		
	}
	
	
}