package My_cart_Page;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.google.common.collect.ImmutableMap;

import AndroidUtils.AndroidActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class My_cart_page_Objects extends AndroidActions{
	
	public AppiumDriver driver;
	public My_cart_page_Objects(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Bottom Bar Svg Picture icon Tab 3")
	private WebElement myAccountScreen;
	
//	Logged in user
	
//	Guest User Slider Menu
	
//	(Women, Men, Kids, Sale, Travel Bag, Most Popular)
	
//	Women Options Menu
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, \"Drawer main item\")][1]")
	private WebElement Womenmenu;
	
	
//	Mens Options Menu
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, \"Drawer main item\")][2]")
	private WebElement MenMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Dolce & Gabbana')]/android.widget.Button[2]")
	private List<WebElement> productList;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(4)")
	private List<WebElement> listOfProducts;
	
	@AndroidFindBy(accessibility = "Add to cart list item 0 - Brand List Details Screen")
	private List<WebElement> sortList;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add To Cart\"]")
	private WebElement addToCartBtn;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,\"Dashboard Drawer\")]")
	private WebElement topLeftMenu;
	
//	Kids Options Menu
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, \"Drawer main item\")][3]")
	private WebElement KidsMenu;
	
	@AndroidFindBy(accessibility = "Logout Button GestureDetector - Profile Screen")
	private WebElement logOut;
	
//	Sale Options Menu
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Sale\"]")
	private WebElement SaleMenu;
	
//	Travel Bag Options Menu
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Travel Bag\"]")
	private WebElement TravelBagMenu;
	
//	Most Popular Options Menu
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Most Popular\"]")
	private WebElement MostPopularMenu;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView")
	private WebElement filterScreen;
	
	
//	Sorting Menu Options
	@AndroidFindBy(accessibility = "Sort")
	private WebElement sortMenu;
	
	@AndroidFindBy(accessibility = "Relevance")
	private WebElement relevanceOptions;
	
	@AndroidFindBy(accessibility = "New Arrivals")
	private WebElement newArrivalOptions;
	
	@AndroidFindBy(accessibility = "Price(highest first)")
	private WebElement priceHightoLowOptions;
	
	@AndroidFindBy(accessibility = "Price(lowest first)")
	private WebElement priceLowtoHighOptions;
	
	@AndroidFindBy(accessibility = "Discount(highest first)")
	private WebElement discountHighFirstOptions;
	
	@AndroidFindBy(accessibility = "Discount(lowest first)")
	private WebElement discountlowFirstOptions;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, \"Drawer main item\")][1]")
	private WebElement womenOption;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,\"All Women\")]")
	private WebElement allWomenOption;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,\"Item Successfully added to the cart\")]")
	private WebElement alertMessage;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Dolce & Gabbana One Shoulder Midì Dress')]")
	private List<WebElement> productNames;
	
	@AndroidFindBy(xpath = "//android.widget.Button")
	private WebElement closeBtn;
	
	@AndroidFindBy(accessibility = "Bottom Bar Svg Picture icon Tab 4")
	private WebElement myCart;
	
	@AndroidFindBy(accessibility = "Subtract Qty Icon item 0 InkWell - Cart Screen")
	private WebElement removeFromcart;
	
	@AndroidFindBy(accessibility = "YES")
	private WebElement popupYesBtn;
	
	@AndroidFindBy(accessibility = "NO")
	private WebElement popupNoBtn;
	
	@AndroidFindBy(accessibility = "Filter")
	private WebElement filterbtn;
	
	@AndroidFindBy(accessibility = "BRAND")
	private WebElement brands;
	
	
//	Catagories
	@AndroidFindBy(accessibility = "Accessories")
	private WebElement accessories;
	
	@AndroidFindBy(accessibility = "Bags")
	private WebElement bags;

	@AndroidFindBy(accessibility = "Clothings")
	private WebElement clothings;
	
	@AndroidFindBy(accessibility = "Shoes")
	private WebElement shoes;
	
