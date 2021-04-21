package driversPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//1index
		//2.id. or name
		//3.Webelement
		//find the frame  // tag name - iframe
		//driver.switchTo().frame("singleframe");
		WebElement sinle = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		driver.switchTo().frame(sinle);
		driver.findElement(By.tagName("input")).sendKeys("Niho");
		driver.switchTo().defaultContent();
		
		
		
		
	}

}
