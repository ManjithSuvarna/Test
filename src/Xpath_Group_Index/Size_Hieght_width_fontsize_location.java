package Xpath_Group_Index;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Size_Hieght_width_fontsize_location {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org/");
		
		WebElement ele = driver.findElement(By.xpath("//a[.='Download']"));
		
		String tooltip = ele.getAttribute("title");
		
		System.out.println("Tooltip ---> "+tooltip);
	
		WebElement ele1 =driver.findElement(By.xpath("//a[@title='Selenium Projects']"));
		
		String text = ele1.getText();
		
		System.out.println("Text --> "+text);
		
		WebElement ele2 =driver.findElement(By.xpath("//a[.='About']"));
		
		Point loc = ele2.getLocation();
		
		System.out.println("Location ---> "+loc);
		
		int x = loc.getX();
		
		System.out.println("X  Co-ordinate ---> "+x);
		
		int y = loc.getY();
		
		System.out.println("Y Co-ordinate ---> "+y);
		
		WebElement ele3 =driver.findElement(By.id("q"));
		
		String font = ele3.getCssValue("font-size");
		
		System.out.println("Font Size ---> "+font);
		
		WebElement ele4 =driver.findElement(By.id("q"));
		
		int h = ele4.getSize().getHeight();
		
		System.out.println("Height ---> "+h);
		
        int w = ele4.getSize().getWidth();
		
		System.out.println("Width ---> "+w);
		
		WebElement ele5 =driver.findElement(By.xpath("//a[.='Selenium Projects']"));
		
		String colour = ele5.getCssValue("color");
		
		System.out.println("colour ---> "+colour);
		
		
		
		
		
		
		
		
		
		
	}
}
