package keyword_driven_framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static WebDriver driver;
	
	
	//setting up driver
	public void setup() {
		driver = new ChromeDriver();
	}
}
