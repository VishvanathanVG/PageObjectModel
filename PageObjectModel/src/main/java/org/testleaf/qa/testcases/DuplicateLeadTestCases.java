package org.testleaf.qa.testcases;

import org.testleaf.qa.baseAPI.ProjectSpecificMethods;
import org.testleaf.qa.pages.FindLeadPage;
import org.testleaf.qa.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DuplicateLeadTestCases extends ProjectSpecificMethods {

	@BeforeTest
	public void setDuplicateLeadData() {

		excelFileName = "LeadsFullData";
		sheetName = "Duplicate_Lead";
	}

	@Test(dataProvider="fetchLeadsData")
	public void runDuplicateLeadTestCases(String userName, String passWord, String Emailaddr) throws InterruptedException {

		LoginPage loginpage = new LoginPage();
		loginpage.enterUserName(userName).enterPassword(passWord).clickOnLogin().clickOnCRMSFA().clickOnLead()
				.clickOnFindLeads().clickOnEmailInFindLeadPage().enterEmailAddressInFindLeadPage(Emailaddr)
				.clickOnFindLeadBtnFindLeadPage();
					Thread.sleep(2000);
		FindLeadPage findleadpage = new FindLeadPage();
		findleadpage.captureFirstResultingNameAndSelectInFindLeadPage()
				.clickOnDuplicateLeadBtnInViewLeadPage().verifyTitleDuplicateLeadPage()
				.clickOnSubmitBtnInDuplicateLeadPage().verifyDuplicatedLeadNameinViewLeadPage();
	}

}
