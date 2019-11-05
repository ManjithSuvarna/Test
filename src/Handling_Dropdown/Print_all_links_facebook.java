package Handling_Dropdown;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Print_all_links_facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[.='kannada']")).click();
		
		Thread.sleep(10000);
		
		List<WebElement> ele = driver.findElements(By.("a"));
		
		TreeSet<String> l = new TreeSet<String>();
		
		int count = ele.size();
		
		for(int i=0;i<=count;i++)
			
		{
			WebElement t = ele.get(i);
			String text = t.getText();
			l.add(text);
		}
		
		for(String a:l)
		{ 
			System.out.println(a);
		}
		
	}

}
