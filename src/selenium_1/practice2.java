package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	
	//driver.findElement(By.id("email"));                                   //by id 
	//driver.findElement(By.tagName("button")).click();                     //by tagname
	//driver.findElement(By.name("email")).sendKeys("123456");              //by name
	//driver.findElement(By.className("_6ltg")).click();                    //by class name
	//driver.findElement(By.linkText("Forgotten password?")).click();       //by linktext
	//driver.findElement(By.partialLinkText("Forgotten")).click();          //by partiallinktext
	
	//driver.findElement(By.xpath("//input[@type='text']"));                  //by xpath by attribute
	//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click(); //by xpath by text
	//driver.findElement(By.xpath("//input[@type='text'][1]"));
	driver.findElement(By.xpath("//input[contains(@type,'text')]"));
}
}
