package testCases;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;

public class LoginTest extends BaseTest {
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	
	@BeforeClass
	public void configuaration() throws InterruptedException, IOException, URISyntaxException {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
	}
	
	@Test(priority = 1, dataProvider = "loginData")
	public void verifyLogin(HashMap<String, String> input) throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin(input.get("email"), input.get("password"));
		Assert.assertTrue(login.verifyUserLogin());
	}

	
	@Test(priority = 2)
	public void verifyLogout() throws InterruptedException {
		login.logoutFromPage();
	}
	
	@Test(priority = 3)
	public void verifyErros() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.errors();
	}
	
	@DataProvider
	public Object [] [] loginData() throws IOException{
		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir") + "\\src\\main\\java\\luxe\\lab\\resources\\testData.json");
		return new Object [][] {{data.get(0)} };
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		driver.quit();
	}
	
}
