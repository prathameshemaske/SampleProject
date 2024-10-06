package Terms_and_Conditions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Terms_and_Conditions_Object {

	public AppiumDriver driver;

	public Terms_and_Conditions_Object(AppiumDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Terms and Conditions')]")
	private WebElement terms;
	
public void scrollUp(WebElement element) {
		
		boolean canScrollMore;
	        do {
	            try {
	            	element.click();
	                return;
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
	        
	        throw new RuntimeException("Element not found after scrolling");
	    }

		public void scrollPrivacy() throws InterruptedException {
			scrollUp(terms);
			driver.navigate().back();
		}
}
