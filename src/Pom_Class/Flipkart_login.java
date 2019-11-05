package Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Flipkart_login {

	@Test

	public void Test_login()

	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.flipkart.com/");

		Thread.sleep(5000);
		
		Loginpage lp=new Loginpage(driver);
		
		
	}

}
