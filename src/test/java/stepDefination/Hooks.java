package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class Hooks {
	
@Before
void before() {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lucky\\eclipse-workspace\\Seleniumjanuary\\Drivers\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
}
}