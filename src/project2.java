import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class project2 
{
public static void main(String[] args) throws InterruptedException
{
    System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/r.php");
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("shubh");
	driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("baru");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shubham@0609");
	WebElement listbox1 =driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s= new Select(listbox1);
s.selectByIndex(21);
//driver.findElement(By.xpath("//input[@name='birthday_month']"));
WebElement listbox2 =driver.findElement(By.xpath("//select[@name='birthday_month']"));
Select s1= new Select(listbox2);
s1.selectByVisibleText("Jun");

Thread.sleep(3000);
WebElement x1=driver.findElement(By.xpath("//select[@id='year']"));
Select s3 =new Select(x1);
s3.selectByIndex(29);
driver.findElement(By.xpath("//label[text()='Male']")).click();
driver.findElement(By.xpath("//button[@type='submit']")).click();


Thread.sleep(3000);
driver.quit();


}
	
	
	
}
