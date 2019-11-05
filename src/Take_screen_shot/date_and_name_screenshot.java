package Take_screen_shot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class date_and_name_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);

		date_and_name_screenshot.getphoto(driver);

		driver.get("https://www.gmail.com/");

		Thread.sleep(5000);

		date_and_name_screenshot.getphoto(driver);
	}

	public static void getphoto(WebDriver driver) throws IOException {
		String Photos = "./Photos/";

		Date d = new Date();

		String d1 = d.toString();
		// ":" symbol not supported in selenium so replaced to selenium
		// supporting symbol "-"
		String Date = d1.replaceAll(":", "-");

		// Step1
		TakesScreenshot ts = (TakesScreenshot) driver;

		// step2
		File src = ts.getScreenshotAs(OutputType.FILE);

		// step3
		File dst = new File(Photos + Date + ".jpeg");

		FileUtils.copyFile(src, dst);

	}

}
