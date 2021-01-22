import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class gmailtest {
   public static void main(String[] args) throws InterruptedException   
   {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.gmail.com");
      driver.findElement(By.id("identifierId")).sendKeys("priyajkumart",Keys.ENTER);
      Thread.sleep(3000);
      driver.findElement(By.name("password")).sendKeys("PASSWORD",Keys.ENTER);
      Thread.sleep(4000);
      driver.close();
      driver.quit();
   }
}