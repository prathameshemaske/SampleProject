package testCases;

import java.io.IOException;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Home_Screen_Object.Home_Screen_Objects;
import Login_Page.Login_Page_Objective;
import Product_details_page.Product_details_page_Objects;

public class Product_details_page_Test extends BaseTest{
	Account_information_page_Objects myAccountScreen;
	Login_Page_Objective login;
	Home_Screen_Objects home;
	Product_details_page_Objects selectProduct;
	Product_details_page_Objects productDetail;
	
	
	@BeforeClass
	public void ConfigureAppium() throws IOException, InterruptedException, Exception {
		AppiumServer();
		myAccountScreen = new Account_information_page_Objects(driver);
		login = new Login_Page_Objective(driver);
		selectProduct = new Product_details_page_Objects(driver);
		productDetail = new Product_details_page_Objects (driver);
	}
	@Test(priority = 1)
	public void verifyProduct() throws InterruptedException {
		myAccountScreen.clickOnMyAccount();
		login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
		selectProduct.productDetailScreen();
	}

	@AfterClass
	public void Teardown() throws InterruptedException {
//		driver.close();
		driver.quit();
	}

	
}
