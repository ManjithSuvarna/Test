package Handling_mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click_action {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		Thread.sleep(10000);
		
		WebElement b1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		
		WebElement b3 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		
		Thread.sleep(10000);
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(b1,b3).perform();
	}

}
