package engines;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class registerpage {

	@DataProvider(name = "register")
	public Object[][] execute() throws Exception {

		// workbook initialization
		FileInputStream fis = new FileInputStream(
				new File("//Users/rambabuyadav07/eclipse-workspace/"
						+ "hybrid/src/main/java/utilities/register1.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		Object[][] data = new Object[sheet.getLastRowNum()][4];

		// performing actions
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			String locatorValue = "";
			String locatorType = "";
			String locator = sheet.getRow(i + 1).getCell(1).toString().trim();
			if (!locator.equalsIgnoreCase("NA")) {
				String[] locatorArr = locator.split("=");
				locatorType = locatorArr[0].trim();
				locatorValue = locatorArr[1].trim();
			}
			String keyword = sheet.getRow(i + 1).getCell(2).toString().trim();
			String value = sheet.getRow(i + 1).getCell(3).toString().trim();

			data[i][0] = locatorType;
			data[i][1] = locatorValue;
			data[i][2] = keyword;
			data[i][3] = value;

			// browser actions
//			switch (keyword) {
//			case "open browser":
//				driver.get(value);
//				break;
//
//			case "close browser":
//				driver.quit();
//				break;
//
//			default:
//				break;
//			}
//
//			// other actions
//			switch (locatorType) {
//
//			// action on name locator
//			case "name":
//				element = driver.findElement(By.name(locatorValue));
//				if (keyword.equalsIgnoreCase("enter")) { // sendkeys action
//					element.sendKeys(value);
//				} else if (keyword.equalsIgnoreCase("click")) {
//					element.click(); // click action
//				} else {
//					Select sel = new Select(element);
//					sel.selectByVisibleText(value); // select action
//				}
//				break;
//
//			// when locator doesn't match any case
//			default:
//				break;
//			}
//
		}
		return data;
//		wb.close();

	}

}
