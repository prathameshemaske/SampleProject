package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Checkout_page.Checkout_page_Object;
import Home_Screen_Object.Home_Screen_Objects;
import Login_Page.Login_Page_Objective;
import My_wishlist_page.My_wishlist_page_Objects;

public class My_wishlist_page_Test extends BaseTest{
	
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Home_Screen_Objects home;
	My_wishlist_page_Objects wishList;
	Checkout_page_Object checkout;
	
	
	@BeforeClass
	public void ConfigureAppium() throws IOException, InterruptedException, Exception {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		wishList = new My_wishlist_page_Objects (driver);
		checkout = new Checkout_page_Object (driver);
		
	}
	@Test(priority = 1)
	public void verifyLoggedinUserAddProducttoWishList() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		wishList.addItem();
	}
	
	@Test(priority = 2)
	public void verifyRemoveProductfromWishList() throws InterruptedException {
		wishList.removeItem();
		login.logoutFromPage();
	}

	@Test(priority = 3)
	public void verifyGuestUserAddProducttoWishList() throws InterruptedException {
		wishList.guestAddProduct();
		login.existingLogin("prathamesh@testriq.com", "Prathamesh*141#");
		wishList.addItem();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 3)
	public void verifyCheckoutwithWishListProduct() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		wishList.addItem();
		wishList.proceedToCheckOut();
		wishList.checkoutProcessFreeShipping("TEST ORDER PLACE");
		Assert.assertTrue(checkout.verifyOrderPlaceSuccessful());
		checkout.completeOrder();
		login.logoutFromPage();
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
//		driver.close();
		driver.quit();
	}

}
