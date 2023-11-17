package classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Fripkart_first_text {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium folder\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		ele.sendKeys("samsung galaxy s23 ultra");
		ele.submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		WebElement ele2=driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Phantom Black, 512 GB)']"));
		String rel=ele2.getText();
		System.out.println(rel);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='_2xm1JU']")).click();
		Thread.sleep(4000);
		driver.close();
		
		
		

	}

}
