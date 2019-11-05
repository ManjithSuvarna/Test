package Handling_Frames;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Maximize_resize_Minimize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		Dimension d = new Dimension(100, 200);

		// Resize the browser

		driver.manage().window().setSize(d);

		Thread.sleep(2000);

		Point p = new Point(200, 300);

		Thread.sleep(2000);

		driver.manage().window().setPosition(p);

	}

}
