package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SauceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hp\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		//Adding items to the cart
		
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();		
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']")).click();		
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();		
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();		
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']")).click();		
		driver.findElement(By.xpath("//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		driver.findElement(By.xpath("//*[@id='shopping_cart_container']")).click();
		
		//Removing all items from cart
		
		driver.findElement(By.xpath("//*[@id='remove-sauce-labs-backpack']")).click();		
		driver.findElement(By.xpath("//*[@id='remove-sauce-labs-bike-light']")).click();		
		driver.findElement(By.xpath("//*[@id='remove-sauce-labs-bolt-t-shirt']")).click();		
		driver.findElement(By.xpath("//*[@id='remove-sauce-labs-fleece-jacket']")).click();		
		driver.findElement(By.xpath("//*[@id='remove-sauce-labs-onesie']")).click();		
		driver.findElement(By.xpath("//*[@id='remove-test.allthethings()-t-shirt-(red)']")).click();
		
		//Continuing to shopping
		driver.findElement(By.xpath("//*[@id='continue-shopping']")).click();
		
		//Again adding items to the cart
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();		
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']")).click();		
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();		
		driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
		driver.findElement(By.xpath("//*[@id='shopping_cart_container']")).click();
		
		//Checkout
		driver.findElement(By.xpath("//*[@id='checkout']")).click();
		driver.findElement(By.name("firstName")).sendKeys("Rohit");
		driver.findElement(By.name("lastName")).sendKeys("Samarth");
		driver.findElement(By.name("postalCode")).sendKeys("440022");
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		
		//Displays Payment Information, Shipping Information, Price Total, Total:
		
		//System.out.println(((WebElement) driver.findElements(By.id("Payment Information"))).isDisplayed());
		
		
		//Finish
		
		driver.findElement(By.xpath("//*[@id='finish']")).click();
		
		
		
		

	}

}
