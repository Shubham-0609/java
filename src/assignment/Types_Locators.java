package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Types_Locators
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email"));
		
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys("sbahirmal");
		
		//driver.findElement(By.linkText("Forgotten account?"));
		//WebElement forget1 = driver.findElement(By.linkText("Forgotten account?"));
		//forget1.click();
		
	  		
       driver.findElement(By.partialLinkText("Forgotten"));
		
		WebElement forgotpwd1 =driver.findElement(By.partialLinkText("Forgotten"));
		
		forgotpwd1.click();
		
			
		//NAME
		//CLASS NAME 
		//XPATH
		//CSS SELECTOR
		
	//	driver.findElement(By.tagName("button"));
		//WebElement button =driver.findElement(By.tagName("button"));
		//button.click();
				
		
		
	}
	
	
	

}
