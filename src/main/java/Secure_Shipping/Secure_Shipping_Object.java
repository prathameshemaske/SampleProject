package Secure_Shipping;

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

public class Secure_Shipping_Object extends AndroidActions{
	
	public AppiumDriver driver;
	public Secure_Shipping_Object(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Secure Shopping Button GestureDetector - Profile Screen")
	private WebElement shopping;
	
	
	public void secureShoppingMenu() throws InterruptedException {
		shopping.click();
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
