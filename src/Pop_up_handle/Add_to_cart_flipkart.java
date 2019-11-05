package Pop_up_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Add_to_cart_flipkart {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("manjithsuvarnak@gmail.com");
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("pumpwell93");
		
		driver.findElement(By.xpath("(//span[.='Login'])[3]")).click();
		
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath("//span[.='Baby & Kids']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[.='Soft Toys']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/612/612/k0flmkw0/stuffed-toy/n/u/q/sitting-tiger-17-miss-chief-original-imafk842qmhmddga.jpeg?q=70']")).click(); 
	}

}
