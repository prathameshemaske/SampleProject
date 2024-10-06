package testCases;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;

public class Account_information_page_Test extends BaseTest{
		Account_information_page_Objects myAccountScreen;
		Login_Page_Objective login;
		Account_information_page_Objects accountInformation;
		Account_information_page_Objects addDetails;
		Account_information_page_Objects personalInfo;
		
		@BeforeClass
		public void configuaration() throws InterruptedException, IOException, URISyntaxException {
			AppiumServer();
			myAccountScreen = new Account_information_page_Objects(driver);
			login = new Login_Page_Objective(driver);
			accountInformation = new Account_information_page_Objects(driver);
			addDetails = new Account_information_page_Objects (driver);
		}
		
		@Test(priority = 1)
		public void accountUpdateerror() throws InterruptedException {
			myAccountScreen.clickOnMyAccount();
			login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
			accountInformation.errorAccount();
			Assert.assertTrue(accountInformation.verifyBlankSubmit());
		} 
		
		@Test(priority = 2)
		public void accountInformationUpdate() throws InterruptedException {
			addDetails.personalInfo("Prathamesh", "Maske", "prathamesh@testriq.com", "9082973580", "1993-06-27", "Married");
			login.logoutFromPage();
		}
		
		@AfterClass
		public void Teardown() throws InterruptedException {
			driver.quit();
		}
}


