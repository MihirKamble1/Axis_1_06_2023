package amazon.pageObjects;
 
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
	
WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id=("nav-link-accountList"))
	public WebElement signInButton;
	
	public void HomePageSuccess() {
		Assert.assertTrue(signInButton.isDisplayed(),"Sign in Button is not displayed");
	}
	

}
