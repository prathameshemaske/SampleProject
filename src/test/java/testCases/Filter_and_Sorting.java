package testCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Account_information_page.Account_information_page_Objects;
import Home_Screen_Object.Home_Screen_Objects;
import Login_Page.Login_Page_Objective;
import My_cart_Page.My_cart_page_Objects;

public class Filter_and_Sorting extends BaseTest{
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

	//Sorting test cases with "NewArrivalOptions" & "PriceLowtoHighOptions" options
	@Test(priority = 1)
	public void sortingByNewArrivalOptions() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.sortProductsnewArrivalOptions();
		cartPage.logout();
	}
	
	@Test(priority = 2)
	public void guestUsersortingByNewArrivalOptions() throws InterruptedException {
		cartPage.sortProductsnewArrivalOptions();
	}

	@Test(priority = 3)
	public void sortingByPriceLowtoHighOptions() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.sortProductsnewpriceLowtoHighOptions();
		cartPage.logout();
	}
	
	@Test(priority = 4)
	public void guestUsersortingByPriceLowtoHighOptions() throws InterruptedException {
		cartPage.sortProductsnewpriceLowtoHighOptions();
	}
	
	@Test(priority = 5)
	public void sortingByPricehighestfirstOptions() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.sortPricehighestfirst();
		cartPage.logout();
	}
	
//	Filter Test cases with accessories option
	@Test(priority = 6)
	public void filterbyaccessories() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.filterProductsbyaccessories();
		cartPage.logout();
	}
	
	@Test(priority = 7)
	public void guestUserfilterbyaccessories() throws InterruptedException {
		cartPage.filterProductsbyaccessories();
	}
	
	@Test (priority = 8)
	public void filterbyBrands() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.filterProductsbyBrands();
		cartPage.brands();
		cartPage.logout();
	}
	
	@Test (priority = 9)
	public void guestUserFilterbyBrands() throws InterruptedException {
		cartPage.filterProductsbyBrands();
		cartPage.brands();
	}
	
//	Filter By Color
	@Test (priority = 10)
	public void filterbyColor() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.filterbyProductsColor();
		cartPage.logout();
	}
	
	@Test (priority = 11)
	public void guestUserfilterbyColor() throws InterruptedException {
		cartPage.filterbyProductsColor();
	}
	
//	Filter By Price
	@Test(priority = 12)
	public void filterbyPrice() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.filterbyProductsPrice();
		cartPage.logout();
	}
	
	@Test(priority = 13)
	public void guestfilterbyPrice() throws InterruptedException {
		cartPage.filterbyProductsPrice();
	}
	
	@Test(priority = 14)
	public void filterbySize() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.filterbyProductsSize();
		cartPage.logout();
	}
	
	@Test(priority = 15)
	public void guestfilterbySize() throws InterruptedException {
		cartPage.filterbyProductsSize();
	}
	
	@Test(priority = 16)
	public void sortByrelevanceOptions() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.sortByrelevance();
		cartPage.logout();
	}
	
	@Test(priority = 17)
	public void guestsortByrelevanceOptions() throws InterruptedException {
		cartPage.sortByrelevance();
	}
	
	@Test(priority = 18)
	public void sortBydiscountHighFirstOptions() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.sortdiscountHighFirstOptions();
		cartPage.logout();
	}
	
	@Test(priority = 19)
	public void guestsortBydiscountHighFirstOptions() throws InterruptedException {
		cartPage.sortdiscountHighFirstOptions();
	}
	
	@Test(priority = 20)
	public void sortBydiscountlowFirstOptions() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		cartPage.sortdiscountlowFirstOptions();
		cartPage.logout();
	}
	
	@Test(priority = 21)
	public void guestsortBydiscountlowFirstOptions() throws InterruptedException {
		cartPage.sortdiscountlowFirstOptions();
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
}
