package My_coupons_page;

import java.time.Duration;

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

public class My_coupons_page_Objects extends AndroidActions{
	
	public AppiumDriver driver;
	public My_coupons_page_Objects(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'My Coupons Button')]")
	private WebElement myCoupons;
	
	@AndroidFindBy(accessibility = "Apply")
	private WebElement applyBtn;
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement enterCodeField;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'View Coupon List')]")
	private WebElement viewCouponList;
	
//	View the Coupon List to apply coupons. There are no elements present, so I tried manually to ensure the test case will complete the functionality.
	
	@AndroidFindBy(accessibility = "Okay")
	private WebElement okBtn;
	
	@AndroidFindBy(accessibility = "Remove Coupon")
	private WebElement removeBtn;
	
	@AndroidFindBy(accessibility = "Bottom Bar Svg Picture icon Tab 4")
	private WebElement myCart;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Checkout button')]")
	private WebElement checkOutBtn;
	
	@AndroidFindBy(accessibility = "Bottom Bar Svg Picture icon Tab 3")
	private WebElement myAccountScreen;
	
	
	public void applyCoupon(String coupon) throws InterruptedException {
		Actions actions = new Actions(driver);
		myCart.click();
		Thread.sleep(5000);
		scrollUp(enterCodeField);
		enterCodeField.click();
		actions.moveToElement(enterCodeField).sendKeys(coupon).perform();
		Thread.sleep(5000);
		applyBtn.click();
		Thread.sleep(5000);
//		okBtn.click();
		Thread.sleep(5000);
		super.hideKeyboard();
		checkOutBtn.click();
		Thread.sleep(5000);
	}
	
	public void applyInvladCoupon(String coupon) throws InterruptedException {
		Actions actions = new Actions(driver);
		myCart.click();
		scrollUp(enterCodeField);
		enterCodeField.click();
		actions.moveToElement(enterCodeField).sendKeys(coupon).perform();
		applyBtn.click();
		okBtn.click();
		super.hideKeyboard();
		checkOutBtn.click();
	}
	
	public void applyExpiredCoupon(String coupon) throws InterruptedException {
		Actions actions = new Actions(driver);
		myCart.click();
		scrollUp(enterCodeField);
		enterCodeField.click();
		actions.moveToElement(enterCodeField).sendKeys(coupon).perform();
		applyBtn.click();
		okBtn.click();
		super.hideKeyboard();
		checkOutBtn.click();
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
	                    "percent", 10.0
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
