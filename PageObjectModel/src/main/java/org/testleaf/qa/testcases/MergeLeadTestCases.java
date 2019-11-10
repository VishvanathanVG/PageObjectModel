package org.testleaf.qa.testcases;

import org.testleaf.qa.baseAPI.ProjectSpecificMethods;
import org.testleaf.qa.pages.LoginPage;
import org.testleaf.qa.pages.MergeLeadPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MergeLeadTestCases extends ProjectSpecificMethods{

	@BeforeTest
	public void setMergeLeadData() {
		
		excelFileName = "LeadsFullData";
		sheetName = "Merge_Lead";
	}
	
	@Test(dataProvider="fetchLeadsData")
	public void runMergeLeadTestCases(String userName,String passWord,String Firstname ,String Lastname) throws InterruptedException {
		
		LoginPage loginpage = new LoginPage();
		loginpage.enterUserName(userName).enterPassword(passWord).clickOnLogin().clickOnCRMSFA().clickOnLead().clickOnMergeLead()
		.clickOnFromLeadIcon(Firstname).clickOnToLeadIcon(Lastname);
		Thread.sleep(2000);
		MergeLeadPage mergelead = new MergeLeadPage();
		mergelead.clickOnMergeLeadBtnInMergeLeadPage().verifyMergeLeadId().clickOnFindLeadLink()
		.enterLeadIdInFindLeadPage().clickOnFindLeadBtnFindLeadPage().verifyNoRecordsDisplayInFindLeadPageForMergeLead();
		
	}
	
}
