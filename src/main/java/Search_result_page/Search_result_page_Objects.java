package Search_result_page;

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

public class Search_result_page_Objects extends AndroidActions{
	
	
	public AppiumDriver driver;
	public Search_result_page_Objects(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Bottom Bar Svg Picture icon Tab 2\"]")
	private WebElement searchMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Create Ticket\"]")
	private WebElement createTicket;
	
	@AndroidFindBy(accessibility = "Name Field - Special Request")
	private WebElement firstName;
	
	@AndroidFindBy(accessibility = "Last Name Field - Special Request")
	private WebElement enterLastName;
	
	@AndroidFindBy(accessibility = "Name Field - Special Request")
	private WebElement fillFirstName;
	
	@AndroidFindBy(accessibility = "Last Name Field - Special Request")
	private WebElement filllastName;

	@AndroidFindBy(accessibility = "Email Field - Special Request")
	private WebElement fillemailID;
	
	@AndroidFindBy(accessibility = "Email Field - Special Request")
	private WebElement emailID;
	
	@AndroidFindBy(accessibility = "Phone Field - Special Request")
	private WebElement num;
	
	@AndroidFindBy(accessibility = "Remark Field - Special Request")
	private WebElement numKeypad;

	
	@AndroidFindBy(accessibility = "Brand Field - Special Request")
	private WebElement brandName;
	
	@AndroidFindBy(accessibility = "Style Field - Special Request")
	private WebElement style;
	
	@AndroidFindBy(accessibility = "Keyword Field - Special Request")
	private WebElement keyword;
	
	@AndroidFindBy(accessibility = "Remark Field - Special Request")
	private WebElement addRemark;
	
	@AndroidFindBy(accessibility = "Submit Button - Special Request")
	private WebElement submitBtn;
	
	@AndroidFindBy(accessibility = "Logout Button GestureDetector - Profile Screen")
	private WebElement logOut;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]//android.widget.EditText/*[2]")
	private WebElement enterText;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Tab 3 of 13')]")
	private WebElement womenMenu;
	
	@AndroidFindBy(accessibility = "All Women")
	private WebElement allWomen;
	
	@AndroidFindBy(accessibility = "Accessories")
	private WebElement accessoriesDropdown;
	
	@AndroidFindBy(accessibility = "Belts")
	private WebElement beltsMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Tab 4 of 13')]")
	private WebElement menMenu;
	
	@AndroidFindBy(accessibility = "All Men")
	private WebElement allMenMenu;
	
	@AndroidFindBy(accessibility = "Shoes")
	private WebElement ShoesMenu;
	
	@AndroidFindBy(accessibility = "Sandals")
	private WebElement sandalsMenu;
	
	@AndroidFindBy(accessibility = "Accessories")
	private WebElement accessoriesMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Tab 5 of 13')]")
	private WebElement kidsMenu;
	
	@AndroidFindBy(accessibility = "Boys")
	private WebElement boysMenu;
	
	@AndroidFindBy(accessibility = "Accessories")
	private WebElement boysAccessories;
	
	@AndroidFindBy(accessibility = "Girls")
	private WebElement girlsMenu;
	
	@AndroidFindBy(accessibility = "Accessories")
	private WebElement girlsAccessories;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Tab 6 of 13')]")
	private WebElement saleMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Tab 7 of 13')]")
	private WebElement selectCategoryMenu;
	
	@AndroidFindBy(accessibility = "All Select Category")
	private WebElement selectAllCategory;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Tab 8 of 13')]")
	private WebElement charityMenu;
	
	@AndroidFindBy(accessibility = "All CHARITY")
	private WebElement charityAll;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Tab 9 of 13')]")
	private WebElement heelsMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Tab 10 of 13')]")
	private WebElement preOwnedMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Tab 11 of 13')]")
	private WebElement toteBagsMenu;
	
	@AndroidFindBy(accessibility = "All Tote Bags")
	private WebElement allToteBags;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Tab 12 of 13')]")
	private WebElement satchelMenu;
	
	@AndroidFindBy(accessibility = "All Satchel")
	private WebElement allSatchel;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Tab 13 of 13')]")
	private WebElement travelBagMenu;
	
	@AndroidFindBy(accessibility = "All Travel Bag")
	private WebElement allTravelBag;
	
	
	public void searchOptions() throws InterruptedException {
		searchMenu.click();
	}
	
	public void verifyTicket(String name, String lastName, String email, String number, String brand, String styleName, String keywordName, String remark) throws InterruptedException {
		createTicket.click();
		verifyform(name, lastName, email, number, brand, styleName, keywordName, remark);
	}
	
	public void searchProduct(String name) throws InterruptedException {
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(5000);
		enterText.click();
		actions.moveToElement(enterText).sendKeys(name).perform();
		Thread.sleep(5000);
		super.hideKeyboard();
	}
	
	public void searchProductbyWomen() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(5000);
		womenMenu.click();
		Thread.sleep(5000);
		allWomen.click();
		Thread.sleep(5000);
		super.navigateBack();
	}
	public void searchProductbyWomenAccessories() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(5000);
		womenMenu.click();
		Thread.sleep(5000);
		accessoriesDropdown.click();
		Thread.sleep(5000);
		beltsMenu.click();
		Thread.sleep(5000);
		super.navigateBack();
	}
	
	public void searchProductbyMen() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(5000);
		menMenu.click();
		Thread.sleep(5000);
		allMenMenu.click();
		Thread.sleep(5000);
		super.navigateBack();
	}
	
	public void searchProductbyMenShoes() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(5000);
		menMenu.click();
		Thread.sleep(5000);
		ShoesMenu.click();
		Thread.sleep(5000);
		sandalsMenu.click();
		Thread.sleep(5000);
		super.navigateBack();
	}
	
	public void searchKidsProdutsbyBoys() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(5000);
		kidsMenu.click();
		Thread.sleep(5000);
		boysMenu.click();
		Thread.sleep(5000);
		boysAccessories.click();
		Thread.sleep(5000);
		super.navigateBack();
	}
	
	public void searchKidsProdutsbyGirls() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(5000);
		kidsMenu.click();
		Thread.sleep(5000);
		girlsMenu.click();
		Thread.sleep(5000);
		girlsAccessories.click();
		Thread.sleep(5000);
		super.navigateBack();
	}
	
	public void searchSalesProdutsby() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(5000);
		saleMenu.click();
		Thread.sleep(5000);
	}
	
	public void searchselectCategoryProduts() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(6000);
		scrollforSelectCategoryMenu(selectCategoryMenu);
		Thread.sleep(5000);
		selectAllCategory.click();
		Thread.sleep(2000);
		super.navigateBack();
		Thread.sleep(2000);
	}
	
	public void searchCharityProduts() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(6000);
		scrollforSelectCategoryMenu(selectCategoryMenu);
		Thread.sleep(6000);
		charityMenu.click();
		Thread.sleep(5000);
		charityAll.click();
		Thread.sleep(2000);
		super.navigateBack();
		Thread.sleep(2000);
		super.navigateBack();
		Thread.sleep(2000);
	}

	public void searchHeelsProduts() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(6000);
		scrollforSelectCategoryMenu(selectCategoryMenu);
		Thread.sleep(6000);
		scrollforCharityMenu(charityMenu);
		Thread.sleep(2000);
		heelsMenu.click();
		Thread.sleep(2000);
	}
	public void searchPreOwnedProduts() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(6000);
		scrollforSelectCategoryMenu(selectCategoryMenu);
		Thread.sleep(6000);
		scrollforCharityMenu(charityMenu);
		Thread.sleep(2000);
		preOwnedMenu.click();
		Thread.sleep(2000);
	}
	
	public void searchToteBagProduts() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(6000);
		scrollforSelectCategoryMenu(selectCategoryMenu);
		Thread.sleep(6000);
		scrollforCharityMenu(charityMenu);
		Thread.sleep(2000);
		scrollforToTeBagsMenu(preOwnedMenu);
		Thread.sleep(2000);
		toteBagsMenu.click();
		Thread.sleep(2000);
		allToteBags.click();
		Thread.sleep(2000);
		super.navigateBack();
		Thread.sleep(2000);
	}
	
	public void searchSatchelProduts() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(6000);
		scrollforSelectCategoryMenu(selectCategoryMenu);
		Thread.sleep(6000);
		scrollforCharityMenu(charityMenu);
		Thread.sleep(2000);
		scrollforToTeBagsMenu(preOwnedMenu);
		toteBagsMenu.click();
		Thread.sleep(2000);
		satchelMenu.click();
		Thread.sleep(2000);
		allSatchel.click();
		Thread.sleep(2000);
		super.navigateBack();
		Thread.sleep(2000);
	}
	
	public void searchTravelBagProduts() throws InterruptedException {
		Thread.sleep(5000);
		searchMenu.click();
		Thread.sleep(6000);
		scrollforSelectCategoryMenu(selectCategoryMenu);
		Thread.sleep(6000);
		scrollforCharityMenu(charityMenu);
		Thread.sleep(2000);
		scrollforToTeBagsMenu(preOwnedMenu);
		toteBagsMenu.click();
		Thread.sleep(2000);
//		satchelMenu.click();
		Thread.sleep(2000);
		travelBagMenu.click();
		Thread.sleep(2000);
		allTravelBag.click();
		Thread.sleep(2000);
		super.navigateBack();
		Thread.sleep(2000);
	}
	
	public void verifyform(String name, String lastName, String email, String number, String brand, String styleName, String keywordName, String remark) throws InterruptedException {
	    Actions actions = new Actions(driver);
	    // Check and fill first name if the field is empty
	    if (firstName.getText().trim().isEmpty()) {
	    	fillFirstName.click();
	        actions.moveToElement(firstName).sendKeys(name).perform();
	    }

	    // Check and fill last name if the field is empty
	    if (enterLastName.getText().trim().isEmpty()) {
	    	filllastName.click();
	        actions.moveToElement(enterLastName).sendKeys(lastName).perform();
	    }

	    // Check and fill email if the field is empty
	    if (emailID.getText().trim().isEmpty()) {
	    	fillemailID.click();
	        actions.moveToElement(emailID).sendKeys(email).perform();
	    }

	    // Fill other fields as per the existing logic
	    num.click();
	    actions.moveToElement(num).sendKeys(number).perform();

	    brandName.click();
	    actions.moveToElement(brandName).sendKeys(brand).perform();

	    style.click();
	    actions.moveToElement(style).sendKeys(styleName).perform();

	    keyword.click();
	    actions.moveToElement(keyword).sendKeys(keywordName).perform();
	    super.hideKeyboard();

	    addRemark.click();
	    actions.moveToElement(addRemark).sendKeys(remark).perform();
	    super.hideKeyboard();

	    submitBtn.click();
	    driver.navigate().back();
	}

	public void beforeLog(String name, String lastName, String email, String number, String brand, String styleName, String keywordName, String remark) throws InterruptedException {		
		Actions actions = new Actions(driver);
		createTicket.click();
		firstName.click();
//		firstName.sendKeys(name);
		actions.moveToElement(firstName).sendKeys(name).perform();
		enterLastName.click();
//		enterLastName.sendKeys(lastName);
		actions.moveToElement(enterLastName).sendKeys(lastName).perform();
		emailID.click();
//		emailID.sendKeys(email);
		actions.moveToElement(emailID).sendKeys(email).perform();
		num.click();
//		num.sendKeys(number);
		actions.moveToElement(num).sendKeys(number).perform();
		brandName.click();
//		brandName.sendKeys(brand);
		actions.moveToElement(brandName).sendKeys(brand).perform();
		style.click();
//		style.sendKeys(styleName);
		actions.moveToElement(style).sendKeys(styleName).perform();
		keyword.click();
//		keyword.sendKeys(keywordName);
		actions.moveToElement(keyword).sendKeys(keywordName).perform();
		super.hideKeyboard();
		addRemark.click();
//		addRemark.sendKeys(remark);
		actions.moveToElement(addRemark).sendKeys(remark).perform();
		super.hideKeyboard();
		submitBtn.click();
		driver.navigate().back();
		}

	public void logoutFromPage() throws InterruptedException {
		scrollUp(logOut);
	}
	
	public void scrollforCharityMenu(WebElement element) {
		Actions actions = new Actions(driver);

	    // Move the cursor upwards by 200 pixels (adjust value as needed)
	    actions.clickAndHold(selectCategoryMenu)
	    		.moveByOffset(20, 0)// Move upwards by 200 pixels
	    		.release()
	    		.perform();
	    element.click();
		    }
	
	public void scrollforSelectCategoryMenu(WebElement element) {
		Actions actions = new Actions(driver);

	    // Move the cursor upwards by 200 pixels (adjust value as needed)
	    actions.clickAndHold(menMenu)
	    		.moveByOffset(10, 0)// Move upwards by 200 pixels
	    		.release()
	    		.perform();
	    element.click();
		    }
	
	public void scrollforToTeBagsMenu(WebElement element) {
		Actions actions = new Actions(driver);

	    // Move the cursor upwards by 200 pixels (adjust value as needed)
	    actions.clickAndHold(preOwnedMenu)
	    		.moveByOffset(50, 0)// Move upwards by 200 pixels
	    		.release()
	    		.perform();
	    element.click();
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

		public void scrollLogout() throws InterruptedException {
			scrollUp(logOut);
		}
		
		
}
