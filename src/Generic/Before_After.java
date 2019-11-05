package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Before_After
{
	public WebDriver driver;
	@BeforeMethod
	public void Launch_Browser()
	{
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
	 driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/r.php");
	}

}
