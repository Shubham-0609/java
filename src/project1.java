import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project1 
{
	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","D:\\s\\ch\\chromedriver.exe"); 
			
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_ya_signin%26adgrpid%3D58972567855%26hvpone%3D%26hvptwo%3D%26hvadid%3D294134771434%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D242627543552856047%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007788%26hvtargid%3Dkwd-513872812020%26hydadcr%3D5839_1738693%26gclid%3DCj0KCQjwheyUBhD-ARIsAHJNM-PF68j-5nbKIQyx24-naEA6GvBAg3PMD6CSTEQm-e9VuYF4UrqXLE8aAhzXEALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

	driver.findElement(By.xpath("//input[@type ='email']")).sendKeys("9011179667");
driver.findElement(By.xpath("//input[@id='continue']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shubham@2020");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
driver.findElement(By.xpath("//img[@alt ='Apple iPhone 13 (128GB) - Midnight']")).click();
driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();




	}
}