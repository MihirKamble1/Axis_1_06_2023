package amazon.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllMenuPage {
	WebDriver driver;
	
	public AllMenuPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id=("nav-hamburger-menu"))
	public WebElement Menu;
	
	@FindBy(xpath=("//*[text()='Mobiles, Computers']"))
	public WebElement MobilesAndcomputers;
	
	@FindBy(xpath=("//*[text()='All Mobile Phones']"))
	public WebElement AllMobilePhones;
	
	public void Click() {
		Menu.click();
		MobilesAndcomputers.click();
		AllMobilePhones.click();
	}

}
