package selenium_1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollpract 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
	//js.executeScript("window.scroll.By(0,800)");
		
	js.executeScript("window.scrollBy(0,2000)");//scroll down
	Thread.sleep(2000);              
	//js.executeScript("window.scrollBy(0,-2000)");//scrollup
	//js.executeScript("window.scrollBy(550,0)");//scroll right
	//js.executeScript("window.scrollBy(-550,0)");//scroll left
	js.executeScript("window.scrollBy(0,2000)");
	
}
}