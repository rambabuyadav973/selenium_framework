package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class base {

	public static WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}
}
