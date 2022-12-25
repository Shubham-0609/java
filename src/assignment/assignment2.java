package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
	
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.google.com");
	
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	Thread.sleep(3000);
	
	Dimension d= new Dimension(200,400);
	driver.manage().window().setSize(d);
	
	Thread.sleep(2000);
	Point p= new Point(100,500);
	driver.manage().window().setPosition(p);
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	Thread.sleep(2000);
	
	driver.quit();
	
	
	
	
}
}
