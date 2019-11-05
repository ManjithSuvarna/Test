package Handling_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchto_frame_then_parent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/admin/Desktop/Main_page.html");
		
		driver.findElement(By.id("t1")).sendKeys("abc");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("t2")).sendKeys("xyz");
		
		driver.switchTo().frame(0);

		driver.findElement(By.id("t3")).sendKeys("123");
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("t1")).sendKeys(" Manjith");
		
		
		
		
		
		

	}

}
