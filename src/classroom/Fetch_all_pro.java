package classroom;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Fetch_all_pro {

	public static void main(String[] args) throws Exception {
      System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
      ChromeDriver driver= new ChromeDriver();
      TakesScreenshot shot= (TakesScreenshot)driver;
      File scr=shot.getScreenshotAs(OutputType.FILE);
      File desc= new File("C:\\Selenium folder\\screenShots","jpeg");
      Files.copy(scr, desc);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.get("https://www.flipkart.com/");
      Thread.sleep(4000);
      driver.findElement(By.xpath("//button[text()='✕']")).click();
      Thread.sleep(2000);
    WebElement ele=  driver.findElement(By.xpath("//input[@class='_3704LK']"));
    ele.sendKeys("samsung galaxy s23 ultra");
    ele.submit();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
    Thread.sleep(3000);
    List<WebElement> ele2= driver.findElements( By.xpath("//div[@class='_4rR01T']"));
 
    for(WebElement z : ele2)
    {
    String pnames =	z.getText();
    	System.out.println(pnames);
    }
    driver.close();
    
    
	}

}
