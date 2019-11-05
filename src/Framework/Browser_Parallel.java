package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Browser_Parallel {
	public WebDriver driver;

	static {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	@Parameters({ "browser" })
	@BeforeSuite
	public void test_parallel(String browser)

	{
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
		} else {
			driver = new ChromeDriver();
			driver.get("https://www.google.com");

		}
	}


	@AfterSuite
	public void close_application()
	{
		driver.quit();
	}
	

}
