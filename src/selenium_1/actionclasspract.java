package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionclasspract
{
	public static void main(String[] args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	Actions act= new Actions(driver);
	WebElement login =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	act.moveToElement(login).perform();
	WebElement signin=driver.findElement(By.xpath("//a[text()='Your Account']"));
	act.click(signin).perform();
	Thread.sleep(3000);
	driver.quit();
	
	
}
}