package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_code {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.actitime.com/login-to-product");
		Thread.sleep(3000);
		driver.navigate().to("https://www.baeldung.com/java-interrupted-exception");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		

	}

}
