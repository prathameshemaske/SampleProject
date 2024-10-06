package Home_Screen_Object;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_Screen_Objects {

	public AppiumDriver driver;

	public Home_Screen_Objects(AppiumDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, \"Bottom Bar Tab 0\")]")
	private WebElement homeScreen;
	
	@AndroidFindBy(accessibility = "Women")
	private WebElement womenList;
	
	@AndroidFindBy(accessibility = "Men")
	private WebElement mensList;
	
	@AndroidFindBy(accessibility = "Kids")
	private WebElement kidsList;
	
	@AndroidFindBy(accessibility = "Sale")
	private WebElement saleList;
	
	@AndroidFindBy(accessibility = "Travel Bag")
	private WebElement travelBagList;
	
	@AndroidFindBy(accessibility = "Travel Bag")
	private WebElement mostPopularList;
	
	public void homeScreen() {
		homeScreen.click();
	}
	
	public void homeScreenWomenList() {
		womenList.click();
		driver.navigate().back();
	}
	
	public void homeScreenMenList() {
		mensList.click();
		driver.navigate().back();
	}
	
	public void homeScreenKidsList() {
		kidsList.click();
		driver.navigate().back();
	}
	
	public void homeScreenSalesList() {
		saleList.click();
		driver.navigate().back();
	}
	
	public void homeScreenTravelBagsList() {
		travelBagList.click();
		driver.navigate().back();
	}
	
	public void homeScreenMostPopularList() {
		mostPopularList.click();
		driver.navigate().back();
	}
	
}


