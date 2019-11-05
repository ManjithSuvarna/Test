package Handling_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_to_frame {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/admin/Desktop/Main_page.html");
		
		WebElement f = driver.findElement(By.xpath("//iframe[@id='f1']"));
		
		driver.findElement(By.id("t1")).sendKeys("abc");
		//switch frame to page
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("f1");
		driver.switchTo().frame(f);
		
		driver.findElement(By.id("t2")).sendKeys("xyz");
		
		//switch from frame to page
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("t1")).sendKeys("123");
	}

}
