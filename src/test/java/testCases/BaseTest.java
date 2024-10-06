package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import com.google.common.collect.ImmutableMap;
import AndroidUtils.AppiumUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseTest extends AppiumUtils{

    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    public void AppiumServer(String apkPath) throws MalformedURLException, URISyntaxException, InterruptedException, IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\luxe\\lab\\resources\\data.properties");
        prop.load(fis);
        String ipAddress = prop.getProperty("ipAddress");
        String port = prop.getProperty("port");
        service = startAppiumServer(ipAddress, Integer.parseInt(port));
        
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("AndroidDeviceName");
        options.setApp(apkPath); // Set the APK path here
        driver = new AndroidDriver(service.getUrl(), options);
    }

    // Other methods (hideKeyboard, navigateBack, etc.) remain unchanged...

	public void hideKeyboard() {
		driver.hideKeyboard();	
	}
	
	public void navigateBack() {
		driver.navigate().back();
	}
	
	public void scrollDown(String elementNƒame) {
		driver.findElement(AppiumBy.androidUIAutomator(("new UiScrollable(new UiSelector()).scrollable(true).instance(0).scrollIntoView(new UiSelector()"+".textMatches(\""+elementNƒame+"\").instance(0)")));
		}
	
	public void scrollUp() {
//		driver.findElement(AppiumBy.androidUIAutomator(("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+ elementName +"\"))")));

		boolean canScrollMore;
		do {
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "up", "percent", 3.0));
		} while (canScrollMore);
		
	}
	
	public void scrollToText(String text) {
		
		driver.findElement(AppiumBy.androidUIAutomator(("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+ text +"\"))")));
	}

	public void closedApp() {
		((AppiumDriver) driver).close();
	}

	public void scrollAndView(String visibleText) {
		driver.findElement(AppiumBy.androidUIAutomator(
				("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))")));
	}
	
}

