package harsha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class employeedetails {
	String address="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  WebDriver driver;
	 @BeforeTest
	 public void beforetest() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(address);
			driver.manage().window().maximize();
			String beforelogin=driver.getCurrentUrl();
			System.out.println(beforelogin);
			//Thread.sleep(3000);
	 }
	 @Test(priority=0)
		public void Testcase1() throws InterruptedException {
			
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	 }
			@Test(priority=1)
			  public void Testcase2() throws InterruptedException
		     {
			Actions act=new Actions(driver);
			
			act.moveToElement(driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a"))).click().build().perform();
	
	        act.moveToElement(driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[1]"))).click().build().perform();
	
	       act.moveToElement(driver.findElement(By.linkText("Users"))).click().build().perform();
	
	        driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[1]/div/div[2]/input")).sendKeys("Russel.Hamilton");
	
	      WebElement ELE=driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']"));
		      act.click(ELE).build().perform();
	
	     act.sendKeys(ELE,Keys.ARROW_DOWN).click().build().perform();
			act.sendKeys(ELE,Keys.ARROW_DOWN).click().build().perform();
	
	     WebElement ele=driver.findElement(By.xpath("//*[@class='oxd-autocomplete-wrapper']/div/input"));
		   act.sendKeys(ele,"Russel Hamilton").click().build().perform();

	    WebElement ELE1=driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[4]/div/div[2]"));
		act.click(ELE1).build().perform();
	

	   act.sendKeys(ELE1,Keys.ARROW_DOWN).doubleClick().build().perform();
	
	   WebElement s=driver.findElement(By.xpath("//*[@type='submit']"));
	
	act.moveToElement(s).click().build().perform();

}
}