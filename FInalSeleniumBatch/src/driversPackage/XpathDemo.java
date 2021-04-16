package driversPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();

		// Abosulte Xpath
		// 1. Starting from the root
		// /html/body/div/a

		// Relative Xpath
		// Starts the from the location
		// Sytax
		// tagname[@attribute='attributevalu']
		driver.findElement(By.xpath("//input[@id='vfb-5']")).sendKeys("Suvi");
		
		//mutiple [logical]
		driver.findElement(By.xpath("//input[@id='vfb-7' and @name='vfb-7']")).sendKeys("Vidhya");
		
		//contains - attri
		//ex: niho123,nioh1,niho4
		driver.findElement(By.xpath("//input[contains(@id,'vfb-13')]")).sendKeys("Addresss 1");
		
		//contains - with text
		String actual = driver.findElement(By.xpath("//label[contains(text(),'Street')]")).getText();
		String expect = "Street Address";
		if(expect.equals(actual)) {
			
		}else {
			
		}
		
		//index - //input[@id='vfb-13-address']//following::label[1]
		
		////input[@id='vfb-13-address']//following-sibling::label
		//input[@id='vfb-13-address']//preceding::input
		//input[@id='vfb-13-address']//parent::span
		//div[@id='mobile-menu-search']//child::form
		//input[@id='vfb-13-address']//descendant:::input
			
		
	
		
		
	}

}
