package org.testleaf.qa.pages;

import org.testleaf.qa.baseAPI.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods{

	public DuplicateLeadPage verifyTitleDuplicateLeadPage() {
		
		verifyTitle("Duplicate Lead | opentaps CRM");
	/*	String dupTitle=driver.getTitle();
		if(dupTitle.startsWith("Duplicate")) {
			System.out.println("Your title is: " + dupTitle + " And your title is correct");
			}
		else {
			System.out.println("Your title is: " + dupTitle + " And your title is incorrect");
		}*/
		
		return this;
	}
	
	public ViewLeadPage clickOnSubmitBtnInDuplicateLeadPage() {
		
		click(locateElement("name", "submitButton"));
		//driver.findElementByName("submitButton").click();
		
		return new ViewLeadPage();
	}
	
}
