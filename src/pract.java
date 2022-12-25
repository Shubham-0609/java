import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract 
{
public static void main(String[] args)
{
	  System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://iborate.com/usd-libor/");
		WebElement ele = driver.findElement(By.xpath("//table[@ID='table_1']/tbody/tr[3]/td[5]"));
		System.out.println(ele.getText());
		
		
		
		
		
}
}
