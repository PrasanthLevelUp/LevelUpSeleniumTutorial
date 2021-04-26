package driversPackage;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePickerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "G:\\\\Selenium Drivers\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("start-maximized");
		  options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		  options.setExperimentalOption("useAutomationExtension", false);
		  WebDriver driver =  new ChromeDriver(options);
		  driver.get("https://www.spicejet.com/");
		  WebElement element = driver.findElement(By.cssSelector("input[name$= 'txt_Fromdate']"));
		  ((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('readonly')", element);
		  WebElement newElement = driver.findElement(By.cssSelector("input[name$= 'txt_Fromdate']"));
		  ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','28/02')", newElement);
	}

}
