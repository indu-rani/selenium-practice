package harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args)throws InterruptedException{
		String baseurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chrome driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(baseurl);
		 String beforelogin=driver.getTitle();
         System.out.println(beforelogin);
         Thread.sleep(5000);
         driver.findElement(By.name("username")).sendKeys("Admin");
         driver.findElement(By.name("password")).sendKeys("admin123");
         driver.findElement(By.xpath("//*[@type='submit']")).click();
         Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent --visited']")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent']")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[1]")).click();
 //driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
 
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[3]")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[4]")).click();
 Thread.sleep(2000);
 driver.findElement(By.linkText("Languages")).click();
 driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[5]")).click();
 Thread.sleep(2000);
 driver.findElement(By.linkText("PIM")).click();
 //driver.findElement(By.xpath("//*[@class='oxd-topba")).click();
 driver.findElement(By.linkText("Add Employee")).click();
 Thread.sleep(2000);
 driver.findElement(By.linkText("Employee List")).click();
 Thread.sleep(2000);
 driver.findElement(By.linkText("Reports")).click();
 Thread.sleep(2000);
 driver.findElement(By.linkText("Maintenance")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");

 driver.findElement(By.xpath("//*[@type='submit']")).click();
  Thread.sleep(2000);
 // driver.findElement(By.name("firstname")).sendKeys("indu");

 //Thread.sleep(2000);
 //driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab-item']/ul/li[2]")).click();
 
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
 		
 
 
 

	
		
		
	}



