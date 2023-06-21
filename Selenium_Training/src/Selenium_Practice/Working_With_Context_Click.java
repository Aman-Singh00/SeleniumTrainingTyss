package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Context_Click {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement double_click = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		Actions act = new Actions(driver);
		//act.contextClick(right_click).perform();
		act.doubleClick(double_click).perform();
		
	}

}
