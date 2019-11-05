package LaunchPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Print_title_url_SourceCode 
{

	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.google.com");
	
    String src = driver.getPageSource();
	
	System.out.println(src);
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	String url = driver.getCurrentUrl();
	
	System.out.println(url);
	
	}

}
