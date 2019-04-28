package bestbuy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Rough {
	
	@Test
	public  static Homepage  Loginbb(String username, String password)
	{	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='hf_accountMenuLink']"))).click();
		// driver.findElement(By.xpath("//a[@id='hf_accountMenuLink']")).click();
		 driver.findElement(By.xpath("//button[@class='lam-signIn__button btn btn-secondary']")).click();
		 driver.findElement(By.xpath("//input[@id='fld-e']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@id='fld-p1']")).sendKeys(password);
		 driver.findElement(By.xpath("//button[@class='cia-form__submit-button js-submit-button']")).click();
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='hf_accountMenuLink']")).getText().contains("Hi"));
		
		 return  new Homepage();
	}
}
