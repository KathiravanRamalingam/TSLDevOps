package LoginTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SeleniumDev {
	
	WebDriver driver;
  @Test
  public void titleTest() {
	  driver.get("http://selenium.dev");
	  Assert.assertEquals(driver.getTitle(), "Selenium");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();

  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(2000);
	  driver.close();
  }

}
