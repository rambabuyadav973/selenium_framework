package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.baseclass;
import pages.register;

public class testregister extends baseclass{
	
	register registerpage;

	
	public testregister() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		registerpage = new register();
	}
	
	
	@DataProvider(name = "testdata")
	public Object[][] dataset(){
		return new Object[][]{
			{
			"Ram",
			"Yadav",
			"1234567890",
			"ram@gmail.com",
			"S_AFR,Shollinganalur,Chennnai,TN",
			"Chennai",
			"Tamil Nadu",
			"600119",
			"ALGERIA",
			"Ram07",
			"1234@Test",
			"123@Test"

			}
		};
			
	}
	
	
	@Test(dataProvider = "testdata")
	public void verifyregister
			(
			 String fname,
			 String lname,
			 String phone,
			 String email,
			 String address,
			 String city,
			 String state,
			 String postal,
			 String country,
			 String username,
			 String password,
			 String confirmpassword
			) {
		registerpage.enterfname(fname);
		registerpage.enterlname(lname);
		registerpage.enterphone(phone);
		registerpage.enteremail(email);
		registerpage.enteraddress(address);
		registerpage.entercity(city);
		registerpage.enterestate(state);
		registerpage.enterpostal(postal);
		registerpage.seleccountry(country);
		registerpage.enterusername(username);
		registerpage.enterpassword(password);
		registerpage.enterconfirmpassword(confirmpassword);
		registerpage.submitting();
	}
	
	
	@AfterTest
	public static void teardown() {
		driver.quit();
	}
	
}
