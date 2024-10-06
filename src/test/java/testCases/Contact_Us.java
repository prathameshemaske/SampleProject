package testCases;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Contact_Us.Contact_Us_Page_Objective;
import Login_Page.Login_Page_Objective;

public class Contact_Us extends BaseTest {
	
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Contact_Us_Page_Objective conatctTest;
	Contact_Us_Page_Objective chat;

	@BeforeClass
	public void ConfigureAppium() throws IOException, InterruptedException, Exception {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		conatctTest = new Contact_Us_Page_Objective(driver);
		chat = new Contact_Us_Page_Objective(driver);
	}
	
	@Test(priority = 1)
	public void loggedinUser() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		conatctTest.contactForm("Prathamesh", "Maske", "prathamesh@testriq.com", "9082973580", "Product", "This is Automation Test Message, Please Ignore");
		login.scrollLogout();
	}
	
	@Test(priority = 2)
	public void liveChat() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		chat.liveChatOption("prathamesh@testriq.com", "9082973580");
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
}
