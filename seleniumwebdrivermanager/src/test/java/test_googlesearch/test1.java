package test_googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) {
		googlesearch();
		// TODO Auto-generated method stub

	} 
	
	public static void googlesearch() {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://google.com");
		  
		 driver.findElement(By.name("q")).sendKeys("yolo");
		 driver.findElement(By.name("btnK")).click();
		
	}

}
