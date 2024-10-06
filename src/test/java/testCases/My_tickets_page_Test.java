package testCases;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import My_tickets_page.My_tickets_page_Objects;
import Search_result_page.Search_result_page_Objects;

public class My_tickets_page_Test extends BaseTest{
	
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	My_tickets_page_Objects track;
	Search_result_page_Objects ticket;
	Search_result_page_Objects search;
	
	@BeforeClass
	public void ConfigureAppium() throws IOException, InterruptedException, Exception {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		search  = new Search_result_page_Objects(driver);
		track = new My_tickets_page_Objects(driver);
		ticket = new Search_result_page_Objects(driver);
	}

	@Test
	public void afterLogin() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		search.searchOptions();
		ticket.verifyTicket("Prathamesh", "Maske", "prathamesh@testriq.com", "9082973580", "Puma", "Puma Shoes", "TEST", "TEST");
		myAccountScreen.clickOnMyAccount();
		search.logoutFromPage();
	}
		
		@Test(priority = 2)
		public void beforeLogin() throws InterruptedException {
			Thread.sleep(5000);
			search.searchOptions();
			ticket.beforeLog("Prathamesh", "Maske", "prathamesh@testriq.com", "9082973580", "Puma", "Puma Shoes", "TEST", "TEST");
		}

@AfterClass
public void Teardown() throws InterruptedException {
	driver.quit();
}

}