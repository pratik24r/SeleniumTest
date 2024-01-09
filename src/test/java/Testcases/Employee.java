package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee {
WebDriver driver;	
	@Test
	public void Validate_url() {
		
		System.setProperty("webdriver.chrome.driver","//home//fs-pratik//Downloads//chromedriver-linux64//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
	}
	
	
	
	
	
	

}
