package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon implements Login_details_amazon{

	public static void main(String[] args) throws Exception {
		
    System.setProperty("webdriver.edge.driver", "C:\\Selenium folder\\msedgedriver.exe");
    WebDriver driver= new EdgeDriver();
    
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
   ;
    
    driver.get("https://www.amazon.in/ref=nav_logo");
    driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
    WebElement ele=driver.findElement(By.xpath("//input[@type='email']"));
    ele.sendKeys(email);
    ele.submit();
    WebElement ele1=driver.findElement(By.xpath("//input[@type='password']"));
    ele1.sendKeys(password);
    ele1.submit();
    String product="cargo";
    
    
    Thread.sleep(3000);
    
    
    driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys(product);
    List<WebElement> ele2= driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div/div[@role='button']"));
    int in=1;
    System.out.println("this are the suggestions we get for this "+product+" product");
    
    
    
    Thread.sleep(3000);
    
    
    for (WebElement sug : ele2) {
    	
    	String sugg=sug.getText();
    	System.out.println("Suggestion "+in+"==>"+sugg);
    	in++;
		
	}
    driver.findElement(By.xpath("//div[@class='left-pane-results-container']/div[7]")).click();
    driver.findElement(By.xpath("//span[@aria-label='Sort by:']")).click();
   // driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
    List<WebElement> ele3=driver.findElements(By.xpath("//h2[@class='a-size-mini s-line-clamp-1']/span"));
    List<WebElement> ele4=driver.findElements(By.xpath("//h2[@class='a-size-mini s-line-clamp-1']/span/../../following-sibling::h2/a/span"));
    List<WebElement> ele5=driver.findElements(By.xpath("//div[@class='a-row a-size-base a-color-base']/a/span/span/span[2]"));
    
    ArrayList<Integer> prices=new ArrayList<Integer>();
    
    System.out.println();
    System.out.println("product details");
    int total_cost=0;
    for(int i=0;i<ele3.size();i++) {
    	String brand= ele3.get(i).getText();
    	String speci= ele4.get(i).getText();
    	String price= ele5.get(i).getText();
    	System.out.println(i+")"+brand+"====>"+speci+"====>"+price);
    	
    	int num=0;
    
    	for(int j=0;j<price.length();j++) {
    		char ch=price.charAt(j);
    		if(ch>='0'&&ch<='9') {
    		num=(num*10)+(ch-48);
    		}
    		
    	}
    	total_cost=total_cost+num;
    	prices.add(num);
    	Collections.sort(prices);
    	
    }
    System.out.println(prices);
    System.out.println("this total cost of entire product: "+total_cost);
    System.out.println();
    System.out.println("the average price of the products present in the page");
	
	int avg=total_cost/(prices.size());
	System.out.println(avg+" : is the avg price of the product in the webpage");
	
	
	Thread.sleep(4000);
	
	System.out.println("this is the position of the window");
    Window win= driver.manage().window();
    Point poin= win.getPosition();
    int ax1=poin.getX();
    int ax2=poin.getY();
    System.out.println(ax1+","+ax2);
    
    System.out.println("this is the dimension of the window");
   Dimension size= win.getSize();
   int lon= size.getHeight();
   int wid= size.getWidth();
   System.out.println(lon+","+wid);
    
    
    WebElement ele8=driver.findElement(By.xpath("(//div[@style='display: inline-block'])[3]"));
    ele8.click();
    
    
    
     
    
   
    
    driver.findElement(By.xpath("//input[@data-hover='Select <b>__dims__</b> from the left<br> to add to Shopping Cart']")).click();
    
    driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
    
   // driver.close();
    
    

	}

}
