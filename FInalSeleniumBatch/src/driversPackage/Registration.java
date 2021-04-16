package driversPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();

		WebElement fn = driver.findElement(By.id("vfb-5"));
		fn.sendKeys("Thiru");
		WebElement ln = driver.findElement(By.id("vfb-7"));
		ln.sendKeys("Sindu");
		WebElement gen = driver.findElement(By.id("vfb-8-1"));
		gen.click();

		// Select Drop Down
		WebElement coun = driver.findElement(By.id("vfb-13-country"));
		Select sel = new Select(coun);
		sel.selectByIndex(3);
		sel.selectByValue("Argentina");
		sel.selectByVisibleText("Australia");

		
		 
		
		
		

	}

}
