package testCases;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import My_Orders_Page.My_Orders_Objects;


public class My_orders_page_Test extends BaseTest {
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	My_Orders_Objects myOrders;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		myOrders = new My_Orders_Objects(driver);
	}
	
	@Test(priority = 1)
	public void myOrders() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		myOrders.verifyNoOrderPlaced();
		login.logoutFromPage();
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
}
