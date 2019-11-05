package cart_TestNG_example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Excute_multiple_times {

	@Test (priority=1,invocationCount=3)

	public void test1() {
		Reporter.log("1", true);
	}

	@Test

	public void test2() {
		Reporter.log("1", true);
	}

}
