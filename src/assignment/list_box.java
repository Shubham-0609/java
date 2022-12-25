package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list_box 
{
public static void main(String[] args) throws InterruptedException
{
	
	
    System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	
	
	//how to handle list box
	
	WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s= new Select(month);
	
	/*
	s.selectByIndex(2);
	Thread.sleep(3000);
	
	s.selectByValue("6");
	Thread.sleep(3000);
	
	s.selectByVisibleText("Oct");
	
	s.deselectByIndex(0);
	s.deselectByValue(null);
	s.deselectByVisibleText(null);
	s.deselectAll();
	*/
		List<WebElement> option= s.getOptions();
				int size = option.size();
				for(int i=0; i<=size-1;i++)
				{
					WebElement data=option.get(i);
					String text=data.getText();
					System.out.println(text);
				//	String str = option.get(i).getText();
				//	System.out.println(option.get(i).getText());
					
					
					
					
				}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
