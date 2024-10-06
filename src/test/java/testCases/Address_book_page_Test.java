package testCases;

import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Account_information_page.Account_information_page_Objects;
import Address_book_page.Address_book_page_Object;
import Login_Page.Login_Page_Objective;

public class Address_book_page_Test extends BaseTest {
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Address_book_page_Object addAddress;
	Address_book_page_Object countryName;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		addAddress = new Address_book_page_Object(driver);
  }
	
	@Test(priority = 1)
	public void loggedinUserAddressBook() throws Exception {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		addAddress.addNewAddress("Prathamesh", "Maske", "9082973580", "Test1", "Test2", "Test3", "Mumbai", "123456", "India");
		login.logoutFromPage();
	}
	
	@Test(priority = 2)
	public void guestUserAddressBook() throws Exception {
		myAccountScreen.clickOnMyAccount();
		addAddress.addNewAddress("Prathamesh", "Maske", "9082973580", "Test1", "Test2", "Test3", "Mumbai", "123456", "India");
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
}