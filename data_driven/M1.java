package data_driven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class M1 {
	public static String URL = "https://demo.guru99.com/test/newtours/register.php";
	public static WebDriver driver;

	@BeforeMethod
	public static void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// launching
		driver.get(URL);
	}

	@Test(dataProvider = "testdata",dataProviderClass = getdata.class)
	public static void contactinformation(String name, String lname, String number, String email, String address,
			String city, String state, String postalcode, String country, String username, String password,
			String confirmpassword) {
		// all the elements
		WebElement nameelement = driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
		WebElement lnameelement = driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
		WebElement numberelement = driver.findElement(By.xpath("//input[@name=\"phone\"]"));
		WebElement emailelement = driver.findElement(By.id("userName"));
		WebElement addresselement = driver.findElement(By.xpath("//input[@name=\"address1\"]"));
		WebElement cityelement = driver.findElement(By.xpath("//input[@name=\"city\"]"));
		WebElement stateelement = driver.findElement(By.xpath("//input[@name=\"state\"]"));
		WebElement postalcodeelement = driver.findElement(By.xpath("(//input)[9]"));
		WebElement countryelement = driver.findElement(By.xpath("//select[@name=\"country\"]"));
		WebElement usernameelement = driver.findElement(By.id("email"));
		WebElement passwordelement = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		WebElement confirmpasswordelement = driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]"));
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));

		// performing actions
		nameelement.sendKeys(name);
		lnameelement.sendKeys(lname);
		numberelement.sendKeys(number);
		emailelement.sendKeys(email);
		addresselement.sendKeys(address);
		cityelement.sendKeys(city);
		stateelement.sendKeys(state);
		postalcodeelement.sendKeys(postalcode);

		// select menu
		Select sel = new Select(countryelement);
		sel.selectByVisibleText(country);

		usernameelement.sendKeys(username);
		passwordelement.sendKeys(password);
		confirmpasswordelement.sendKeys(confirmpassword);
		
		submit.click();
	}

}
