package Handling_multiple_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Print_fastest_route_distance {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/maps");
		
		Thread.sleep(10000);
		
		WebElement ele = driver.findElement(By.id("searchboxinput"));
		
		ele.sendKeys("malpe");
		
        WebElement ele1 = driver.findElement(By.id("searchbox-directions"));
		
		ele1.click();
		
		Thread.sleep(10000);
		
        WebElement ele2= driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']"));
		
		ele2.sendKeys("rajajinagara");
		
		WebElement ele3 = driver.findElement(By.xpath("//div[@class='gstl_51 sbib_a']/following-sibling::button[1]"));
		
		ele3.click();
		
		Thread.sleep(10000);
		
		WebElement ele4 = driver.findElement(By.xpath("//span[contains(.,'Fastest route')]/ancestor::div//div[@class='section-directions-trip-distance section-directions-trip-secondary-text']"));
		
		String text = ele4.getText();
		
		WebElement ele5 = driver.findElement(By.xpath("//span[contains(.,'typically')]/preceding-sibling::span[1]"));
		
		String text1 = ele5.getText();
		
		System.out.println("Distance is "+text+" and Estimated Time will be "+text1);
		
		
		
		
		
		
		
		
		
	}
}