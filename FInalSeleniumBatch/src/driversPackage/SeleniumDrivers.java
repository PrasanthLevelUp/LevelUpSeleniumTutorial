package driversPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDrivers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		//Locator
		//id
		//class
		//name
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium");
		WebElement but = driver.findElement(By.name("btnK"));
		but.click();
		//tagname
		List<WebElement> tags = driver.findElements(By.tagName("input"));
		System.out.println(tags.size());
		//linktext
		//parital linktext
		//xpath
		//cssselector
		

	}

}
