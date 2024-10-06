package testCases;

import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import About_Us.About_Us_Objects;
import Account_information_page.Account_information_page_Objects;
import Login_Page.Login_Page_Objective;

public class About_Us extends BaseTest {
    
    Account_information_page_Objects myAccountScreen;
    About_Us_Objects scrollAbout;
    Login_Page_Objective login;

    @Parameters({"apkPath"}) // Parameter annotation to receive apkPath
    @BeforeClass
    public void configuration(String apkPath) throws InterruptedException, IOException, URISyntaxException {
        AppiumServer(apkPath); // Pass apkPath to AppiumServer
        myAccountScreen = new Account_information_page_Objects(driver);
        scrollAbout = new About_Us_Objects(driver);
        login = new Login_Page_Objective(driver);
    }

    @Test(priority = 1)
    public void loggedinUserVerifyAboutUS() throws InterruptedException {
        myAccountScreen.clickOnMyAccount();
        login.ExistinguserLogin("prathamesh@testriq.com", "Prathamesh*141#");
        scrollAbout.scrollAbout();
        login.logoutFromPage();
    }
    
    @Test(priority = 2)
    public void guestUserVerifyAboutUS() throws InterruptedException {
        myAccountScreen.clickOnMyAccount();
        scrollAbout.scrollAbout();
    }
    
    @AfterClass
    public void teardown() throws InterruptedException {
        driver.quit();
    }
}
