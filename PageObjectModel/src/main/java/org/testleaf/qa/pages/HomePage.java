package org.testleaf.qa.pages;

import org.testleaf.qa.baseAPI.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public LoginPage clickOnLogout() {
		
		click(locateElement("class", "decorativeSubmit"));
		//driver.findElementByClassName("decorativeSubmit").click();
		
		return new LoginPage();
	}
	
	
	public MyHomePage clickOnCRMSFA() {
		
		click(locateElement("partial", "CRM/SFA"));
		//driver.findElementByPartialLinkText("CRM/SFA").click();
		return new MyHomePage();
		
	}
	
}
