package Pop_up_handle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_Multiple_window_and_switch_fourth {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org/");
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		WebElement link1 = driver.findElement(By.xpath("//a[.='Projects']"));
		
		act.contextClick(link1).perform();
		
		Thread.sleep(3000);
		
		Robot r1 = new Robot();
		
		r1.keyPress(KeyEvent.VK_T);
		
		r1.keyRelease(KeyEvent.VK_T);
		
		WebElement link2 = driver.findElement(By.xpath("//a[.='Download']"));
		
		act.contextClick(link2).perform();
		
		Thread.sleep(3000);
		
		WebElement link3 = driver.findElement(By.xpath("//a[.='Documentation']"));
		
		act.contextClick(link3).perform();
		
		Thread.sleep(3000);
		
		WebElement link4 = driver.findElement(By.xpath("//a[.='Support']"));
		
		act.contextClick(link4).perform();
		
		Thread.sleep(3000);
		
		WebElement link5 = driver.findElement(By.xpath("//a[.='About']"));

		act.contextClick(link5).perform();
	
	}

}
