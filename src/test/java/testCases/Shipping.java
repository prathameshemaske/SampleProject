package testCases;

import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import Shopping.Shipping_Object;

public class Shipping extends BaseTest{
	
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Shipping_Object shipping;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		shipping = new Shipping_Object(driver);
	}
	
	@Test(priority = 1)
	public void loggedinUserShoppingMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		shipping.shippingMenu();
		shipping.shippingMenucontent();
		login.logoutFromPage();
	}
	
	@Test(priority = 2)
	public void guestUsershippingMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		shipping.shippingMenu();
		shipping.shippingMenucontent();
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
}
