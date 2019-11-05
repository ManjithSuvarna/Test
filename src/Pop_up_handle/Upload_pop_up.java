package Pop_up_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_pop_up {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/admin/Desktop/upload.html");
		
		WebElement ele = driver.findElement(By.id("upload file"));
		
		Thread.sleep(3000);
		
		//select file
		
		ele.sendKeys("C:\\Users\\admin\\Desktop\\upload.html");

	}

}
