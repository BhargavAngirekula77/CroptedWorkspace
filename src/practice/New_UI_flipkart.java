package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_UI_flipkart {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver driver= new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//span[text()='✕']")).click();
    WebElement ele=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
    ele.sendKeys("rolex watches");
    ele.submit();
    List<WebElement> ele1= driver.findElements(By.xpath("//div[@class='_2WkVRV']"));
    List<WebElement> ele2= driver.findElements(By.xpath("//div[@class='_30jeq3']"));
    List<WebElement> ele3=driver.findElements(By.xpath("//a[contains(@class,'IRpwTa')]"));
    List<WebElement> ele4=driver.findElements(By.xpath("//div[@class='_3Ay6Sb']/span"));
   
    	
   
    for(int i=0;i<ele1.size();i++) {
    	String brand= ele1.get(i).getText();
    	String price= ele2.get(i).getText();
    	String model= ele3.get(i).getText();
    	String discount= ele4.get(i).getText();
    	System.out.println(brand+"=======>"+model+"=========>"+discount+"======>"+price);
    }
    driver.close();

	}

}
