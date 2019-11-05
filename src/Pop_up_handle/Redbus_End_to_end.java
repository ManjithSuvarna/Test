package Pop_up_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Redbus_End_to_end {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@class='icon-profile-new-unsigned ']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//li[.='Sign In/Sign Up']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("not_signed_in7dmtxph70jpv")).click();
		
		
	}
	}
	