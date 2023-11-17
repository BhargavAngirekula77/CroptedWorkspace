package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_things {

	public static void main(String[] args) throws InterruptedException {
		try{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/angir/OneDrive/Documents/HTML/LOGINPAGE.html");
		Thread.sleep(90);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();}
	catch(Exception obj) {
	System.out.println(obj.getMessage());
	}
		
		

	}

}
