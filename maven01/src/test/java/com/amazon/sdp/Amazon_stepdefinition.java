package com.amazon.sdp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.amazon.runner.AmazonRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Amazon_stepdefinition extends AmazonRunner {
	WebDriver driver = AmazonRunner.driver;
	public static String gettitle2;
	public static String GetTitle1;

	@Given("select {string} by using dropdown option")
	public void select_by_using_dropdown_option(String string) {
	WebElement SearchCat = driver.findElement(By.id("searchDropdownBox"));
		
		
        Select menu = new Select(SearchCat);
		//Select SearchList = new Select(SearchCat);
        
		List<WebElement> allSelectedOptions = menu.getOptions();
        String epect ="Music";
		for (WebElement webEle : allSelectedOptions) {
			if (epect.equals(webEle.getText())) {
				System.out.println(webEle.getText());
				menu.selectByVisibleText(webEle.getText());
				break;
			}
		}
		/*	ListIterator<WebElement> listIterator = allSelectedOptions.listIterator();
		String Expect = "Music";
           while (listIterator.hasNext()) {
//			WebElement Each = (WebElement) listIterator.next();
			WebElement Each = listIterator.next();
			String Actual = Each.getText();
			if (Expect.equalsIgnoreCase(Actual)) {

				menu.selectByVisibleText(Actual);
				break;
			}
		}*/
		
		
	}

	    
	

	@When("send this key {string} in the searchbox and compare with the reference and select")
	public void send_this_key_in_the_searchbox_and_compare_with_the_reference_and_select(String string) throws InterruptedException {
		WebElement SearchBar = driver.findElement(By.id("twotabsearchtextbox"));
		String SearchBarKey = "cd";
		SearchBar.sendKeys(SearchBarKey);
		Thread.sleep(3000);

		List<WebElement> SearchSuggestions = driver
				.findElements(By.xpath("//div[@class='autocomplete-results-container']/div/div[1]"));

		System.out.println(SearchSuggestions.size());

		for (int i = 1; i <= SearchSuggestions.size(); i++) {

			WebElement Suggestions = driver.findElement(
					By.xpath("//div[@class='autocomplete-results-container']//child::div[" + i + "]/div/div"));

			String text = Suggestions.getText();
			System.out.println(i);
			System.out.println(text);

			if (text.equalsIgnoreCase(SearchBarKey)) {
				System.out.println(text);
				System.out.println(SearchBarKey);
				driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

				break;
			}

		}
	}

	    
	

	@When("get the product title and select the product and move to next page")
	public void get_the_product_title_and_select_the_product_and_move_to_next_page() throws InterruptedException {
	    
		WebElement GetTitle = driver.findElement(
				By.xpath("//span[(text()='RESULTS')]//ancestor::div[4]//following-sibling::div[1]//child::h2"));
		String GetTitle1 = GetTitle.getText();
		String windowHandle1 = driver.getWindowHandle();
		System.out.println(GetTitle1);

		driver.findElement(
				By.xpath("//span[(text()='RESULTS')]//ancestor::div[4]//following-sibling::div[1]//child::h2/a"))
				.click();

		Set<String> windowHandles = driver.getWindowHandles();

		System.out.println(windowHandles.size());
		for (String string2 : windowHandles) {
			System.out.println(string2);

			if (!windowHandle1.equalsIgnoreCase(string2)) {

				driver.switchTo().window(string2);
				Thread.sleep(3000);
				WebElement Title2 = driver.findElement(By.xpath("//span[@id='productTitle']"));

				gettitle2 = Title2.getText();

				System.out.println(GetTitle1);

				System.out.println(gettitle2);

							}
		}
	}



	@Given("get the current page product title and compare with the homepage product title")
	public void get_the_current_page_product_title_and_compare_with_the_homepage_product_title() {
	    
	    
	}

	@When("after comparison is matched select the add to cart button")
	public void after_comparison_is_matched_select_the_add_to_cart_button() {
		if (gettitle2.equalsIgnoreCase(GetTitle1)) {
			WebElement findElement3 = driver.findElement(By.id("add-to-cart-button"));
			findElement3.click();
		}    
	}	
	@Given("select go to cart button")
	public void select_go_to_cart_button() {
		WebElement findElement = driver.findElement(By.linkText("Go to Cart"));
		findElement.click();
	}

	@When("take screenshot of the page after selecting the go to cart button")
	public void take_screenshot_of_the_page_after_selecting_the_go_to_cart_button() {
	    
	    
	}

	@When("fetch the go to cart product title and compare with the homepage product title")
	public void fetch_the_go_to_cart_product_title_and_compare_with_the_homepage_product_title() {
	    
	    
	}

	@When("select the proceed to buy button")
	public void select_the_proceed_to_buy_button() {
	    
	    
	}

	@When("closing the current web page")
	public void closing_the_current_web_page() {
	    
	    
	}

}
