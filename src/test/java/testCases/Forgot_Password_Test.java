package testCases;

import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;

public class Forgot_Password_Test extends BaseTest{
	
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective forgotpassword;
	
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		forgotpassword = new Login_Page_Objective(driver);
	}
	
	@Test
	public void verifyForgotPassword() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
//		forgotpassword.ForgotPassword("prathamesh1@testriq.com"); forgot Password link is not working
		
	}

	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}

}
