package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class From_bros_innsta {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium folder\\msedgedriver.exe");
		EdgeDriver vox=new EdgeDriver();
		vox.get("edge://newtab/");
		vox.findElement(By.className("class='control'")).sendKeys("instagram");
		//vox.findElement(By.xpath("")).sendKeys("instagram");

	}

}
