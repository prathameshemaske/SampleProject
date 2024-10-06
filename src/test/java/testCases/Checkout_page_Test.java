package testCases;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Account_information_page.Account_information_page_Objects;
import Address_book_page.Address_book_page_Object;
import Checkout_page.Checkout_page_Object;
import Login_Page.Login_Page_Objective;
import My_cart_Page.My_cart_page_Objects;
import My_coupons_page.My_coupons_page_Objects;

public class Checkout_page_Test extends BaseTest{

	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	My_cart_page_Objects cartPage;
	Checkout_page_Object checkout;
	My_coupons_page_Objects coupon;
	Address_book_page_Object adAdd;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		cartPage = new My_cart_page_Objects(driver);
		checkout = new Checkout_page_Object (driver);
		coupon = new My_coupons_page_Objects (driver);
		adAdd = new Address_book_page_Object (driver);
	}
	@Test (priority = 1)
	public void checkOutFreeShipping() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		checkout.checkoutProcessFreeShipping("TEST ORDER PLACE");
		Assert.assertTrue(checkout.verifyOrderPlaceSuccessful());
		checkout.completeOrder();
		login.logoutFromPage();
	}
	
	@Test (priority = 2)
	public void checkOutCardPayement() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		checkout.checkoutProcessCardsPayment("TEST ORDER PLACE");
		Assert.assertTrue(checkout.verifyOrderPlaceSuccessful());
		checkout.completeOrder();
		login.logoutFromPage();
	}
	
	@Test (priority = 3)
	public void checkOutStanderdShipping() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		checkout.checkoutProcesswithStanderdShipping("TEST ORDER PLACE");
		Assert.assertTrue(checkout.verifyOrderPlaceSuccessful());
		checkout.completeOrder();
		login.logoutFromPage();
	}
	@Test (priority = 4)
	public void checkOutadyenStoredPaymentt() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		checkout.checkoutProcessadyenStoredPayment("TEST ORDER PLACE");
		Assert.assertTrue(checkout.verifyOrderPlaceSuccessful());
		checkout.completeOrder();
		login.logoutFromPage();
	}
	
	@Test (priority = 5)
	public void checkOutCheckMoneyOrder() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		checkout.checkoutProcessCheckMoneyOrder("TEST ORDER PLACE");
		Assert.assertTrue(checkout.verifyOrderPlaceSuccessful());
		checkout.completeOrder();
		login.logoutFromPage();
	}
	
	@Test (priority = 6)
	public void checkOutCardPayment() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		checkout.checkoutProcessCardsPayment("TEST ORDER PLACE");
		Assert.assertTrue(checkout.verifyOrderPlaceSuccessful());
		checkout.completeOrder();
		login.logoutFromPage();
	}
	
	@Test (priority = 7)
	public void checkOutError() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		checkout.errorWhileCheckoutProcess("TEST ORDER PLACE");
		Assert.assertTrue(checkout.verifyErrorWhileOrderPlace());
		login.logoutFromPage();
	}

//	Reporting issue for this test case
//	@Test (priority = 8)
//	public void verifyWithoutLogincheckOut() throws InterruptedException {
//		cartPage.addFirstProductOfWomenCategory();
//		checkout.guestUsercheckout();
//	}
	
	@Test (priority = 9)
	public void apply10PercentCoupon() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		coupon.applyCoupon("OCT10");
		checkout.checkoutWithCoupon();
		Assert.assertTrue(checkout.verifyOrderPlaceSuccessful());
		checkout.completeOrder();
		login.logoutFromPage();
	}
	
//	Reporting issue for this test case
//	@Test (priority = 10)
//	public void guestApplyCoupon() throws Exception {
//		cartPage.addFirstProductOfWomenCategory();
//		coupon.applyCoupon("TEST30AV");
//		adAdd.addguestUserAddress("abc@testriq.com", "Prathamesh", "Maske", "TEST 1", "TEST 2", "TEST 3", "TEST 4", "123456", "9082973580");
//	}
	
	@Test (priority = 11)
	public void applyInvladCoupon() throws Exception {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		coupon.applyInvladCoupon("TEST 30AV");
		checkout.checkoutWithCoupon();
		Assert.assertTrue(checkout.verifyOrderPlaceSuccessful());
		checkout.completeOrder();
		login.logoutFromPage();
	}
//	Reporting issue for this test case	
//	@Test (priority = 12)
//	public void guestapplyInvladCoupon() throws Exception {
//		cartPage.addFirstProductOfWomenCategory();
//		coupon.applyInvladCoupon("TEST 30AV");
//		adAdd.addguestUserAddress("abc@testriq.com", "Prathamesh", "Maske", "TEST 1", "TEST 2", "TEST 3", "TEST 4", "123456", "9082973580");
//	}
	
//	Reporting issue for this test case
//	@Test (priority = 13)
//	public void guestapplyExpiredCoupon() throws Exception {
//		cartPage.addFirstProductOfWomenCategory();
//		coupon.applyExpiredCoupon("Expired");
//		adAdd.addguestUserAddress("abc@testriq.com", "Prathamesh", "Maske", "TEST 1", "TEST 2", "TEST 3", "TEST 4", "123456", "9082973580");
//	}
	
	@Test (priority = 14)
	public void applyExpiredCoupon() throws Exception {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		coupon.applyExpiredCoupon("Expired");
		checkout.checkoutWithCoupon();
		Assert.assertTrue(checkout.verifyOrderPlaceSuccessful());
		checkout.completeOrder();
		login.logoutFromPage();
	}
	
	@Test (priority = 15)
	public void checkOutwithNewAddress() throws Exception {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		checkout.checkoutProcesswithAddNewShippingAdd();
		adAdd.NewAddressWhileCheckout("Prathamesh", "Maske", "9082973580", "TEST 1", "TEST 2", "TEST 3", "TEST 4", "123456", "India");
		checkout.checkoutProcesswithNewShippingAdd("TEST ORDER PLACE");
		Assert.assertTrue(checkout.verifyOrderPlaceSuccessful());
		checkout.completeOrder();
		login.logoutFromPage();
	}
	
	@Test (priority = 16)
	public void apply20PercentCoupon() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		coupon.applyCoupon("OCT20");
		checkout.checkoutWithCoupon();
		Assert.assertTrue(checkout.verifyOrderPlaceSuccessful());
		checkout.completeOrder();
		login.logoutFromPage();
	}
	
	@Test (priority = 17)
	public void apply50PercentCoupon() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.addFirstProductOfWomenCategory();
		coupon.applyCoupon("OCT50");
		checkout.checkoutWithCoupon();
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
