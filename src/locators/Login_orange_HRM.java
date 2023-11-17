package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_orange_HRM {

	public static void main(String[] args) throws Exception {
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(10000);
	    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}

}
