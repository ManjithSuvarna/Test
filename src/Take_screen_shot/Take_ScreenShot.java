package Take_screen_shot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Take_ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
   System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		//Step1
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//step2
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//step3
		File dst = new File("E:\\FB2.PNG");
		
		FileUtils.copyFile(src,dst);

	}

}
