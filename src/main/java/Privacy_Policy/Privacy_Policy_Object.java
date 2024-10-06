package Privacy_Policy;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Privacy_Policy_Object {
	
	public AppiumDriver driver;

	public Privacy_Policy_Object(AppiumDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Privacy Policy')]")
	private WebElement privacy;
	
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

		public void scrollPrivacy() throws InterruptedException {
			scrollUp(privacy);
			driver.navigate().back();
		}
}

