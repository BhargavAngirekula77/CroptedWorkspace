package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		String user_name="angirekulabhargav777@gmail.com",password="Bhargav@77";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
        Thread.sleep(3000);
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.name("email")).sendKeys(user_name);
        Thread.sleep(3000);
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.className("a-button-input")).click();
        
        /**driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();**/
        Thread.sleep(5000);
        driver.findElement(By.name("url")).click();
        
        Thread.sleep(4000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches for men");
        Thread.sleep(3000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(300);
        driver.findElement(By.className("a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart-button")).click();
        
        Thread.sleep(3000);
        driver.findElement(By.id("nav-cart-count")).click();
        Thread.sleep(4000);
        
        driver.close();
        
        
        
        
        
        
	}

}
