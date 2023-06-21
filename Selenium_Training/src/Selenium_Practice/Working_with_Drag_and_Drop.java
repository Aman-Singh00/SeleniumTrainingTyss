package Selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Drag_and_Drop {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement drag_Point = driver.findElement(By.id("box3"));
		WebElement drop_point = driver.findElement(By.xpath("//div[text()='United States']"));
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag_Point, drop_point).perform();
		
	}

}
