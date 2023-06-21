package DWSRegister;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDrivenTesting.LearningExcelSheet;

public class AmazonRegister {
	
	
	@Test(dataProvider = "RegisterData")
	public void Register(String Yourname, String Phoneno,String Email,String Password)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement signin = driver.findElement(By.id("nav-link-accountList"));
		Actions act = new Actions(driver);
		act.moveToElement(signin).perform();
		act.click(driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"))).perform();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys(Yourname);
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys(Phoneno);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(Password);
		driver.close();
	}
	@DataProvider(name="RegisterData")
	public String[][] data() throws IOException
	{
		return LearningExcelSheet.objectArray("Register");
	}
	
	

}
