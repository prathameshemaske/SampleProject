package testCases;

import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import Search_result_page.Search_result_page_Objects;

public class Create_Ticket extends BaseTest{
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Search_result_page_Objects ticket;
	Search_result_page_Objects search;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		ticket = new Search_result_page_Objects(driver);
		search = new Search_result_page_Objects(driver);
	}
	
	@Test (priority = 1)
	public void loggedinuserVerifyCreateTicket() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		Assert.assertTrue(login.verifyUserLogin());
		search.searchOptions();
		ticket.verifyTicket("Prathamesh", "Maske", "prathamesh@testriq.com", "9082973580", "Puma", "Puma Shoes", "TEST", "TEST");
		myAccountScreen.clickOnMyAccount();
		login.logoutFromPage();
	}
	
	@Test (priority = 2)
	public void guestVerifyCreateTicket() throws InterruptedException {
		search.searchOptions();
		ticket.verifyTicket("Prathamesh", "Maske", "prathamesh@testriq.com", "9082973580", "Puma", "Puma Shoes", "TEST", "TEST");
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
}
