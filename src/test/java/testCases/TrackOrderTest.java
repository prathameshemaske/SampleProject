package testCases;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;
import Track_Order_Page.Track_Order_Page_Object;

public class TrackOrderTest extends BaseTest{
		Account_information_page_Objects myAccountScreen;
		Login_Page_Objective login;
		Track_Order_Page_Object trackMyOrders;
		Track_Order_Page_Object newslatters;
		
		
		@BeforeClass
		public void ConfigureAppium() throws IOException, InterruptedException, Exception {
			AppiumServer();
			myAccountScreen = new Account_information_page_Objects(driver);
			login = new Login_Page_Objective(driver);
			trackMyOrders = new Track_Order_Page_Object (driver);
			newslatters = new Track_Order_Page_Object (driver);
		}
			
			@Test(priority = 1)
			public void afterLogin() throws InterruptedException {
				myAccountScreen.clickOnMyAccount();
				login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
				trackMyOrders.guestUser("123456", "Maske", "prathamesh@testriq.com");
				login.logoutFromPage();
			}
			
			@Test(priority = 2)
			public void guestLogin() throws InterruptedException {
				myAccountScreen.clickOnMyAccount();
				trackMyOrders.guestUser("123456", "Maske", "prathamesh@testriq.com");
			}
			
			@Test(priority = 3)
			public void newsLatterTest() throws InterruptedException {
//				myAccountScreen.clickOnMyAccount();
				newslatters.newsLatter("prathamesh+1@testriq.com");
			}
			
			@Test(priority = 4)
			public void orderTrackHelp() throws InterruptedException {
				trackMyOrders.orderTrack("Prathamesh", "Maske", "123456789", "prathamesh@gmail.com", "9082973580", "Please Ignore this is Automation Test");
			}
			
			@AfterClass
			public void Teardown() throws InterruptedException {
				driver.quit();
			}
}
