package testCases;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Designers_Tab.Designers_Tab_Page_Object;
import Login_Page.Login_Page_Objective;

public class Designers_Tab extends BaseTest{
	
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Designers_Tab_Page_Object search;
	
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		search = new Designers_Tab_Page_Object (driver);
		}

	@Test(priority = 1)
	public void verifyLoggedinUserSearchProductbyBrand() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.brandsSearchbyName("Puma");
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 2)
	public void verifyGuestUserSearchProductbyBrand() throws InterruptedException {
		search.brandsSearchbyName("Puma");
	}
	
	@Test(priority = 3)
	public void verifyLoggedinUserSelectProductFromList() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.selectBrandFromList();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 4)
	public void verifyGuestUserSelectProductFromList() throws InterruptedException {
		search.selectBrandFromList();
	}
	
	@Test(priority = 5)
	public void verifyLoggedinUserScrollProductList() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.selectBrandByScrollingBrandList();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 6)
	public void verifyGuestUserScrollProductList() throws InterruptedException {
		search.selectBrandByScrollingBrandList();
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
	
}