//	Brands
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement searchBox;
	
	@AndroidFindBy(accessibility = "artistix")
	private WebElement artistix;
	
	@AndroidFindBy(accessibility = "BALENCIAGA")
	private WebElement balenciaga;
	
	@AndroidFindBy(accessibility = "BOTTEGA VENETA")
	private WebElement bottega;
	
	@AndroidFindBy(accessibility = "BURBERRY")
	private WebElement burberry;
	
	@AndroidFindBy(accessibility = "chiara ferragni")
	private WebElement chiara;
	
	@AndroidFindBy(accessibility = "CHLOE")
	private WebElement chloe;
	
	@AndroidFindBy(accessibility = "CHRISTIAN LOUBOUTIN")
	private WebElement christian;
	
	@AndroidFindBy(accessibility = "cole haan")
	private WebElement cole;
	
	@AndroidFindBy(accessibility = "comme des garçons")
	private WebElement comme;
	
	@AndroidFindBy(accessibility = "DOLCE & GABBANA")
	private WebElement dolce;
	
	@AndroidFindBy(accessibility = "dsquared2")
	private WebElement dsquared2;
	
	@AndroidFindBy(accessibility = "TORY BURCH")
	private WebElement tory;
	
	@AndroidFindBy(accessibility = "VALENTINO GARAVANI")
	private WebElement velentino;
	
	@AndroidFindBy(accessibility = "vivienne westwood")
	private WebElement vivienne;
	
//	Colors
	@AndroidFindBy(accessibility = "COLOR")
	private WebElement color;
	
	@AndroidFindBy(accessibility = "Black")
	private WebElement black;
	
	@AndroidFindBy(accessibility = "Blue")
	private WebElement blue;
	
	@AndroidFindBy(accessibility = "Brown")
	private WebElement brown;
	
	@AndroidFindBy(accessibility = "Green")
	private WebElement green;
	
	@AndroidFindBy(accessibility = "Grey")
	private WebElement grey;
	
	@AndroidFindBy(accessibility = "Orange")
	private WebElement orange;
	
	@AndroidFindBy(accessibility = "Pink")
	private WebElement Pink;
	
	@AndroidFindBy(accessibility = "Purple")
	private WebElement purple;
	
	@AndroidFindBy(accessibility = "Red")
	private WebElement red;
	
	@AndroidFindBy(accessibility = "Tan")
	private WebElement tan;
	
	@AndroidFindBy(accessibility = "White")
	private WebElement white;
	
	@AndroidFindBy(accessibility = "Yellow")
	private WebElement yellow;
	
//	Price
	@AndroidFindBy(accessibility = "PRICE")
	private WebElement price;
	
	@AndroidFindBy(accessibility = "100%")
	private WebElement full;
	
	@AndroidFindBy(accessibility = "0%")
	private WebElement start;
	
//	Size
	@AndroidFindBy(accessibility = "SIZE")
	private WebElement size;
	
	@AndroidFindBy(accessibility = "10")
	private WebElement ten;
	
	@AndroidFindBy(accessibility = "34")
	private WebElement thirtyfour;
	
	@AndroidFindBy(accessibility = "35")
	private WebElement thirtyFive;
	
	@AndroidFindBy(accessibility = "36")
	private WebElement thirtysix;
	
	@AndroidFindBy(accessibility = "38")
	private WebElement thirtyeight;
	
	@AndroidFindBy(accessibility = "40")
	private WebElement forty;
	
	@AndroidFindBy(accessibility = "42")
	private WebElement fortytwo;
	
	@AndroidFindBy(accessibility = "44")
	private WebElement fortyfour;
	
	@AndroidFindBy(accessibility = "46")
	private WebElement fortysix;
	
	@AndroidFindBy(accessibility = "48")
	private WebElement fortyeight;
	
	@AndroidFindBy(accessibility = "50")
	private WebElement fifty;
	
	@AndroidFindBy(accessibility = "52")
	private WebElement fiftytwo;
	
	@AndroidFindBy(accessibility = "54")
	private WebElement fiftyfour;
	
	@AndroidFindBy(accessibility = "56")
	private WebElement fiftysix;
	
	@AndroidFindBy(accessibility = "60")
	private WebElement sixty;
	
	@AndroidFindBy(accessibility = "Apply")
	private WebElement applybtn;
	
