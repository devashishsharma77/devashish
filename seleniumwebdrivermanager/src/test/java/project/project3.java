package project;

import java.io.FileInputStream;import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
 
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class project3 {
	public WebDriver driver;
	@BeforeTest(alwaysRun = true)
	public void setUp()  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver ();
		driver.get("https://www.google.com/")  ;
	}
	@Test 
	public void test() throws Exception {
		driver.findElement(By.name("q")).sendKeys("calculator");
		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/div/div")).sendKeys("33");;
		//driver.findElement(By.className("XRsWPe MEdqYd")).click();
		//driver.findElement(By.className("z7BZJb XSNERd")).sendKeys("2");
		Thread.sleep(2000);
	}
	@AfterTest(alwaysRun = true)
	public void tearDown() {
		driver.quit();}

	@DataProvider(name= "test1data")
	public static Object[][] ReadVariant() throws Exception
	{
		
	    XSSFWorkbook workbook = new XSSFWorkbook ("C:\\Users\\HP\\eclipse-workspace\\seleniumwebdrivermanager\\excel\\data.xlsx"); //get my workbook 
		XSSFSheet worksheet = workbook.getSheet("Sheet1");// get my sheet from workbook	
	
		XSSFRow Row=worksheet.getRow(0);     //get my Row which start from 0   

		int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
		int ColNum= Row.getLastCellNum(); // get last ColNum 

		Object Data[][]= new Object[RowNum-1][ColNum]; // pass my  count data in array

		for(int i=0; i<RowNum-1; i++) //Loop work for Rows
		{  
			XSSFRow row= worksheet.getRow(i+1);

			for (int j=0; j<ColNum; j++) //Loop work for colNum
			{
				if(row==null)
					Data[i][j]= "";
				else
				{
					XSSFCell cell= row.getCell(j);
					if(cell==null)
						Data[i][j]= ""; //if it get Null value it pass no data 
					else
					{
						DataFormatter formatter = null;
						String value=formatter.formatCellValue(cell);
						Data[i][j]=value; //This formatter get my all values as string i.e integer, float all type data value
					}
				}
			}
		}

		return Data;
	}
}






















