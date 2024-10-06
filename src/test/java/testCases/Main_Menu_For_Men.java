package testCases;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import Main_Menu.Main_Menu_Objects;

public class Main_Menu_For_Men extends BaseTest {
	
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
//	Men Shoes Test cases
	@Test(priority = 1)
	public void verifybeltOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifySandalsOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 2)
	public void guestverifybeltOption() throws InterruptedException {
		mainMenu.verifySandalsOption();
	}
	
	@Test(priority = 3)
	public void verifybootsOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifySandalsOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 4)
	public void guestverifybootsOption() throws InterruptedException {
		mainMenu.verifySandalsOption();
	}
	
	@Test(priority = 5)
	public void verifyloafersOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifySandalsOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 6)
	public void guestverifyloafersOption() throws InterruptedException {
		mainMenu.verifySandalsOption();
	}
	
	@Test(priority = 7)
	public void verifymenBeltOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifymenBeltOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 8)
	public void guestverifymenBeltOption() throws InterruptedException {
		mainMenu.verifymenBeltOption();
	}
	
	@Test(priority = 9)
	public void verifyscarvesandWrapsOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifyscarvesandWrapsOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 10)
	public void guestverifyscarvesandWrapsOption() throws InterruptedException {
		mainMenu.verifyscarvesandWrapsOption();
	}
	
	@Test(priority = 11)
	public void verifytieandBowTiesOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifytieandBowTiesOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 12)
	public void guestverifytieandBowTiesOption() throws InterruptedException {
		mainMenu.verifytieandBowTiesOption();
	}
	
	@Test(priority = 13)
	public void verifymenBagpackOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifymenBagpackOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 14)
	public void guestverifymenBagpackOption() throws InterruptedException {
		mainMenu.verifymenBagpackOption();
	}
	
	@Test(priority = 15)
	public void verifmenBriefcasesOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifymenBriefcasesOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 16)
	public void guestverifymenBriefcasesOption() throws InterruptedException {
		mainMenu.verifymenBriefcasesOption();
	}
	
	@Test(priority = 17)
	public void verifmenClutchesOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifymenClutchesOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 18)
	public void guestverifymenClutchesOption() throws InterruptedException {
		mainMenu.verifymenClutchesOption();
	}
	
	@Test(priority = 19)
	public void verifymenmenShirtsOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifymenmenShirtsOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 20)
	public void guestverifymenmenShirtsOption() throws InterruptedException {
		mainMenu.verifymenmenShirtsOption();
	}
	
	@Test(priority = 21)
	public void verifymenSweaterOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifymenSweaterOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 22)
	public void guestverifymenSweaterOption() throws InterruptedException {
		mainMenu.verifymenSweaterOption();
	}
	
	@Test(priority = 23)
	public void verifymenTshirtsOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifymenTshirtsOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 24)
	public void guestverifymenTshirtsOption() throws InterruptedException {
		mainMenu.verifymenTshirtsOption();
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
	
}
