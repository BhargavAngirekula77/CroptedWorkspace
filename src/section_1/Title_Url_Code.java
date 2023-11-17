package section_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Url_Code {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.baeldung.com/java-interrupted-exception");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String title= driver.getTitle();
		System.out.println(title);
		String url= driver.getCurrentUrl();
		System.out.println(url);
		String code=driver.getPageSource();
		System.out.println(code);
		Thread.sleep(3000);
		driver.close();

	}

}
