package Handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Count_links {

	public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		int count = link.size();
		
		System.out.println(count);
		
		List<WebElement> link1 = driver.findElements(By.tagName("img"));
		
        int count1 = link1.size();
		
		System.out.println(count1);
		
        List<WebElement> link2 = driver.findElements(By.xpath("//table|//select"));
		
        int count2 = link2.size();
		
		System.out.println(count2);
		
		for(int i=0;i<count;i++)
		{
			WebElement we = link.get(i);
			String text = we.getText();
			System.out.println(link);
		}

	}

}
