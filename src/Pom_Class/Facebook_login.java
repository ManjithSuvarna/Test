package Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Facebook_login {
	
	
		@FindBy(xpath="//input[@id='u_0_n']")
		private WebElement fntbox;
		
		@FindBy(xpath="//input[@id='u_0_p']")
		private WebElement sntbox;
		
		@FindBy(xpath="//input[@id='u_0_s']")
		private WebElement mobtbox;
		
		@FindBy(xpath="//input[@id='u_0_z']")
		private WebElement pwdtbox;
		
		@FindBy(xpath="//input[@id='u_0_v']")
		private WebElement verifymobtbox;
		
		@FindBy(xpath="//select[@id='day']")
		private WebElement daydd;
		
		@FindBy(xpath="//select[@id='month']")
		private WebElement monthdd;
		
		@FindBy(xpath="//select[@id='year']")
		private WebElement yeardd;
		
		@FindBy(xpath="//input[@id='u_0_7']")
		private WebElement gender_r_button;
		
		@FindBy(xpath="//button[.='Sign Up']")
		private WebElement signup_button;
		
		public void set_fname(String fname)
		{
		fntbox.sendKeys(fname);
		}
		
		public void set_sname(String sname)
		{
		sntbox.sendKeys(sname);
		}
		
		public void set_mob(String mob)
		{
		mobtbox.sendKeys(mob);
		}
		
		public void set_pwd(String pwd)
		{
		pwdtbox.sendKeys(pwd);
		}
		
		public void set_verifymob(String verifymob)
		{
		verifymobtbox.sendKeys(verifymob);
		}
		
		public void set_date(String date)
		{
		daydd.sendKeys(date);
		}
		
		public void set_month(String month)
		{
		monthdd.sendKeys(month);
		}
		
		public void set_year(String year)
		{
		yeardd.sendKeys(year);
		}
		
		public void set_gender()
		{
		gender_r_button.click();
		}
		
		public void click_signup()
		{
		signup_button.click();
		}
		
	public void signup1(String fname,String sname,String mob,String pwd,String verifymob,String date,String month,String year)
	{
		
		
	}
		
}
		
		
		
	



