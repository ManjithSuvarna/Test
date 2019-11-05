package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Before_After_method {

	public WebDriver driver; // Global Variable

	@BeforeMethod
	public void open_Application() {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("http://localhost/login.do;jsessionid=pgmqtkumilks");
	}

	@AfterMethod
	public void close_Application()

	{
		driver.quit(); // close();
	}
}
