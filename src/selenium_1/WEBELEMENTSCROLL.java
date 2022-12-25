package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEBELEMENTSCROLL
{
public static void main(String[] args ) throws InterruptedException

{
	System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.w3schools.com/js/js_popup.asp");
WebElement aq= driver.findElement(By.xpath("//a[text()='Try it Yourself »'][1]"));

JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("arguments[0].scrollIntoView(true);",aq);


Thread.sleep(3000);







}
}