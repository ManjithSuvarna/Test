package Pop_up_handle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_and_switch_multiple_window {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org/");
		
		WebElement w1 = driver.findElement(By.xpath("//a[.='Projects']"));
		WebElement w2 = driver.findElement(By.xpath("//a[.='Download']"));
		WebElement w3 = driver.findElement(By.xpath("//a[.='Documentation']"));
		WebElement w4 = driver.findElement(By.xpath("//a[.='Support']"));
		WebElement w5 = driver.findElement(By.xpath("//a[.='About']"));
		
		ArrayList<WebElement> l = new ArrayList<WebElement>();
		
		l.add(w1);
		l.add(w2);
		l.add(w3);
		l.add(w4);
		l.add(w5);
		
		Actions act = new Actions(driver);
		
		Robot r = new Robot();
		
		for(WebElement t:l)
		{
			act.contextClick(t).perform();
			
			r.keyPress(KeyEvent.VK_T);
			
			r.keyRelease(KeyEvent.VK_T);
			
		}
		
			Thread.sleep(5000);
			Set<String> allwh = driver.getWindowHandles();
			
			ArrayList<String> l1 = new ArrayList<String>(allwh);
			
			String wh=l1.get(2);
			
			driver.switchTo().window(wh);
			
		driver.findElement(By.xpath("//td[.='C#']/following-sibling::td[3]")).click();
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_S);
			
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
		
	}

