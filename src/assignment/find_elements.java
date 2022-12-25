package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_elements 
{
public static void main(String[] args)
{
		System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		driver.findElement(By.tagName("button"));
		WebElement button =driver.findElement(By.tagName("button"));
		button.click();
		
		
		

		
		
		//WebElement button =driver.findElement(By.tagName("button"));
		//button.click();
	
	
	
	
	
	
	
	
	
	
}










}
