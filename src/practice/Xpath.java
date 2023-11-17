package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {

	public static void main(String[] args) throws Exception {
       System.setProperty("webdriver.edgr.driver","C:\\Selenium folder\\msedgedriver.exe");
       EdgeDriver driver= new EdgeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       driver.get("https://www.instagram.com/");
      // Thread.sleep(4000);
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bhargav_angirekula");
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bhargav@77");
       
       driver.findElement(By.xpath("//button[@type='submit']")).click();
     
       
    //  driver.findElement(By.xpath("//div[@role='button']")).submit();
    /**Alert alr=driver.switchTo().alert();
     alr.dismiss();
     String lox=alr.getText();
      System.out.println(lox);**/
       Thread.sleep(4000);
      // driver.close()
;       
	}

}
