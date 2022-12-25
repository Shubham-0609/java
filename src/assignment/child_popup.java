
package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_popup 
{
public static void main(String[] args) throws InterruptedException
{
	  System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/js/");
			driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
			Thread.sleep(2000);
			
			
		String mainwindow=	driver.getWindowHandle();
		
		Set<String> allw = driver.getWindowHandles();
		for(String s:allw)
		{
			driver.switchTo().window(s);
			System.out.println(driver.getCurrentUrl());
			
		}
		
		
		
		
		
			
		/*Set<String> allw = driver.getWindowHandles();
		String expUrl = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst";
		for(String s:allw)
		{
			driver.switchTo().window(s);
			String Atualurl = driver.getCurrentUrl();
			if(expUrl.equals(Atualurl))
			{
				break;
			}
			}
		*/
			
			
}
}
