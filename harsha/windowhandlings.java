package harsha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandlings {
	String address="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String URL="https://www.youtube.com";
	String URL1="https://karnatakatourism.org/";
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
		
}
		//Thread.sleep(3000);
		@Test
		public void Testcase3() throws InterruptedException{
			driver.getWindowHandle();
			driver.switchTo().newWindow(WindowType.TAB);
			driver.navigate().to(URL1);
			driver.close();
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.navigate().to(URL);
			//driver.close();
		
		
			//ch.get(i).click();
	}
	@AfterTest
	public void AT() throws InterruptedException {
		Thread.sleep(3000);
		//driver.close();


	}
	}



