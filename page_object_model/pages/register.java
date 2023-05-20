package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.baseclass;
import pageactions.pageactions;

public class register extends baseclass {

	// object repo
	@FindBy(name = "firstName")
	public  WebElement fname;

	@FindBy(name = "lastName")
	public  WebElement lname;

	@FindBy(name = "phone")
	public  WebElement phone;

	@FindBy(name = "userName")
	public  WebElement email;

	@FindBy(name = "address1")
	public  WebElement address;

	@FindBy(name = "city")
	public  WebElement city;

	@FindBy(name = "state")
	public  WebElement state;

	@FindBy(name = "postalCode")
	public  WebElement postal;

	@FindBy(name = "country")
	public  WebElement country;

	@FindBy(name = "email")
	public  WebElement username;

	@FindBy(name = "password")
	public  WebElement password;

	@FindBy(name = "confirmPassword")
	public  WebElement confirmpassword;

	@FindBy(name = "submit")
	public  WebElement submit;

	
	
	// constructor
	public register() {
		PageFactory.initElements(driver, this);
	}


	// actions
	public void enterfname(String name) {
		pageactions.sendaction(fname, name);
	}

	public void enterlname(String lastname) {
		pageactions.sendaction(lname,lastname);
	}

	public void enterphone(String number) {
		pageactions.sendaction(phone, number);
	}

	public void enteremail(String emaildata) {
		pageactions.sendaction(email, emaildata);
	}

	public void enteraddress(String addressdata) {
		pageactions.sendaction(address, addressdata);
	}

	public void enterestate(String statedata) {
		pageactions.sendaction(state, statedata);
	}

	public void entercity(String citydata) {
		pageactions.sendaction(city, citydata);
	}

	public void enterpostal(String postaldata) {
		pageactions.sendaction(postal, postaldata);
	}

	public void seleccountry(String countrydata) {
		pageactions.selectaction(country, countrydata);
	}

	public void enterusername(String usernamedata) {
		pageactions.sendaction(username, usernamedata);
	}

	public void enterpassword(String passworddata) {
		pageactions.sendaction(password, passworddata);
	}

	public void enterconfirmpassword(String confirmpassworddata) {
		pageactions.sendaction(confirmpassword,confirmpassworddata);
	}

	public void submitting() {
		pageactions.clicking(submit);
		
	}

}
