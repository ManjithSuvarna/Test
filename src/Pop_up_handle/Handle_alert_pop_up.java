package Pop_up_handle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_alert_pop_up {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.javascriptkit.com//javatutors/alert2.shtml");
		
		WebElement ele = driver.findElement(By.xpath("//input[@value='Click here for output>>']"));
		
		ele.click();
		
		Alert a=driver.switchTo().alert();
		
		Thread.sleep(10000);
		
		String text = a.getText();
		
		System.out.println(text);
		
		a.accept();
		
		//a.dismiss();
		

	}

	
}
