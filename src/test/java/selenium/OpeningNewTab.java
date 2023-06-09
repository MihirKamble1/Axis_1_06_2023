package selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class OpeningNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//driver.findElement(By.linktext).sendKeys(Keys.chord(Keys.Control, Keys.Return));
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
		
	


}
}
