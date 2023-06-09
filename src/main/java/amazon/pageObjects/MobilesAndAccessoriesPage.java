package amazon.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MobilesAndAccessoriesPage {
	
WebDriver driver;
	
	public MobilesAndAccessoriesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Mobiles & Accessories']")
	public WebElement MobilesAndAccessories;
	
	public void Verify() {
		Assert.assertTrue(MobilesAndAccessories.isDisplayed());
	}
	
     

}