//	Brands Filter Results
	@AndroidFindBy(accessibility = "Add to cart list item 0 - Brand List Details Screen")
	private WebElement addtoCart;
	
	@AndroidFindBy(accessibility = "Add To Cart")
	private WebElement addedtoCart;
	
	@AndroidFindBy(accessibility = "Item Successfully added in cart ok button")
	private WebElement okBtn;
	
	public void myCartScreen() {
		myCart.click();
	}
	
	public void addFirstProductOfWomenCategory() throws InterruptedException {
		Thread.sleep(2000);
		topLeftMenu.click();
		Thread.sleep(2000);
		womenOption.click();
		Thread.sleep(2000);
		allWomenOption.click();
		Thread.sleep(2000);
		listOfProducts.get(0).click();
		addToCartBtn.click();
		Thread.sleep(2000);
		okBtn.click();
		Thread.sleep(2000);
		driver.navigate().back();
//		driver.navigate().back();
//		System.out.println(productNames.get(0).getText());
	}
	
	public void logout() throws InterruptedException {
		scrollUp(logOut);
	}
	
	public void removeFromcart() throws InterruptedException {
//		driver.navigate().back();
		myCart.click();
		removeFromcart.click();
//		popupYesBtn.click();
		myAccountScreen.click();
//		scrollUp(logOut);
		
	}
	
	public void filterProductsbyaccessories() throws InterruptedException {
		topLeftMenu.click();
		womenOption.click();
		allWomenOption.click();
		filterbtn.click();
		accessories.click();
		scrollUpbyBrands(applybtn);
		applybtn.click();
		sortList.get(0).click();
		addedtoCart.click();
		okBtn.click();
		driver.navigate().back();
	}


	public void sortProductsnewArrivalOptions() throws InterruptedException {
		topLeftMenu.click();
		womenOption.click();
		allWomenOption.click();
		sortMenu.click();
		newArrivalOptions.click();
		sortList.get(0).click();
		addToCartBtn.click();
		okBtn.click();
		driver.navigate().back();
	}
	
//	- Search Product by "Catagories" by Filter
//	- Search Product by "Brands" Filter
//	- Search Product by "COLOR" Filter
	
	public void filterProductsbyBrands() throws InterruptedException {
		topLeftMenu.click();
		womenOption.click();
		allWomenOption.click();
		filterbtn.click();
		artistix.click();
		scrollUpbyBrands(applybtn);
		applybtn.click();
	}
	
	public void brands() throws InterruptedException {
		addtoCart.click();
		addedtoCart.click();
		okBtn.click();
		driver.navigate().back();
	}
	
	public void filterProductbyColor() throws InterruptedException {
		topLeftMenu.click();
		womenOption.click();
		allWomenOption.click();
		filterbtn.click();
		black.click();
		scrollUpbyBrands(applybtn);
		applybtn.click();
		addToCartBtn.click();
		okBtn.click();
		driver.navigate().back();
		
	}
	
	public void sortProductsnewpriceLowtoHighOptions() throws InterruptedException {
		topLeftMenu.click();
		Womenmenu.click();
		allWomenOption.click();
		sortMenu.click();
		priceLowtoHighOptions.click();
		sortList.get(0).click();
		addToCartBtn.click();
		okBtn.click();
		driver.navigate().back();
	}
	
	public void sortPricehighestfirst() throws InterruptedException {
	    topLeftMenu.click();
	    womenOption.click();
	    allWomenOption.click();
	    sortMenu.click();
	    priceHightoLowOptions.click();
	    sortList.get(0).click();
	    addToCartBtn.click();
	    okBtn.click();
	    driver.navigate().back();
	}
	
	public void sortByrelevance() throws InterruptedException {
	    topLeftMenu.click();
	    womenOption.click();
	    allWomenOption.click();
	    sortMenu.click();
	    relevanceOptions.click();
	    sortList.get(0).click();
	    addToCartBtn.click();
	    okBtn.click();
	    driver.navigate().back();
	}
	
	public void sortdiscountHighFirstOptions() throws InterruptedException {
	    topLeftMenu.click();
	    womenOption.click();
	    allWomenOption.click();
	    sortMenu.click();
	    scrollforSort(discountHighFirstOptions);
	    sortList.get(0).click();
	    addToCartBtn.click();
	    okBtn.click();
	    driver.navigate().back();
	}
	
	public void sortdiscountlowFirstOptions() throws InterruptedException {
	    topLeftMenu.click();
	    womenOption.click();
	    allWomenOption.click();
	    sortMenu.click();
	    scrollforSort(discountlowFirstOptions);
	    sortList.get(0).click();
	    addToCartBtn.click();
	    okBtn.click();
	    driver.navigate().back();
	}
	
	public void filterbyProductsColor() throws InterruptedException {
	    topLeftMenu.click();
	    womenOption.click();
	    allWomenOption.click();
	    filterbtn.click();
	    scrollUpbyColor(filterPop);
	    black.click();
		scrollUpbyBrands(applybtn);
	    applybtn.click();
	    sortList.get(0).click();
	    addToCartBtn.click();
	    okBtn.click();
	    driver.navigate().back();
	}
	
	public void filterbyProductsPrice() throws InterruptedException {
	    topLeftMenu.click();
	    womenOption.click();
	    allWomenOption.click();
	    filterbtn.click();
	    scrollUpbyPrice(filterPop);
	    scrollLeftByPrice(full);
	    applybtn.click();
	    sortList.get(0).click();
	    addToCartBtn.click();
	    okBtn.click();
	    driver.navigate().back();
	}
	
