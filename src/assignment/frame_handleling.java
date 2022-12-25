package assignment;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_handleling 
{
	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
			
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.w3schools.com/js/js_popup.asp");
				driver.findElement(By.xpath("//a[@href= 'tryit.asp?filename=tryjs_alert']")).click();
				
				Set<String> id = driver.getWindowHandles();
				System.out.println(id);
				ArrayList<String> id1 =new ArrayList(id);
				
				driver.switchTo().window(id1.get(1));
				//Thread.sleep(2000);
			
			WebElement framepath  =	driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
				driver.switchTo().frame(framepath);
				driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
				Alert alt1=driver.switchTo().alert();
				Thread.sleep(2000);
				alt1.accept();
				driver.quit();
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
	
	
}
