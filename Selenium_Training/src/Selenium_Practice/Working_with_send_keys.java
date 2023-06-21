package Selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_send_keys {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
			
		Actions act = new Actions(driver);
		//act.sendKeys(Keys.PAGE_DOWN).perform();
		
		act.keyDown(Keys.SHIFT).sendKeys(driver.findElement(By.id("small-searchterms")), "mobile").perform();
		act.keyUp(Keys.SHIFT).sendKeys(driver.findElement(By.id("small-searchterms")), "mobile").perform();
		
	
	}

}
