package driversPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		
		String actualrul = driver.getCurrentUrl();
		String actualtitle = driver.getTitle();
		String source = driver.getPageSource();
		
		System.out.println(actualrul);
		System.out.println(actualtitle);
		System.out.println(source);
		
		// Navigation
		
		  driver.navigate().to("https://www.google.com/"); 
		  driver.navigate().back();
		  driver.navigate().refresh();
		  driver.navigate().forward();
		 
	}

}
