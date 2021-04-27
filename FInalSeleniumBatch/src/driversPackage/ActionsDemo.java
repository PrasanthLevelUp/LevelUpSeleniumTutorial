package driversPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.j2store.org/demo-stores.html");
		driver.manage().window().maximize();
		
		//Creata a actions obj
		Actions action = new Actions(driver);
		
		WebElement sup = driver.findElement(By.xpath("//li[@data-id='141']/a"));
		WebElement form = driver.findElement(By.xpath("//li[@data-id='829']/a"));
		Action suppot = action.moveToElement(sup).click(form).build();
		suppot.perform();
		
		
		//li[@data-id='141']//div[@class='row']/div[1]//ul/li
		
	}

}
