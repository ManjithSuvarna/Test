package Handling_Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Remove_duplicate_without_remove_removeAll {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/admin/Desktop/Duplicate.html");
		
		WebElement ele = driver.findElement(By.id("donnebiryani"));
		
		Select s = new Select(ele);
		
		List<WebElement> options = s.getOptions();
		
		ArrayList<String> l = new ArrayList<String>();
		
		int count = options.size();
		
		System.out.println(count);
		
		for(WebElement we:options)
		{
			String text = we.getText();
			
			l.add(text);
			
		}

		
		TreeSet<String> tr = new TreeSet<String>(l);
		
		for(String t:tr)
		{
			System.out.println(t);
		}
		
		

	}

}




