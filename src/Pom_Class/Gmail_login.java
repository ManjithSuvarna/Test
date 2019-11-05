package Pom_Class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Gmail_login {
	
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement fntbox;
	
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lntbox;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement untbox;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement pwdtbox;
	
	@FindBy(xpath="//input[@aria-label='Confirm']")
	private WebElement cnfpwdtbox;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement click_next;
	
	public void set_fname(String fname)
	{
	fntbox.sendKeys(fname);
	}
	
	public void set_sname(String sname)
	{
		lntbox.sendKeys(sname);
	}

	public void set_uname(String uname)
	{
		untbox.sendKeys(uname);
	}
	
	public void set_pwd(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	
	public void set_cnfpwd(String cnfpwd)
	{
		cnfpwdtbox.sendKeys(cnfpwd);
	}
	
	public void click_next()
	{
		click_next.click();
	}

	
	public void Signup_arg(String fname,String sname,String uname,String pwd,String cnfpwd)
	{
		
	}
	
	
	
}
