package org.testleaf.qa.pages;

import org.openqa.selenium.WebElement;
import org.testleaf.qa.api.base.SeleniumBase;
import org.testleaf.qa.baseAPI.ProjectSpecificMethods;

public class ViewLeadPage extends SeleniumBase {

	public ViewLeadPage verifyViewLead(String expectedFirstName) {

		verifyPartialText(locateElement("id", "viewLead_firstName_sp"), expectedFirstName);
		/*
		 * String firstName =driver.findElementById("viewLead_firstName_sp").getText();
		 * if(firstName.contains(expectedFirstName)) {
		 * System.out.println("My first name is :" + firstName +
		 * " and firstname is correct"); } else {
		 * System.out.println("My first name is :" + firstName +
		 * " and firstname is incorrect"); }
		 */

		return this;

	}

	public MyHomePage clickOnMyHome() {

		click(locateElement("link", "My Home"));
		// driver.findElementByLinkText("My Home").click();
		return new MyHomePage();
	}

	public EditLeadPage clickOnEditInFindLeadPage() {
		click(locateElement("xpath", "//a[contains(text(),'Edit')]"));
		// driver.findElementByXPath("//a[contains(text(),'Edit')]").click();
		return new EditLeadPage();
	}

	public ViewLeadPage verifyEditedLeadinViewLeadPage(String ExpectCompanyName) {

		verifyPartialText(locateElement("id", "viewLead_companyName_sp"), ExpectCompanyName);
		/*
		 * String companyNameUp =
		 * driver.findElementById("viewLead_companyName_sp").getText(); if
		 * (companyNameUp.contains(ExpectCompanyName)) {
		 * System.out.println("Your company name is " + companyNameUp +
		 * " and it is correct"); } else { System.out.println("Your company name is " +
		 * companyNameUp + " and it is incorrect"); }
		 */

		return this;
	}

	public DuplicateLeadPage clickOnDuplicateLeadBtnInViewLeadPage() {

		click(locateElement("xpath", "//a[contains(text(),'Duplicate Lead')]"));
		// driver.findElementByXPath("//a[contains(text(),'Duplicate Lead')]").click();

		return new DuplicateLeadPage();
	}

	public MyLeadPage clickOnDeleteLeadBtnInViewLeadPage() {

		click(locateElement("xpath", "//a[text() ='Delete']"));
		// driver.findElementByXPath("//a[text() ='Delete']").click();

		return new MyLeadPage();
	}

	public ViewLeadPage verifyDuplicatedLeadNameinViewLeadPage() {

		verifyPartialText(locateElement("id", "viewLead_firstName_sp"), firstResultingName);
		//System.out.println("DuplicatedLeadNameinViewLeadPage :" + firstName);
		System.out.println("verifyDuplicatedLeadNameinViewLeadPage :" + firstResultingName);
		/*
		 * String firstName = driver.findElementById("viewLead_firstName_sp").getText();
		 */

		/*
		 * if (firstName.contains(firstResultingName)) {
		 * System.out.println("My first name is :" + firstName +
		 * " and firstname is correct"); } else {
		 * System.out.println("My first name is :" + firstName +
		 * " and firstname is incorrect"); }
		 */
		return this;

	}

	public ViewLeadPage verifyMergeLeadId() {

		verifyPartialText(locateElement("id", "viewLead_companyName_sp"), MergerID);
		/*WebElement ID = driver.findElementById("viewLead_companyName_sp");
		String mergeViewID = ID.getText();
		if (mergeViewID.contains(MergerID)) {
			System.out.println("your id is correct and ID is: " + mergeViewID);
		} else {
			System.out.println("your id is Incorrect and ID is: " + mergeViewID);
		}*/

		return this;
	}

	public FindLeadPage clickOnFindLeadLink() {

		click(locateElement("link", "Find Leads"));
		//driver.findElementByLinkText("Find Leads").click();

		return new FindLeadPage();
	}

}
