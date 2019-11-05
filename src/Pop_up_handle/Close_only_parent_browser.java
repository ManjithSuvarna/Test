package Pop_up_handle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close_only_parent_browser {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(5000);
		
		String Parent_id = driver.getWindowHandle();
		
		System.out.println(Parent_id);
		
		//allwh consist of id of all the browsers
		
		Set<String> allwh = driver.getWindowHandles();
		
		for(String wh:allwh)
		{ 
			driver.switchTo().window(wh);
			
			if(wh.equals(Parent_id))
			{ driver.close(); }
			
		}
		
	}

}
