package org.testleaf.qa.testcases;

import org.testleaf.qa.api.base.SeleniumBase;
import org.testleaf.qa.baseAPI.ProjectSpecificMethods;
import org.testleaf.qa.pages.FindLeadPage;
import org.testleaf.qa.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLeadTestCases extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setEditLeadData() {
		excelFileName="LeadsFullData";
		sheetName="Edit_Lead";
	}
	
	@Test(priority=2,dataProvider="fetchLeadsData")
	public void runEditLeadTestCases(String userName, String passWord, String firstname, String companyname, String ExpectedCompanyName) throws InterruptedException {
		
		LoginPage loginpage = new LoginPage();
		loginpage.enterUserName(userName)
		.enterPassword(passWord)
		.clickOnLogin().clickOnCRMSFA().clickOnLead().clickOnFindLeads().enterFirstNameinFindLeadPage(firstname)
		.clickOnFindLeadBtnFindLeadPage();
		Thread.sleep(2000);
		FindLeadPage findleadpage = new FindLeadPage();
		findleadpage.selectFirstListedFindLeadsData().clickOnEditInFindLeadPage()
		.enterChangeCompanyNameInEditLeadPage(companyname).clickOnUpdateBtnInEditLeadPage().verifyEditedLeadinViewLeadPage(ExpectedCompanyName);
		
		
	}
	

}
