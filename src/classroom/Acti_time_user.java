package classroom;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_time_user {

	public static void main(String[] args) throws Exception {
		String name="bhargav";
		String last="angirekula";
		String mail="qwerty";
		String mailend="@gmail.com";
		Random ram= new Random();
		int num=ram.nextInt(2000);
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
    driver.findElement(By.xpath("//a[@id='loginButton']")).click();
    driver.findElement(By.xpath("//div[@id='container_users']")).click();
    driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();
    Thread.sleep(4000);
    
    driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys(name+num);
    driver.findElement(By.xpath("(//input[@name='lastName'])[2]")).sendKeys(last+num);
    driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(mail+num+mailend);
    driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
   // Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class=\"createUserPanel_accountCreatedContainer\"]/div[5]/span")).click();
    driver.findElement(By.xpath("//a[text()='Logout']")).click();
	
	
	}

}
