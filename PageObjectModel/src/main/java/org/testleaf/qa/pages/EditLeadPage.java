package org.testleaf.qa.pages;

import org.openqa.selenium.WebElement;
import org.testleaf.qa.baseAPI.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{

	public EditLeadPage enterChangeCompanyNameInEditLeadPage(String companyname) {
		CompanyNameUpdated =companyname;
		clearAndType(locateElement("id", "updateLeadForm_companyName"), companyname);
		/*WebElement companyName = driver.findElementById("updateLeadForm_companyName");
		companyName.clear();
		companyName.sendKeys(companyname);*/
		return this;
	}
	
	public ViewLeadPage clickOnUpdateBtnInEditLeadPage() {
		click(locateElement("name", "submitButton"));
		//driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
	}
	
}
