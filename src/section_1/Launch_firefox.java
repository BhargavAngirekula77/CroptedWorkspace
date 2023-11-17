package section_1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.samsung.com/in/");

	}

}
