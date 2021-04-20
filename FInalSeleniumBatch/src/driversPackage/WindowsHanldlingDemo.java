package driversPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHanldlingDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//GetWindowHandle
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent Window " + parentwindow);
		
		//GetWindowHandles
		driver.findElement(By.xpath("//div[@id='Tabbed']//a")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		/*List<String> win = new ArrayList(windows);
		System.out.println(win);
		
		driver.switchTo().window(win.get(1));*/
		
		Iterator<String> irr = windows.iterator();
		while(irr.hasNext()) {
			System.out.println();
			String st = irr.next();
			if(!parentwindow.equals(st)) {
				driver.switchTo().window(st);
				driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys("selenium");
				driver.close();
			}
			
		}
		
		for(String st : windows) {
			System.out.println(st);
			if(!parentwindow.equals(st)) {
				driver.switchTo().window(st);
				driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys("selenium");
				driver.close();
			}
		}
		
		
		/*driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys("selenium");
		driver.close();
		
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//div[@id='Tabbed']//a")).click();*/
		

		
		
	}

}
