package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////*[@id='tab1Loser']/tbody/tr[5]/td[1] for last position Symbol
		//*[@id='tab1Loser']/tbody/tr[3]/td[2] for asian paints for Ltp value
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nseindia.com/");
		System.out.println(driver.findElement(By.xpath("//*[@id='tab1Loser']/tbody/tr[5]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='tab1Loser']/tbody/tr[3]/td[2]")).getText());

	}

}
