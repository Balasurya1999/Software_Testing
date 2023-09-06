package org.StepDefinition;

import java.util.List;
import java.util.Map;

import org.Base.BaseClass;
import org.pom.Fb_Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;

public class Fb_Registration extends BaseClass{
	Fb_Login f;
	@Given("To Launch the Chrome Browser and maximize the Window")
	public void to_Launch_the_Chrome_Browser_and_maximize_the_Window() {
		launchBrowser();
		WindowMaximize();
	   
	}

	@When("To Launch the Facebook URL")
	public void to_Launch_the_Facebook_URL() {
		launchUrl("https://en-gb.facebook.com/");
	    
	}

	@When("To Click Create New Account button")
	public void to_Click_Create_New_Account_Button() {
		f=new Fb_Login();
		ClickBtn(f.getCreate_New_Account());
	}

	@When("To Pass the First_Name in Firstname_Textfield")
	public void to_Pass_the_First_Name_in_Firstname_Textfield(DataTable d) throws InterruptedException {
		f = new Fb_Login();
		Thread.sleep(2000);
		List<String> l = d.asList();
		PassText(l.get(0),f.getFirst_Name());
	   
	}

	@When("To pass the Second_Name in Surname_Textfield")
	public void to_pass_the_Second_Name_in_Surname_Textfield(DataTable d) {
		f = new Fb_Login();
		Map<String, String> m = d.asMap(String.class,String.class);
		PassText(m.get("SecondName2"),f.getSur_Name());
	  
	}

	@When("To Pass the Number or Email in Num_Textfield")
	public void to_Pass_the_Number_or_Email_in_Num_Textfield(DataTable d) {
		f = new Fb_Login();
		List<List<String>> l = d.asLists();
		PassText(l.get(1).get(0),f.getNumber());
	  
	}

	@When("To pass the Password in Password_Textfield")
	public void to_pass_the_Password_in_Password_Textfield(DataTable d) {
		f = new Fb_Login();
		List<Map<String, String>> maps = d.asMaps();
		PassText(maps.get(0).get("Password1"),f.getPassword());
	    
	}

	@Then("To Close the Entire Browser")
	public void to_Close_the_Entire_Browser() {
//		CloseEntireBrowser();
	   
	}
}


