package practice;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Implict_wait {
public static void main(String[] args) throws Exception {
		        System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\geckodriver.exe");
		        FirefoxDriver driver= new FirefoxDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.get("https://www.flipkart.com/");
		      //  Thread.sleep(3000);
		        driver.findElement(By.xpath("//button[text()='✕']")).click();
		        WebElement ele=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		        ele.sendKeys("samsung galaxy s23");
		        ele.submit();
		       // Thread.sleep(3000);
		        driver.navigate().refresh();
		       // WebDriverWait wait=new WebDriverWait(driver,(Duration.ofSeconds(10)));
		        
		      //  Thread.sleep(4000);
		        driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		       // Thread.sleep(4000);
		        List<WebElement> ele2=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		        for (WebElement elo : ele2) {
		        	String lox=elo.getText();
		        	System.out.println(lox);
					
				}
		        System.out.println("this fot only the s23 ultra list ");
		        
		        List<WebElement> ele3=driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S23 Ultra 5G')]"));
		        Iterator irate= ele3.iterator();
		        while(irate.hasNext()) {
		        	String lp=((WebElement) irate.next()).getText();
		        	System.out.println(lp);
		        }
		        
		        System.out.println("this 5G mobiles data");
		        List<WebElement> ele4= driver.findElements(By.xpath("//div[contains(text(),'5G')]"));
		        for(int i=0;i<ele4.size();i++) {
		        	String ok= ele4.get(i).getText();
		        	System.out.println(ok);
		        }
		        driver.findElement(By.xpath("//div[contains(text(),'F04')]")).click();
		      //  Thread.sleep(4000);
		     //   driver.quit();
		        
		        
			}

		

	

}
