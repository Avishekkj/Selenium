package project.avi.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import project.avi.base.Testbase;

public class AddCustomerTest extends Testbase {

	
	@Test
	public static void addcustomer() throws InterruptedException
	{
		webdriver.findElement(By.cssSelector(OR.getProperty("addcustbtn"))).click();
		webdriver.findElement(By.cssSelector(OR.getProperty("firstname"))).sendKeys("raghav");
		webdriver.findElement(By.cssSelector(OR.getProperty("lastname"))).sendKeys("sharma");
		webdriver.findElement(By.cssSelector(OR.getProperty("zipcode"))).sendKeys("34344");
		webdriver.findElement(By.cssSelector(OR.getProperty("addcust"))).click();
		
//		Thread.sleep(2000);
//		
//		WebDriverWait wait = new WebDriverWait(webdriver,20);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		
//		Assert.assertTrue(alert.getText().contains("Customer added successfully with customer id"));
//		alert.accept();
//		
//		Thread.sleep(2000);
	}
}
