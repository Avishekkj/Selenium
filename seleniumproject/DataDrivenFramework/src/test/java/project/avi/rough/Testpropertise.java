package project.avi.rough;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Testpropertise {

public static void main (String args[]) throws IOException	
{
	
//System.err.println(System.getProperty("user.dir"));
Properties config = new Properties();
Properties OR = new Properties();

FileInputStream fis = new FileInputStream("/Users/Apple/Desktop/Avishek/seleniumproject/DataDrivenFramework/src/test/resources/propertise/config.propertise");
config.load(fis);
System.out.println(config.getProperty("browser"));

fis = new FileInputStream("/Users/Apple/Desktop/Avishek/seleniumproject/DataDrivenFramework/src/test/resources/propertise/OR.propertise");
OR.load(fis);
System.out.println(OR.getProperty("bmlBtn_CSS"));

System.setProperty("webdriver.chrome.driver","/Users/Apple/Desktop/Avishek/seleniumproject/DataDrivenFramework/src/test/resources/executables/chromedriver");
WebDriver  webdriver = new ChromeDriver();

//((WebDriver) webdriver).get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		
}

}
