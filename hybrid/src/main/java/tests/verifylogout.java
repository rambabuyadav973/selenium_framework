package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.base;
import engines.logoutpage;

public class verifylogout extends base {

	@Test( dataProvider = "logout", dataProviderClass = logoutpage.class)
	public void logout(String locatorType, String locatorValue,String keyword, String value) {
		System.out.println(keyword + " " + value + " " );
		
		
		//performing action on logout button
		if (keyword.equalsIgnoreCase("logout")) {
			driver.findElement(By.linkText(locatorValue)).click();
		}
		if(keyword.equalsIgnoreCase("close browser")){
			driver.quit();
		}

	}

}
