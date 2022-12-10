package harsha;



import java.util.List;

//import java.awt.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guru {
	String url="https://demo.guru99.com/test/newtours/";
	  WebDriver driver;
	 @BeforeTest
	 public void beforetest() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			String beforelogin=driver.getCurrentUrl();
			System.out.println(beforelogin);
			String afterlogin=driver.getCurrentUrl();
			System.out.println(afterlogin);
			//Thread.sleep(3000);
	 }
			@Test
			public void Testcase2() throws InterruptedException {
				
				
				driver.findElement(By.name("userName")).sendKeys("user");
				driver.findElement(By.name("password")).sendKeys("user");
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				Thread.sleep(2000);	

}
			@Test
			public void Testcase3() throws InterruptedException {
				driver.findElement(By.linkText("REGISTER")).click();
				Thread.sleep(2000);
			}
			@Test
			public void Testcase4() throws InterruptedException {
				driver.findElement(By.name("firstName")).sendKeys("indu");
				driver.findElement(By.name("lastName")).sendKeys("rani");
				driver.findElement(By.name("phone")).sendKeys("9704856775");
				driver.findElement(By.id("userName")).sendKeys("indu@gmail.com");
				
				driver.findElement(By.name("address1")).sendKeys("indu,banglore");
				driver.findElement(By.name("city")).sendKeys("banglore");
				driver.findElement(By.name("state")).sendKeys("karnataka");
				driver.findElement(By.name("postalCode")).sendKeys("560048");
				//WebElement dropdown=driver.findElement(By.name("country"));
				//Select SelectObject= new Select(dropdown);
				//SelectObject.selectByValue("AUSTRIA");
				//SelectObject.selectByIndex(13);
				//SelectObject.selectByVisibleText("AUSTRIA");
				List<WebElement> dropdown1 =driver.findElements(By.name("country"));
				for(int i=0;i<dropdown1.size();i++);
				dropdown1.get(7).click();
				Thread.sleep(2000);
				
				driver.findElement(By.id("email")).sendKeys("indu@gmail.com");
				driver.findElement(By.name("password")).sendKeys("indu");
				driver.findElement(By.name("confirmPassword")).sendKeys("indu");
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				//driver.findElement(By.name("country")).click();
				
				//for(int i=0;i<dropdown.length;i++);
				
				
				
				
			}
			@AfterTest
			public void AT() throws InterruptedException {
				Thread.sleep(3000);
				//driver.close();
			}
}