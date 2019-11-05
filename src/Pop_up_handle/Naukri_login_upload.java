package Pop_up_handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri_login_upload {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(3000);
		
		String parent_id = driver.getWindowHandle();
		
		System.out.println(parent_id);
		
		Set<String> allwh = driver.getWindowHandles();
		
		int count = allwh.size();
		
		System.out.println(count);
		
		allwh.remove(parent_id);
		
		int count1 = allwh.size();
		
		System.out.println(count1);
		
		for(String wh:allwh)
			
		{
			driver.switchTo().window(wh);
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			Thread.sleep(2000);
			
			driver.close();
		}
		driver.switchTo().window(parent_id);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@id='block']")).click();
		
		driver.findElement(By.xpath("(//div[.='Login'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='eLoginNew']")).sendKeys("manjithsuvarnak@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pLogin']")).sendKeys("mskmskmsk");
		
		driver.findElement(By.xpath("(//button[@class='blueBtn'])[2]")).click();
		
		Thread.sleep(4000);
		
		WebElement ele = driver.findElement(By.xpath("(//div[@class='mTxt'])[8]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[.='Edit Profile']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//inputattachCV")).click();
		
		
	}
}
