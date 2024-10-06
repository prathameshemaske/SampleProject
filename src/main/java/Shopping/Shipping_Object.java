package Shopping;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import AndroidUtils.AndroidActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Shipping_Object extends AndroidActions{
	
	public AppiumDriver driver;
	public Shipping_Object(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Shipping Button GestureDetector - Profile Screen")
	private WebElement shipping;
	
	@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Shipping\"])[1]")
	private WebElement shippingHeading;
	
	@AndroidFindBy(accessibility = "Duties & Taxes")
	private WebElement Duties;
	
	@AndroidFindBy(accessibility = "Same Day Delivery")
	private WebElement SameDayDelivery;
	
	@AndroidFindBy(accessibility = "Order Tracking")
	private WebElement OrderTracking;
	
	@AndroidFindBy(accessibility = "Cancellations")
	private WebElement Cancellations;
	
	@AndroidFindBy(accessibility = "F90 Store To Door In 90 Minutes")
	private WebElement F90Store;
	
	@AndroidFindBy(accessibility = "Customised Items")
	private WebElement CustomisedItems;
	
	public void shippingMenu() throws InterruptedException {
		scrollUp(shipping);
		
	}	
	public void shippingMenucontent() throws InterruptedException {
		Duties.click();
		Duties.click();
		SameDayDelivery.click();
		SameDayDelivery.click();
		OrderTracking.click();
		OrderTracking.click();
		Cancellations.click();
		Cancellations.click();
		F90Store.click();
		F90Store.click();
		scrollUp(CustomisedItems);
		CustomisedItems.click();
		driver.navigate().back();
	}
	
	public void scrollUp(WebElement element) {
//		driver.findElement(AppiumBy.androidUIAutomator(("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+ elementName +"\"))")));

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
	
	public boolean verifyShoppingContent() {
		
		boolean flag = true;
		if(!shippingHeading.isDisplayed()) {
			flag = false;
		}
		else {
			flag = true;
		}
		return flag;
	}
}
