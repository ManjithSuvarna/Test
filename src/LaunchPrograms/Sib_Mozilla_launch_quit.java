package LaunchPrograms;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sib_Mozilla_launch_quit 
{

		static
		{
			String key="webdriver.gecko.driver";
			String value="./softwares/geckodriver.exe";
			System.setProperty(key,value);
		}
	public static void main(String[] args)
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.close();

	}

}
