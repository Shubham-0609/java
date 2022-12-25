
package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sele1 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	
	//driver.manage().window().maximize();
	
	//Thread.sleep(3000);
	
	//driver.findElement(By.id("email"));
	
	//WebElement email = driver.findElement(By.id("email"));
	
	//email.sendKeys("sbahirmal@gmail.com");
	
	driver.findElement(By.linkText("Forgotten account?")).click();
	
	//WebElement forgot1=driver.findElement(By.linkText("Forgotten account?"));
	//forgot1.click();
	
	
	
	
	
	
	
	
	
	
}
}
