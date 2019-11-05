package Xpath_Group_Index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Print_value {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement ele = driver.findElement(By.name("websubmit"));
		
		String text = ele.getText();
		
		System.out.println(text);
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@data-testid='royal_login_button']"));
		
		String text1 = ele1.getAttribute("value");
		
		System.out.println(text1);

	}

}
