package Other_Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Boat_cable {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get(
				"https://www.amazon.in/Rugged-Extra-Tough-Unbreakable-Braided/dp/B0789LZTCJ/ref=sr_1_5?crid=2ZJ281F9QRUE9&keywords=rugged+cable&qid=1574803293&sprefix=rugged+ca%2Caps%2C789&sr=8-5");

		Thread.sleep(5000);

		WebElement ele = driver.findElement(By.xpath("//*[@id='priceblock_ourprice']"));

		String text = ele.getText();

		String price_String = text.substring(2);

		float price = Float.parseFloat(price_String);

		if (price > 200) {
			driver.get("https://www.facebook.com/");

			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mskmangalore@gmail.com");

			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pumpwell");

			Thread.sleep(2000);

			Robot r = new Robot();

			r.keyPress(KeyEvent.VK_ENTER);

			r.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(5000);

			r.keyPress(KeyEvent.VK_ESCAPE);

			r.keyRelease(KeyEvent.VK_ESCAPE);
			
			Thread.sleep(3000);

			driver.get("https://www.facebook.com/manjith.suvarna");

			r.keyPress(KeyEvent.VK_ESCAPE);

			r.keyRelease(KeyEvent.VK_ESCAPE);
			
			Thread.sleep(3000);

			driver.findElement(By.xpath("//*[@id='u_0_1j']")).click();

			Thread.sleep(3000);
			
			r.keyPress(KeyEvent.VK_S);

			r.keyRelease(KeyEvent.VK_S);

			r.keyPress(KeyEvent.VK_ENTER);

			r.keyRelease(KeyEvent.VK_ENTER);

		}

		else {
			System.out.println("Dont Buy");
		}
	}

}
