package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_firefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium folder\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://github.com/mozilla/geckodriver/releases");
		Thread.sleep(5);
		driver.manage().window().maximize();
		Thread.sleep(6);
		driver.manage().window().minimize();
		
		Thread.sleep(3);
		
		Dimension dem = new Dimension(100,560); 
		driver.manage().window().setSize(dem);
		
		Thread.sleep(4509);
		Point pon = new Point(200,570);
		driver.manage().window().setPosition(pon);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();

	}

}