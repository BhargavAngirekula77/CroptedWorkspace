package classroom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class All_pricefrom_flipkart {

	public static void main(String[] args) {
    System.setProperty("webdriver.edge.driver", "C:\\Selenium folder\\msedgedriver.exe");
    EdgeDriver driver= new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    driver.get("https://www.flipkart.com/");
//    WebElement ele=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
//    ele.sendKeys("samsung galaxy s23 ultra");
//    ele.submit();
    driver.findElement(By.xpath("//button[text()='✕']")).click();
    WebElement ele= driver.findElement(By.xpath("//input[@type='text']"));
    ele.sendKeys("samsung galaxy s23 ultra");
    ele.submit();
    
    List<WebElement> ele2= driver.findElements(By.xpath("//div[@class='col col-7-12']/div[@class='_4rR01T']"));
    List<WebElement> ele3= driver.findElements(By.xpath("//div[@class='col col-7-12']/following-sibling::div/div/div/div[@class='_30jeq3 _1_WHN1']"));
    int count=0;
    for(int i=0;i<ele2.size();i++) {
    	
    	String product= ele2.get(i).getText();
    	String price=ele3.get(i).getText();
    	System.out.println(product+"------>"+price);
    	count++;
    }
    if(count==ele2.size()) {
    	System.out.println("All products are printed now");
    }
    driver.close();
	}

}
