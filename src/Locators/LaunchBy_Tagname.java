package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBy_Tagname 
{

	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://youtu.be/JXxdKFzBR0E?t=9");
	
	
	 
	 
	}

}
