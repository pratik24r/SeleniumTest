package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee {
WebDriver driver;	
	@BeforeClass
	public void Validate_url() {
		
		System.setProperty("webdriver.edge.driver", "/home/fs-pratik/Downloads/edgedriver_linux64/msedgedriver");
	//	WebDriverManager.edgedriver().setup(); ///home/fs-pratik/Downloads/edgedriver_linux64
		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--no-sandbox"); // Bypass OS security model
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://google.com");
		
		
		
		
	}
	
	@Test
	public void testCase1() {
		System.out.println("this is testCase1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("this is testCase2");
	}
	@AfterMethod
    public void tearDown() {
        // Close the browser after each test method
        if (driver != null) {
            driver.quit();
        }
	
	
	
	
	}	

}
