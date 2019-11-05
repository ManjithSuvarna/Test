package cart_TestNG_example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multiple_annotation {
	
	@Test(priority=-4)
	public void test1()
	{
		Reporter.log("1",true);
	}
	
	@Test(priority=-9)
	public void test2()
	{
		Reporter.log("2",true);
	}
	
	

}
