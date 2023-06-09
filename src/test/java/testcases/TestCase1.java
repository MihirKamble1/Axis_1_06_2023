package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import amazon.base.BaseConfiguration;
import amazon.pageObjects.AllMenuPage;
import amazon.pageObjects.HomePage;
import amazon.pageObjects.MobilesAndAccessoriesPage;

public class TestCase1 extends BaseConfiguration{
	
	HomePage homepageobj;
	AllMenuPage allmenupageobj;
	MobilesAndAccessoriesPage allmobilesandaccessoriesobj;
	WebDriver driver;
	
	@BeforeClass
	public void initiSetup() {
		driver = Driver();
		homepageobj =new HomePage(driver);
		allmenupageobj = new AllMenuPage(driver);
		allmobilesandaccessoriesobj = new MobilesAndAccessoriesPage(driver);
		
		
		
	}
	
	@Test
	public void Senario1() {
		homepageobj.HomePageSuccess();
		allmenupageobj.Click();
		allmobilesandaccessoriesobj.Verify();
	}
	
	

}
