package com.amzon.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.amazon.baseClass.Baseclass;
import com.amzon.runner.TestRunner;

import io.cucumber.java.en.*;

public class ProductTest {
public static WebDriver driver= TestRunner.driver;
	
	@Given("user lounch url")
	public void user_lounch_url() {
	 driver.get("https://www.amazon.in");
	}

	@When("user Enter the Keyword in search Bar")
	public void user_enter_the_keyword_in_search_bar() {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cd");
	}
	
	@When("user Click search button")
	public void user_click_search_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}


	@When("user get First Product Title")
	public void user_get_first_product_title() {
	}
	
	@When("user Click first Product")
	public void user_click_first_product() {
	}

}
