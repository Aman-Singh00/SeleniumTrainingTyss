package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utility.Test_Base;

public class SS_Dropdown extends Test_Base {
	
	@Test
	public void dropdown()
	{
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='category']"));
		Select s   = new Select(dropdown);
		List<WebElement> all_option = s.getOptions();
		for(WebElement option:all_option)
		{
			System.out.println(option.getText());
		}
	}
	

}
