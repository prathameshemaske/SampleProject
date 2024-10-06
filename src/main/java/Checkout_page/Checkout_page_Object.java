package Checkout_page;

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

public class Checkout_page_Object extends AndroidActions{
		
		public AppiumDriver driver;
		public Checkout_page_Object(AndroidDriver driver) {
			
			super(driver);
			this.driver = driver;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}

		@AndroidFindBy(accessibility = "Bottom Bar Svg Picture icon Tab 3")
		private WebElement myAccountScreen;
		
		@AndroidFindBy(accessibility = "Bottom Bar Svg Picture icon Tab 4")
		private WebElement myCart;
		
		@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Checkout button')]")
		private WebElement checkOutBtn;
		
		@AndroidFindBy(accessibility = "New Address")
		private WebElement addNewAdd;
		
		@AndroidFindBy(accessibility = "Unselected shipping method")
		private WebElement standerdShipping;
		
		@AndroidFindBy(accessibility = "Unselected shipping method")
		private WebElement freeShipping;
		
		@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Unselected Payment method\"])[1]")
		private WebElement checkMoneyOrder;
		
		@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Unselected Payment method\"])[1]")
		private WebElement cashOnDelivery;
		
		@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Unselected Payment method\"])[2]")
		private WebElement adyenStoredPayment;
		
		@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Unselected Payment method\"])[3]")
		private WebElement cardsPayment;
		
		@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View[8]")
		private WebElement billingandShippingAddCheckBox;
		
		@AndroidFindBy(accessibility = "New Address")
		private WebElement firestAddRadioBtn;
		
		@AndroidFindBy(xpath = "//android.widget.EditText")
		private WebElement orderComment;
		
		@AndroidFindBy(accessibility = "PLACE ORDER")
		private WebElement placeOrderBtn;
		
		@AndroidFindBy(accessibility = "Ok")
		private WebElement errorPoupOkBtn;
		
		@AndroidFindBy(accessibility = "Continue Shopping")
		private WebElement countinueShoppingBtn;
		
		@AndroidFindBy(accessibility = "Thank you")
		private WebElement thankYou;
		
		@AndroidFindBy(accessibility = "Warning")
		private WebElement warningError;
		
		@AndroidFindBy(accessibility = "Ok")
		private WebElement warningOK;
				
		public void checkoutProcessFreeShipping(String OrderSummary) throws InterruptedException {
		    Actions actions = new Actions(driver);
			myCart.click();
//			scrollUp(checkOutBtn);
			Thread.sleep(5000);
			checkOutBtn.click();;
//			addNewAdd.click();
			Thread.sleep(10000);
//			Thread.sleep(2000);
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
	
		public void checkoutProcessCardsPayment(String OrderSummary) throws InterruptedException {
		    Actions actions = new Actions(driver);
			myCart.click();
//			scrollUp(checkOutBtn);
			Thread.sleep(5000);
			checkOutBtn.click();
//			addNewAdd.click();
			Thread.sleep(10000);
//			Thread.sleep(2000);
			cardsPayment.click();
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
		public void checkoutProcessadyenStoredPayment(String OrderSummary) throws InterruptedException {
		    Actions actions = new Actions(driver);
			myCart.click();
//			scrollUp(checkOutBtn);
			Thread.sleep(5000);
			checkOutBtn.click();
//			addNewAdd.click();
			Thread.sleep(10000);
//			Thread.sleep(2000);
			adyenStoredPayment.click();
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
		
		public void checkoutProcessCheckMoneyOrder(String OrderSummary) throws InterruptedException {
		    Actions actions = new Actions(driver);
			myCart.click();
//			scrollUp(checkOutBtn);
			Thread.sleep(5000);
			checkOutBtn.click();
//			addNewAdd.click();
			Thread.sleep(10000);
//			Thread.sleep(2000);
			checkMoneyOrder.click();
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
		
		public void checkoutProcesswithStanderdShipping(String OrderSummary) throws InterruptedException {
		    Actions actions = new Actions(driver);
			myCart.click();
//			scrollUp(checkOutBtn);
			Thread.sleep(5000);
			checkOutBtn.click();
//			addNewAdd.click();
			Thread.sleep(10000);
			standerdShipping.click();
			Thread.sleep(2000);
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
		
		public void checkoutWithCoupon() throws InterruptedException {
//			checkOutBtn.click();
//			addNewAdd.click();
			Thread.sleep(10000);
//			standerdShipping.click();
//			Thread.sleep(2000);
			cashOnDelivery.click();
			scrollUp(orderComment);
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			placeOrderBtn.click();
			Thread.sleep(2000);
			thankYou.click();
			Thread.sleep(2000);
		}
		
		public void checkoutProcesswithAddNewShippingAdd() throws InterruptedException {
			myCart.click();
//			scrollUp(checkOutBtn);
			Thread.sleep(5000);
			checkOutBtn.click();
//			addNewAdd.click();
			Thread.sleep(10000);
			addNewAdd.click();
			Thread.sleep(5000);
		}
		public void checkoutProcesswithNewShippingAdd(String OrderSummary) throws InterruptedException {
			Actions actions = new Actions(driver);
			standerdShipping.click();
			Thread.sleep(2000);
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
		
		public void completeOrder() throws InterruptedException {
		countinueShoppingBtn.click();
		Thread.sleep(5000);
		myAccountScreen.click();
		Thread.sleep(5000);
		}
		
		public void guestUsercheckout() throws InterruptedException {
			myCart.click();
			scrollUp(checkOutBtn);
			Thread.sleep(5000);
			addNewAdd.click();
			driver.navigate().back();
			myAccountScreen.click();
		}
		
		public void errorWhileCheckoutProcess(String OrderSummary) throws InterruptedException {
		    Actions actions = new Actions(driver);
			myCart.click();
			Thread.sleep(5000);
			checkOutBtn.click();;
			Thread.sleep(10000);
			cashOnDelivery.click();
			scrollUp(orderComment);
			Thread.sleep(2000);
			orderComment.click();
			actions.moveToElement(orderComment).sendKeys(OrderSummary).perform();
			driver.navigate().back();
			Thread.sleep(2000);
			placeOrderBtn.click();
			Thread.sleep(2000);
			warningError.click();
			Thread.sleep(2000);
			warningOK.click();
			Thread.sleep(2000);
			super.hideKeyboard();
			driver.navigate().back();
			myAccountScreen.click();
			Thread.sleep(2000);
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
		
		public boolean verifyOrderPlaceSuccessful() {
			
			boolean flag = true;
			if(!thankYou.isDisplayed()) {
				flag = false;
			}
			else {
				flag = true;
			}
			return flag;
		}
		
		public boolean verifyErrorWhileOrderPlace() {
			
			boolean flag = true;
			if(!warningError.isDisplayed()) {
				flag = false;
			}
			else {
				flag = true;
			}
			return flag;
		}
}
