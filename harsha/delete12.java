package harsha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class delete12 {
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
		/*Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
			Thread.sleep(5000);
			/*driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(3).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(3).click();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(3).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();*/
			// List<WebElement>ch= driver.findElements(By.xpath("//form//input[@type='checkbox']"));
			List<WebElement>ch= driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
				System.out.println("Total no of checkboxes:"+ch.size());
				for(int i=0;i<ch.size();i++)
					
					if(ch.get(i)!=null) {
						WebElement lee=driver.findElement(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
							lee.click();
						//System.out.println(ls);
					//System.out.println(li.get(i));
							driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(6).click();
							//System.out.println("User Name:"+driver.findElements(By.xpath("//*[@class='oxd-table-card'][6]//div[2]/div"));
		}
			    //ch.get(i).click();
				Thread.sleep(2000);
				//}*/
	     }
	/* @Test
		public void Testcase3() throws InterruptedException
	{
	
	// driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent --visited']")).click();
	 Thread.sleep(2000);

	 
	 
	/* List<WebElement>ch= driver.findElements(By.xpath("//*[@class='oxd-table-body']"));
		System.out.println("Total no of checkboxes:"+ch.size());
		for(int i=0;i<=ch.size();i++)
			ch.get(i).click();
		Thread.sleep(10000);*/
	
	 @AfterTest
		public void AT() throws InterruptedException {
			Thread.sleep(3000);
			//driver.close();
		}

}
