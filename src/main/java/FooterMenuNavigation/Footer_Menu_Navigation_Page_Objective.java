package FooterMenuNavigation;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Footer_Menu_Navigation_Page_Objective {
	
	public AppiumDriver driver;
	public Footer_Menu_Navigation_Page_Objective(AppiumDriver driver) {
//		 super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(accessibility = "Bottom Bar Svg Picture icon Tab 4")
	private WebElement myCart;


}
