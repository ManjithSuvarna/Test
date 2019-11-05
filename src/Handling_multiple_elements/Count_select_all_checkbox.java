package Handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Count_select_all_checkbox {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https:///");
		
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int count=ele.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{ 
			WebElement we = ele.get(i);
			we.click();
		}

	}

}
