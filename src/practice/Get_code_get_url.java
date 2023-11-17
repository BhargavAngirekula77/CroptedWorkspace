package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_code_get_url {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(20000);
		System.out.println("this is the title of the appplication");
		System.out.println(driver.getTitle());
		System.out.println("this is the url of application");
		System.out.println(driver.getCurrentUrl());
		System.out.println("this is frount_end code of the application");
		System.out.println(driver.getPageSource());
		Thread.sleep(3000);
		driver.close();

	}

}
