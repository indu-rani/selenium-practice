package harsha;

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

public class orange {
	 String address="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  WebDriver driver;
	 @BeforeTest
	     public void beforetest() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.manage().window().maximize();
	     Thread.sleep(5000);
	 }
	 @Test
	 public void Testcase1() throws InterruptedException {
	     driver.findElement(By.name("username")).sendKeys("Admin");
	     driver.findElement(By.name("password")).sendKeys("admin123");
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
	     Thread.sleep(3000);
	Actions action = new Actions(driver);
	WebElement element =driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']"));
	action.click(element).perform();
	action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
	action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
	driver.findElement(By.xpath("//*[@type='submit']")).click();

}

@AfterTest
public void AT() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();
}
}
