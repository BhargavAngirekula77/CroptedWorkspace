package classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_prices {

	public static void main(String[] args) throws Exception {
     System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
     ChromeDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.get("https://www.flipkart.com/");
     driver.findElement(By.xpath("//button[text()='✕']")).click();
     WebElement ele= driver.findElement(By.xpath("//input[@class='_3704LK']"));
     ele.sendKeys("samsung galaxy s23 ultra");
     ele.submit();
     Thread.sleep(5000);
     for(int i=1;i<=15;i++) {
    	WebElement ele2= driver.findElement(By.xpath("(//div[@class='_4rR01T'])["+i+"]"));
    	String pname= ele2.getText();
    	WebElement ele3= driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])["+i+"]"));
    	String price=ele3.getText();
    	System.out.println(pname+"--------->"+price);
     }
     
     
	}

}
