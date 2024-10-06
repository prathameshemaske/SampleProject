package Login_Page;

//import java.time.Duration;

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

public class Login_Page_Objective extends AndroidActions{
	
	public AppiumDriver driver;
	public Login_Page_Objective(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Login
	
//	Actions actions = new Actions(driver);
	
	@AndroidFindBy(accessibility = "Log in Button")
	private WebElement loginButton;
	
//	Login
	@AndroidFindBy(accessibility = "Email Id Form Field - Login screen")
	private WebElement emailid;
	
	@AndroidFindBy(accessibility = "Password Form Field - Login screen")
	private WebElement password;
	
	@AndroidFindBy(accessibility = "Login Button CustomOutlinedButton - Login screen")
	private WebElement loginbtn;
	
	//Forgot Password
	
	@AndroidFindBy(accessibility = "Forgot Password Button - Login screen")
	private WebElement forgotPasswordLink;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement enterid;
	
	@AndroidFindBy(accessibility = "RESET MY PASSWORD")
	private WebElement resetPassbtn;
	
	@AndroidFindBy(accessibility = "Back to login")
	private WebElement backToLoginbtn;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Inside my account \"]")
	private WebElement insideMyAccount;
	
	@AndroidFindBy(accessibility = "Logout Button GestureDetector - Profile Screen")
	private WebElement logOut;
	

	
	public void ExistinguserLogin(String email, String Pass) throws InterruptedException {
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
		loginButton.click();
		emailid.click();
//		emailid.sendKeys(email);
		actions.moveToElement(emailid).sendKeys(email).perform();
		password.click();
		actions.moveToElement(password).sendKeys(Pass).perform();
//		password.sendKeys(Pass);
		loginbtn.click();
		Thread.sleep(5000);
	}
	
	public void ForgotPassword(String emailaddress) throws InterruptedException {
		Actions actions = new Actions(driver);
		loginButton.click();
		Thread.sleep(5000);
		forgotPasswordLink.click();
		enterid.click();
		enterid.sendKeys(emailaddress);
		actions.moveToElement(enterid).sendKeys(emailaddress).perform();
		super.hideKeyboard();
		Thread.sleep(5000);
		resetPassbtn.click();
//		backToLoginbtn.click();
	}
	
	public void verifyLogout(String emailaddress, String pass) throws InterruptedException {
		Actions actions = new Actions(driver);
		loginButton.click();
		emailid.click();
//		emailid.sendKeys(emailaddress);
		actions.moveToElement(emailid).sendKeys(emailaddress).perform();
		password.click();
//		password.sendKeys(pass);
		actions.moveToElement(password).sendKeys(pass).perform();
		loginbtn.click();
		scrollUp(logOut);
	}
	
	public void logoutFromPage() throws InterruptedException {
		scrollUp(logOut);
	}
	
	public void existingLogin(String email, String Pass) throws InterruptedException {
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		emailid.click();
//		emailid.sendKeys(email);
		actions.moveToElement(emailid).sendKeys(email).perform();
		password.click();
		actions.moveToElement(password).sendKeys(Pass).perform();
//		password.sendKeys(Pass);
		loginbtn.click();
		Thread.sleep(2000);
	}
	
	public void errors() throws InterruptedException {
		loginButton.click();
		loginbtn.click();
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

		public void scrollLogout() throws InterruptedException {
			scrollUp(logOut);
			Thread.sleep(5000);
		}
	
	public boolean verifyUserLogin() {
		boolean flag = true;
		if(!insideMyAccount.isDisplayed()) {
			flag = false;
		}
		else {
			flag = true;
		}
		return flag;
	}
	
	public boolean verifyLoginError() {
		
		boolean flag = true;
		if(!insideMyAccount.isDisplayed()) {
			flag = false;
		}
		else {
			flag = true;
		}
		return flag;
	}
}

