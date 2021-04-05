package PageFactory;

import PageFactory.Base;
public class CommonActions extends Base {
	
	public void Signup(String firstname,String lastname,String Email,String companyname,String PhoneNumber) {
		
		sendKeys(Locaters.Signup.Firstname, firstname);
		sendKeys(Locaters.Signup.Lastname, lastname);
		sendKeys(Locaters.Signup.Email, Email);
		sendKeys(Locaters.Signup.CompanyName, companyname);
		sendKeys(Locaters.Signup.PhoneNumber, PhoneNumber);

	}
	
	public void quitsession() {
		
		quit();
	}

}
