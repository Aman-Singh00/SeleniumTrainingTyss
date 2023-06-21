package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utility.Test_Base;

public class SS_Login extends Test_Base{
	
	@Test()
	public void login()
	{
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ak2843@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Aman@2843");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
	}

}
