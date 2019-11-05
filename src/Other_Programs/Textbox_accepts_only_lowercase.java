package Other_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textbox_accepts_only_lowercase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com");
		
		String s1 = "AbCdEfgHIJK";
		String s2 ="";
		
	char[] arr=s1.toCharArray();
	for (int i=0;i<arr.length;i++)
	if((int)arr[i]>97 && (int)arr[i]<122)
	{
		s2=s2+arr[i];
	}
	driver.findElement(By.id("email")).sendKeys(s2);
	}

}
