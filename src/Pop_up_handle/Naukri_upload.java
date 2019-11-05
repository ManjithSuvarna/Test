package Pop_up_handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri_upload {

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
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//span[@id='block']")).click();
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.id("input_resumeParser"));
		
		Thread.sleep(3000);
		
		//select file
		
		ele.sendKeys("C:\\Users\\admin\\Downloads\\sql_tutorial.pdf");
	}

}
