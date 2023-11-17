package practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Second_elements {

	public static void main(String[] args) throws Exception {
      System.setProperty("webdriver.edge.driver", "C:\\Selenium folder\\msedgedriver.exe");
      WebDriver driver= new EdgeDriver();
      driver.manage().window().maximize();
      TakesScreenshot td=(TakesScreenshot)driver;
      File scr= td.getScreenshotAs(OutputType.FILE);
      File desc= new File("C:\\Selenium folder\\screenShots","jpeg");
      Files.copy(scr,desc);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.get("https://www.flipkart.com/");
      driver.findElement(By.xpath("//button[text()='✕']")).click();
      WebElement ele= driver.findElement(By.xpath("//input[@class='_3704LK']"));
      ele.sendKeys("shirts");
      ele.submit();
      driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
      Thread.sleep(4000);
      WebElement ele2= driver.findElement(By.xpath("//div[@class='_13oc-S']/div[2]/div[1]/div[1]/div[1]"));
      String prob=ele2.getText();
      System.out.println("the name of the product");
      System.out.println(prob);
      WebElement ele3= driver.findElement(By.xpath("//div[@class='_13oc-S']/div[2]/div[1]/div[1]/div[1]/../a[2]/div/div"));
      String price= ele3.getText();
      System.out.println("the peice of the product");
      System.out.println(price);
      WebElement ele4= driver.findElement(By.xpath("//div[@class='_2B099V']/a[2]/div/div[3]/span"));
      String discount=ele4.getText();
      System.out.println("the discount given");
      System.out.println(discount);
    //  driver.close();
      
      
      
	}

}
