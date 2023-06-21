package DWSRegister;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDrivenTesting.LearningExcelSheet;

public class Register {
	
	@Test(dataProvider = "RegisterData")
	public void  Registerdata(String FN,String LN,String Email,String Pwd,String CPWD)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@value='M']")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FN);
		driver.findElement(By.id("LastName")).sendKeys(LN);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CPWD);
		driver.findElement(By.id("register-button")).click();
		driver.close();
		
	}
	@DataProvider(name="RegisterData")
	public String[][] data() throws IOException
	{
		return LearningExcelSheet.objectArray("Register");
	}
}
