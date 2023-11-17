package classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Sort_byalpha_assending {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium folder\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement ele=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		ele.sendKeys("mobiles 5g");
		ele.submit();
		Thread.sleep(4000);
		
		List<WebElement> names =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		String arr[]=new String[names.size()];
		int i=0;
		for (WebElement elo : names) {
			String name=elo.getText();
			arr[i]=name;
			System.out.println(arr[i]);
			i++;
			
		}
		    Arrays.sort(arr);
		    System.out.println("////////////////////////////////////////////////////////////////////////////////");
		    System.out.println();
		    System.out.println("this is the sorted array");
		    for (String obj : arr) {
		    	System.out.println(obj);
			}
			
		}
		
		   
//		    driver.manage().window().setSize(new Dimension(871,935));
//		    driver.manage().window().setPosition(new Point(-7,0));

	}


