package section_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_chrome_broswer {

	public static void main(String[] args) {
		//1. start web driver we need to provide the key and value for it 
		System.setProperty("webdriver.chrome.driver","C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe" );
		//2.we need to create the object for the chrome
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.samsung.com/");

	}

}
