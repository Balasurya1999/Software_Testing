package org.pom;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login extends BaseClass
{
	public Fb_Login() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement Create_New_Account;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement First_Name;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement Sur_Name;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement Number;
	
	@FindBy(id = "password_step_input")
	private WebElement Password;

	public WebElement getCreate_New_Account() {
		return Create_New_Account;
	}

	public WebElement getFirst_Name() {
		return First_Name;
	}

	public WebElement getSur_Name() {
		return Sur_Name;
	}

	public WebElement getNumber() {
		return Number;
	}

	public WebElement getPassword() {
		return Password;
	}	
	
}
