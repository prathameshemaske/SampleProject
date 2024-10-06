package My_wishlist_page;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class My_wishlist_page_Objects {
	
	public AppiumDriver driver;

	public My_wishlist_page_Objects(AppiumDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,\"Dashboard Drawer\")]")
	private WebElement topLeftMenu;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,\"Women\")]")
	private WebElement womenOption;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,\"All Women\")]")
	private WebElement allWomenOption;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(3)")
	private WebElement addToWishList;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Product added to wishlist\"]")
	private WebElement verifyWhishlist;
	
	@AndroidFindBy(accessibility = "My Wishlist Button GestureDetector - Profile Screen" )
	private WebElement myWishList;
	
	@AndroidFindBy(accessibility = "Add To Cart")
	private WebElement addToCart;
	
	@AndroidFindBy(accessibility = "Add To Cart")
	private WebElement addToCartBtn;
	
	@AndroidFindBy(xpath = "//android.widget.Button")
	private WebElement closeBtn;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'DOLCE & GABBANA MIDI SILK DRESS')]/android.widget.Button")
	private WebElement removeBtn;
	
	@AndroidFindBy(accessibility = "Bottom Bar Svg Picture icon Tab 4")
	private WebElement myCart;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Checkout button')]")
	private WebElement checkOutBtn;
	
	@AndroidFindBy(accessibility = "Cash On Delivery")
	private WebElement cashOnDelivery;
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement orderComment;
	
	@AndroidFindBy(accessibility = "PLACE ORDER")
	private WebElement placeOrderBtn;
	
	@AndroidFindBy(accessibility = "Thank you")
	private WebElement thankYou;

	public void addItem() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		womenOption.click();
		allWomenOption.click();
		addToWishList.click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		}
	
	public void removeItem() throws InterruptedException {
		myWishList.click();
		removeBtn.click();
		driver.navigate().back();
		}
	public void proceedToCheckOut() throws InterruptedException {
		Thread.sleep(5000);
		myWishList.click();
		Thread.sleep(5000);
		addToCart.click();
		Thread.sleep(5000);
		addToCartBtn.click();
		Thread.sleep(5000);
		closeBtn.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
	}
	
	public void checkoutProcessFreeShipping(String OrderSummary) throws InterruptedException {
	    Actions actions = new Actions(driver);
		myCart.click();
//		scrollUp(checkOutBtn);
		Thread.sleep(5000);
		checkOutBtn.click();;
//		addNewAdd.click();
		Thread.sleep(10000);
//		Thread.sleep(2000);
		cashOnDelivery.click();
		scrollUp(orderComment);
		Thread.sleep(2000);
		orderComment.click();
		actions.moveToElement(orderComment).sendKeys(OrderSummary).perform();
		driver.navigate().back();
		Thread.sleep(2000);
		placeOrderBtn.click();
		Thread.sleep(2000);
		thankYou.click();
	}
	
	public void guestAddProduct() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		womenOption.click();
		allWomenOption.click();
		addToWishList.click();
		Thread.sleep(3000);
		}
	
	public boolean verifyProductAdded() {
		boolean flag = true;
		if(!verifyWhishlist.isDisplayed()) {
			flag = false;
		}
		else {
			flag = true;
		}
		return flag;
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
	                    "percent", 3.0
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
