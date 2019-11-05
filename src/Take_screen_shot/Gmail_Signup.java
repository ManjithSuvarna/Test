package Take_screen_shot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic.Generic_WebDriver;
import Generic.Generic_WebElement;
import Pop_up_handle.Generic_method;

public class Gmail_Signup {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./s/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Generic_WebDriver c=new Generic_WebDriver();
		Generic_WebElement c2=new Generic_WebElement();
		Generic_method c3=new Generic_method();
		Action_generic c1=new Action_generic();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		c.getApp(driver, "https://accounts.google.com/signin");
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='identifierId']"));
		c2.send_Keys(ele1, "Shrivathsarao");
		WebElement ele2 = driver.findElement(By.xpath("(//span[.='Next'])[2]"));
		c2.clickA(ele2);
		Thread.sleep(2000);
		WebElement ele3= driver.findElement(By.xpath("//input[@name='password']"));
		c2.send_Keys(ele3, "shrivathsarao");
		WebElement ele4 = driver.findElement(By.xpath("(//span[.='Next'])[1]"));
		c2.clickA(ele4);
	}


	}


