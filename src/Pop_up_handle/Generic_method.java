package Pop_up_handle;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.primitives.Booleans;

public class Generic_method {

	public void selectIndex(WebElement ele,int i)
	
	{
		Select s=new Select(ele);
		
		s.selectByIndex(i);
	
	}
	
	public void selectValue(WebElement ele,String Value)
	{
		Select s=new Select(ele);
		
		s.selectByValue(Value);
	}
	
	public void selectText(WebElement ele,String Text)
	{
		Select s=new Select(ele);
		
		s.selectByVisibleText(Text);
	}
	
	public void deselect_All(WebElement ele)
	{
		Select s=new Select(ele);
		
		s.deselectAll();
	}
	
	public void deselectByIndex(WebElement ele,int j)
	{
		Select s=new Select(ele);
		
		s.deselectByIndex(j);
	}
	
	public void deselectByValue(WebElement ele,String Text1)
	{
		Select s=new Select(ele);
		
		s.deselectByValue(Text1);
	}
	
	public void deselectByText(WebElement ele,String Text2)
	{
		Select s=new Select(ele);
		
		s.deselectByVisibleText(Text2);
	}
	
	public Boolean isMultiple(WebElement ele)
	{
		Select s=new Select(ele);
		
		boolean k=s.isMultiple();
		
		return k;
	}
	
	public int options_size(WebElement ele)
	{
		Select s=new Select(ele);
		
		List<WebElement> options = s.getOptions();
		
		int count = options.size();
		
		System.out.println(count);
		
		return count;
	}
	
	public void options_text(WebElement ele)
	{
		Select s=new Select(ele);
		
		List<WebElement> options = s.getOptions();
		
		for(WebElement we:options)
		{
			String text=we.getText();
			
			System.out.println(text);
		}
	}
	
	public void get_all_selected_options(WebElement ele)
	{
		Select s=new Select(ele);
		
		List<WebElement> options = s.getAllSelectedOptions();
		
		for(WebElement we:options)
		{
			String text=we.getText();
			
			System.out.println(text);
		}
	}
	
	public void get_first_selected_options(WebElement ele)
	{
		Select s=new Select(ele);
		
		 WebElement option = s.getFirstSelectedOption();
		
			String text=option.getText();
			
			System.out.println(text);
		
	}
}
