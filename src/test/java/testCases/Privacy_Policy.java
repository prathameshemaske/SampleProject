package testCases;
import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import Privacy_Policy.Privacy_Policy_Object;

public class Privacy_Policy extends BaseTest{
	
	Account_information_page_Objects myAccountScreen;
	Privacy_Policy_Object scrollPrivacy;
	Login_Page_Objective login;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		scrollPrivacy = new Privacy_Policy_Object(driver);
		login = new Login_Page_Objective(driver);
	}
	
	@Test (priority = 1)
	public void loginUserVerifyPrivacyPolicy() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		scrollPrivacy.scrollPrivacy();
		login.logoutFromPage();
	}
	
	@Test (priority = 2)
	public void verifyPrivacyPolicy() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		scrollPrivacy.scrollPrivacy();
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
}