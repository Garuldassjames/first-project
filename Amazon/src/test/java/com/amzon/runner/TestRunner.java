package com.amzon.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.baseClass.Baseclass;
import com.github.dockerjava.api.model.Driver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/amazon/feature/Product.feature",
		glue = {"com.amzon.stepDefinition"}
//		dryRun = false,
//		plugin = "pretty",
//		stepNotifications = true
		
		
		)

public class TestRunner  {
	
	public static WebDriver driver=null;
	
	@BeforeClass
	public static void setUp() {
		driver = Baseclass.browserlaunch("chrome");
	}

	@AfterClass

	public static void tearDown() {
		driver.quit();
	}
}
