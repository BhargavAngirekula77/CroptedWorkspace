package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fron_new_win {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver= new  ChromeDriver();
		driver.get("https://www.google.com/search?q=instagram&rlz=1C1RXQR_enIN1059IN1059&oq=inst&aqs=chrome.0.35i39i650j69i57j0i131i433i512l7j0i512.663179j0j15&sourceid=chrome&ie=UTF-8");

	}

}
