package driversPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {

@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//Java thread sleep
		Thread.sleep(2000);
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explicit wait 
		//1.Webdriver Wait
		WebDriverWait wait = new WebDriverWait(driver, 5);	
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='Tabbed']//a"))));
		
		//2.Fluent Wait	
		Wait wait1 =  new FluentWait(driver)
			       .withTimeout(Duration.ofSeconds(100))
			       .pollingEvery(Duration.ofSeconds(10))
			       .ignoring(NoSuchElementException.class);
		
		wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='Tabbed']//a"))));
		
	}

}
