package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee {
WebDriver driver;	
	@BeforeClass
	public void Validate_url() {
		
	//	System.setProperty("webdriver.edge.driver", "\\home\\fs-pratik\\Downloads\\edgedriver-linux64\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup(); ///home/fs-pratik/Downloads/edgedriver_linux64
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
	}
	
	@Test
	public void testCase1() {
		System.out.println("this is testCase1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("this is testCase2");
	}
	
	
	
	
	

}
