package Track_Order_Page;

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

public class Track_Order_Page_Object extends AndroidActions{

	public AppiumDriver driver;
	public Track_Order_Page_Object(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Track Order Guest Button GestureDetector - Profile Screen")
	private WebElement trackOrderbyGuest;

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
	private WebElement orderId;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
	private WebElement billingLastName;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
	private WebElement emailId;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)")
	private WebElement enterEmailId;

	@AndroidFindBy(accessibility = "Let's Go")
	private WebElement letsGoBtn;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"SUBSCRIBE\"]")
	private WebElement subscribeBtn;
	
	@AndroidFindBy(accessibility = "order track help")
	private WebElement trackhelp;
	
	@AndroidFindBy(accessibility = "Name Field - Special Request")
	private WebElement firstName;
	
	@AndroidFindBy(accessibility = "Last Name Field - Special Request")
	private WebElement lastName;
	
	@AndroidFindBy(accessibility = "Order Id Field - Special Request")
	private WebElement orderNumber;
	
	@AndroidFindBy(accessibility = "Email Field - Special Request")
	private WebElement emailID;
	
	@AndroidFindBy(accessibility = "Phone Field - Special Request")
	private WebElement num;
	
	@AndroidFindBy(accessibility = "Query Field - Special Request")
	private WebElement query;
	
	@AndroidFindBy(accessibility = "Submit Button - Special Request")
	private WebElement submitBtn;

	
	public void guestUser(String OrderID, String BillingLastName, String emailid) throws InterruptedException{
		Actions actions = new Actions(driver);
		scrollUp(trackOrderbyGuest);
		orderId.click();
//		orderId.sendKeys(OrderID);
		actions.moveToElement(orderId).sendKeys(OrderID).perform();
		billingLastName.click();
//		billingLastName.sendKeys(BillingLastName);
		actions.moveToElement(billingLastName).sendKeys(BillingLastName).perform();
		emailId.click();
//		emailId.sendKeys(emailid);
		actions.moveToElement(emailId).sendKeys(emailid).perform();
		letsGoBtn.click();
		driver.navigate().back();
		driver.navigate().back();
	}
	
	public void newsLatter(String EmailId) throws InterruptedException {
		Actions actions = new Actions(driver);
		trackOrderbyGuest.click();
		enterEmailId.click();
//		enterEmailId.sendKeys(EmailId);
		actions.moveToElement(enterEmailId).sendKeys(EmailId).perform();
		subscribeBtn.click();
	}
	
	public void orderTrack(String Name, String last, String ordernum, String email, String mobNum,String queries) throws InterruptedException {
		Actions actions = new Actions(driver);
		driver.navigate().back();
		trackhelp.click();
		firstName.click();
		actions.moveToElement(firstName).sendKeys(Name).perform();
		lastName.click();
		actions.moveToElement(lastName).sendKeys(last).perform();
		orderNumber.click();
		actions.moveToElement(orderNumber).sendKeys(ordernum).perform();
		emailID.click();
		actions.moveToElement(orderNumber).sendKeys(ordernum).perform();
		num.click();
		actions.moveToElement(num).sendKeys(mobNum).perform();
		query.click();
		actions.moveToElement(query).sendKeys(queries).perform();
		super.hideKeyboard();
		submitBtn.click();
		driver.navigate().back();
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
                    "percent", 2.0
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
