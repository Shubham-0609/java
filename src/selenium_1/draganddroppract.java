package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddroppract 
{
	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
			
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	
	Actions act =new Actions(driver);
	
	WebElement src=driver.findElement(By.xpath("//li[@data-id='2']"));	
	WebElement dest=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	//act.dragAndDrop(src, dest).perform();
	act.clickAndHold(src).release(dest).build().perform();
}
}
