package Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pop_up_handle.Generic_method;

public class facebooksignup {
	
	@FindBy(xpath="//input[@aria-label='First name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@aria-label='Surname']")
	private WebElement surname;
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobileno;
	
	@FindBy(xpath="//input[@id='u_0_v']")
	private WebElement verifymobtbox;
	
	@FindBy(xpath="//input[@aria-label='New password']")
	private WebElement password;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement date;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement year;
	
	@FindBy(xpath="(//input[@name='sex'])[2]")
	private WebElement male;
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signup;
	
	public facebooksignup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void firstname(String value)
	{
		firstname.sendKeys(value);
	}
	public void sname(String value)
	{
		surname.sendKeys(value);
	}
	public void mobile(String value)
	{
		mobileno.sendKeys(value);
	}
	public void verifymobile(String value)
	{
		verifymobtbox.sendKeys(value);
	}
	public void passwod(String value)
	{
		password.sendKeys(value);
	}
	public void day(String text)
	{
		Generic_method d = new Generic_method();
		d.selectText(date, text);
	}
	public void month(String text)
	{
		Generic_method d = new Generic_method();
		d.selectText(month, text);
	}
	public void year(String text)
	{
		Generic_method d = new Generic_method();
		d.selectText(year, text);
	}
	public void gender()
	{
		male.click();
	}
	public void sinup()
	{
		signup.click();
	}
	
	
	
	
	
	
}
