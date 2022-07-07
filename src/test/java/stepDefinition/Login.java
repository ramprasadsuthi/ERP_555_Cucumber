package stepDefinition;

import commonMethods.BaseMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	BaseMethods base;
	
	@Given("Open Browser and Launch Application {string}")
	public void open_browser_and_launch_application(String url) {
	  base = new BaseMethods();
	  BaseMethods.openBrowser();
	  BaseMethods.launchERP(url);
	}
	
	@When("Login with Valid {string} and {string}")
	public void login_with_valid_username_and_password(String username, String password) {
	  BaseMethods.loginERP(username, password);
	}
	
	@Then("Validate the ERP HomePage")
	public void validate_the_erp_home_page() {
	 
	}
	
	@Then("Logout ERP Application")
	public void logout_erp_application() {
       BaseMethods.logoutERP();
	}
	
	@Then("Close the Browser")
	public void close_the_browser() {
	   BaseMethods.closeBrowser();
	}


}
