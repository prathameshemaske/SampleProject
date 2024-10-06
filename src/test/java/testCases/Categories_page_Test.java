package testCases;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Categories.Categories_Objective;
import Product_details_page.Product_details_page_Objects;

public class Categories_page_Test extends BaseTest{
	
	Categories_Objective homescreen;
	Categories_Objective menOptions;
	Categories_Objective notify;
	Categories_Objective KidsMenu;
	Categories_Objective SaleMenu;
	Categories_Objective TravelBagMenu;
	Categories_Objective MostPopularMenu;
	Categories_Objective TravelBag;
	Product_details_page_Objects women;
	
	@BeforeClass
	public void ConfigureAppium() throws IOException, InterruptedException, Exception {
		AppiumServer();
		women = new Product_details_page_Objects(driver);
		homescreen = new Categories_Objective(driver);
		menOptions = new Categories_Objective(driver);
		notify = new Categories_Objective(driver);
		KidsMenu = new Categories_Objective (driver);
		SaleMenu = new Categories_Objective (driver);
		TravelBagMenu = new Categories_Objective (driver);
		MostPopularMenu = new Categories_Objective (driver);
	}

	@Test(priority = 1)
	public void verifyWomenMenu() throws InterruptedException {
		women.womenCartScreen();
		homescreen.backToHome();
	}
	
	@Test(priority = 2)
	public void verifyMenMenu() throws InterruptedException {
		menOptions.addFirstProductOfMenCategory();
		homescreen.backToHome();
	}
	
	@Test(priority = 3)
	public void verifyNotify() throws InterruptedException {
		notify.productnotifyMenCategory("Prathamesh", "Maske", "prathamesh@testriq.com", "9082973580");
		homescreen.back3Home();
	}
	
	@Test(priority = 4)
	public void verifyKids() throws InterruptedException {
		KidsMenu.navigateToKidsMenu();
		homescreen.backToHome();
	}
	
	@Test(priority = 5)
	public void verifySalesMenu() throws InterruptedException {
		SaleMenu.navigateToSalesMenu();
		homescreen.backToHome();
	}
	
	@Test(priority = 6)
	public void verifyTravelBag() throws InterruptedException {
		TravelBagMenu.navigateToTravelBagMenu();
		homescreen.backToHome();
	}
	
	@Test(priority = 7)
	public void verifyMostPopular() throws InterruptedException {
		MostPopularMenu.navigateToMostPopularMenu();
		homescreen.backToHome();
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
//		driver.close();
		driver.quit();
	}

}
