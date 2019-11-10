package org.testleaf.qa.testcases;

import org.testleaf.qa.api.base.SeleniumBase;
import org.testleaf.qa.baseAPI.ProjectSpecificMethods;
import org.testleaf.qa.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLeadTestCases extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setCeateLeadData() {
		excelFileName="LeadsFullData";
		sheetName="Create_Lead";
	}
	
	
	@Test(priority=1,dataProvider="fetchLeadsData")
	public void runCreateLeadTestCases(String userName,String passWord,String companyName,String firstName,String lastName, String expectedfirstName) {
		
		LoginPage loginpage = new LoginPage();
		loginpage.enterUserName(userName)
		.enterPassword(passWord)
		.clickOnLogin()
		.clickOnCRMSFA()
		.clickOnLead()
		.clickOnCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadSubmit()
		.verifyViewLead(expectedfirstName)
		.clickOnMyHome();
		
		
	}
	
	
}
