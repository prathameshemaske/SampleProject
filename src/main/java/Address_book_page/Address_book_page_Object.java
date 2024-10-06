package Address_book_page;

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

public class Address_book_page_Object extends AndroidActions{
	
	public AppiumDriver driver;

	public Address_book_page_Object(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Address book Button GestureDetector - Profile Screen")
	private WebElement AddBook;
	
	
	@AndroidFindBy(accessibility = "Add New Address")
	private WebElement AddNewAdd;
	
	@AndroidFindBy(accessibility = "First Name Field - Add Address")
	private WebElement FirstName;
	
	@AndroidFindBy(accessibility = "Last Name Field - Add Address")
	private WebElement LastName;
	
	@AndroidFindBy(accessibility = "Phone Field - Add Address")
	private WebElement mobNum;
	
	@AndroidFindBy(accessibility = "Address 1 Field - Add Address")
	private WebElement streetAdd1;
	
	@AndroidFindBy(accessibility = "Address 2 Field - Add Address")
	private WebElement streetAdd2;
	
	@AndroidFindBy(accessibility = "Address 3 Field - Add Address")
	private WebElement streetAdd3;
	
	@AndroidFindBy(accessibility = "City Field - Add Address")
	private WebElement city;
	
	@AndroidFindBy(accessibility = "Zip Field - Add Address")
	private WebElement zipCode;
	
	@AndroidFindBy(accessibility = "Country Field - Add Address")
	private WebElement countryName;
	
	@AndroidFindBy(accessibility = "Save Address - Add Address")
	private WebElement SaveAddressBtn;
	
	@AndroidFindBy(accessibility = "India")
	private WebElement country_India;
	
	@AndroidFindBy(accessibility = "State Field - Add Address")
	private WebElement stateSelect;
	
	@AndroidFindBy(accessibility = "Maharashtra")
	private WebElement stateMaha;
	
//	Guest User Detail
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[1]")
	private WebElement guestEmail;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
	private WebElement guestFirstName;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[3]")
	private WebElement guestLastName;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[4]")
	private WebElement guestAdd1;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[5]")
	private WebElement guestAdd2;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[6]")
	private WebElement guestAdd3;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[7]")
	private WebElement guestCity;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Country\"]")
	private WebElement guestCountryDropdown;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"India\"]")
	private WebElement guestCountry;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[8]")
	private WebElement guestZip;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"State/Province\"]")
	private WebElement guestStateDropdown;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Maharashtra\"]")
	private WebElement guestState;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[9]")
	private WebElement guestNumber;
	
	
	public void clickONAddressBook() {
		AddBook.click();
	}
	
	public void clickOnAddNewAddress() {
		AddNewAdd.click();
	}
	
	public void addNewAddress(String firstName, String lastName, String number, String street1, String street2, String street3, String City, String zip, String SelectcountryName) throws Exception {
		Actions actions = new Actions(driver);
		AddBook.click();
		AddNewAdd.click();
		FirstName.click();
		actions.moveToElement(FirstName).sendKeys(firstName).perform();
//		FirstName.sendKeys(firstName);
		LastName.click();
		actions.moveToElement(LastName).sendKeys(lastName).perform();
//		LastName.sendKeys(lastName);
		mobNum.click();
		actions.moveToElement(mobNum).sendKeys(number).perform();
//		mobNum.sendKeys(number);
		streetDetail(street1 , street2 , street3);
		additionalDetail(City , zip , SelectcountryName);
		super.hideKeyboard();
		SaveAddressBtn.click();
		driver.navigate().back();
		driver.navigate().back();
	}
		
		public void streetDetail(String street1, String street2, String street3) {
		Actions actions = new Actions(driver);
		streetAdd1.click();
		actions.moveToElement(streetAdd1).sendKeys(street1).perform();
//		streetAdd1.sendKeys(street1);
		streetAdd2.click();
		actions.moveToElement(streetAdd2).sendKeys(street2).perform();
//		streetAdd2.sendKeys(street2);
		streetAdd3.click();
		actions.moveToElement(streetAdd3).sendKeys(street3).perform();
//		streetAdd3.sendKeys(street3);
			
		}
		
		public void additionalDetail(String City, String zip, String SelectcountryName) throws Exception {
			Actions actions = new Actions(driver);
			city.click();
			actions.moveToElement(city).sendKeys(City).perform();
//			city.sendKeys(City);
			zipCode.click();
			actions.moveToElement(zipCode).sendKeys(zip).perform();
//			zipCode.sendKeys(zip);
			super.hideKeyboard();
			countryName.click();
//			countryName.sendKeys(SelectcountryName);
			scrollUp(country_India);
			stateSelect.click();
			scrollUp(stateMaha);
		}
		
		public void addguestUserAddress(String email, String firtsName, String lastName, String Add1, String Add2, String Add3, String city, String code, String num) throws InterruptedException {
			Actions actions = new Actions(driver);
			Thread.sleep(5000);
			guestEmail.click();			
			actions.moveToElement(guestEmail).sendKeys(email).perform();
			guestFirstName.click();
			actions.moveToElement(guestFirstName).sendKeys(firtsName).perform();
			guestLastName.click();
			actions.moveToElement(guestLastName).sendKeys(lastName).perform();
			guestAdd1.click();
			actions.moveToElement(guestAdd1).sendKeys(Add1).perform();
			guestAdd2.click();
			actions.moveToElement(guestAdd2).sendKeys(Add2).perform();
			guestAdd3.click();
			actions.moveToElement(guestAdd3).sendKeys(Add3).perform();
			guestCity.click();
			actions.moveToElement(guestCity).sendKeys(city).perform();
			guestCountryDropdown.click();
			scrollUp(guestCountry);
			guestZip.click();
			actions.moveToElement(guestCity).sendKeys(code).perform();
			guestStateDropdown.click();
			scrollUp(guestState);
			guestNumber.click();
			actions.moveToElement(guestNumber).sendKeys(num).perform();
		}
		
		public void NewAddressWhileCheckout(String firstName, String lastName, String number, String street1, String street2, String street3, String City, String zip, String SelectcountryName) throws Exception {
			Actions actions = new Actions(driver);
			FirstName.click();
			actions.moveToElement(FirstName).sendKeys(firstName).perform();
			LastName.click();
			actions.moveToElement(LastName).sendKeys(lastName).perform();
			mobNum.click();
			actions.moveToElement(mobNum).sendKeys(number).perform();
			streetAdd1.click();
			actions.moveToElement(streetAdd1).sendKeys(street1).perform();
			streetAdd2.click();
			actions.moveToElement(streetAdd2).sendKeys(street2).perform();
			streetAdd3.click();
			actions.moveToElement(streetAdd3).sendKeys(street3).perform();
			city.click();
			actions.moveToElement(city).sendKeys(City).perform();
			zipCode.click();
			actions.moveToElement(zipCode).sendKeys(zip).perform();
			super.hideKeyboard();
			countryName.click();
			scrollUp(country_India);
			stateSelect.click();
			scrollUp(stateMaha);
			SaveAddressBtn.click();
			}
		
		public void scrollUp(WebElement element) {
//			driver.findElement(AppiumBy.androidUIAutomator(("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+ elementName +"\"))")));

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
}
