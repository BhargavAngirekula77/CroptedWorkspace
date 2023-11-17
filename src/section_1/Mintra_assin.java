package section_1;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mintra_assin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=Bing_Brand_BMM_Desktop&utm_source=bing&msclkid=57a1238a5a1e1beecd6447627c2eeef2&utm_term=myntra%27&utm_content=Myntra_Generic");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		 driver.manage().window().setSize(new Dimension(500,250));
		 
		 Thread.sleep(3000);
		 driver.manage().window().setPosition(new Point(580,670));
		 Thread.sleep(3000);
			driver.manage().window().minimize();
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
		

	}

}
