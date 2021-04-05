package StepDefinitions;

import Locaters.Chat;
import Locaters.HomepageLocaters;
import Locaters.Signup;
import Locaters.TrackOrder;
import PageFactory.Base;
import PageFactory.CommonActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends Base {

	public CommonActions commonaction = new CommonActions();

	@Given("^i am on Fetchr Homepage$")
	public void i_am_on_fetchr_homepage() throws Throwable {

		OpenBrowser();
		NavigateTo("ProdUrl");
		System.out.println("asdasd");
	}

	@Given("^i am on Fetchr track page$")
	public void i_am_on_fetchr_track_page() throws Throwable {

		OpenBrowser();
		NavigateTo("TrackURL");
	}

	@When("^i click on GetStarted Button$")
	public void i_click_on_getstarted_button() throws Throwable {

		System.out.println("Click on Get Started Button");
		click(HomepageLocaters.Signup);
	}

	@Then("^The GeStarted should be opened Successfully$")
	public void the_gestarted_should_be_opened_successfully() throws Throwable {

		System.out.println("The Page should Be generated");
		match("Power your deliveries with Fetchr");

	}

	@Then("^the Singup form should be Registered Successfully(.+)$")
	public void the_singup_form_should_be_registered_successfully(String confirmmessage) throws Throwable {

		match(confirmmessage);
	}

	@And("^fill the following details firstname(.+) lastname(.+) email(.+) companyname(.+) phonenumber(.+)$")
	public void fill_the_following_details_firstname_lastname_email_companyname_phonenumber(String firstname,
			String lastname, String email, String companyname, String phonenumber) {

		commonaction.Signup(firstname, lastname, email, companyname, phonenumber);
	}

	@And("^Click on on Contact Me Button$")
	public void click_on_on_contact_me_button() {

		click(Signup.ContactMe);
	}

	@And("^The session is terminated$")
	public void the_session_is_terminated() {

		quit();
	}

	@And("^Select Country as KSA$")
	public void select_country_as_ksa() {

		click(Signup.CountryDropdown2);
		click(Signup.KSA);
	}

	@And("^Select Country as egypt$")
	public void select_country_as_egypt() {

		click(Signup.CountryDropdown2);
		click(Signup.Egypt);
	}

	@And("^Select Country as oman$")
	public void select_country_as_oman() {

		click(Signup.CountryDropdown2);
		click(Signup.Oman);
	}

	@Then("^the error message should be displayed(.+)$")
	public void the_error_message_should_be_displayed(String errormessage) {

		match(errormessage);
	}

	@When("^i enter a message in English or Arabic(.+)$")
	public void i_enter_a_message_in_english_or_arabic(String language) {

		sendKeys(Chat.Texteditor, language);
		Enter(Chat.Texteditor);

	}

	@Then("^the message should be sent Successfully(.+)$")
	public void the_message_should_be_sent_successfully(String language) {

		match(language);
	}

	@And("^click on Chat support icon$")
	public void click_on_chat_support_icon() {

		SwitchToFrame(Chat.ChatFrame);
		wait(1);
		click(Chat.ChatIcon);
	}

	@When("^i send a message using Random Text with emojis(.+)$")
	public void i_send_a_message_using_random_text_with_emojis(String language) {

		sendKeys(Chat.Texteditor, language);
		click(Chat.EmojiMenuIcon);
		click(Chat.EmojiSmilyfaceIcon);
		Enter(Chat.Texteditor);
	}

	@When("^i enter a valid tracking number$")
	public void i_enter_a_valid_tracking_number() {

		sendKeys(TrackOrder.TrackNumber, "12345678912345");
	}

	@Then("^the current status of order should be displayed$")
	public void the_current_status_of_order_should_be_displayed() {

		match("Out for Deliver");
	}

	@When("^i click on where can i find my tracking number$")
	public void i_click_on_where_can_i_find_my_tracking_number() {
		click(TrackOrder.WhereToFind);
	}

	@Then("^Check your SMS from fetchr popup should be displayed$")
	public void check_your_sms_from_fetchr_popup_should_be_displayed() {

		match("Check your SMS from Fetchr");
	}

	@And("^i click on Track Button$")
	public void i_click_on_track_button() {

		click(TrackOrder.Track);
	}
}
