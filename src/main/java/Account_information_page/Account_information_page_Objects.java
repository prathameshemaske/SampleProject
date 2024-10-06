package Account_information_page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import com.google.common.collect.ImmutableMap;
import AndroidUtils.AndroidActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Account_information_page_Objects extends AndroidActions{
	
	public AppiumDriver driver;

	public Account_information_page_Objects(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@AndroidFindBy(accessibility = "Bottom Bar Svg Picture icon Tab 3")
	private WebElement myAccountScreen;

	//Account Infomation
	@AndroidFindBy(accessibility = "Account Information Button GestureDetector - Profile Screen")
	private WebElement accountInformation;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Mr.\"]")
	private WebElement mrOption;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Ms.\"]")
	private WebElement msOption;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]//android.widget.EditText[1]")
	private WebElement FirstName;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]//android.widget.EditText[2]")
	private WebElement LastName;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]//android.widget.EditText[3]")
	private WebElement emailId;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)")
	private WebElement mobNum;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]//android.view.View[2]/android.view.View[3]")
	private WebElement dateOfBirth;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"*is Required\").instance(0)")
	private WebElement error;
	
	//android.widget.SeekBar[@content-desc="June"]
	//android.widget.SeekBar[@content-desc="27"]
	//android.widget.SeekBar[@content-desc="1993"]
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
	private WebElement submitbtn;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(4)")
	private WebElement MarriageStatus;
	
	@AndroidFindBy(accessibility = "Update")
	private WebElement updatebtn;
	
	
	public void clickOnMyAccount() throws InterruptedException{
		Thread.sleep(5000);
		myAccountScreen.click();
		Thread.sleep(2000);
	}
	
	public void errorAccount() throws InterruptedException{
		accountInformation.click();
		updatebtn.click();
		error.click();
	}
	
	public void clickOnAccountInfo() throws InterruptedException{
		accountInformation.click();
	}
	
	
	
	public void setGender(String gender) {
		if (gender.contains("female"))
			msOption.click();
		else
			mrOption.click();	}
	
	
	public void personalInfo(String firstname , String lastname, String id, String num, String dob, String status) throws InterruptedException{
		Actions actions = new Actions(driver);
		FirstName.click();
		actions.moveToElement(FirstName).sendKeys(firstname).perform();
//		FirstName.sendKeys(firstname);
		LastName.click();
		actions.moveToElement(LastName).sendKeys(lastname).perform();
//		LastName.sendKeys(lastname);
		otherDetails(id, num, dob, status);
//		emailId.click();
//		emailId.sendKeys(id);
//		mobNum.click();
//		mobNum.sendKeys(num);
//		dateOfBirth.click();
//		dateOfBirth.sendKeys(dob);
//		submitbtn.click();
		super.hideKeyboard();
		updatebtn.click();
		driver.navigate().back();
	}
	
	public void otherDetails(String id, String num, String dob, String status) throws InterruptedException {
		Actions actions = new Actions(driver);
		emailId.click();
		actions.moveToElement(emailId).sendKeys(id).perform();
//		emailId.sendKeys(id);
		scrollUp(mobNum);
		mobNum.click();
		actions.moveToElement(mobNum).sendKeys(num).perform();
		scrollUp(MarriageStatus);
//		mobNum.sendKeys(num);
//		dateOfBirth.click();
//		dateOfBirth.sendKeys(dob);
//		submitbtn.click();
		MarriageStatus.click();
		actions.moveToElement(MarriageStatus).sendKeys(status).perform();
//		MarriageStatus.sendKeys(status);
	}
	
	public boolean verifyBlankSubmit() {
		
		boolean flag = true;
		if(!error.isDisplayed()) {
			flag = false;
		}
		else {
			flag = true;
		}
		return flag;
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
