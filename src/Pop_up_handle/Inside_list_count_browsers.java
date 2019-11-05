package Pop_up_handle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inside_list_count_browsers {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(5000);
		
		Set<String> allwh = driver.getWindowHandles();
		
		ArrayList<String> l = new ArrayList<String>(allwh);
		
		int count = l.size();
		
		System.out.println(count);
		
		
	}

}
