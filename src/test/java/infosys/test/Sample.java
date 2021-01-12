package infosys.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public WebDriver driver;
	
	@BeforeMethod
	private void launch() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		

	}
	
	@BeforeClass
	private void start() {
		Date date = new Date();
		System.out.println(date);
		
	}
	
	@AfterClass
	private void end() {
		Date date = new Date();
		System.out.println(date);
	
	}
	
	@Test
	private void tc1() {
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Akshu");
		driver.findElement(By.id("pass")).sendKeys("GodisGreat");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.id("email")).sendKeys("Siva");
		driver.findElement(By.id("pass")).sendKeys("Greatthings");
		driver.findElement(By.name("login")).click();
		
		
		

	}
}
