package testCases;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import Main_Menu.Main_Menu_Objects;

public class Main_Menu_For_Woman extends BaseTest {
	
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
	
//	Accessories Menu Test cases
	@Test(priority = 1)
	public void verifybeltOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifybeltOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 2)
	public void guestAccessoriesMenu() throws InterruptedException {
		mainMenu.verifybeltOption();
	}

	@Test(priority = 3)
	public void verifywalletsandCardholdersOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifywalletsandCardholdersOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 4)
	public void guestwalletsandCardholdersOption() throws InterruptedException {
		mainMenu.verifywalletsandCardholdersOption();
	}
	
	@Test(priority = 5)
	public void verifycosmeticOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifycosmeticOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 6)
	public void guestverifycosmeticOption() throws InterruptedException {
		mainMenu.verifycosmeticOption();
	}
	
//	Bag Menu Test cases
	
	@Test(priority = 7)
	public void verifybackpackOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifybackpackOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 8)
	public void guestverifybackpackOption() throws InterruptedException {
		mainMenu.verifybackpackOption();
	}
	
	@Test(priority = 9)
	public void verifyclutchesandSlingsOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifycosmeticOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 10)
	public void guestverifyclutchesandSlingsOption() throws InterruptedException {
		mainMenu.verifycosmeticOption();
	}
	
	@Test(priority = 11)
	public void verifycrossbodyBagOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifycosmeticOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 12)
	public void guestverifycrossbodyBagOption() throws InterruptedException {
		mainMenu.verifycosmeticOption();
	}
	
//	Clothing Menu Test cases
	
	@Test(priority = 13)
	public void verifycoatandKacketsOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifycoatandKacketsOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 14)
	public void guestverifycoatandKacketsOption() throws InterruptedException {
		mainMenu.verifycoatandKacketsOption();
	}	
	
	@Test(priority = 15)
	public void verifydressesOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifydressesOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 16)
	public void guestverifydressesOption() throws InterruptedException {
		mainMenu.verifydressesOption();
	}
	
	@Test(priority = 17)
	public void verifytshirtOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifytshirtOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 18)
	public void guestverifytshirtOption() throws InterruptedException {
		mainMenu.verifytshirtOption();
	}	
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
}
