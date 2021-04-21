package driversPackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class AlertAndPop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		Thread.sleep(2000);
		//Alert Class
		Alert al = driver.switchTo().alert();
		//Declare and initialise a fluent wait
				FluentWait wait2 = new FluentWait(driver);
				//Specify the timout of the wait0
				wait2.withTimeout(Duration.ofSeconds(10));
				//Sepcify polling time
				wait2.pollingEvery(Duration.ofSeconds(2));
				//Specify what exceptions to ignore
				wait2.ignoring(NoSuchElementException.class);

				//This is how we specify the condition to wait on.
				//This is what we will explore more in this chapter
				wait2.until(ExpectedConditions.alertIsPresent());
		String alertmsg = al.getText();
		System.out.println(alertmsg);
		al.accept();
		driver.close();
		
		
		

	}

}
