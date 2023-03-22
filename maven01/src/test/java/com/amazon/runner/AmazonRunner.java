package com.amazon.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\com\\amazon\\feature\\Amazon.feature",
		glue = "com.amazon.sdp"
		
		
		
		)
public class AmazonRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void stepUp() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		driver= new ChromeDriver(opt);
		driver.get(null);
		
		

	}
	@AfterClass
	public static void browserClose() {
		 driver.quit();
	}

	
	
	

}
