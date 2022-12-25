package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_class_dragdrop 
{
	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
			
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/drag_drop.html");

	
	Actions act =new Actions(driver);
	
	WebElement src=driver.findElement(By.xpath("//li[@data-id='2']"));
	WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	
	Thread.sleep(2000);
	//act.dragAndDrop(src, target).perform();
	//Thread.sleep(3000);
	//act.moveToElement(src).clickAndHold().build().perform();
	act.clickAndHold(src).perform(); 
	act.release(target).perform();
	//act.clickAndHold(src).release(target).build().perform();
	
	
	
	
	}
}
