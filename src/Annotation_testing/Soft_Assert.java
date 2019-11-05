package Annotation_testing;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.Generic_Before_After_method;

public class Soft_Assert extends Generic_Before_After_method {

	@Test
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("PWD")).sendKeys("Manager");
		driver.findElement(By.xpath("//div[.='Login']")).click();

		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "actiTime-Enter time_track");
		System.out.println("1");
	}

	{

		SoftAssert sa = new SoftAssert();
		sa.assertequals(title,"actiTime-enter_time_track");

		System.out.println("1");
		sa.assertAll();
		System.out.println("2");

	}

}
