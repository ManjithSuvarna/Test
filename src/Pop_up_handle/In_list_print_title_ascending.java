package Pop_up_handle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class In_list_print_title_ascending {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(5000);
		
		Set<String> allwh = driver.getWindowHandles();
		
		ArrayList<String> l = new ArrayList<String>();
		
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			
			String title = driver.getTitle();
			
			l.add(title);
		}
		
		//for Reverse order
		//Collections.sort(l,Collections.reverseOrder());
		
		Collections.sort(l);
		
		for(String t:l)
		{ System.out.println(t); }
		
	}

}

