package My_Orders_Page;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import AndroidUtils.AndroidActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class My_Orders_Objects extends AndroidActions{
	
	public AppiumDriver driver;

	public My_Orders_Objects(AndroidDriver driver) {
		
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "My Order Button GestureDetector - Profile Screen")
	public WebElement myOrder;
	
	@AndroidFindBy(accessibility = "Continue Shopping")
	public WebElement continueShopping;
	
	public void verifyNoOrderPlaced() throws InterruptedException {
		Thread.sleep(2000);
		myOrder.click();
		Thread.sleep(2000);
		continueShopping.click();
		Thread.sleep(2000);
		
	}
}
