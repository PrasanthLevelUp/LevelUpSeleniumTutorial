package driversPackage;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapbilitesDemo {

	public static void main(String[] args) {
		
		//https://sites.google.com/a/chromium.org/chromedriver/capabilities
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "accept");
		//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setCapability("ignoreZoomSetting", true);
		capabilities.setCapability("requireWindowFocus", true);// to move mouse manually
		
		ChromeOptions options = new ChromeOptions();
		options.merge(capabilities);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		/*ChromeOptions options1 = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("myhttpproxy:3337");
		options1.setCapability("proxy", proxy);
		options1.addArguments("--headless");
		options1.addArguments("--disable-gpu");
		options1.setAcceptInsecureCerts(true);
		options1.addArguments("--allow-insecure-localhost");
		options1.addArguments("--lang=fr-CA");
		options1.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);*/
	}

}
