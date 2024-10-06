package Affiliate_Program;

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

public class Affiliate_Program_Object extends AndroidActions{
	
	public AppiumDriver driver;

	public Affiliate_Program_Object(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Affiliate Program Button GestureDetector - Profile Screen")
	public WebElement affiliateProgram;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Join the affiliate program\"]")
	public WebElement joinTheAffiliateProgram;
	
	@AndroidFindBy(accessibility = "First Name Form Field")
	public WebElement enterFirstName;
	
	@AndroidFindBy(accessibility = "Last Name Form Field")
	public WebElement enterLastName;

	@AndroidFindBy(accessibility = "Email Form Field")
	public WebElement enterEmail;
	
	@AndroidFindBy(accessibility = "Phone Form Field")
	public WebElement enterNumber;
	
	@AndroidFindBy(accessibility = "Unique Visitors Drop Down")
	public WebElement slectDropdown;
	
	@AndroidFindBy(accessibility = "Page View Drop Down")
	public WebElement dropdown;
	
	//Select unique visitors/Month Dropdown 1
	@AndroidFindBy(accessibility = "Mr.")
	public WebElement mr;
	
	@AndroidFindBy(accessibility = "Ms.")
	public WebElement ms;
	
	//Select unique visitors/Month Dropdown 1
	
	@AndroidFindBy(accessibility = "Mr.")
	public WebElement mr1;
	
	@AndroidFindBy(accessibility = "Ms")
	public WebElement ms2;
	
	//Select Country DropDown
	
	@AndroidFindBy(accessibility = "Country Text Field\\nSelect")
	public WebElement country;
	
	@AndroidFindBy(accessibility = "(//android.view.View[@content-desc=\"Mr.\"]")
	public WebElement countrySelection;
	
	@AndroidFindBy(accessibility = "Address Line 1 Form Field")
	public WebElement addLine1;

	@AndroidFindBy(accessibility = "Address Line 2 Form Field")
	public WebElement addLine2;
	
	@AndroidFindBy(accessibility = "Post Code Form Field")
	public WebElement postCode;

	@AndroidFindBy(accessibility = "City Form Field")
	public WebElement enterCity;
	
	@AndroidFindBy(accessibility = "Lets Go Button - Aafiliate Program")
	public WebElement letsGoBtn;
	
	@AndroidFindBy(accessibility = "Logout Button GestureDetector - Profile Screen")
	private WebElement logOut;
	
	@AndroidFindBy(accessibility = "Contacts")
	public WebElement contacts;
	
//	public void setGender(String gender) {
//		if (gender.contains("female"))
//			msOption.click();
//		else
//			mrOption.click();	}
	
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
	
	public void scrollUp(String firstName, String lastName, String email, String number, String add1, String add2, String code, String city) throws InterruptedException {
		Actions actions = new Actions(driver);
		scrollUp(contacts);
		affiliateProgram.click();
		scrollUp(letsGoBtn);
		enterFirstName.click();
		actions.moveToElement(enterFirstName).sendKeys(firstName).perform();
//		enterFirstName.sendKeys(firstName);
		scrollUp(enterLastName);
		enterLastName.click();
		actions.moveToElement(enterLastName).sendKeys(lastName).perform();
//		enterLastName.sendKeys(lastName);
		enterEmail.click();
		actions.moveToElement(enterEmail).sendKeys(email).perform();
//		enterEmail.sendKeys(email);
		enterNumber.click();
//		enterNumber.sendKeys(number);
		actions.moveToElement(enterNumber).sendKeys(number).perform();
//		slectDropdown.click();
//		mr.click();
//		dropdown.click();
//		mr1.click();
		addLine1.click();
//		addLine1.sendKeys(add1);
		actions.moveToElement(addLine1).sendKeys(add1).perform();
		scrollUp(letsGoBtn);
		addLine2.click();
//		addLine2.sendKeys(add2);
		actions.moveToElement(addLine2).sendKeys(add2).perform();
		postCode.click();
//		postCode.sendKeys(code);
		actions.moveToElement(postCode).sendKeys(code).perform();
		enterCity.click();
//		enterCity.sendKeys(city);
		actions.moveToElement(enterCity).sendKeys(city).perform();
		super.hideKeyboard();
		Thread.sleep(2000);
//		country.click();
//		countrySelection.click();
		letsGoBtn.click();
		driver.navigate().back();
	}
	
	public void logoutFromPage() throws InterruptedException {
		scrollUp(logOut);
	}		

		
	}

