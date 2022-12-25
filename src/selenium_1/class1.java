package selenium_1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 
{
public static void main(String[] args) throws Exception 
{
	System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	
	
	
	String url =driver.getCurrentUrl(); 
	System.out.println(url);//to print url on console
	
	String title =driver.getTitle();
	System.out.println(title);// to get current url title

	driver.navigate().to("https://www.youtube.com/watch?v=J1rOfVst-EQ");
	driver.navigate().refresh();
	driver.navigate().forward();
	driver.navigate().back();
	
	Dimension d= new Dimension(100,100);
	
	
	/*
	Options o=driver.manage();
	Window w= o.window();
	w.setSize(d);*/
	
	driver.manage().window().setSize(d);
	
	
	
	
	
	
	
	
	
	
	
	
	/*Navigation n=driver.navigate();
	n.to("https://www.youtube.com/watch?v=J1rOfVst-EQ");
	Thread.sleep(3000);
	n.refresh();
	Thread.sleep(3000);
	n.to("https://www.youtube.com/watch?v=r6tU3GvJ5so");
	n.back();
	Thread.sleep(3000);
	n.forward();
	*/
	//driver.close();
	//driver.quit();

}
}
