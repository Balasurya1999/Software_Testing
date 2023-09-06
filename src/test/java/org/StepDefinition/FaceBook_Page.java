package org.StepDefinition;

import org.Base.BaseClass;
import org.pom.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBook_Page extends BaseClass {
	@Given("To Launch the Chrome Browser and Maximize the Window")
	public void to_Launch_the_Chrome_Browser_and_Maximize_the_Window() {
		launchBrowser();
		WindowMaximize();
	    
	}

	@When("To Launch the URl of Facebook Application")
	public void to_Launch_the_URl_of_Facebook_Application() {
		launchUrl("https://en-gb.facebook.com/");
	   
	}

	@When("To Pass Valid Username in Email Text Field")
	public void to_Pass_Valid_Username_in_Email_Text_Field() {
		LoginPojo f = new LoginPojo();
		PassText("balasurya9842212687@gmail.com",f.getEmail());
	
	  
	}

	@When("To Pass Valid Password in Password Text Field")
	public void to_Pass_Valid_Password_in_Password_Text_Field() {
		LoginPojo f = new LoginPojo();
		PassText("Balasurya@007",f.getPassword());
	  
	}

	@When("To Click the Login Button")
	public void to_Click_the_Login_Button() {
		LoginPojo f = new LoginPojo();
		ClickBtn(f.getLoginbtn());
	  
	}

	@Then("Close the Browser")
	public void close_the_Browser() {
		CloseEntireBrowser();
	   
	}


}
