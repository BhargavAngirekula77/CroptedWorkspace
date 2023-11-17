package classroom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_Prices_with_surrounding {

	public static void main(String[] args) {
     System.setProperty("webdriver.gecko.driver", "C:\\Selenium folder\\geckodriver.exe");
     FirefoxDriver driver= new FirefoxDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
     driver.get("https://www.flipkart.com/");
     driver.findElement(By.xpath("//button[text()='✕']")).click();
     WebElement ele= driver.findElement(By.xpath("//input[@type='text']"));
     ele.sendKeys("samsung galaxy s23 ultra");
     ele.submit();
     List<WebElement> ele2= driver.findElements(By.xpath("//div[@class='_1AtVbE col-12-12']/div/div/div/a/div[2]/div/div[@class=\"_4rR01T\"]"));
     List<WebElement> ele3= driver.findElements(By.xpath("//div[@class='_1AtVbE col-12-12']/div/div/div/a/div[2]/div/div[@class=\"_4rR01T\"]/../following-sibling::div[1]/div/div/div[@class='_30jeq3 _1_WHN1']"));
     //driver.quit();
     for(int i=1;i<ele2.size()-1;i++) {
    	 String pro= ele2.get(i).getText();
    	 String pri= ele3.get(i).getText();
    	 System.out.println(pro+"------->"+pri);
     }
     
 // driver.close();
     
	}
	

}
