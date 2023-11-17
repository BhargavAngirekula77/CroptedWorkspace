package classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_checkbox {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/login.do");
    //Thread.sleep(4000);
    WebElement ele= driver.findElement(By.xpath("//div[@title='Do not select if this computer is shared']"));
    String text= ele.getAttribute("title");
    boolean dis= ele.isDisplayed();
    boolean ena= ele.isEnabled();
    boolean sele= ele.isSelected();
    System.out.println("this is the h-over message: "+text);
    System.out.println("is this displaying or not: "+dis);
    System.out.println("is this enabled or not: "+ena);
    System.out.println("is this selected: "+sele);
    System.out.println(ele.getSize());
    System.out.println(ele.getLocation());
    
    
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    Thread.sleep(4000);
    WebElement ele1= driver.findElement(By.xpath("//input[@type='checkbox']"));
    
    
    System.out.println("this is the h-over message: "+ele1.getAttribute("title"));
    System.out.println("is this displaying or not: "+ ele1.isDisplayed());
    System.out.println("is this enabled or not: "+ele1.isEnabled());
    System.out.println("is this selected: "+ele1.isSelected());
    System.out.println(ele1.getSize());
    System.out.println(ele1.getLocation());
    
    
    
		
	}

}
