package org.testleaf.qa.pages;

import java.awt.Graphics;
import java.awt.Shape;

import javax.swing.text.BadLocationException;
import javax.swing.text.View;
import javax.swing.text.Position.Bias;

import org.openqa.selenium.WebElement;
import org.testleaf.qa.api.base.SeleniumBase;
import org.testleaf.qa.baseAPI.ProjectSpecificMethods;

public class CreateLeadPage extends SeleniumBase {

	
	public CreateLeadPage enterCompanyName(String companyName) {
	/*	WebElement ele =locateElement("id", "createLeadForm_companyName");
		clearAndType(ele, companyName);*/
		clearAndType(locateElement("id", "createLeadForm_companyName"), companyName);
	//	driver.findElementById("createLeadForm_companyName").sendKeys(companyName);

		return this;
	}

	
	public CreateLeadPage enterFirstName(String firstname) {
		Firstname = firstname;
		clearAndType(locateElement("id", "createLeadForm_firstName"), firstname);
		//driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
		return this;
	}

	public CreateLeadPage enterLastName(String lastName) {
		
		clearAndType(locateElement("id", "createLeadForm_lastName"), lastName);
		
		//driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
		return this;

	}

	public ViewLeadPage clickCreateLeadSubmit() {
	
		click(locateElement("name", "submitButton"));
		//driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
	}
}