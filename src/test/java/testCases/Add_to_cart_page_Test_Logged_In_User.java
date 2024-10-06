package testCases;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Home_Screen_Object.Home_Screen_Objects;
import Login_Page.Login_Page_Objective;
import My_cart_Page.My_cart_page_Objects;

public class Add_to_cart_page_Test_Logged_In_User extends BaseTest{
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Home_Screen_Objects homescreen;
	My_cart_page_Objects cartPage;
	My_cart_page_Objects remove;

	@BeforeClass
	public void ConfigureAppium() throws IOException, InterruptedException, Exception {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		homescreen = new Home_Screen_Objects(driver);
		cartPage = new My_cart_page_Objects(driver);
		remove = new My_cart_page_Objects (driver);
	}
	
	@Test(priority = 1)
	public void loggedinuser() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		cartPage.logout();
	}

	@Test(priority = 2)
	public void guestverifyAddProductToCart() throws InterruptedException {
		cartPage.addFirstProductOfWomenCategory();
	}

	@Test(priority = 3)
	public void removeProductfromCart() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		remove.removeFromcart();
		cartPage.logout();
	}
	
	@Test(priority = 4)
	public void guestremoveProductfromCart() throws InterruptedException {
		cartPage.addFirstProductOfWomenCategory();
		remove.removeFromcart();
		cartPage.logout();
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
//		driver.close();
		driver.quit();
	}
}
