package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Logout_orange_with_edge {

	public static void main(String[] args)throws Exception {
		try {
      System.setProperty("webdriver.edge.driver", "C:\\Selenium folder\\msedgedriver.exe");
      EdgeDriver driver=new EdgeDriver();
      driver.manage().window().maximize();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
        Thread.sleep(500);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("oxd-userdropdown-name")).click();
        Thread.sleep(100);
        driver.findElement(By.cssSelector("a[href='/web/index.php/auth/logout']")).click();
        Thread.sleep(5000);
        driver.close();
		}
		catch(Exception obj) {
			System.out.println(obj.getMessage());
		}
        
        
      
      
	}

}
