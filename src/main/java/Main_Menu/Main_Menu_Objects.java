package Main_Menu;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Main_Menu_Objects {

	public AppiumDriver driver;

	public Main_Menu_Objects(AppiumDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,\"Dashboard Drawer\")]")
	private WebElement topLeftMenu;
	
//	Woman Menu
	@AndroidFindBy(xpath = "//android.widget.ImageView[normalize-space(@content-desc)='Drawer main item 1 Women']")
	private WebElement womenOption;
	
//	Accessories SubMenu 
	@AndroidFindBy(xpath = "//android.widget.ImageView[normalize-space(@content-desc)='Drawer sub item 1 Accessories']")
	private WebElement accessoriesMenu;
	
	@AndroidFindBy(xpath = "(//android.view.View[contains(normalize-space(@content-desc), 'Belts')])[1]")
	private WebElement beltOption;
	
	@AndroidFindBy(xpath = "(//android.view.View[contains(normalize-space(@content-desc), 'Wallets & Cardholders')])[1]")
	private WebElement walletsandCardholdersOption;
	
	@AndroidFindBy(xpath = "(//android.view.View[contains(normalize-space(@content-desc), 'Cosmetic Pouches')])[1]")
	private WebElement cosmeticOption;
	
//	Bag SubMenu
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Bags')]")
	private WebElement bagMenu;
	
	@AndroidFindBy(xpath = "(//android.view.View[contains(normalize-space(@content-desc), 'Backpacks')])[1]")
	private WebElement backpackOption;
	
	@AndroidFindBy(xpath = "(//android.view.View[contains(normalize-space(@content-desc), 'Clutches & Slings')])[1]")
	private WebElement clutchesandSlingsOption;
	
	@AndroidFindBy(xpath = "(//android.view.View[contains(normalize-space(@content-desc), 'Crossbody Bags')])[1]")
	private WebElement crossbodyBagOption;
	
//	Clothing SubMenu
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Clothings')]")
	private WebElement clothingsMenu;
	
	@AndroidFindBy(xpath = "(//android.view.View[contains(normalize-space(@content-desc), 'Coats & Jackets')])[1]")
	private WebElement coatandjacketsOption;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Dresses')]")
	private WebElement dressesOption;
	
	@AndroidFindBy(xpath = "(//android.view.View[contains(normalize-space(@content-desc), 'T-Shirts')])[1]")
	private WebElement tshirtOption;
	
//	Menu Menu
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Drawer main item 2') and contains(@content-desc, 'Men')]")
	private WebElement MenMenu;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(normalize-space(@content-desc), 'Shoes')]")
	private WebElement shoesOption;

	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Sandals')]")
	private WebElement sandals;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Boots')]")
	private WebElement boots;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Loafers')]")
	private WebElement loafers;
	
//	Mens Accessories
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(normalize-space(@content-desc), 'Accessories')]")
	private WebElement accessories;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Belts')]")
	private WebElement menBelt;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Scarves & Wraps')]")
	private WebElement scarvesandWraps;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Tie & Bow Ties')]")
	private WebElement tieandBowTies;
	
//	Men Bags
	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(normalize-space(@content-desc), 'Bags')])[1]")
	private WebElement menBags;

	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Backpacks')]")
	private WebElement menBagpack;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Briefcases')]")
	private WebElement menBriefcases;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Clutches')]")
	private WebElement menClutches;
	
//	Men Clothing Menu
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(normalize-space(@content-desc), 'Clothing')]")
	private WebElement menClothing;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Shirts')][1]")
	private WebElement menShirts;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Knitwear / Sweater')]")
	private WebElement menSweater;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Shirts')][2]")
	private WebElement menTshirts;
	
//	Kids Menu
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(normalize-space(@content-desc), 'Kids')]")
	private WebElement kidsMenu;
	
//	Boys Options
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(normalize-space(@content-desc), 'Boys')]")
	private WebElement boysMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Accessories')]")
	private WebElement boysAccessories;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Shoes')]")
	private WebElement boysShoes;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Clothing')]")
	private WebElement boysClothing;
	
//	Girls Options
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(normalize-space(@content-desc), 'Girls')]")
	private WebElement girlsMenu;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Accessories')]")
	private WebElement girlsAccessories;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Shoes')]")
	private WebElement girlsShoes;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'Clothing')]")
	private WebElement girlsClothing;
	
//	Travel Bag Menu
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(normalize-space(@content-desc), 'Travel Bag')]")
	private WebElement travelBag;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(normalize-space(@content-desc), 'All Travel Bag')]")
	private WebElement AlltravelBag;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(normalize-space(@content-desc), 'Bags')]")
	private WebElement bags;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(normalize-space(@content-desc), 'Bags')]")
	private WebElement travelBags;

	//	Baggy Menu
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Drawer main item')][3]")
	private WebElement baggyMenu;
	
//	Hip Hop Menu
	
	@AndroidFindBy(xpath = "//android.view.View[normalize-space(@content-desc)='Drawer main item 7 Hip hop']")
	private WebElement hipHopMenu;
	
//	Trendy Menu

	@AndroidFindBy(xpath = "//android.view.View[normalize-space(@content-desc)='Drawer main item 8 trendy']")
	private WebElement trendyMenu;
	
//	Funcky Menu
	
	@AndroidFindBy(xpath = "//android.view.View[normalize-space(@content-desc)='Drawer main item 9 funky']")
	private WebElement funckyMenu;
	
//	Accessories Menu
	
	@AndroidFindBy(xpath = "//android.view.View[normalize-space(@content-desc)='Drawer main item 10 Accossories']")
	private WebElement mainAccessoriesMenu;
	
	
