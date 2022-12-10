package harsha;

import java.util.List;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test12 {
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
		  Thread.sleep(2000);
	     }
		 @Test
			public void Testcase3() throws InterruptedException
		{
		//driver.findElement(By.linkText("Admin")).click();
		//Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent --visited']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']")).sendKeys("Anthony.Nolan");
		 //driver.findElement(By.xpath("//*[@class='oxd-select-text--after']"));
		/* WebElement dropdown=driver.findElement(By.xpath("//*[@class='oxd-select-text--after']"));
			Select SelectObject= new Select(dropdown);
			SelectObject.selectByValue("ESS");
			SelectObject.selectByIndex(1);
		 Thread.sleep(2000);*/
		 Actions action = new Actions(driver);
			WebElement element =driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']"));
			
			action.click(element).perform();
			action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
			action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
			Thread.sleep(6000);
			WebElement search=driver.findElement(By.xpath("//*[@type='submit']"));
			search.click();
			Thread.sleep(7000);
			
			
			//action.moveToElement(search).build().perform();
			
			//driver.findElement(By.xpath("//*[type='submit']")).click();
			Thread.sleep(2000);
	

	}
	@Test(priority=2)
	public void Testcase4() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[3]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]")).click();
		 Thread.sleep(2000);
	}
	@Test(priority=3)
	public void Testcase5() throws InterruptedException
	{
		 driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		 
		 Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void Testcase6() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Education")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		List<WebElement>ch= driver.findElements(By.xpath("//*[@class='oxd-table-body']"));
		System.out.println("Total no of checkboxes:"+ch.size());
		for(int i=0;i<=ch.size();i++)
			ch.get(i).click();
		Thread.sleep(10000);
	}
	@Test(priority=5)
	public void Testcase7() throws InterruptedException
	{
		 Actions action = new Actions(driver);
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[6]/a")).click();
		Thread.sleep(2000);
		WebElement Female=driver.findElement(By.xpath("//*[@class='oxd-radio-wrapper']/label/input[@value=2]"));
		//Female.click();
		action.click(Female).build().perform();
		//action.sendKeys(Female,Keys.)
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@Test(priority=6)
	public void Testcase8() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body']/nav/ul/li[4]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Languages")).click();
	}
	@Test(priority=7)
	public void Testcase9() throws InterruptedException
	{
		driver.findElement(By.linkText("Nationalities")).click();
		 Thread.sleep(2000);
	}
	@Test(priority=8)
	public void Testcase10() throws InterruptedException
	{
		driver.findElement(By.linkText("PIM")).click();
		 //driver.findElement(By.xpath("//*[@class='oxd-topba")).click();
		 driver.findElement(By.linkText("Add Employee")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Employee List")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Reports")).click();
		 Thread.sleep(2000);
	}
	@Test(priority=9)
	public void Testcase11() throws InterruptedException
	{
		driver.findElement(By.linkText("Maintenance")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");

		 driver.findElement(By.xpath("//*[@type='submit']")).click();
		  Thread.sleep(2000);
	}
	@Test(priority=10)
	public void Testcase12() throws InterruptedException
	{
		String beforelogin=driver.getTitle();
        System.out.println(beforelogin);
		String afterlogin=driver.getTitle();
		 System.out.println(afterlogin);
		 if(beforelogin.equals(afterlogin)){
		 	driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		 	Thread.sleep(5000);
		 	driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		 	
		 	
		 	 System.out.println("the title is same");
		 }else{
		 	 System.out.println("the title is not same");
		 }
	}
	
	@AfterTest
	public void AT() throws InterruptedException {
		Thread.sleep(3000);
		//driver.close();
	}
	}



