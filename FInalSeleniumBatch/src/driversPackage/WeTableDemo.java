package driversPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeTableDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();

		List<WebElement> table = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));

		for (int i = 1; i < table.size() - 1; i++) {
			String actualcompnay = driver
					.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[" + i + "]//td[1]//a")).getText();
			if (actualcompnay.equals("Nestle India")) {
				for (int j = 2; j <= 5; j++) {
					if (j == 5) {
						System.out.println(driver
								.findElement(
										By.xpath("//table[@class='dataTable']//tbody//tr[" + i + "]//td[" + j + "]//a"))
								.getText());
					} else {
						System.out.println(driver
								.findElement(
										By.xpath("//table[@class='dataTable']//tbody//tr[" + i + "]//td[" + j + "]"))
								.getText());
					}
				
				}
				break;
				/*
				 * for(int j=1;j<=5;j++) { if(j==1) {
				 * System.out.println(driver.findElement(By.xpath(
				 * "//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]//a")).getText());
				 * }else if(j==5) { System.out.println(driver.findElement(By.xpath(
				 * "//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]//font")).getText())
				 * ; }else { System.out.println(driver.findElement(By.xpath(
				 * "//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]")).getText()); } }
				 */
			}
		}
	}
}
