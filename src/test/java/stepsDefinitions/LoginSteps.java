package stepsDefinitions;

import StandardUtils.DriverFactory;
import StandardUtils.InitPageObjectClasses;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BaseObjects;
import pages.LoginPage;
import testData.ReadTestData;

public class LoginSteps extends InitPageObjectClasses {

	
	ReadTestData.Root loginData = BaseObjects.readJsonFile("LoginTestData.json", ReadTestData.Root.class);
	
	@Given("User launch browser and enter application url")
	public void user_launch_browser_and_enter_application_url() {
	   
	     DriverFactory.launchBrowser();
	     
	}
	@When("User enters valid user name and valid password and click login button")
	public void user_enters_valid_user_name_and_valid_password_and_click_login_button() {
	   
		loginpage().login(loginData.login_Details.userName,loginData.login_Details.password);
	}
	@When("User navigates to home page and verify the title of the application")
	public void user_navigates_to_home_page_and_verify_the_title_of_the_application() {
	    
		loginpage().verifyTheUrlOfTheApplication(loginData.login_Details.url);
		
	}
	@Then("Logged out the application and verify the login page title")
	public void logged_out_the_application_and_verify_the_login_page_title() {
	   
		
	}
    // Invalid Scenario
	
	@When("User enters invalid username and invalid password and click login button")
	public void user_enters_invalid_username_and_invalid_password_and_click_login_button() {
	    
		loginpage().login(loginData.invalid_Login_Data.userName,loginData.invalid_Login_Data.password);
		
		
	}
	@When("User verified the error message in the login page of the application")
	public void user_verified_the_error_message_in_the_login_page_of_the_application() {
	    
		loginpage().errorMessage(loginData.invalid_Login_Data.Error_Message);
	}
	
	
}
