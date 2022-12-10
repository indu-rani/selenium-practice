package harsha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class orang {
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
			//Thread.sleep(2000);		
					
		}
	/*@Test(priority=1)
		  public void Testcase2() throws InterruptedException
	     {
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		 Thread.sleep(2000);
	     }*/
		 @Test
			public void Testcase3() throws InterruptedException
		   {
		   driver.findElement(By.linkText("Admin")).click();
		  // Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent --visited']")).click();
		   //Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[1]")).click();
		  // Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']")).sendKeys("Charlie.Carter");
		  
		   driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']")).sendKeys("Charlie.Carter");
		  // driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")).sendKeys("Anthony.Nolan");
		   Actions action = new Actions(driver);
		   WebElement element =driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']"));
		 //  WebElement un=driver.findElement(By.xpath("//*[@class='oxd-select-text oxd-select-text--active']"));
		  
			
			action.click(element).perform();
			action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
			action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
			action.click(element).perform();
			driver.findElement(By.xpath("//*[@placeholder='Type for hints...']")).sendKeys("Charlie.Carter");
			WebElement ELE1=driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[4]/div/div[2]"));
			action.click(ELE1).build().perform();
		
		action.sendKeys(ELE1,Keys.ARROW_DOWN).doubleClick().build().perform();
		WebElement search=driver.findElement(By.xpath("//*[@type='submit']"));
		 action.moveToElement(search).doubleClick().build().perform();
				search.click();
		
			//WebElement search=driver.findElement(By.xpath("//*[@type='submit']"));
			//search.click();
			//Thread.sleep(1000);
			//  driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']")).sendKeys("Anthony.Nolan");
			  
			 // WebElement un=driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[4]/div/div[2]/div"));
			 // action.click(un).build().perform();
			  //action.sendKeys(un,Keys.ARROW_DOWN).click().build().perform();
			 // action.click(un).build().perform();
			/*WebElement ELE1=driver.findElement(By.xpath("//*[@class=''oxd-icon bi-caret-down-fill oxd-select-text--arrow"));
			action.click(ELE1).build().perform();
			action.sendKeys(ELE1,Keys.ARROW_DOWN).doubleClick().build().perform();*/
			 // element1 = driver.switch_to.active_element;
			 //0 action.sendKeys(un,Keys.ESCAPE).click();
			  //driver.switchTo().frame("Enabled");
				//Thread.sleep(1000);
				

}
		 @AfterTest
			public void AT() throws InterruptedException {
				Thread.sleep(3000);
				//driver.close();
}
}
