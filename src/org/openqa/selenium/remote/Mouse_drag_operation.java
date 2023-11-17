package org.openqa.selenium.remote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_drag_operation {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement ele=driver.findElement(By.xpath("//input[@class='_3704LK']"));
	ele.sendKeys("samsung s10");
	ele.submit();
	Thread.sleep(3000);
	WebElement price_reg1= driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
	WebElement price_reg2= driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
	Actions act= new Actions(driver);
	act.dragAndDropBy(price_reg1,30,0);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='SAMSUNG']")).click();
	act.dragAndDropBy(price_reg2,0,-30);
	//driver.close();
	

	}

}
