package data_driven;

import org.testng.annotations.DataProvider;

public class getdata {

	@DataProvider(name = "testdata")
	public static Object[][] contactprovider() {
		
		Object[][] data = null;
		
		return new Object[][]
		{
			{
				"ram",
				"babu",
				"1234567890",
				"ramgmail.com",
				"Shollingnallur",
				"Chennai",
				"Tamil Nadu",
				"600119",
				"ALGERIA",
				"ram07",
				"pass",
				"pass"
			},
			{
				"ramu",
				"yadav",
				"1234567899",
				"ramu@gmail.com",
				"Shollingnallur",
				"Chennai",
				"Tamil Nadu",
				"600119",
				"ANGOLA",
				"ramu07",
				"pass",
				"pass"
			}
		};
	}

}
