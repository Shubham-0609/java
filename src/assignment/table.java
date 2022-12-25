package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\s\\\\ch\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> row =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		for(int i=1;i<=row.size();i++)
		{
			List<WebElement> cell;
			if(i==1)
			{
				cell=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/th"));
			}
			else
			{
				cell=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
			}
			for(int j=1;j<=cell.size();j++)
			{
				if(i==1)
				{
					
					WebElement c= driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/th["+j+"]"));
					System.out.print(c.getText() + "|");
				}
				else
				{
					WebElement c=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]"));
					System.out.print(c.getText() + "|");
				}
				
				
			}
			System.out.println();
				
			}
			
			
			
			
			
			
		}
		
		
		
		
}
