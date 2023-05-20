package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public static WebDriver driver;
	public static String URL = "https://demo.guru99.com/test/newtours/register.php";
	public static Properties prop;

	public baseclass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}

	public static void initialization() {

		try {
			prop = new Properties();

			FileInputStream fis = new FileInputStream(
					new File("/Users/rambabuyadav07/eclipse-workspace/selenium_framework/src/"
							+ "main/java/utils/newtours.properties"));
			prop.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
