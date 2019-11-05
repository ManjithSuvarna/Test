package Generic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Generic_WebElement {

	public void Clear(WebElement ele)

	{
		ele.clear();
	}

	public void Click(WebElement ele)

	{
		ele.click();
	}

	public String get_Attribute(WebElement ele, String title)

	{
		String text = ele.getAttribute(title);

		return text;
	}

	public String get_CSS_Value(WebElement ele, String title)

	{
		String text = ele.getCssValue(title);

		return text;
	}

	public int get_location_x(WebElement ele, Point p)

	{
		int loc = ele.getLocation().getX();

		return loc;
	}

	public int get_location_y(WebElement ele, Point p)

	{
		int loc = ele.getLocation().getY();

		return loc;
	}

	public Point get_location(WebElement ele, Point p)

	{
		Point loc = ele.getLocation();

		return loc;
	}

	public Dimension get_size(WebElement ele)

	{
		Dimension size = ele.getSize();

		return size;
	}

	public int get_size_height(WebElement ele)

	{
		int Height = ele.getSize().getHeight();

		return Height;
	}

	public int get_size_width(WebElement ele)

	{
		int width = ele.getSize().getWidth();

		return width;
	}

	public String get_text(WebElement ele)

	{
		String text = ele.getText();

		return text;
	}

	public boolean is_Displayed(WebElement ele)

	{
		boolean b = ele.isDisplayed();
		return b;
	}

	public boolean is_Enabled(WebElement ele)

	{
		boolean b = ele.isEnabled();
		return b;
	}

	public boolean is_Selected(WebElement ele)

	{
		boolean b = ele.isSelected();
		return b;
	}

	public void get_multiple_text(List<WebElement> ele)

	{
		ArrayList<String> l = new ArrayList<String>();
		for (WebElement we : ele) {
			String text = we.getText();
			System.out.println(text);
			l.add(text);
		}

	}
	
	public void send_keys(WebElement ele,String value)

	{
		ele.sendKeys(value);
		
	

	}

}