package Handling_multiple_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Print_trailer_views {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.youtube.com/watch?v=g7fhwg2ICbs/");
		
WebElement ele = driver.findElement(By.xpath("//yt-formatted-string[contains(.,'Published on')]/ancestor::div//yt-view-count-renderer//span[1]"));
		
		String text = ele.getText();
		
		System.out.println(text);

	}

}
