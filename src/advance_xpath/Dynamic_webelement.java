package advance_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_webelement {

	public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        WebElement ele= driver.findElement(By.xpath("//input[@class='_3704LK']"));
        ele.sendKeys("Samsung galaxy s23");
        ele.submit();
        Thread.sleep(4000);
        WebElement ele2=driver.findElement(By.xpath("//div[@class='_3pLy-c row']/div[1]/div[1]"));
        String pro=ele2.getText();
        System.out.println(pro);
        WebElement ele3= driver.findElement(By.xpath("//div[@class='_3pLy-c row']/div[1]/div[1]/../../div[2]/div[1]/div/div"));
        String price= ele3.getText();
        System.out.println(price);
      //  driver.close();
        
        
	}
	

}
