package Log4jConcept.Log4jConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;


public class AppTest 
{
	Logger log = Logger.getLogger(AppTest.class);
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		log.info("-------------------------------Chrome driver intialization---------------------------------------------");
		System.setProperty("webdriver.chrome.driver", "D://core java training//Drivers//ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		log.info("-------------------------------Lauching URL---------------------------------------------");
	}

	@Test
	public void titletest()
	{
	log.info("-------------------------------Test case started---------------------------------------------");
	Assert.assertEquals(driver.getTitle(),"Google","Title not matched");
	log.info("-------------------------------Test case ended---------------------------------------------");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
}
