package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class yatrabus {
	
	public static void main(String[] args) throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.findElement(By.cssSelector("[title='Buses']")).click();
		driver.findElement(By.name("bus_leaving")).click();
		driver.findElement(By.xpath("//div[@class='viewport']/descendant::li[3]/span")).click();
		driver.findElement(By.xpath("//div[@class='viewport']//descendant::li[8]/span")).click();
		driver.findElement(By.id("BE_bus_search_btn")).click();
		
	}

}