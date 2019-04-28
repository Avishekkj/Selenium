package bestbuy;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Homepage extends Rough{

	public static void search()
	{ 	 
		 
		 
		WebElement item = driver.findElement(By.id("gh-search-input"));
	    item.sendKeys("mac");
	    
		item.sendKeys(Keys.DOWN);
		item.sendKeys(Keys.DOWN);
		item.sendKeys(Keys.DOWN);
		item.sendKeys(Keys.ENTER);
		 
		 
	}
	
	
	public static  product products()
	{
		driver.findElement(By.xpath("//a[@id='menu0']")).click();
		driver.findElement(By.xpath("//*[@id=\"group0\"]/div[1]/div/div[1]/ul/li[1]/a")).click();
		
		return new product();
	}
	
}
