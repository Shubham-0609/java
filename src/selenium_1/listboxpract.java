package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxpract 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/r.php");
	
	WebElement listbox=driver.findElement(By.xpath("//select[@aria-label='Day']"));
	Select s=new Select(listbox);
	s.selectByIndex(0);
	s.selectByValue("22");
	s.selectByVisibleText("12");
	
	
	
	
	
	
	
	
}
}
