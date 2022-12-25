package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/signup");
	
	Thread.sleep(3000);

	
	//driver.findElement(By.partialLinkText("Forgotten account?"));
	
	//WebElement for1 = driver.findElement(By.partialLinkText("Forgotten"));
	
//	for1.click();
	
	//for1.sendKeys("sbahirmal");
	//driver.findElement(By.id("email"));
	//WebElement email = driver.findElement(By.id("email"));
	//email.sendKeys("9011179667");
	
	
	/*driver.findElement(By.tagName("button"));
	WebElement xyz = driver.findElement(By.tagName("button"));
	xyz.click();*/
	
	driver.findElement(By.xpath("//input[@type='text']"));
	
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	
	
	
	
	driver.findElement(By.xpath("//input[@type='text']"));
	driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
	driver.findElement(By.xpath(//))
	
	
	
	
	
	
	
	
	
	
	
	
}
}
