package SignUp;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import AndroidUtils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUp_Page_Objective extends AndroidActions{
	
	public AppiumDriver driver;
	public SignUp_Page_Objective(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Sign Up Button")
	private WebElement signupbtn;
	
	@AndroidFindBy(accessibility = "Email Address Text Field CustomTextFormField - Sign Up screen")
	private WebElement emailid;
	
	@AndroidFindBy(accessibility = "Confirm Email Address Text Field CustomTextFormField - Sign Up screen")
	private WebElement confEmailid;
	
	@AndroidFindBy(accessibility = "Password Text Field CustomTextFormField - Sign Up screen")
	private WebElement password;
	
	@AndroidFindBy(accessibility = "Confirm Password  Text Field CustomTextFormField - Sign Up screen")
	private WebElement confPassword;
	
	@AndroidFindBy(accessibility = "Phone Number Text Field CommonTextPhoneField - Sign Up screen")
	private WebElement mobNum;
	
	@AndroidFindBy(accessibility = "First Name Text Field CustomTextFormField - Sign Up screen")
	private WebElement firstName;
	
	@AndroidFindBy(accessibility = "Last Name Text Field CustomTextFormField - Sign Up screen")
	private WebElement lastName;
	
	//I agree that Veralusso may collect my personal information for marketing purposes (newsletters, news and promotions). checkbox
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.CheckBox[1]")
	private WebElement checkBox1;
	
	//I agree that Solo Luxury may collect my personal information to create a profile of my shopping habits.
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.CheckBox[2]")
	private WebElement checkBox2;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, \"Sign Up Button\")]")
	private WebElement signUpBTN;
	
	@AndroidFindBy(accessibility = "Logout Button GestureDetector - Profile Screen")
	private WebElement logOut;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Inside my account \"]")
	private WebElement insideMyAccount;

	
	public void UserRegistration(String emailaddress, String pass, String num, String FirstName, String LastName) throws InterruptedException {
		Actions actions = new Actions(driver);
		signupbtn.click();
		emailid.click();
//		emailid.sendKeys(email);
		actions.moveToElement(emailid).sendKeys(emailaddress).perform();
		confEmailid.click();
//		confEmailid.sendKeys(email);
		actions.moveToElement(confEmailid).sendKeys(emailaddress).perform();
		password.click();
//		password.sendKeys(pass);
		actions.moveToElement(password).sendKeys(pass).perform();
		confPassword.click();
//		confPassword.sendKeys(pass);
		actions.moveToElement(confPassword).sendKeys(pass).perform();
		mobNum.click();
//		mobNum.sendKeys(num);
		actions.moveToElement(mobNum).sendKeys(num).perform();
		firstName.click();
//		firstName.sendKeys(FirstName);
		actions.moveToElement(firstName).sendKeys(FirstName).perform();
		lastName.click();
//		lastName.sendKeys(LastName);
		actions.moveToElement(lastName).sendKeys(LastName).perform();
		super.hideKeyboard();
		checkBox1.click();
		checkBox2.click();
		signUpBTN.click();
	}
	
//	public void enterEmail(String email) throws InterruptedException {
//		Actions actions = new Actions(driver);
//		emailid.click();
////		emailid.sendKeys(email);
//		actions.moveToElement(emailid).sendKeys(email).perform();
//		confEmailid.click();
////		confEmailid.sendKeys(email);
//		actions.moveToElement(confEmailid).sendKeys(email).perform();
//	}
//	
//	public void enterPassword(String pass) throws InterruptedException {
//		Actions actions = new Actions(driver);
//		password.click();
////		password.sendKeys(pass);
//		actions.moveToElement(password).sendKeys(pass).perform();
//		confPassword.click();
////		confPassword.sendKeys(pass);
//		actions.moveToElement(confPassword).sendKeys(pass).perform();
//	}
//	
//	public void enterfirstandlastName(String FirstName, String LastName) throws InterruptedException{
//		Actions actions = new Actions(driver);
//		firstName.click();
////		firstName.sendKeys(FirstName);
//		actions.moveToElement(firstName).sendKeys(FirstName).perform();
//		lastName.click();
////		lastName.sendKeys(LastName);
//		actions.moveToElement(lastName).sendKeys(LastName).perform();
//	}
	
	public void logoutFromPage() throws InterruptedException {
		scrollUp(logOut);
	}
	
	public void signupError() throws InterruptedException {
		signupbtn.click();
		signUpBTN.click();
		
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
	                    "percent", 3.0
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

public boolean verifySignUpError() {

boolean flag = true;
if(!insideMyAccount.isDisplayed()) {
	flag = false;
}
else {
	flag = true;
}
return flag;
}

public boolean verifyUserSignUp() {
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
