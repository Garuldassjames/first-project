package com.nykaa.nykaa_product_list;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookdatadriven {
	
	
	public static void browserl() {
//		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		WebDriver driver = new ChromeDriver(opt);
//		opt.addArguments("start-maximized");
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();		 
        
        WebElement emailid = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
        emailid.sendKeys();
        
        WebElement passd = driver.findElement(By.xpath(""));
        passd.sendKeys();
        
        WebElement button = driver.findElement(By.xpath(""));
        button.click();
		
//	public static void main(String[] args) {
//		
//		int a = 100;
//		int b;
//		int c;
//		 b=++a;
//		 c=b++;
//		 
//		 System.out.println(a);
//		 System.out.println(b);
//		 System.out.println(c);
//
//	
	}
		
//	}
	public static void main(String[] args) {
//		facebookdatadriven
		browserl();
		
	}
	
	
}
	
	
	
	

