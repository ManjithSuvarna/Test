package Handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enter_data_inside_textbox {

	public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
List<WebElement> link = driver.findElements(By.xpath("//input[@type='text']"));
		
        int count = link.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement we = link.get(i);
			we.sendKeys("abc");
			System.out.println(link);

	}
	}
}
