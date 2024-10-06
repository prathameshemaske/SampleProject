package Designers_Tab;

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

public class Designers_Tab_Page_Object extends AndroidActions{
	
	public AppiumDriver driver;

	public Designers_Tab_Page_Object(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Bottom Bar Svg Picture icon Tab 1")
	private WebElement designerTab;
	
	@AndroidFindBy(xpath = "//android.widget.EditText/android.widget.ImageView")
	private WebElement searchBrand;
	
	@AndroidFindBy(accessibility = "Brand List InkWell - Designer Screen puma")
	private WebElement pumaBrandName;
	
	@AndroidFindBy(xpath = "//android.view.View[normalize-space(@content-desc)='Brand List InkWell - Designer Screen aquazzura firenze']")
	private WebElement aquazzurafirenze;
	
	@AndroidFindBy(accessibility = "Brand List InkWell - Designer Screen 1972 DESA")
	private WebElement desa1972;
	
	@AndroidFindBy(accessibility = "Brand List InkWell - Designer Screen B LOW THE BELT")
	private WebElement bSideBrand;
	
	public void brandsSearchbyName(String brandName) throws InterruptedException {
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		designerTab.click();
		Thread.sleep(3000);
		searchBrand.click();
		Thread.sleep(3000);
		searchBrand.clear();
		actions.moveToElement(searchBrand).sendKeys(brandName).perform();
		pumaBrandName.click();
		Thread.sleep(3000);
		super.navigateBack();
		Thread.sleep(3000);
		super.hideKeyboard();
		Thread.sleep(3000);
	}
	
	public void selectBrandFromList() throws InterruptedException {
		Thread.sleep(3000);
		designerTab.click();
		Thread.sleep(3000);
		aquazzurafirenze.click();
		Thread.sleep(3000);
		super.navigateBack();
		Thread.sleep(3000);
	}
	
	public void selectBrandByScrollingBrandList() throws InterruptedException {
		Thread.sleep(3000);
		designerTab.click();
		Thread.sleep(5000);
		scrollUpbyBrnd(bSideBrand);
//		Thread.sleep(3000);
//		bSideBrand.click();
		Thread.sleep(3000);
		super.navigateBack();
		Thread.sleep(3000);
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
	public void scrollUpbyBrnd(WebElement element) {
		Actions actions = new Actions(driver);

	    // Move the cursor upwards by 200 pixels (adjust value as needed)
	    actions.clickAndHold(aquazzurafirenze)
	    		.moveByOffset(0, -2500)// Move upwards by 200 pixels
	    		.release()
	    		.perform();
	    element.click();
		    }
}
