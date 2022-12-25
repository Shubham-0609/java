import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class makemytrip
{
	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
			
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");

	
WebElement ele =driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10'][1]"));
ele.click();
Date date = new Date(22); 
Calendar c = Calendar.getInstance(); 
c.setTime(date); 
// Add one day to the today's date 
c.add(Calendar.DATE, 1); 
 
String strMonth = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH); 

String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(c.getTime()); 

}
}
