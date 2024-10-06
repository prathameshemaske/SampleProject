package Product_details_page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Product_details_page_Objects {
	public AppiumDriver driver;

	public Product_details_page_Objects(AppiumDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Men\"]")
	private WebElement MenMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Dolce & Gabbana One Shoulder Midì Dress')]/android.widget.Button[2]")
	private List<WebElement> productList;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add To Cart\"]")
	private WebElement addToCartBtn;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,\"Dashboard Drawer\")]")
	private WebElement topLeftMenu;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, \"Drawer main item 1\")]")
	private WebElement womenOption;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,\"All Women\")]")
	private WebElement allWomenOption;
	
	@AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, 'Dolce & Gabbana One Shoulder Midì Dress')])[1]")
	private WebElement selectProduct;
	
	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Product Details\"]")
	private WebElement productDetail;
	
	@AndroidFindBy(xpath = "//android.widget.Button")
	private WebElement closeBtn;

	public void productDetailScreen() throws InterruptedException {
		topLeftMenu.click();
		womenOption.click();
		allWomenOption.click();
		selectProduct.click();
		}
	
	public void womenCartScreen() throws InterruptedException {
		topLeftMenu.click();
		womenOption.click();
		allWomenOption.click();
		productList.get(0).click();
		addToCartBtn.click();
		closeBtn.click();
	}
	

	public boolean verifyproductDetail() {
		boolean flag = true;
		if(!productDetail.isDisplayed()) {
			flag = false;
		}
		else {
			flag = true;
		}
		return flag;
	}
	
	
}
