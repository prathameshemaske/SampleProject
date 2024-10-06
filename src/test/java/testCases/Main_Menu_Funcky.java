package testCases;

import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import Main_Menu.Main_Menu_Objects;

public class Main_Menu_Funcky extends BaseTest{
	
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
	public void verifyLoggedinUserFunckyOption() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		mainMenu.verifyfunckyOption();
		login.logoutFromPage();
	}
	
	@Test(priority = 2)
	public void verifyGuestUserFunckyOption() throws InterruptedException {
		mainMenu.verifyfunckyOption();
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}

}
