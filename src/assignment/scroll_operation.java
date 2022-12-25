package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_operation
{
public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.w3schools.com/js/js_popup.asp");

Thread.sleep(3000);

JavascriptExecutor js = (JavascriptExecutor)driver;

WebElement target= driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
js.executeScript("arguments[0].scrollInt9"
		+ "oView(true);", target);
	/*	js.executeScript("window.scrollBy(0,2000)");//scroll down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");//scroll up
		
		js.executeScript("window.scrollBy(2000,0)");//scroll right
		js.executeScript("window.scrollBy(-1000,0)");//scroll left
		js.executeScript("window.scrollBy(2000,2000)");//scroll right and scroll down
		*/
		
		
		
		
		
		
		
		
		
}

}