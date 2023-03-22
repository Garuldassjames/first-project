package project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetProductTitle {
	public static WebDriver driver;
	public static String SearchText = "iphone";

	private static void BrowserLaunch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		List<String> l = new ArrayList<String>();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		ch.addArguments(l);
		driver = new ChromeDriver(ch);
		driver.get("https://www.flipkart.com/");

	}

	private static void SkipRigistor() {
		WebElement Register = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
		if (Register.isDisplayed()) {

			Register.click();
		}
	}

	private static void searchProduct() {
		WebElement SearchBar = driver
				.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));

		SearchBar.sendKeys(SearchText);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public static void main(String[] args) throws InterruptedException {

		BrowserLaunch();
		SkipRigistor();
		searchProduct();

	}

}