//	women Menu
	
	public void verifybeltOption() throws InterruptedException {
		Thread.sleep(5000);
		topLeftMenu.click();
		Thread.sleep(3000);
		womenOption.click();
		Thread.sleep(3000);
		accessoriesMenu.click();
		Thread.sleep(3000);
		beltOption.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	public void verifywalletsandCardholdersOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		womenOption.click();
		Thread.sleep(3000);
		accessoriesMenu.click();
		Thread.sleep(3000);
		walletsandCardholdersOption.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	public void verifycosmeticOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		womenOption.click();
		Thread.sleep(3000);
		accessoriesMenu.click();
		Thread.sleep(3000);
		cosmeticOption.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifybackpackOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		womenOption.click();
		Thread.sleep(3000);
		bagMenu.click();
		Thread.sleep(3000);
		backpackOption.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	public void verifyclutchesandSlingsOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		womenOption.click();
		Thread.sleep(3000);
		bagMenu.click();
		Thread.sleep(3000);
		clutchesandSlingsOption.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifycrossbodyBagOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		womenOption.click();
		Thread.sleep(3000);
		bagMenu.click();
		Thread.sleep(3000);
		crossbodyBagOption.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	public void verifycoatandKacketsOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		womenOption.click();
		Thread.sleep(3000);
		clothingsMenu.click();
		Thread.sleep(3000);
		coatandjacketsOption.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
	public void verifydressesOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		womenOption.click();
		Thread.sleep(3000);
		clothingsMenu.click();
		Thread.sleep(3000);
		dressesOption.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifytshirtOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		womenOption.click();
		Thread.sleep(3000);
		clothingsMenu.click();
		Thread.sleep(3000);
		tshirtOption.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
//	Men Menu
	
//			Men Shoes

	public void verifySandalsOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		MenMenu.click();
		Thread.sleep(3000);
		shoesOption.click();
		Thread.sleep(3000);
		sandals.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifybootsOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		MenMenu.click();
		Thread.sleep(3000);
		shoesOption.click();
		Thread.sleep(3000);
		boots.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifyloafersOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		MenMenu.click();
		Thread.sleep(3000);
		shoesOption.click();
		Thread.sleep(3000);
		loafers.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
//	Mens accessories
	
	public void verifymenBeltOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		MenMenu.click();
		Thread.sleep(3000);
		accessories.click();
		Thread.sleep(3000);
		menBelt.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifyscarvesandWrapsOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		MenMenu.click();
		Thread.sleep(3000);
		accessories.click();
		Thread.sleep(3000);
		scarvesandWraps.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifytieandBowTiesOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		MenMenu.click();
		Thread.sleep(3000);
		accessories.click();
		Thread.sleep(3000);
		tieandBowTies.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
//	Mens Bag Menu
	
	public void verifymenBagpackOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		MenMenu.click();
		Thread.sleep(3000);
		menBags.click();
		Thread.sleep(3000);
		menBagpack.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifymenBriefcasesOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		MenMenu.click();
		Thread.sleep(3000);
		menBags.click();
		Thread.sleep(3000);
		menBriefcases.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifymenClutchesOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		MenMenu.click();
		Thread.sleep(3000);
		menBags.click();
		Thread.sleep(3000);
		menClutches.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
//	Men Clothing Menu
	
	public void verifymenmenShirtsOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		MenMenu.click();
		Thread.sleep(3000);
		menClothing.click();
		Thread.sleep(3000);
		menShirts.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifymenSweaterOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		MenMenu.click();
		Thread.sleep(3000);
		menClothing.click();
		Thread.sleep(3000);
		menSweater.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifymenTshirtsOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		MenMenu.click();
		Thread.sleep(3000);
		menClothing.click();
		Thread.sleep(3000);
		menTshirts.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
//	Kids Menu
	
	public void verifyboysAccessoriesOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		kidsMenu.click();
		Thread.sleep(3000);
		boysMenu.click();
		Thread.sleep(3000);
		boysAccessories.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifyboysShoesOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		kidsMenu.click();
		Thread.sleep(3000);
		boysMenu.click();
		Thread.sleep(3000);
		boysShoes.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifyboysClothingOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		kidsMenu.click();
		Thread.sleep(3000);
		boysMenu.click();
		Thread.sleep(3000);
		boysClothing.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
//	Girls Menu
	
	public void verifygirlsAccessoriesOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		kidsMenu.click();
		Thread.sleep(3000);
		girlsMenu.click();
		Thread.sleep(3000);
		girlsAccessories.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifygirlsShoesOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		kidsMenu.click();
		Thread.sleep(3000);
		girlsMenu.click();
		Thread.sleep(3000);
		girlsShoes.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifygirlsClothingOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		kidsMenu.click();
		Thread.sleep(3000);
		girlsMenu.click();
		Thread.sleep(3000);
		girlsClothing.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
//	Travel Bags Menu
	
	public void verifyAlltravelBagOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		travelBag.click();
		Thread.sleep(3000);
		AlltravelBag.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}

	public void verifybagsOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		travelBag.click();
		Thread.sleep(3000);
		bags.click();
		Thread.sleep(3000);
		travelBags.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	public void verifybaggyOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		baggyMenu.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifyhipHopOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		hipHopMenu.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifytrendyOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		trendyMenu.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifyfunckyOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		funckyMenu.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public void verifyAccessoriesOption() throws InterruptedException {
		Thread.sleep(3000);
		topLeftMenu.click();
		Thread.sleep(3000);
		mainAccessoriesMenu.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
	}
	
}
