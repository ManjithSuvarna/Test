package Pop_up_handle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumhq_open_downloads {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.seleniumhq.org/");

		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath("//a[.='Download']"));

		Actions act = new Actions(driver);

		act.contextClick(ele).perform();

		Thread.sleep(3000);

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_T);

		r.keyRelease(KeyEvent.VK_T);

		Thread.sleep(3000);

		Set<String> allwh = driver.getWindowHandles();

		int count = allwh.size();

		for (String wh : allwh)

		{
			driver.switchTo().window(wh);

			String title = driver.getTitle();

			System.out.println(title);

			Thread.sleep(2000);

			if (title.equals("Downloads"))

			{
				driver.switchTo().window(wh);
			}
		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//td[.='C#']/following-sibling::td[3]")).click();

		Thread.sleep(2000);

		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\selenium.exe");
	}

}
