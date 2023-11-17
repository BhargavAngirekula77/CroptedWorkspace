package classroom;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		String whatwe_want="Mr.Yamaha";
		Random num= new Random();
		int ran= num.nextInt(701);
      System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
      ChromeDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.actitime.com/login.do");
      Thread.sleep(7000);
      driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
      driver.findElement(By.name("pwd")).sendKeys("manager");
      driver.findElement(By.xpath("//div[text()='Login ']")).click();
      Thread.sleep(1000);
      driver.findElement(By.id("container_tasks")).click();
      Thread.sleep(200);
      
      driver.findElement(By.xpath("//div[text()='Add New']")).click();
      driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
      Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Mr.Yamaha"+ran);
      driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("hi im going to create the new person");
      driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
      Thread.sleep(2000);
      
      WebElement elen= driver.findElement(By.className("titleEditButtonContainer"));
      String whatin=elen.getText();
      System.out.println(whatin);
      if(whatin.contains(whatwe_want)) {
    	  System.out.println("it's done");
    	  
      }
      else {
    	  System.out.println("it's lost");
      }
      
      Thread.sleep(4000);
      driver.close();
      
      
	}

}
