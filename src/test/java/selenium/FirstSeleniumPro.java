package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirstSeleniumPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hp\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("mdk@bbc.com");
		driver.findElement(By.name("pass")).sendKeys("abcdefg");
		driver.findElement(By.name("login")).click();*/
		/*driver.get("https://www.google.com");
		//driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.name("q")).sendKeys("Patek Philippe 5990");
		driver.findElement(By.name("btnK")).click();*/
		driver.get("https://www.calculator.net/bmi-calculator.html");
		driver.findElement(By.name("cage")).clear();
		driver.findElement(By.name("cage")).sendKeys("23");
		driver.findElement(By.name("cheightfeet")).clear();
		driver.findElement(By.name("cheightfeet")).sendKeys("5");
		driver.findElement(By.name("cheightinch")).clear();
		driver.findElement(By.name("cheightinch")).sendKeys("11");
		driver.findElement(By.name("cpound")).clear();
		driver.findElement(By.name("cpound")).sendKeys("189.598");
		//driver.findElement(By.xpath("//*[@data-testid='royal_email']")).click();
		System.out.println(driver.getCurrentUrl());
		

	}

}
//*[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop'] for language
//*[@class='nav-icon nav-arrow'] for dropdown
//*[@class='hm-icon-label'] for all
//*[@class="nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown" ]for all dropdown
//*[@attributeName='attributeValue']



//*[@data-testid='royal_email']




//input[@data-testid='royal_email']



//*[@aria-label='First name']
