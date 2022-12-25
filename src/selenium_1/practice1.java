package selenium_1;

import java.lang.StackWalker.Option;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\s\\ch\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.youtube.com/");
	
	Navigation n= driver.navigate();
	
	n.to("https://www.youtube.com/watch?v=7-q01mPunjc");
n.to("https://web.whatsapp.com/");
	Thread.sleep(2000);
	n.back();
	Thread.sleep(2000);
	n.forward();

	driver.get("https://www.facebook.com/");
String s=driver.getCurrentUrl();
System.out.println(s);

String s1= driver.getTitle();
System.out.println(s1);

Thread.sleep(2000);
//driver.manage().window().maximize();
Options o=driver.manage();
Window w=o.window();
w.maximize();
//driver.manage().window().setSize(d);
Dimension d= new Dimension(200,100);
w.setSize(d);

Point p= new Point(600,300);

w.setPosition(p);

	
	
}
}
