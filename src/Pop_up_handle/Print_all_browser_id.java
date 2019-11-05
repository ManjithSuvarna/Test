package Pop_up_handle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Print_all_browser_id {

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
		
		for(String wh:allwh)
		{ System.out.println(wh); }
		
		}

}


