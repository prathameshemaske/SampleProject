package testCases;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import Search_result_page.Search_result_page_Objects;

public class Search_result_page_Test extends BaseTest{
	
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Search_result_page_Objects search;
	
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		search = new Search_result_page_Objects (driver);
		}

	@Test(priority = 1)
	public void verifyLoggedinUserSearchProduct() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchProduct("demo");
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 2)
	public void verifyGuestUserSearchProduct() throws InterruptedException {
		search.searchProduct("demo");
	}
	
	@Test(priority = 3)
	public void verifyLoggedinUserbyWomenAccessories() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchProductbyWomenAccessories();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 4)
	public void verifyGuestUserbyWomenAccessories() throws InterruptedException {
		search.searchProductbyWomenAccessories();
	}
	
	@Test(priority = 5)
	public void verifyLoggedinUserbyWomenMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchProductbyWomen();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 6)
	public void verifyGuestUserbyWomenMenu() throws InterruptedException {
		search.searchProductbyWomen();
	}
	
	@Test(priority = 7)
	public void verifyLoggedinUserbyMenMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchProductbyMen();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 8)
	public void verifyGuestUserbyMenMenu() throws InterruptedException {
		search.searchProductbyMen();
	}
	
	@Test(priority = 9)
	public void verifyLoggedinUserbyMenShoeMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchProductbyMenShoes();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 10)
	public void verifyGuestUserbyMenShoeMenu() throws InterruptedException {
		search.searchProductbyMenShoes();
	}
	
	@Test(priority = 11)
	public void verifyLoggedinUserbykidsBoyMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchKidsProdutsbyBoys();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 12)
	public void verifyGuestUserbykidsBoyMenu() throws InterruptedException {
		search.searchKidsProdutsbyBoys();
	}
	
	@Test(priority = 13)
	public void verifyLoggedinUserbykidsGirlsMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchKidsProdutsbyGirls();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 14)
	public void verifyGuestUserbykidsGirlsMenu() throws InterruptedException {
		search.searchKidsProdutsbyGirls();
	}
	
	@Test(priority = 15)
	public void verifyLoggedinUserbySalesMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchSalesProdutsby();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 16)
	public void verifyGuestUserbySalesMenu() throws InterruptedException {
		search.searchSalesProdutsby();
	}
	
	@Test(priority = 17)
	public void verifyLoggedinUserbySelctCategoryMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchselectCategoryProduts();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 18)
	public void verifyGuestUserbySelctCategoryMenu() throws InterruptedException {
		search.searchselectCategoryProduts();
	}
	
	@Test(priority = 19)
	public void verifyLoggedinUserbyCharityMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchCharityProduts();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 20)
	public void verifyGuestUserbyCharityMenu() throws InterruptedException {
		search.searchCharityProduts();
	}
	
	@Test(priority = 21)
	public void verifyLoggedinUserbyHeelsMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchHeelsProduts();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 22)
	public void verifyGuestUserbyHeelsMenu() throws InterruptedException {
		search.searchHeelsProduts();
	}
	
	@Test(priority = 23)
	public void verifyLoggedinUserbyPreownedMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchPreOwnedProduts();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 24)
	public void verifyGuestUserbyPreownedMenu() throws InterruptedException {
		search.searchPreOwnedProduts();
	}
	
	@Test(priority = 25)
	public void verifyLoggedinUserbyToteBagsMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchToteBagProduts();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 26)
	public void verifyGuestUserbyToteBagsMenu() throws InterruptedException {
		search.searchToteBagProduts();
	}
	
	@Test(priority = 27)
	public void verifyLoggedinUserbySatchelMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchSatchelProduts();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 28)
	public void verifyGuestUserbySatchelMenu() throws InterruptedException {
		search.searchSatchelProduts();
	}
	
	@Test(priority = 29)
	public void verifyLoggedinUserbyTravelBagMenu() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchTravelBagProduts();
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test(priority = 30)
	public void verifyGuestUserbyTravelBagMenu() throws InterruptedException {
		search.searchTravelBagProduts();
	}

	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
}
