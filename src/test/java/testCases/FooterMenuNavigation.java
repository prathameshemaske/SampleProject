package testCases;

import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Account_information_page.Account_information_page_Objects;
import Categories.Categories_Objective;
import Home_Screen_Object.Home_Screen_Objects;
import Login_Page.Login_Page_Objective;
import My_cart_Page.My_cart_page_Objects;
import Search_result_page.Search_result_page_Objects;

public class FooterMenuNavigation extends BaseTest{
	Categories_Objective categoriesMenu;
	Search_result_page_Objects searchMenu;
	Account_information_page_Objects myAccountScreen;
	My_cart_page_Objects myCart;
	Home_Screen_Objects HomeScreen;
	Login_Page_Objective login;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		categoriesMenu = new Categories_Objective (driver);
		searchMenu = new Search_result_page_Objects (driver);
		HomeScreen = new Home_Screen_Objects (driver);
		myCart = new My_cart_page_Objects (driver);
		login = new Login_Page_Objective(driver);
	}
	
	@Test
	public void guestUserNavigations() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		categoriesMenu.categoriesOptions();
		searchMenu.searchOptions();
		myCart.myCartScreen();
	}
	
	@Test
	public void loggedinUserNavigations() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		categoriesMenu.categoriesOptions();
		searchMenu.searchOptions();
		myCart.myCartScreen();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}

}
