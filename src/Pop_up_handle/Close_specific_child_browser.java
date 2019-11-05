package Pop_up_handle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close_specific_child_browser {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(5000);
		
		String Parent_id = driver.getWindowHandle();
		
		System.out.println(Parent_id);
		
		//allwh consist of id of all the browsers
		
		Set<String> allwh = driver.getWindowHandles();
		
		int count = allwh.size();
		
		System.out.println(count);
		
		allwh.remove(Parent_id);
		
		int count1 = allwh.size();
		
		System.out.println(count1);
		
		for(String wh:allwh)
		{ 
			driver.switchTo().window(wh);
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			Thread.sleep(5000);
			
			if(title.equals("Amazon"))
			{		
			
			//If we give driver.quit(); we will get "No such session exception (Selenium RTE)
			driver.close();
			}
		}
		
		}

}

