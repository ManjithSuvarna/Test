package Generic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic_WebDriver {

	public void close(WebDriver driver)

	{
		driver.close();
	}

	public void get(WebDriver driver, String url)

	{
		driver.get(url);
	}

	public String current_url(WebDriver driver)

	{
		String url = driver.getCurrentUrl();
		return url;
	}

	public String get_source(WebDriver driver)

	{
		String source = driver.getPageSource();
		return source;
	}

	public String get_title(WebDriver driver)

	{
		String title = driver.getTitle();
		return title;
	}

	public void quit(WebDriver driver)

	{
		driver.quit();
	}

	public String get_window_handle(WebDriver driver)

	{
		String parent_id = driver.getWindowHandle();

		return parent_id;

	}

	public Set<String> get_window_handles(WebDriver driver)

	{
		Set<String> allwh = driver.getWindowHandles();

		return allwh;

	}

	public void switch_to(WebDriver driver)

	{
		driver.switchTo();

	}
	
	

}
