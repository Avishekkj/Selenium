package bestbuy;

import org.openqa.selenium.By;

public class product extends Rough{

	
	 public static void selectproduct() throws InterruptedException
	 {
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-block button-state-default btn-primary btn-leading-ficon')]")).click(); 
		Thread.sleep(2000);
	 }
	 
}
