package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/python/python_lambda.asp");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		 driver.manage().window().minimize();
		 Thread.sleep(5000);
		 
		 Dimension dim =new Dimension(400,580);
		 
		 driver.manage().window().setSize(dim);
		 Thread.sleep(5200);
		 Point pon =new Point(1,8);
		 
		 driver.manage().window().setPosition(pon);
	}

}
