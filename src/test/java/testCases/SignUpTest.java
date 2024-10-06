package testCases;

import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import SignUp.SignUp_Page_Objective;

public class SignUpTest extends BaseTest{
	
	Account_information_page_Objects myAccountScreen;
	SignUp_Page_Objective signup;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		signup = new SignUp_Page_Objective(driver);
	}
	
		@Test(priority = 1)
		public void verifySignup() throws InterruptedException {
			Thread.sleep(5000);
			myAccountScreen.clickOnMyAccount();
			signup.UserRegistration("prathamesh3@testriq.com", "Prathamesh*141#", "9082973580", "Prathamesh", "Maske");
			Assert.assertTrue(signup.verifyUserSignUp());
			signup.logoutFromPage();
	}

	
//	New Sign Up is not working
	@Test(priority = 2)
	public void verifyLogout() throws InterruptedException {
		Thread.sleep(5000);
		signup.logoutFromPage();
		Thread.sleep(5000);
	}
	
	@Test(priority = 3)
	public void errors() throws InterruptedException {
//		myAccountScreen.clickOnMyAccount();
		signup.signupError();
	}
	
//	@DataProvider
//	public Object [] [] loginData() throws IOException{
//		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir") + "\\src\\main\\java\\luxe\\lab\\resources\\testData.json");
//		return new Object [][] {{data.get(0)} };
//	}

	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
}
