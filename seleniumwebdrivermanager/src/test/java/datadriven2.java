import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import exceldatautils.ReadExcelFile;

public class datadriven2 {
	WebDriver driver = new ChromeDriver();
	@Test(dataProvider="testdata")
	public void demoClass(String username, String password) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.gmail.com");
     driver.findElement(By.id("identifierId")).sendKeys(username,Keys.ENTER);
     Thread.sleep(3000);
     driver.findElement(By.name("password")).sendKeys(password,Keys.ENTER);
     Thread.sleep(4000);
	//Assert.assertTrue(driver.getTitle().matches("BrowserStack Login | Sign Into The Best Mobile & Browser Testing Tool"), "Invalid credentials");
	//System.out.println("Login successful");
	}
	@AfterMethod
	void ProgramTermination() {
	driver.quit();
	} 
	@DataProvider(name="testdata")
	public Object[][] testDataExample(){
	ReadExcelFile configuration = new ReadExcelFile("C:\\Users\\HP\\eclipse-workspace\\seleniumwebdrivermanager\\excel\\data.xlsx");
	int rows = configuration.getRowCount(0);
	Object[][]signin_credentials = new Object[rows][2];

	for(int i=0;i<rows;i++)
	{
	signin_credentials[i][0] = configuration.getData(0, i, 0);
	signin_credentials[i][1] = configuration.getData(0, i, 1);
	}
	return signin_credentials;
	}
	}
