package org.testleaf.qa.pages;

import org.testleaf.qa.baseAPI.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{

	public MyLeadPage clickOnLead() {
		
		click(locateElement("link", "Leads"));
		//driver.findElementByLinkText("Leads").click();
		return new MyLeadPage();
	}
	
	
}
