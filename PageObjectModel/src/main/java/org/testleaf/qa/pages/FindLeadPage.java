package org.testleaf.qa.pages;

import org.openqa.selenium.WebElement;
import org.testleaf.qa.baseAPI.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods {

	
	public FindLeadPage enterFirstNameinFindLeadPage(String firstname) {

		clearAndType(locateElement("xpath", "((//label[text()='First name:'])[3]/following::input)[1]"), firstname);
		//driver.findElementByXPath("((//label[text()='First name:'])[3]/following::input)[1]").sendKeys(firstname);
		return this;
	}

	public FindLeadPage enterLeadIdInFindLeadPage() {
		
		clearAndType(locateElement("xpath", "//label[contains(text(), 'Lead ID:')]/following::input[1]"), leadId);
		//driver.findElementByXPath("//label[contains(text(), 'Lead ID:')]/following::input[1]").sendKeys(leadId);
		return this;
	}
	
	public FindLeadPage clickOnFindLeadBtnFindLeadPage() {

		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		//driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		return this;
	}
	

	public ViewLeadPage selectFirstListedFindLeadsData() {
		
		String leadid = getElementText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]"));
		/*WebElement firtLead= driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]");
		String leadid=firtLead.getText();*/
		leadId =leadid;
		System.out.println("first lead id:"+ leadid);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]"));
		return new ViewLeadPage();
	}
	
	public FindLeadPage clickOnEmailInFindLeadPage() {
		
		click(locateElement("xpath", "//span[contains(text(),'Email')]"));
		//driver.findElementByXPath("//span[contains(text(),'Email')]").click();
		
		return this;
	}
	
	
	public FindLeadPage enterEmailAddressInFindLeadPage(String Emailaddr ) {
		
		clearAndType(locateElement("name", "emailAddress"), Emailaddr);
		//driver.findElementByName("emailAddress").sendKeys(Emailaddr);
		
		return this;
	}
	
	public ViewLeadPage captureFirstResultingNameAndSelectInFindLeadPage() {
		
		String name = getElementText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		//WebElement name =driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]");
		//String Name=name;
		firstResultingName=name;
		System.out.println("Your name is:" + firstResultingName);
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		return new ViewLeadPage();
	}
	
	public FindLeadPage clickOnPhoneNoInFindLeadPage() {
		
		click(locateElement("xpath", "//span[contains(text(),'Phone')]"));
		//driver.findElementByXPath("//span[contains(text(),'Phone')]").click();
		
		return this;
	}
	
	public FindLeadPage enterPhoneNoInFindLeadPage(String Phonenumber) {
		
		clearAndType(locateElement("name", "phoneNumber"), Phonenumber);
		//driver.findElementByName("phoneNumber").sendKeys(Phonenumber);
		return this;
	}
	
	
	public FindLeadPage verifyNoRecordsDisplayInFindLeadPage() {
		
		verifyPartialText(locateElement("xpath", "//div[contains(text(),'No records to display')]"), "No records to display");
		/*String norecords=driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText();
		if(norecords.startsWith("No")) {
			System.out.println("Your message is :" + norecords + " and This message confirm the successful deletion");
	    }
		else {
			System.out.println("Your message is :" + norecords + " and This message confirm the successful deletion");
		}*/
		
		return this;
	}
	
	
	public FindLeadPage verifyNoRecordsDisplayInFindLeadPageForMergeLead() {
		
		verifyPartialText(locateElement("xpath", "//div[contains(text(),'No records to display')]"), "No records to display");
		/*String message =driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText();
		if(message.contains("No records to display")) {
			System.out.println("First Lead id result is :"+ message + " and This message confirm the successful merge");
		}
			else{
			System.out.println("First Lead id result is :"+ message + " and This message confirm the unsuccessful merge");
		}
		*/
		return this;
	}
}
