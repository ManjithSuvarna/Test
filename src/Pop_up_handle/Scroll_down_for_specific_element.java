package Pop_up_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_down_for_specific_element {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		//typecasting (Explicite)
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Wipro WiFi Enabled Smart LED Bulb B22 9-Watt (16 Million Colors + Warm White/Neutral White/White) (Compatible with...']"));
	
		Point loc=ele.getLocation();
		
		int x=loc.getX();
		
		System.out.println(x);
		
		int y=loc.getY();
		
		System.out.println(y);
		
		Thread.sleep(3000);
		
		js.executeScript("window.Scrollby("+x+","+y+")");
		
		
	
	}
}