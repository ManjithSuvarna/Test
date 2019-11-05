package Pop_up_handle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Print_title_and_close_browsers {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(5000);
		
		//allwh consist of id of all the browsers
		
		Set<String> allwh = driver.getWindowHandles();
		
		for(String wh:allwh)
		{ 
			driver.switchTo().window(wh);
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			Thread.sleep(5000);
			
			//If we give driver.quit(); we will get "No such session exception (Selenium RTE)
			driver.close();
			
		}
		
		}

}