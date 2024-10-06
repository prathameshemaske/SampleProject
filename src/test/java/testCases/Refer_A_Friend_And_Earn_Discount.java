package testCases;

import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import Refer_A_Friend_And_Earn_Discount.Refer_A_Friend_And_Earn_Discount_Object;

public class Refer_A_Friend_And_Earn_Discount extends BaseTest{
	
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Refer_A_Friend_And_Earn_Discount_Object refer;

	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		refer = new Refer_A_Friend_And_Earn_Discount_Object(driver);
	}
	
	@Test(priority = 1)
	public void referFriend() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		refer.scrollUp("Prathamesh", "prathamesh@testriq.com", "9082973580", "TEST", "prathamesh.maske@testriq.com", "1234567890");
		refer.logoutFromPage();
	}
	
	
	@Test(priority = 2)
	public void beforLoginReferFriend() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		refer.scrollUp("Prathamesh", "prathamesh@testriq.com", "9082973580", "TEST", "prathamesh.maske@testriq.com", "1234567890");
	}
		
		
		@AfterClass
		public void Teardown() throws InterruptedException {
			driver.quit();
		}
}

