package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	
	Dimension d= new Dimension(100,100);
	driver.manage().window().setSize(d);
	
	driver.manage().window().maximize();
	
	driver.quit();
	
	
	
	
	
	
	
	
}
}
