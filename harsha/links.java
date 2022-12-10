package harsha;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {
	String url="https://demo.guru99.com/test/newtours";
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
			public void Testcase2() throws IOException {
				List<WebElement>ch= driver.findElements(By.tagName("a"));
				/*int size=ch.size();
				for(int i=0;i<size;i++){
					WebElement element=ch.get(i);
					String url=element.getAttribute("href");
					URL link =new URL(url);
					HttpURLConnection httpcon=(HttpURLConnection)link.openConnection();
					
					httpcon.connect();
					int rescode=httpcon.getResponseCode();
					//System.out.println(ch.get(i).getText());
					if(rescode>400){
						System.out.println(url +"---->is broken link");
					}else{
						System.out.println(url +"---->is valid link");
					}*/
					
				//ch.addAll(driver.findElements(By.tagName("img")));
				//System.out.println("Total no of checkboxes:"+ch.size());
				List<WebElement>ch1=new ArrayList<WebElement>();
				
				//for(int i=0;i<=ch.size();i++)
				//{
					//if (ch.get(i).getAttribute("href")!=null){
						//ch.add(ch1.get(i));
					//}*/
				
				//System.out.println(ch.get(i).getText());
				//System.out.println(ch.get(i).getAttribute("href"));
				
			for(int i=0;i<=ch1.size();i++){
				HttpURLConnection indu=(HttpURLConnection) new URL(ch1.get(i).getAttribute("href")).openConnection();
				indu.connect();
				String response=indu.getResponseMessage();
				indu.getResponseMessage();
				System.out.println(ch1.get(i).getAttribute("href")+"--->"+response);
			}
				
				}
			@AfterTest
			public void AT() throws InterruptedException {
				Thread.sleep(3000);
				//driver.close();
				
				

}
}
