package Handling_mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over_action {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//Button[.='✕']")).click();
		
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath("//span[.='Men']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[.='T-Shirts']")).click();
		
	}

}
