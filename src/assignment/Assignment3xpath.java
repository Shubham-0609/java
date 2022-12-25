package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3xpath 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
	//tagname[@attribute name='attribute value']
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shubham"); //xpath attribute
		

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bahirmal");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567891");
	
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shubham1234");
		//
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("22");
		
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jun");
		
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1994");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click(); //xpath by text function
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		//xpath by index 
		//xpath by contains
		//absolute xpath
		//relative xpath 
		
		
	}	
	
}
