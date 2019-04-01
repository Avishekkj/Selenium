package project.avi.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;
import org.openqa.selenium.By;
//import org.testng.annotations.Test;

import project.avi.base.Testbase;

public class BankMangerLoginTest extends Testbase {

	@Test
	public static void loginbankmanger() throws InterruptedException
	{
		webdriver.findElement(By.cssSelector(OR.getProperty("bmlBtn_CSS"))).click();
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addcustbtn"))),"Login not successful");
	}
	
}
