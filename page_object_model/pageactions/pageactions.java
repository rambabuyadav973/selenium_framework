package pageactions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class pageactions {
	
	
	public static void sendaction(WebElement ele, String data) {
		ele.sendKeys(data);
	}
	
	public static void selectaction(WebElement ele, String data) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(data);
	}
	
	public static void clicking(WebElement ele) {
		ele.click();
	}
	
	
}
