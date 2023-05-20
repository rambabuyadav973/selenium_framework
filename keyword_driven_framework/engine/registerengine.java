package keyword_driven_framework.engine;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import keyword_driven_framework.base.base;

public class registerengine extends base{
	
	public WebElement element;

	
	public registerengine() {
		// TODO Auto-generated constructor stub
		setup();
	}
	
	
	public void execute() throws Exception {
		
		
		//workbook initialization
		FileInputStream fis = new FileInputStream(new File("/Users/rambabuyadav07/eclipse-workspace/selenium"
				+ "_framework/src/main/java/keyword_driven_framework/utilities/Untitled spreadsheet (1).xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		
		//performing actions
		for(int i = 0;i<sheet.getLastRowNum();i++) {
			String locatorValue = "";
			String locatorType = "";
			String locator = sheet.getRow(i+1).getCell(1).toString().trim();
			if(!locator.equalsIgnoreCase("NA")) {
				String[] locatorArr = locator.split("=");
				locatorType = locatorArr[0].trim();
				locatorValue = locatorArr[1].trim();
			}
			String keyword = sheet.getRow(i+1).getCell(2).toString().trim();
			String value = sheet.getRow(i+1).getCell(3).toString().trim();
			
			
			//browser actions
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
			
			
			//other actions
			switch (locatorType) {
			
			//action on name locator
			case "name":
				element = driver.findElement(By.name(locatorValue));         
				if(keyword.equalsIgnoreCase("enter")) {                             //sendkeys action
					element.sendKeys(value);
				}else if(keyword.equalsIgnoreCase("click")) {
					element.click();												//click action
				}else {																
					Select sel = new Select(element);
					sel.selectByVisibleText(value);									//select action
				}
				break;
			
			//when locator doesn't match any case
			default:
				break;
			}	
			
		}
		
//		wb.close();
		
	}
}
