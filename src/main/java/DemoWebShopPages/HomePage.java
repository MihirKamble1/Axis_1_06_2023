package DemoWebShopPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions act = new Actions(driver);
	
	@FindBy(xpath="//*[text()='Register']")
	public WebElement RegisterButton;
	
	@FindBy(xpath="//*[text()='Log in']")
	public WebElement LoginButton;
	
	@FindBy(xpath="//*[text()='Shopping cart']")
	public WebElement ShoppingcartButton;
	
	@FindBy(xpath="//*[text()='Wishlist']")
	public WebElement WishlistButton;
	
	@FindBy(xpath="(//a[@href='/computers'])[1]")
	public WebElement ComputersButton;
	
	@FindBy(xpath="(//a[@href='/desktops'])[1]")
	public WebElement DesktopsButton;
	
	
	
	
	
	public void Verify() {
		Assert.assertTrue(RegisterButton.isDisplayed(), "Register button is not displayed");
		Assert.assertTrue(LoginButton.isDisplayed(), "Login button is not displayed");
		Assert.assertTrue(ShoppingcartButton.isDisplayed(), "Shopping cart button is not displayed");
		Assert.assertTrue(WishlistButton.isDisplayed(), "Wishlist button is not displayed");
		
	}
	
	public void Click() {
		Actions act = new Actions(driver);
		act.moveToElement(ComputersButton).click(DesktopsButton).build().perform();
		/*ComputersButton.click();
		DesktopsButton.click();*/
		
	}
	

}
