package testCases;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import Secure_Shipping.Secure_Shipping_Object;

public class Secure_Shopping extends BaseTest{
	
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Secure_Shipping_Object shopping;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		shopping = new Secure_Shipping_Object(driver);
	}

	@Test(priority = 1)
	public void loggedinUserShoppingMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		shopping.secureShoppingMenu();
		login.logoutFromPage();
	}
	
	@Test(priority = 2)
	public void guestUsershoppingMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		shopping.secureShoppingMenu();
		
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
	
}
