package DWSRegister;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("");
	}

}
