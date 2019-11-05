package Other_Programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_end_to_end {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8971779173");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("pumpwell93");

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//Span[.='Login'])[3]")).click();

		WebElement ele = driver.findElement(By.xpath("//span[.='Men']"));

		Actions act = new Actions(driver);

		act.moveToElement(ele).perform();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[.='T-Shirts']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[.='Printed, Geometric Print Men Round Neck Dark Blue T-Shi...']")).click();

		Thread.sleep(3000);

		String Parent_id = driver.getWindowHandle();

		System.out.println(Parent_id);

		// allwh consist of id of all the browsers

		Set<String> allwh = driver.getWindowHandles();

		Thread.sleep(3000);

		allwh.remove(Parent_id);

		for (String wh : allwh) {
			System.out.println(wh);
			driver.switchTo().window(wh);
		}

		driver.findElement(By.xpath("//a[.='XL']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[.=' ADD TO CART']")).click();

		Thread.sleep(3000);

		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("//button[.=' + ']")).click();
			Thread.sleep(2000);
		}
		
		String s = driver.findElement(By.xpath("((//div[contains(.,'Save for later')])[12]/../ancestor::div//span[@class='pMSy0p XU9vZa'])[1]")).getText();
	
	System.out.println(s);
	
	String s1 = s.replaceAll("?","");
	
	String s2 = s1.replaceAll(",","");
	
	System.out.println(s2);
	
	
	
	}

}
