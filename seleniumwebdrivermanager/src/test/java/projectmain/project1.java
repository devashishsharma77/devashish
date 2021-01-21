package projectmain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class project1 {
	public WebDriver driver;
	@BeforeTest(alwaysRun = true)
	public void setUp()  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver ();
		driver.get("https://www.google.com/")  ;
	}
	 @Test
	 public void testUntitledTestCase() throws Exception {
		  driver.get("https://nihilent.com/");
		    
		    
		    driver.findElement(By.xpath("//*[@id=\"menu-item-326\"]/a")).click();
		    driver.findElement(By.xpath("//*[@id=\"menu-item-899\"]/a")).click();
		  Thread.sleep(2000);
		  }
	 @AfterTest(alwaysRun = true)
	  public void tearDown() {
	    driver.quit();}
























}
