package org.pom;

import org.Base.BaseClass;

public class Pom extends BaseClass
{
	public static void main(String[] args)  {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		WindowMaximize();
		
		LoginPojo p = new LoginPojo();
		PassText("Selenium", p.getEmail());
		PassText("Java", p.getPassword());
		
		driver.navigate().refresh();
		
		PassText("maven", p.getEmail());
		PassText("PoMFrame", p.getPassword());
		
		
	}
}
