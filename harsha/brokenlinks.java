package harsha;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlinks {
	String url="https://demo.guru99.com/test/newtours";
	  WebDriver driver;
	  
	 @BeforeTest
	 public void beforetest() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			//driver.findElement(By.id("wzrk-cancel")).click();
			String beforelogin=driver.getCurrentUrl();
			System.out.println(beforelogin);
			String afterlogin=driver.getCurrentUrl();
			System.out.println(afterlogin);
	 }
			//Thread.sleep(3000);
			@Test
			public void Testcase2() throws IOException {
				List<WebElement>ch= driver.findElements(By.tagName("a"));
				//ch.addAll(driver.findElements(By.tagName("img")));
				int size=ch.size();
				for(int i=0;i<size;i++){
					//WebElement element=ch.get(i);
					//String url=element.getAttribute("href");
					String url=ch.get(i).getAttribute("href");
				   URL link =new URL(url);
					HttpURLConnection indu=(HttpURLConnection)link.openConnection();
					//HttpURLConnection httpcon=(HttpURLConnection) new URL(ch.get(i).getAttribute("href")).openConnection();
					indu.connect();
					int rescode=indu.getResponseCode();
					System.out.println(ch.get(i).getText());
					if(rescode>400){
						System.out.println(url +"---->is broken link");
					}else{
						System.out.println(url +"---->is valid link");
					}
				}
			}
				@AfterTest
				public void AT() throws InterruptedException {
					Thread.sleep(3000);
					//driver.close();
					

}
			}
