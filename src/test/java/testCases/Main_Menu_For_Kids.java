package testCases;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import Main_Menu.Main_Menu_Objects;

public class Main_Menu_For_Kids extends BaseTest {
	
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Main_Menu_Objects mainMenu;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		mainMenu = new Main_Menu_Objects(driver);
		}

	@Test(priority = 1)
	public void verifyboysAccessoriesOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifyboysAccessoriesOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 2)
	public void guestverifyboysAccessoriesOption() throws InterruptedException {
		mainMenu.verifyboysAccessoriesOption();
	}
	
	@Test(priority = 3)
	public void verifyboysShoesOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifyboysShoesOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 4)
	public void guestverifyboysShoesOption() throws InterruptedException {
		mainMenu.verifyboysShoesOption();
	}
	
	@Test(priority = 5)
	public void verifyboysClothingOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifyboysClothingOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 6)
	public void guestverifyboysClothingOption() throws InterruptedException {
		mainMenu.verifyboysClothingOption();
	}
	
	@Test(priority = 7)
	public void verifygirlsAccessoriesOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifygirlsAccessoriesOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 8)
	public void guestverifygirlsAccessoriesOption() throws InterruptedException {
		mainMenu.verifygirlsAccessoriesOption();
	}
	
	@Test(priority = 9)
	public void verifygirlsShoesOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifygirlsShoesOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 10)
	public void guestverifygirlsShoesOption() throws InterruptedException {
		mainMenu.verifygirlsShoesOption();
	}
	
	@Test(priority = 11)
	public void verifygirlsClothingOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifygirlsClothingOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 12)
	public void guestverifygirlsClothingOption() throws InterruptedException {
		mainMenu.verifygirlsClothingOption();
	}
		
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
}
