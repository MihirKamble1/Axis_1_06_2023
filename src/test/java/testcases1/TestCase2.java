package testcases1;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DemoWebShop.BaseConfigurationDemo;
import DemoWebShopPages.DesktopPage;
import DemoWebShopPages.HomePage;

;
public class TestCase2 extends BaseConfigurationDemo{
	
	public HomePage homepage;
	public DesktopPage desktoppage;
	public WebDriver driver;
	
	

	
	@Parameters({"Port"})
	@BeforeMethod
	public void Setup(String Port) throws MalformedURLException {
		driver = setUp(Port);
		homepage = new HomePage(driver);
        desktoppage = new DesktopPage(driver);
		
		
	}
	
	@Test
	public void Test2() {
		//homepage.Verify();
		homepage.Click();
		desktoppage.Click2();
		//desktoppage.Verify2();
	}
	
	
	
	

}
