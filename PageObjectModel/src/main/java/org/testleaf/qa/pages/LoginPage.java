package org.testleaf.qa.pages;

import org.testleaf.qa.api.base.SeleniumBase;
import org.testleaf.qa.baseAPI.ProjectSpecificMethods;

public class LoginPage extends SeleniumBase {

	public LoginPage enterUserName(String userName) {
		clearAndType(locateElement("id", "username"), userName);
		//driver.findElementById("username").sendKeys(userName);
		return this;

	}
	
	public LoginPage enterPassword(String passWord) {
		
		clearAndType(locateElement("name", "PASSWORD"), passWord);
		//driver.findElementByName("PASSWORD").sendKeys(passWord);
		return this;
	}
	
	public HomePage clickOnLogin() {
		
		click(locateElement("class", "decorativeSubmit"));
		//driver.findElementByClassName("decorativeSubmit").click();
		
		return new HomePage();
	}

}
