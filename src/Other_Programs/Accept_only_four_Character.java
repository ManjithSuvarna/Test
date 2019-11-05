package Other_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Accept_only_four_Character {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com");
		
		String s = "Qspiders";
		
		String str=	s.substring(0,4);
		
		driver.findElement(By.id("email")).sendKeys(str);
		
	

	}

}
