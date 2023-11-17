package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class Trial_edge {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium folder\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://wallup.net/naruto-uzumaki-2/");
		Thread.sleep(60);
		driver.manage().window().maximize();
		Thread.sleep(7);
		driver.manage().window().minimize();
		Thread.sleep(10);
		driver.manage().window().setSize(new Dimension(50,61));
		
		Thread.sleep(9);
		driver.manage().window().setPosition(new Point(20,568));

	}

}
