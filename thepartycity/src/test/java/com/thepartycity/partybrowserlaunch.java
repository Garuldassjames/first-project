package com.thepartycity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class partybrowserlaunch {
	public static WebDriver driver;

	public static void chromelaunch() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.get("https://www.partycity.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		WebElement dropover = driver.findElement(By.xpath("//button[@aria-label='Open Birthday Party Supplies Submenu']"));
		Actions act = new Actions(driver);
		act.moveToElement(dropover).build().perform();
		Thread.sleep(4000);
		WebElement firstbirthday = driver.findElement(By.xpath("//a[text()='1st Birthday']"));
		act.click(firstbirthday).build().perform();
		
		
		Thread.sleep(2000);
		WebElement boho = driver.findElement(By.xpath("//h3[contains(text(),\"Boho\")]"));
		boho.click();
		
		WebElement partykits = driver.findElement(By.xpath("//a[contains(text(),\"Party Ki\")]"));
		partykits.click();
		
//		WebElement products = driver.findElement(By.xpath("//a[contains(text(),\"Free Spirit Boho 1st Birthday P\")]"));
//		products.click();
		
		List<WebElement> maxiproduct = driver.findElements(By.xpath("//pc-price[@class='pc-price pc-price--regular']//span[@class='pc-type pc-type--title-6']"));
		
		
		List<Float> values= new ArrayList<Float>();
		
		for (WebElement webEli : maxiproduct) {
			System.out.println(webEli.getText());
		String dollargo = webEli.getText().replace("$", "");
		values.add(Float.valueOf(dollargo)); 
		System.out.println(dollargo);
		}	
		float max = Collections.max(values);
		System.out.println(max);
		
		driver.findElement(By.xpath("//span[text()[normalize-space() = '$"+max+"']] /parent::pc-price/parent::div/parent::div/parent::pc-product-price-review/preceding-sibling::pc-product-tile-head")).click();

		driver.quit();
	}

	public static void firefox() throws InterruptedException {
//		Thread.sleep(2000);

		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt = new FirefoxOptions();
//		opt.addArguments("start-maximized");
		driver = new FirefoxDriver(opt);
		driver.get("https://www.partycity.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(4000);
		driver.quit();

	}

	public static void edgebrowserlaunch() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeOptions opt = new EdgeOptions();
//		opt.addArguments("start-maximized");
		driver = new EdgeDriver();
		driver.get("https://www.partycity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		chromelaunch();
		firefox();
		edgebrowserlaunch();
	}
}
