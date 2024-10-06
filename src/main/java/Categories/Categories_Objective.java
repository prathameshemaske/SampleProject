package Categories;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Categories_Objective {
	
	public AppiumDriver driver;
	public Categories_Objective(AppiumDriver driver) {
//		 super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, \"Drawer main item 1\")]")
	private WebElement Womenmenu;
	
	
//	Mens Options Menu
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Drawer main item 2') and contains(@content-desc, 'Men')]")
	private WebElement MenMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Drawer sub item 2') and contains(@content-desc, 'All Men')]")
	private WebElement allMen;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Add to cart list item 0 - Brand List Details Screen\"]")
	private List<WebElement> productList;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add To Cart\"]")
	private WebElement addToCartBtn;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,\"Dashboard Drawer\")]")
	private WebElement topLeftMenu;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,\"Women\")]")
	private WebElement womenOption;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,\"All Women\")]")
	private WebElement allWomenOption;
	
//	Kids Options Menu
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Drawer main item 3') and contains(@content-desc, 'Kids')]")
	private WebElement KidsMenu;
	
//	Sale Options Menu
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Drawer main item 4') and contains(@content-desc, 'Sale')]")
	private WebElement SaleMenu;
	
//	Travel Bag Options Menu
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Drawer main item 5') and contains(@content-desc, 'Travel Bag')]")
	private WebElement TravelBagMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Drawer sub item 5') and contains(@content-desc, 'All Travel Bag')]")
	private WebElement allTravel;
	
//	Most Popular Options Menu
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Drawer main item 6') and contains(@content-desc, 'Most Popular')]")
	private WebElement MostPopularMenu;
	
//	Sorting Menu Options
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Sort\"]")
	private WebElement sortMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Relevance\"]")
	private WebElement relevanceOptions;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"New Arrivals\"]")
	private WebElement newArrivalOptions;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Price(highest first)\"]")
	private WebElement priceHightoLowOptions;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Price(lowest first)\"]")
	private WebElement priceLowtoHighOptions;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Discount(highest first)\"]")
	private WebElement discountHighFirstOptions;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Discount(lowest first)\"]")
	private WebElement discountlowFirstOptions;
	
	@AndroidFindBy(xpath = "//android.widget.Button")
	private WebElement closeBtn;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Dolce & Gabbana Jeans')][1]")
	private WebElement productOpen;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Buy Now\"]")
	private WebElement buyNow;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add To Cart\"]")
	private WebElement addToCart;
	
	@AndroidFindBy(accessibility = "Name Field - Special Request")
	private WebElement firstName;

	@AndroidFindBy(accessibility = "Last Name Field - Special Request")
	private WebElement enterLastName;
	
	@AndroidFindBy(accessibility = "Email Field - Special Request")
	private WebElement emailID;
	
	@AndroidFindBy(accessibility = "Phone Field - Special Request")
	private WebElement num;	
	
	@AndroidFindBy(accessibility = "Submit Button - Special Request")
	private WebElement submitBtn;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Bottom Bar Svg Picture icon Tab 1\"]")
	private WebElement categoriesMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Drawer sub item 3') and contains(@content-desc, 'All Kids')]")
	private WebElement allKids;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'LogOut')]")
	private WebElement logOut;
	
	@AndroidFindBy(accessibility = "Item Successfully added in cart ok button")
	private WebElement okBtn;

	
	public void categoriesOptions() throws InterruptedException {
		Thread.sleep(5000);
		categoriesMenu.click();
		}
	
	
	public void addFirstProductOfMenCategory() throws InterruptedException {
		topLeftMenu.click();
		MenMenu.click();
		allMen.click();
		productList.get(0).click();
		addToCartBtn.click();
		okBtn.click();
//		System.out.println(productNames.get(0).getText());
	}
	
	public void productnotifyMenCategory(String name, String lastName, String email, String mobNum) throws InterruptedException {
		Actions actions = new Actions(driver);
		topLeftMenu.click();
		MenMenu.click();
		allMen.click();
		productOpen.click();
		scrollUp(addToCart);
		firstName.click();
		actions.moveToElement(firstName).sendKeys(name).perform();
//		firstName.sendKeys(name);
		enterLastName.click();
		actions.moveToElement(enterLastName).sendKeys(lastName).perform();
//		enterLastName.sendKeys(lastName);
		emailID.click();
		actions.moveToElement(emailID).sendKeys(email).perform();
//		emailID.sendKeys(email);
		num.click();
//		num.sendKeys(mobNum);
		actions.moveToElement(num).sendKeys(mobNum).perform();
		submitBtn.click();
//		System.out.println(productNames.get(0).getText());
	}

//	public void productnotifyformMenCategory(String name, String lastName, String email, String mobNum) throws InterruptedException{
//		Actions actions = new Actions(driver);
//		firstName.click();
//		actions.moveToElement(firstName).sendKeys(name).perform();
////		firstName.sendKeys(name);
//		enterLastName.click();
//		actions.moveToElement(enterLastName).sendKeys(lastName).perform();
////		enterLastName.sendKeys(lastName);
//		emailID.click();
//		actions.moveToElement(emailID).sendKeys(email).perform();
////		emailID.sendKeys(email);
//		num.click();
////		num.sendKeys(mobNum);
//		actions.moveToElement(num).sendKeys(mobNum).perform();
//	}
	
	public void navigateToKidsMenu() throws InterruptedException {
		topLeftMenu.click();
		KidsMenu.click();
		allKids.click();
	}
	
	public void navigateToSalesMenu() throws InterruptedException {
		topLeftMenu.click();
		SaleMenu.click();
	}
	
	public void navigateToTravelBagMenu() throws InterruptedException {
		topLeftMenu.click();
		TravelBagMenu.click();
		allTravel.click();
	}
	
	public void navigateToMostPopularMenu() throws InterruptedException {
		topLeftMenu.click();
		MostPopularMenu.click();
	}
	
	public void backToHome() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().back();
	}
	
	public void back3Home() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
	
public void scrollUp(WebElement element) {
		
		boolean canScrollMore;
	        do {
	            try {
	            	if (element.isDisplayed()) {
	                    element.click();
	                    return;
	                }
	            } catch (Exception e) {
	                // Element not found, continue scrolling
	            }
	            
	            // Perform the scroll
	            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript(
	                "mobile: scrollGesture", ImmutableMap.of(
	                    "left", 100, 
	                    "top", 100, 
	                    "width", 200, 
	                    "height", 200, 
	                    "direction", "down", 
	                    "percent", 5.0
	                )
	            );
	        } while (canScrollMore);
	        try
	        {
	            if (element.isDisplayed()) {
	                element.click();
	                return;
	            }
	        } catch (Exception e) {
	            throw new RuntimeException("Element not found after scrolling");
	        }
	    }
}
