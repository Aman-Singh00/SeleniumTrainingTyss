package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Drag_And_Drop1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement drag = driver.findElement(By.cssSelector("div[id=box3]"));
		WebElement drop = driver.findElement(By.xpath("//div[text()='United States']"));
		
		Actions act  = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		
	}

}
