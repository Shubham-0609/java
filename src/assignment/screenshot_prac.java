package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot_prac 
{
	public static void main(String[] args) throws InterruptedException, IOException

	{
		System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	File src =	((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	File dest =new File("C:\\Users\\Admin\\Desktop\\New folder\\screenshot1.jpg");
	
	FileHandler.copy(src, dest);
		
		
		
	}
	
}
