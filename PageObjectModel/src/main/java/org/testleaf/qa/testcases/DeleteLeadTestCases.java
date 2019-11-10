package org.testleaf.qa.testcases;

import org.testleaf.qa.baseAPI.ProjectSpecificMethods;
import org.testleaf.qa.pages.FindLeadPage;
import org.testleaf.qa.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteLeadTestCases extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setDeleteLeadData() {
		
		excelFileName = "LeadsFullData";
		sheetName = "Delete_Lead";
	}
	
	@Test(dataProvider="fetchLeadsData")
	public void runDeleteLeadTestCases(String userName,String passWord,String PhoneNumber ) throws InterruptedException {
		
		LoginPage loginpage = new LoginPage();
		loginpage.enterUserName(userName).enterPassword(passWord).clickOnLogin().clickOnCRMSFA()
		.clickOnLead().clickOnFindLeads().clickOnPhoneNoInFindLeadPage().enterPhoneNoInFindLeadPage(PhoneNumber).clickOnFindLeadBtnFindLeadPage();
		Thread.sleep(2000);
		FindLeadPage findleadpage = new FindLeadPage();
		findleadpage.selectFirstListedFindLeadsData().clickOnDeleteLeadBtnInViewLeadPage().clickOnFindLeads()
		.enterLeadIdInFindLeadPage().clickOnFindLeadBtnFindLeadPage().verifyNoRecordsDisplayInFindLeadPage();
		
		
	}
	
}
