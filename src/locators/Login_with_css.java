package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_with_css {

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
		driver.manage().window().setSize(new Dimension(200,300));
		Thread.sleep(5000);
		
		driver.manage().window().setPosition(new Point(560,200));
	    driver.close();

	}

}
