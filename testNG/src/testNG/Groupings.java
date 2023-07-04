package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Groupings {
	WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;
	
	@BeforeSuite
	public void launchBrowser() {
		 startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void openGoole() {
		
		driver.get("https://qa.creaudit.com");

	}
	
	  @Test 
	  public void openBing() { 
		  driver.get("https://www.Bing.com");
	  }
	  
	  @Test 
	  public void openYahoo() { 
		  driver.get("https://www.Yahoo.com");
	  }
	  
	  @AfterSuite
	  public void afterBrowser() {
		  driver.quit();
		   endTime=System.currentTimeMillis();
		   totalTime=endTime-startTime;
		   System.out.println(totalTime);
	  }
	  }
	 

