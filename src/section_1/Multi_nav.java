package section_1;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_nav {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium folder\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.baeldung.com/java-interrupted-exception");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Navigation nav= driver.navigate();
		
		Thread.sleep(3000);
		driver.navigate().to("https://app.fireflink.com/signin");
		Thread.sleep(3000);
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		nav.refresh();
		Thread.sleep(3000);
		driver.close();

	}

}
