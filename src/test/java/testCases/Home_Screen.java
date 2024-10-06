package testCases;

import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Home_Screen_Object.Home_Screen_Objects;
import Login_Page.Login_Page_Objective;

public class Home_Screen extends BaseTest {
	
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Home_Screen_Objects home;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		home = new Home_Screen_Objects(driver);
		}

	@Test(priority = 1)
	public void homeScreenWomenList() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		home.homeScreen();
		home.homeScreenWomenList();
	}
	
	@Test(priority = 2)
	public void guestHomeScreenWomenList() throws InterruptedException {
		home.homeScreenWomenList();
	}
	
	@Test(priority = 3)
	public void homeScreenMenList() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		home.homeScreen();
		home.homeScreenMenList();
	}
	
	@Test(priority = 4)
	public void guestHomeScreenMenList() throws InterruptedException {
		home.homeScreenMenList();
	}
	
	@Test(priority = 5)
	public void homeScreenKidsList() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		home.homeScreen();
		home.homeScreenKidsList();
	}
	
	@Test(priority = 6)
	public void guestHomeScreenKidsList() throws InterruptedException {
		home.homeScreenKidsList();
	}
	
	@Test(priority = 7)
	public void homeScreenSalesList() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		home.homeScreen();
		home.homeScreenSalesList();
	}
	
	@Test(priority = 8)
	public void guestHomeScreenSalesList() throws InterruptedException {
		home.homeScreenSalesList();
	}
	
	@Test(priority = 9)
	public void homeScreenTravelBagsList() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		home.homeScreen();
		home.homeScreenTravelBagsList();
	}
	
	@Test(priority = 10)
	public void guestHomeScreenTravelBagsList() throws InterruptedException {
		home.homeScreenTravelBagsList();
	}
	
	@Test(priority = 11)
	public void homeScreenMostPopularList() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		home.homeScreen();
		home.homeScreenMostPopularList();
	}
	
	@Test(priority = 12)
	public void guestHomeScreenMostPopularList() throws InterruptedException {
		home.homeScreenMostPopularList();
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
}
