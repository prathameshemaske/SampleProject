package Contact_Us;

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

public class Contact_Us_Page_Objective extends AndroidActions{
	
	public AppiumDriver driver;

	public Contact_Us_Page_Objective(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, \"Contact Us\")]")
	private WebElement contactUs;
	
	@AndroidFindBy(accessibility = "First Name Form Field")
	private WebElement enterFirestName;
	
	@AndroidFindBy(accessibility = "Last Name Form Field")
	private WebElement enterLastName;
	
	@AndroidFindBy(accessibility = "Email Form Field")
	private WebElement enterEmailAddress;
	
	@AndroidFindBy(accessibility = "Phone Form Field")
	private WebElement enterPhoneNumer;
	
	@AndroidFindBy(accessibility = "Enquiry Text Field")
	private WebElement typeOfEnquery;
	
	@AndroidFindBy(accessibility = "Product")
	private WebElement dropDownOption;
	
	@AndroidFindBy(accessibility = "Subject Text Field")
	private WebElement enterSubject;
	
	@AndroidFindBy(accessibility = "Whats on your mind Form Field")
	private WebElement whatsOnYourMind;
	
	@AndroidFindBy(accessibility = "Contact Us Continue Button")
	private WebElement continueBtn;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(1)")
	private WebElement liveChatBtn;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
	private WebElement emailID;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
	private WebElement phoneNumber;
	
	@AndroidFindBy(accessibility = "Start the Chat")
	private WebElement startChat;
	
	@AndroidFindBy(accessibility = "Logout Button GestureDetector - Profile Screen")
	private WebElement logOut;
	
	public void contactForm(String nameFirst, String nameLast, String email, String number, String subject, String message) throws InterruptedException {
		Actions actions = new Actions(driver);
		contactUs.click();
		enterFirestName.click();
//		enterFirestName.sendKeys(nameFirst);
		actions.moveToElement(enterFirestName).sendKeys(nameFirst).perform();
		enterLastName.click();
//		enterLastName.sendKeys(nameLast);
		actions.moveToElement(enterLastName).sendKeys(nameLast).perform();
		enterEmailAddress.click();
//		enterEmailAddress.sendKeys(email);
		actions.moveToElement(enterEmailAddress).sendKeys(email).perform();
		enterPhoneNumer.click();
//		enterPhoneNumer.sendKeys(number);
		actions.moveToElement(enterPhoneNumer).sendKeys(number).perform();
		typeOfEnquery.click();
		dropDownOption.click();
		enterSubject.click();
//		enterSubject.sendKeys(subject);
		actions.moveToElement(enterSubject).sendKeys(subject).perform();
		scrollUp(whatsOnYourMind);
		Thread.sleep(2000);
		whatsOnYourMind.click();
//		whatsOnYourMind.sendKeys(message);
		actions.moveToElement(whatsOnYourMind).sendKeys(message).perform();
		super.hideKeyboard();
		continueBtn.click();
		driver.navigate().back();
	}
	
	public void liveChatOption(String email, String number) throws InterruptedException {
		Actions actions = new Actions(driver);
		contactUs.click();
		liveChatBtn.click();
		emailID.click();
//		emailID.sendKeys(email);
		actions.moveToElement(emailID).sendKeys(email).perform();
		phoneNumber.click();
//		phoneNumber.sendKeys(number);
		actions.moveToElement(phoneNumber).sendKeys(number).perform();
		startChat.click();
		driver.navigate().back();
		
	}
	
	public void scrollLogout() throws InterruptedException {
		scrollUp(logOut);
		
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
	                    "height", 300, 
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
