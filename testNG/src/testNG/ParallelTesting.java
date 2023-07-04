package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver",
				"/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa.creaudit.com");
		driver.quit();
	
	}
	
	@Test
	public void openBing() {
		System.setProperty("webdriver.chrome.driver",
				"/home/mac/ADS/Chromedriver/107/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.quit();
	
	}

}
