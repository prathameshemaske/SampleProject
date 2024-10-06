package testCases;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Account_information_page.Account_information_page_Objects;
import Influencer_Registration.Influencer_Registration_Object;
import Login_Page.Login_Page_Objective;

public class Influencer_Registration extends BaseTest {
	
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Influencer_Registration_Object influencer;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		influencer = new Influencer_Registration_Object(driver);
	}
	
	
	@Test (priority = 1)
	public void registerInfluencer() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		influencer.scrollUp("Prathamesh", "Maske", "prathameshmaske007@gmail.com", "1234567890", "www.testriq.com", "Mumbai", "India", "400065", "www.facebook.com", "www.insta.com", "www.twitter.com", "www.youtube.com", "www.linkedin.com", "www.pinterest.com", "10M", "10M", "10M", "10M", "10M", "10M", "TEST Project");
		login.logoutFromPage();
	}
	
	@Test (priority = 2)
	public void registerInfluencerWithoutLogin() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		influencer.scrollUp("Prathamesh", "Maske", "prathameshmaske007@gmail.com", "1234567890", "www.testriq.com", "Mumbai", "India", "400065", "www.facebook.com", "www.insta.com", "www.twitter.com", "www.youtube.com", "www.linkedin.com", "www.pinterest.com", "10M", "10M", "10M", "10M", "10M", "10M", "TEST Project");
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}

}
