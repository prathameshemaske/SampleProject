package testCases;

import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Affiliate_Program.Affiliate_Program_Object;
import Login_Page.Login_Page_Objective;

public class Affiliate_Program_Test extends BaseTest{

	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Affiliate_Program_Object affiliate;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		affiliate = new Affiliate_Program_Object(driver);
	}

	@Test(priority = 1)
	public void affiliateProgram() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		affiliate.scrollUp("Prathamesh", "Maske", "prathamesh@testriq.com", "9082973580", "TEST", "TEST1", "123456", "Mumbai");
		affiliate.logoutFromPage();
	}

	@Test (priority = 2)
	public void verifyaffiliateGuestProgram() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		affiliate.scrollUp("Prathamesh", "Maske", "prathamesh@testriq.com", "9082973580", "TEST", "TEST1", "123456", "Mumbai");
	}
	
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
}

