package My_tickets_page;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import AndroidUtils.AndroidActions;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class My_tickets_page_Objects extends AndroidActions{
	
	public AppiumDriver driver;

	public My_tickets_page_Objects(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, \"Track Your Ticket By Email\")]")
	private WebElement ticketByEmail;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[1]")
	private WebElement emailID;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
	private WebElement password;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Login\"]")
	private WebElement loginBtn;
	
public void scrollToText(String text) {
		
		driver.findElement(AppiumBy.androidUIAutomator(
				("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ text + "\").instance(0))"))).click();
}

public void scrollDown(String elementname) {
	driver.findElement(AppiumBy.androidUIAutomator(("new UiScrollable(new UiSelector()).scrollable(true).instance(0).scrollIntoView(new UiSelector()"+".textMatches(\""+elementname+"\").instance(0)")));
	}
	
	
	public void TrackticketByEmail(String email, String pass) throws InterruptedException {
		Actions actions = new Actions(driver);
		ticketByEmail.click();
		emailID.click();
//		emailID.sendKeys(email);
		actions.moveToElement(emailID).sendKeys(email).perform();
		password.click();
//		password.sendKeys(pass);
		actions.moveToElement(password).sendKeys(pass).perform();
		loginBtn.click();
		
	}
	
	public void guestUsertracking(String email, String pass) throws InterruptedException {
		Actions actions = new Actions(driver);
		ticketByEmail.click();
		emailID.click();
//		emailID.sendKeys(email);
		actions.moveToElement(emailID).sendKeys(email).perform();
		password.click();
//		password.sendKeys(pass);
		actions.moveToElement(password).sendKeys(pass).perform();
		loginBtn.click();
	}
	
	public void verifyTicket() {
		
	}
}
