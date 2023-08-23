package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
public 	WebDriver driver;
public void launchTheBrowser() {

	WebDriverManager.chromedriver().setup();
	
	ChromeOptions c= new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	c.addArguments("--start-maximized");
	c.addArguments("--incognito");
	
	
 driver= new ChromeDriver(c);
	
	
	driver.get("https://www.facebook.com/campaign/landing.php");
	
	
	
}
}
