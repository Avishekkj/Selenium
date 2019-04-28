package bestbuy;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Rough {

	
	 static WebDriver driver = null ;
	 static WebDriverWait wait = null;
	 static String usrname = "jha.avishek1@gmail.com";
	 static String pass = "login into bb";
	 
	 String actualtitle= "Best Buy | Official Online Store | Shop Now & Save";
	//public static void main(String[] args) throws InterruptedException {
	
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Apple/Desktop/Avishek/selenium/jars/chromedriver");
		driver = new ChromeDriver();
		wait =  new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bestbuy.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")).click();
		WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".email-submission-modal .modal-header button.close")));
		closeButton.click();
		String title= driver.getTitle();
		AssertJUnit.assertEquals(title, actualtitle);
		System.out.println(title);	 
		Login lgn = new Login();
		
		
		Homepage hm = lgn.Loginbb(usrname, pass);  
		product pd= hm.products();
		pd.selectproduct();
		
		driver.close();
		
	}
		
		
//}	
		
	

}
