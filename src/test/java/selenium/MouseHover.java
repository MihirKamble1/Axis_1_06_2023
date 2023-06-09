package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		//perform() is necessary
		//for drag and drop
	   // act.dragAndDrop(driver.findElements(By.xpath), driver.findElement(By.xpath)).build().perform();
	    //act.moveToElement(driver.findElement(By.xpath("//*[]"))).contextClick(driver.findElement(By.));
		
		WebElement accounts=driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		WebElement yourAccount=driver.findElement(By.xpath("//*[text()='Your Account']"));
		act.moveToElement(accounts).contextClick(yourAccount).build().perform();
		
	}

}
