package seleniumwebdrivermanager;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
     public static void main(String[] args) {
    	 WebDriverManager.chromedriver().setup();
    	 WebDriver driver = new ChromeDriver();
    	 driver.get("https://google.com");
    	 
    	 java.util.List<WebElement> listofinputelements = driver.findElements(By.xpath("// input"));
    	 int count = listofinputelements.size();
    	 System.out.println(count);
	}
}
