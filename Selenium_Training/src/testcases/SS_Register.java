package testcases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility.Test_Base;

public class SS_Register extends Test_Base {
	
	@Test()
	public void register()
	{
		Random r = new Random();
		int num = r.nextInt(10000);
		int phoneno = r.nextInt(1000);
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("Aman");
		driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@id='Male']")).click();
		driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("9050"+phoneno+"9462");
		driver.findElement(By.xpath("//input[@id='Email Address']")).sendKeys("ak"+num+"@gmail.com");
		System.out.println(driver.findElement(By.xpath("//input[@id='Email Address']")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Aman@"+num);
		System.out.println(driver.findElement(By.xpath("//input[@id='Password']")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@id='Confirm Password']")).sendKeys("Aman@"+num);
		driver.findElement(By.id("Terms and Conditions")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
	}

}
