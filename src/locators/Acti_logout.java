package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_logout {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("logout")).click();
		Thread.sleep(4000);
	    driver.close();

	}

}
