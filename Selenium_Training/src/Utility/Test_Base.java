package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Test_Base {
	
	
	public WebDriver driver;
	@BeforeClass
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void login()
	{
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ak2843@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Aman@2843");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		driver.findElement(By.cssSelector("[data-testid='SettingsIcon']")).click();
		driver.findElement(By.cssSelector("[data-testid='LogoutIcon']")).click();
	}
	
	@AfterClass
	public void end()
	{
		driver.quit();
	}

}
