package section_1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;


public class Max_Min {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pexels.com/search/samsung%20wallpaper/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		
		driver.manage().window().setSize(new Dimension(400,576));
		Thread.sleep(4000);
		Dimension dem= new Dimension(900,300);
		driver.manage().window().setSize(dem);
		Thread.sleep(4000);
		Point pon=new Point(560,850);
		driver.manage().window().setPosition(pon);
		Thread.sleep(5000);
		driver.manage().window().setPosition(new Point(1,852));
	}
	

}
