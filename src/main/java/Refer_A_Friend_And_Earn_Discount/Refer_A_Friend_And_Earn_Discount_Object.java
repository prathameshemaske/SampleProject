package Refer_A_Friend_And_Earn_Discount;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Refer_A_Friend_And_Earn_Discount_Object {
	public AppiumDriver driver;

	public Refer_A_Friend_And_Earn_Discount_Object(AppiumDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Refer Friend Button GestureDetector - Profile Screen")
	public WebElement referAFriend;
	
	@AndroidFindBy(accessibility = "First Name Form Field")
	public WebElement enterFirstName;
	
	@AndroidFindBy(accessibility = "Email Form Field")
	public WebElement enterEmail;
	
	@AndroidFindBy(accessibility = "Phone Number Field")
	public WebElement enterNum;
	
	@AndroidFindBy(accessibility = "Friend First Name Field")
	public WebElement friendFirstName;
	
	@AndroidFindBy(accessibility = "Friend First Email Field")
	public WebElement friendEmail;
	
	@AndroidFindBy(accessibility = "Friend Phone Number Field")
	public WebElement friendNum;
	
	@AndroidFindBy(accessibility = "Register Button - Refer Friend")
	public WebElement registerBtn;
	
	@AndroidFindBy(accessibility = "Logout Button GestureDetector - Profile Screen")
	private WebElement logOut;
	
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
	
	public void scrollUp(String name, String email, String mobNum, String friendName, String friendemail,String friendMobNum) throws InterruptedException {
		Actions actions = new Actions(driver);
		scrollUp(referAFriend);
		enterFirstName.click();
//		enterFirstName.sendKeys(name);
		actions.moveToElement(enterFirstName).sendKeys(name).perform();
		enterEmail.click();
//		enterEmail.sendKeys(email);
		actions.moveToElement(enterEmail).sendKeys(email).perform();
		enterNum.click();
//		enterNum.sendKeys(mobNum);
		actions.moveToElement(enterNum).sendKeys(mobNum).perform();
		friendFirstName.click();
//		friendFirstName.sendKeys(friendName);
		actions.moveToElement(friendFirstName).sendKeys(friendName).perform();
		friendEmail.click();
//		friendEmail.sendKeys(friendemail);
		actions.moveToElement(friendEmail).sendKeys(friendemail).perform();
		friendNum.click();
//		friendNum.sendKeys(friendMobNum);
		actions.moveToElement(friendNum).sendKeys(friendMobNum).perform();
		registerBtn.click();
		driver.navigate().back();
	}

	
	public void logoutFromPage() throws InterruptedException {
		scrollUp(logOut);
	}
	
}