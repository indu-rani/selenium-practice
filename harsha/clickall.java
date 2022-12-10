package harsha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clickall {
	 String address="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  WebDriver driver;
	 @BeforeTest
	 public void beforetest() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get(address);
			driver.manage().window().maximize();
			String beforelogin=driver.getCurrentUrl();
			System.out.println(beforelogin);
			Thread.sleep(3000);
	 }
	 @Test(priority=0)
		public void Testcase1() throws InterruptedException {
			
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);		
					
		}
	 @Test(priority=1)
	  public void Testcase2() throws InterruptedException
    {
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
	   Thread.sleep(5000);
	    /*List<WebElement> li=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
		System.out.println("Total size of the webelements:"+li.size());
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(6).click();
		System.out.println("User Name:"+driver.findElement(By.xpath("//*[@class='oxd-table-card'][6]//div[2]/div")).getText());
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(6).click();
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();*/
		List<WebElement>ch= driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
		System.out.println("Total no of checkboxes:"+ch.size());
		for(int i=0;i<ch.size();i++)
			
		if(ch.get(i)!=null) {
   	WebElement ha=driver.findElement(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
		ha.click();
			}
}
	 @Test(priority=2)
	  public void Testcase3() throws InterruptedException
   {
		 driver.findElement(By.linkText("Leave")).click(); 
		 Actions action = new Actions(driver);
	    action.doubleClick( driver.findElement(By.xpath("//*[@class='oxd-icon bi-calendar oxd-date-input-icon']"))).perform();
	    // action.moveToElement(driver.findElement(By.xpath("//*[@class='oxd-date-input']/input"))).click();
	     Thread.sleep(2000);
  
		action.moveToElement( driver.findElement(By.linkText("Performance")));
		// action.contextClick().perform();
		 //action.contextClick( driver.findElement(By.linkText("Performance"))).perform();
   }
	 @AfterTest
		public void AT() throws InterruptedException {
			Thread.sleep(3000);
			//driver.close();
		}

}
