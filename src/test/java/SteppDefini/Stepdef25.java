package SteppDefini;

import Swag.PageAction.Page_Action25;
import Util25.TestBase25;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef25 extends TestBase25{
	
	Page_Action25 pageaction25 = new Page_Action25();
	
	@Given("Launch {string}")
	public void launch(String URL) {
		getURL(URL);
	}
	
	
	  

	@When("I fill the account information for account StandardUser into the Username  field and the Password field")
	public void i_fill_the_account_information_for_account_standard_user_into_the_username_field_and_the_password_field() {
		pageaction25.StandardUser_Username();
		
		pageaction25.StandardUser_Password();
	}

	@When("I click the Login Button")
	public void i_click_the_login_button() {
	   
		pageaction25.ClickLoginButton();
	}

	@Then("I am redirected to the Sauce Demo Main Page")
	public void i_am_redirected_to_the_sauce_demo_main_page() {
		pageaction25.redirectedSauceDemoMainPage();
		
		pageaction25.clicksidebar();
		
	}

	@Then("I verify the App Logo exists")
	public void i_verify_the_app_logo_exists() {
	    
		pageaction25.verifyAppLogoexists();
	}

	@When("I fill the account information for account LockedOutUser into the  Username field and the Password field")
	public void i_fill_the_account_information_for_account_locked_out_user_into_the_username_field_and_the_password_field() {
	    
		pageaction25.LockedOutUser_Username();
		
		pageaction25.LockedOutUser_Password();
	}

	@Then("I verify the Error Message contains the text {string}")
	public void i_verify_the_error_message_contains_the_text(String string) {
	   
		pageaction25.verifyErrorMessage();
	}



}
