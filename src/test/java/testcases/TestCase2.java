package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DemoWebShop.BaseConfigurationDemo;
import DemoWebShopPages.DesktopPage;
import DemoWebShopPages.HomePage;
;
public class TestCase2 extends BaseConfigurationDemo {
	
	HomePage homepage;
	DesktopPage desktoppage;
	WebDriver driver;
	
	@BeforeClass
	public void Setup() {
		driver = getDriver();
		homepage = new HomePage(driver);
		desktoppage = new DesktopPage(driver);
		
	}
	
	@Test
	public void Test2() {
		homepage.Verify();
		homepage.Click();
		desktoppage.Click2();
		desktoppage.Verify2();
	}
	
	
	
	

}
