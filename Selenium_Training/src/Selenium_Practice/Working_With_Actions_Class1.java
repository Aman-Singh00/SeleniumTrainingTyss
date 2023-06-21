package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_Class1 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement electronic = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')] )[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(electronic).perform();
	}

}
