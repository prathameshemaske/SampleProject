package testCases;

import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import Terms_and_Conditions.Terms_and_Conditions_Object;

	public class Terms_and_Conditions extends BaseTest{
		
		Account_information_page_Objects myAccountScreen;
		Terms_and_Conditions_Object scrollPrivacy;
		Login_Page_Objective login;
		
		@BeforeClass
		public void configuaration() throws InterruptedException, IOException, URISyntaxException {
			AppiumServer();
			myAccountScreen = new Account_information_page_Objects(driver);
			scrollPrivacy = new Terms_and_Conditions_Object(driver);
			login = new Login_Page_Objective(driver);
		}
		
		@Test (priority = 1)
		public void loggedinUserVerifyTermsandConditions() throws InterruptedException {
			myAccountScreen.clickOnMyAccount();
			login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
			scrollPrivacy.scrollPrivacy();
			login.logoutFromPage();
		}
		
		@Test (priority = 2)
		public void guestUserverifyTermsandConditions() throws InterruptedException {
			myAccountScreen.clickOnMyAccount();
			scrollPrivacy.scrollPrivacy();
		}

		@AfterClass
		public void Teardown() throws InterruptedException {
			driver.quit();
		}
	}

