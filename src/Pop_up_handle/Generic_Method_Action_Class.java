package Pop_up_handle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_Method_Action_Class 
{
	public void context_click(WebDriver driver,WebElement ele)
	{
		Actions act = new Actions(driver);
		
		act.contextClick(ele).perform();
	}
	
	public void double_click(WebDriver driver,WebElement ele)
	{
		Actions act = new Actions(driver);
		
		act.doubleClick(ele);
	}
	
	public void drag_and_drop(WebDriver driver,WebElement ele,WebElement ele1)
	{
		Actions act = new Actions(driver);
		
		act.dragAndDrop(ele,ele1).perform();;
	}
	
	public void mouse_Hover(WebDriver driver,WebElement ele)
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).perform();
	}
	
	public void click(WebDriver driver,WebElement ele)
	{
		Actions act = new Actions(driver);
		
		act.click(ele);
	}
	
	public void new_Tab(WebDriver driver,WebElement ele) throws AWTException
	{
		Actions act = new Actions(driver);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
	
	public void new_Window(WebDriver driver,WebElement ele) throws AWTException
	{
		Actions act = new Actions(driver);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
	}
	
	
}
