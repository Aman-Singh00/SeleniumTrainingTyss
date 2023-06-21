package Selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Right_click {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
//		//identify the right click button
//		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
//		
//		//Create the object of actions class
//		Actions act = new Actions(driver);
//		
//		act.contextClick(right_click).perform();
		
		//identify the double click button
		WebElement double_click = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		//create the object of actions class
		Actions act = new Actions(driver);
		act.doubleClick(double_click).perform();
	}

}
