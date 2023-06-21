package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_Class {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify the computer link
		WebElement computer = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		
		//identify the accessories link
		
		
		Actions act = new Actions(driver);
		act.moveToElement(computer).click().perform();
		//act.click(driver.findElement(By.cssSelector("a[href='/accessories']"))).perform();
		
		
		
		
	}

}
