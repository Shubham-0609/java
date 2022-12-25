package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\s\\ch\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

}
