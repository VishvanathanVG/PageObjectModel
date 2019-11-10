package org.testleaf.qa.pages;

import org.testleaf.qa.baseAPI.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods{

	public CreateLeadPage clickOnCreateLead() {
		
		click(locateElement("link", "Create Lead"));
		//driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
		
	}
	
	public FindLeadPage clickOnFindLeads() {
		
		click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
		//driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		
		return new FindLeadPage();
	}
	
	public MergeLeadPage clickOnMergeLead() {
		
		click(locateElement("link", "Merge Leads"));
		//driver.findElementByLinkText("Merge Leads").click();
		return new MergeLeadPage();
	}
	
}
