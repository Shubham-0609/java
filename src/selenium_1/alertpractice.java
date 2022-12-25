package selenium_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpractice 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/delete_customer.php");

Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='submit']")).click();

Alert alt= driver.switchTo().alert();

alt.accept();

Alert alt1= driver.switchTo().alert();
alt1.accept();
alt1.sendKeys("shubham");


}
}