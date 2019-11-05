package Pop_up_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden_division_pop_up {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.cleartrip.com/");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//i[.='Cal'])[1]")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//i[.='28'])[1]")).click();

	}

}
