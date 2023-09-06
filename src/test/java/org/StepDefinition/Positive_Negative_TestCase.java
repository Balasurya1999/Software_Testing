package org.StepDefinition;

import org.Base.BaseClass;
import org.pom.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Positive_Negative_TestCase extends BaseClass {
	LoginPojo f;
	@Given("user has to Launch the Chrome Browser nad Maximize the Window")
	public void user_has_to_Launch_the_Chrome_Browser_nad_Maximize_the_Window() {
		launchBrowser();
		WindowMaximize();
	   
	}

	@When("user has to hit the URL of the FaceBook Application")
	public void user_has_to_hit_the_URL_of_the_FaceBook_Application() {
		launchUrl("https://en-gb.facebook.com/");
	   
	}

	@When("user has to Pass the date {string} in Email Field")
	public void user_has_to_Pass_the_date_in_Email_Field(String Email) {
		f = new LoginPojo();
		PassText(Email, f.getEmail());
	   
	}

	@When("user has to pass the date {string} in Password Field")
	public void user_has_to_pass_the_date_in_Password_Field(String Password) {
		f = new LoginPojo();
		PassText(Password, f.getEmail());
	   
	}

	@When("user to Click the Login Button")
	public void user_to_Click_the_Login_Button() {
		f = new LoginPojo();
		ClickBtn(f.getLoginbtn());
	   
	}

	@Then("Use has to Close the Window")
	public void use_has_to_Close_the_Window() {
		CloseEntireBrowser();
	  
	}


}