//	Filter by Size 
	
	public void filterbyProductsSize() throws InterruptedException {
	    topLeftMenu.click();
	    womenOption.click();
	    allWomenOption.click();
	    filterbtn.click();
	    scrollUpbyPrice(filterPop);
	    forty.click();
	    applybtn.click();
	    sortList.get(0).click();
	    addToCartBtn.click();
	    okBtn.click();
	    driver.navigate().back();
	}
	
	
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView")
	WebElement filterPop; 
public void scrollUpbyBrands(WebElement element) {
	Actions actions = new Actions(driver);

    // Move the cursor upwards by 200 pixels (adjust value as needed)
    actions.clickAndHold(filterPop)
    		.moveByOffset(0, -1400)// Move upwards by 200 pixels
    		.release()
    		.perform();
//    element.click();
	    }

public void scrollUpbyPrice(WebElement element) {
	Actions actions = new Actions(driver);

    // Move the cursor upwards by 200 pixels (adjust value as needed)
    actions.clickAndHold(filterPop)
    		.moveByOffset(0, -1400)// Move upwards by 200 pixels
    		.release()
    		.perform();
//    element.click();
}

public void scrollLeftByPrice(WebElement element) {
    Actions actions = new Actions(driver);

    // Click and hold the element, move it left (negative x offset)
    actions.clickAndHold(full)  // Hold the element
           .moveByOffset(-200, 0)  // Move left by 100 pixels
           .release()              // Release the element
           .perform();             // Execute the action sequence

    // After the drag, you can perform additional actions on the element if needed
//    element.click(); // Click the element (optional, depending on your use case)
}

public void scrollUpbyColor(WebElement element) {
	Actions actions = new Actions(driver);

    // Move the cursor upwards by 200 pixels (adjust value as needed)
    actions.clickAndHold(filterPop)
    		.moveByOffset(0, -800)// Move upwards by 200 pixels
    		.release()
    		.perform();
    element.click();
	    }

public void scrollforSort(WebElement element) {
	Actions actions = new Actions(driver);

    // Move the cursor upwards by 200 pixels (adjust value as needed)
    actions.clickAndHold(priceHightoLowOptions)
    		.moveByOffset(0, -150)// Move upwards by 200 pixels
    		.release()
    		.perform();
    element.click();
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
