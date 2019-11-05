package Take_screen_shot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic.Generic_WebElement;
import Pop_up_handle.Generic_method;

public class Facebook_login_screenshot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/r.php");

		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//input[@id='u_0_n']"));

		Generic_WebElement We = new Generic_WebElement();

		String value1 = "MSK";

		We.send_keys(ele, value1);

		WebElement ele1 = driver.findElement(By.xpath("//input[@id='u_0_p']"));

		String value2 = "Mangalore";

		We.send_keys(ele1, value2);

		WebElement ele2 = driver.findElement(By.xpath("//input[@id='u_0_s']"));

		String value3 = "mskMangalore@gmail.com";

		We.send_keys(ele2, value3);

		WebElement ele3 = driver.findElement(By.xpath("//input[@id='u_0_z']"));

		String value4 = "12345abcde";

		We.send_keys(ele3, value4);

		WebElement ele4 = driver.findElement(By.xpath("//input[@id='u_0_v']"));

		String value5 = "mskMangalore@gmail.com";

		We.send_keys(ele4, value5);

		WebElement ele5 = driver.findElement(By.xpath("//select[@id='day']"));

		Generic_method drop = new Generic_method();

		String text = "12";

		drop.selectText(ele5, text);

		WebElement ele6 = driver.findElement(By.xpath("//select[@id='month']"));

		String text1 = "Apr";

		drop.selectText(ele6, text1);
		
		WebElement ele7 = driver.findElement(By.xpath("//select[@id='year']"));

		String text2 = "1993";

		drop.selectText(ele7, text2);
		
		driver.findElement(By.xpath("//input[@id='u_0_7']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[.='Sign Up']")).click();
	}

}
