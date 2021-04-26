package driversPackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Test");
		driver.findElement(By.name("password")).sendKeys("Test");
		WebElement click = driver.findElement(By.name("btnLogin"));
		
		//scroll and click
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		js.executeScript("window.scrollBy(0,600)");
		js.executeScript("arguments[0].click();", click);
		
		js.executeScript("window.location = 'http://www.redbus.com/'");
		
		//Declare and set the start time		
        long start_time = System.currentTimeMillis();			
                 
        //Call executeAsyncScript() method to wait for 5 seconds		
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");			
        		
       //Get the difference (currentTime - startTime)  of times.		
       System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));	
       
       js.executeScript("alert('Welcome to Fita');");   
       
     //Fetching the Domain Name of the site. Tostring() change object to name.		
       String DomainName = js.executeScript("return document.domain;").toString();			
       System.out.println("Domain name of the site = "+DomainName);					
         		
       //Fetching the URL of the site. Tostring() change object to name		
       String url = js.executeScript("return document.URL;").toString();			
       System.out.println("URL of the site = "+url);					
         		
      //Method document.title fetch the Title name of the site. Tostring() change object to name		
      String TitleName = js.executeScript("return document.title;").toString();			
      System.out.println("Title of the page = "+TitleName);
      
      WebElement value = (WebElement) js.executeScript("return document.evaluate( '//body//div/iframe' ,document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue;");
      WebElement searchbox = null;
      searchbox = (WebElement) js.executeScript("return document.getElementById('gsc-i-id1');", searchbox);
	}

}
