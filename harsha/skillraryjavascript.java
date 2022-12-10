package harsha;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class skillraryjavascript {
	public String url="https://demoapp.skillrary.com/login.php";
	WebDriver driver;
	@BeforeTest
	
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver=new ChromeDriver(options);
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
		@Test
		public void test1() throws InterruptedException
		{
			
		JavascriptExecutor jsExecutor =(JavascriptExecutor) driver;
		WebElement element = (WebElement) jsExecutor.executeScript("document.getElementById('email');");
		element.sendKeys("admin");
		WebElement element1 = (WebElement) jsExecutor.executeScript("document.getElementById('password');");
		element.sendKeys("admin");
	    jsExecutor.executeScript("document.getElementById('last').click()");
		


}
}
