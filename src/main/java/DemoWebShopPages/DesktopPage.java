package DemoWebShopPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DesktopPage {
	WebDriver driver;
	public DesktopPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//*[@value='Add to cart'])[1]")
	public WebElement AddtoCartButton;
	
	public void Click2() {
		AddtoCartButton.click();
	}
	
	public void Verify2() {
		Assert.assertTrue(AddtoCartButton.isDisplayed(), "Add to cart button is not displayed");
	}
	
}
