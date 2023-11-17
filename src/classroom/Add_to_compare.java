package classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_to_compare {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
     ChromeDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.get("https://www.flipkart.com/");
     driver.findElement(By.xpath("//button[text()='✕']")).click();
     WebElement ele= driver.findElement(By.xpath("//input[@class='_3704LK']"));
     ele.sendKeys("samsung galaxy s23 ultra");
     ele.submit();
     Thread.sleep(5000);
     driver.findElement(By.xpath("(//span[text()='Add to Compare'])[1]")).click();
    
     driver.findElement(By.xpath("(//span[text()='Add to Compare'])[5]")).click();
     driver.findElement(By.xpath("(//span[text()='Add to Compare'])[9]")).click();
     driver.findElement(By.xpath("(//span[text()='Add to Compare'])[15]")).click();
     driver.findElement(By.xpath("//a[@class='_11o22n _87aCMT']")).click();
     
     
     
     
     
	}

}
