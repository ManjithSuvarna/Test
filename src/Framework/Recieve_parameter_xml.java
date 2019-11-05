package Framework;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Recieve_parameter_xml {
	@Parameters({"city","country"})
	@Test
	public void test_parallel(String city,String country)
	{
		Reporter.log(city, true);
		Reporter.log(country, true);
		
	}
	

}
