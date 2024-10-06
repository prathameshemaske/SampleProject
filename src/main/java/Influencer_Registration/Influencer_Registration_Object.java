package Influencer_Registration;

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

public class Influencer_Registration_Object extends AndroidActions{
	
	public AppiumDriver driver;

	public Influencer_Registration_Object(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "Influencer Registration Button GestureDetector - Profile Screen")
	public WebElement influencerRegistration;
	
	@AndroidFindBy(accessibility = "1. Profile")
	public WebElement profileText;
	
	@AndroidFindBy(accessibility = "First Name Form Field")
	public WebElement name;
	
	@AndroidFindBy(accessibility = "Last Name Form Field")
	public WebElement lastName;
	
	@AndroidFindBy(accessibility = "Email Address Form Field")
	public WebElement email;
	
	@AndroidFindBy(accessibility = "Phone Number - Form Field")
	public WebElement phoneNumber;
	
	@AndroidFindBy(accessibility = "Web URL - Form Field")
	public WebElement websiteURL;
	
	@AndroidFindBy(accessibility = "City - Form Field")
	public WebElement enterCity;
	
	@AndroidFindBy(accessibility = "Country Form Field")
	public WebElement enterCountry;
	
	@AndroidFindBy(accessibility = "Postal code Form Field")
	public WebElement enterPostCode;
	
	@AndroidFindBy(accessibility = "Facebook Form Field")
	public WebElement facebook;
	
	@AndroidFindBy(accessibility = "Instagram Form Field")
	public WebElement instagram;
	
	@AndroidFindBy(accessibility = "Twitter Form Field")
	public WebElement twitter;
	
	@AndroidFindBy(accessibility = "You Tube Form Field")
	public WebElement youtube;
	
	@AndroidFindBy(accessibility = "Linked In Form Field")
	public WebElement linkedin;
	
	@AndroidFindBy(accessibility = "Pinterest Form Field")
	public WebElement pinterest;
	
	@AndroidFindBy(accessibility = "facebookFieldTitleText")
	public WebElement facebookFollower;
	
	@AndroidFindBy(accessibility = "instagramFieldTitleText")
	public WebElement instagramFollower;
	
	@AndroidFindBy(accessibility = "twitterFieldTitleText")
	public WebElement twitterFollower;
	
	@AndroidFindBy(accessibility = "youTubeFieldTitleText")
	public WebElement youTubeFollower;
	
	@AndroidFindBy(accessibility = "linkedInFieldTitleText")
	public WebElement linkedInFollower;
	
	@AndroidFindBy(accessibility = "pinterestFieldTitleText")
	public WebElement pinterestFollower;
	
	@AndroidFindBy(accessibility = "Project TextField")
	public WebElement projectField;
	
	@AndroidFindBy(accessibility = "Submit")
	public WebElement submitbtn;
	
	@AndroidFindBy(accessibility = "3. Followers")
	public WebElement followersScroll;
	
	@AndroidFindBy(accessibility = "4. Projects")
	public WebElement ProjectsScroll;

	
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
	
//	public void influencer() throws InterruptedException {
//		Thread.sleep(5000);
//		influencerRegistration.click();
//	}	
	
	public void scrollUp(String firstName, String enterlastName, String emailid, String number, String url, String city, String country, String postcode, String facebookURL, String istagramURL, String twitterURL, String youtubeURL, String linkedinURL, String pinterestURL, String fbfollower, String instaFollower, String xFollower, String 
			ytFollower, String linkedInFollowers, String pinterestFollowers, String projecttxtField) throws InterruptedException {
		Actions actions = new Actions(driver);
		scrollUp(influencerRegistration);
		scrollUp(profileText);
		name.click();
//		name.sendKeys(firstName);
		actions.moveToElement(name).sendKeys(firstName).perform();
		lastName.click();
//		lastName.sendKeys(enterlastName);
		actions.moveToElement(lastName).sendKeys(enterlastName).perform();
		email.click();
//		email.sendKeys(emailid);
		actions.moveToElement(email).sendKeys(emailid).perform();
		phoneNumber.click();
//		phoneNumber.sendKeys(number);
		actions.moveToElement(phoneNumber).sendKeys(number).perform();
		websiteURL.click();
//		websiteURL.sendKeys(url);
		actions.moveToElement(websiteURL).sendKeys(url).perform();
//		enterCity.click();
		scrollUp(enterCity);
//		enterCity.sendKeys(city);
		actions.moveToElement(enterCity).sendKeys(city).perform();
		enterCountry.click();
//		enterCountry.sendKeys(country);
		actions.moveToElement(enterCountry).sendKeys(country).perform();
		enterPostCode.click();
//		enterPostCode.sendKeys(postcode);
		actions.moveToElement(enterPostCode).sendKeys(postcode).perform();
		super.hideKeyboard();
		scrollUp(followersScroll);
		facebook.click();
//		facebook.sendKeys(facebookURL);
		actions.moveToElement(facebook).sendKeys(facebookURL).perform();
		instagram.click();
//		instagram.sendKeys(istagramURL);
		actions.moveToElement(instagram).sendKeys(istagramURL).perform();
		twitter.click();
//		twitter.sendKeys(twitterURL);
		actions.moveToElement(twitter).sendKeys(twitterURL).perform();
		youtube.click();
//		youtube.sendKeys(youtubeURL);
		actions.moveToElement(youtube).sendKeys(youtubeURL).perform();
		linkedin.click();
//		linkedin.sendKeys(linkedinURL);
		actions.moveToElement(linkedin).sendKeys(linkedinURL).perform();
		pinterest.click();
//		pinterest.sendKeys(pinterestURL);
		actions.moveToElement(pinterest).sendKeys(pinterestURL).perform();
		super.hideKeyboard();
		scrollUp(ProjectsScroll);
		facebookFollower.click();
//		facebookFollower.sendKeys(fbfollower);
		actions.moveToElement(facebookFollower).sendKeys(fbfollower).perform();
		instagramFollower.click();
//		instagramFollower.sendKeys(instaFollower);
		actions.moveToElement(instagramFollower).sendKeys(instaFollower).perform();
		twitterFollower.click();
//		twitterFollower.sendKeys(xFollower);
		actions.moveToElement(instagramFollower).sendKeys(instaFollower).perform();
		youTubeFollower.click();
//		youTubeFollower.sendKeys(ytFollower);
		actions.moveToElement(youTubeFollower).sendKeys(ytFollower).perform();
		linkedInFollower.click();
//		linkedInFollower.sendKeys(linkedInFollowers);
		actions.moveToElement(linkedInFollower).sendKeys(linkedInFollowers).perform();
		pinterestFollower.click();
//		pinterestFollower.sendKeys(pinterestFollowers);
		actions.moveToElement(pinterestFollower).sendKeys(pinterestFollowers).perform();
		super.hideKeyboard();
		projectField.click();
//		projectField.sendKeys(projecttxtField);
		actions.moveToElement(projectField).sendKeys(projecttxtField).perform();
		super.hideKeyboard();
		submitbtn.click();
		driver.navigate().back();
	}
}

			


