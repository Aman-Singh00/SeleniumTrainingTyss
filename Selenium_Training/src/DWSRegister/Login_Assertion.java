package DWSRegister;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Login_Assertion {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement actitime = driver.findElement(By.className("productNameContainer"));
		Assert.assertEquals(actitime.getAttribute("class"),"productNameContainer", "Logo Verification");
		WebElement actitime1 = driver.findElement(By.className("productNameContainer"));
		File temp=actitime1.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/actitime.png");
		FileHandler.copy(temp, dest);
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='pagetitle']"))));
		
		SoftAssert ast = new SoftAssert();
		ast.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/user/submit_tt.do", "Login verification");
		ast.assertAll();
		driver.close();
		}

}
