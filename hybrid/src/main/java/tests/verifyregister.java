package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.base;
import engines.registerpage;

public class verifyregister extends base {

	public WebElement element;

	@Test(dataProvider = "register",dataProviderClass = registerpage.class)
	public void verifyingregister(String locatorType, String locatorValue, String keyword, String value) {

		// browser actions
		switch (keyword) {
		case "open browser":
			driver.get(value);
			break;

		case "close browser":
			driver.quit();
			break;

		default:
			break;
		}

		// other actions
		switch (locatorType) {

		// action on name locator
		case "name":
			element = driver.findElement(By.name(locatorValue));
			if (keyword.equalsIgnoreCase("enter")) { // sendkeys action
				element.sendKeys(value);
			} else if (keyword.equalsIgnoreCase("click")) {
				element.click(); // click action
			} else {
				Select sel = new Select(element);
				sel.selectByVisibleText(value); // select action
			}
			break;

		// when locator doesn't match any case
		default:
			break;
		}

	}

}
