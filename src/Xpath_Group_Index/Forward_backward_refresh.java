package Xpath_Group_Index;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Forward_backward_refresh {

	public static void main(String[] args) throws InterruptedException {	

System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.GOOGLE.com/");
		
		driver.navigate().to("https://www.gmail.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
	}

}
