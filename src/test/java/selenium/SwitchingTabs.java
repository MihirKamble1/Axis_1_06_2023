package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
		
	    String parent=driver.getWindowHandle();
	    System.out.println(parent);
	    
	    Set<String> windowID=driver.getWindowHandles();
	    Iterator<String> it=windowID.iterator();
	    
	    while(it.hasNext()) {
	    	String child = it.next();
	    	if(!parent.equals(child)) {
	    		driver.switchTo().window(child);
	    		
	    	}
	    	
	    }
	    
	    
	    		

	}

}
