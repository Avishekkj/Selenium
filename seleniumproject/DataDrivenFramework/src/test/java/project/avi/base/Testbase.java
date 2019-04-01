package project.avi.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Testbase {

	public static WebDriver webdriver;
	
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	
	
	@BeforeSuite
	public void setup() throws IOException
	{
		if(webdriver==null)
		{
			FileInputStream fis = new FileInputStream("/Users/Apple/Desktop/Avishek/seleniumproject/DataDrivenFramework/src/test/resources/propertise/config.propertise");
			config.load(fis);
			fis = new FileInputStream("/Users/Apple/Desktop/Avishek/seleniumproject/DataDrivenFramework/src/test/resources/propertise/OR.propertise");
			OR.load(fis);
			
			if(config.getProperty("browser").equals("Chrome"))
			{
			System.setProperty("webdriver.chrome.driver", "/Users/Apple/Desktop/Avishek/seleniumproject/DataDrivenFramework/src/test/resources/executables/chromedriver");
			webdriver = new ChromeDriver();
			}
			
//			elseif(config.getProperty("browser").equals("ie"))
//			{
//			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\test\\resources\\executables\\IEDriverServer.exe");
//			webdriver = new InternetExplorerDriver();
//			}
			
		}
		
		webdriver.get(config.getProperty("baseurl"));
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		
	}
	
	public static boolean isElementPresent(By by)
	{
	try
	{
		webdriver.findElement(by);
		return true ;
	
	}
	catch(NoSuchElementException e)
	{
		return false;
	}
		
	}
	
	
	
	@AfterSuite
	public void teardown()
	{
       webdriver.quit();
	}
}
