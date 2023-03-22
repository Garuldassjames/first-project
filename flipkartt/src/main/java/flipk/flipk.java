package flipk;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipk {
	public static   WebDriver driver = null;
	public static void browserlaunch() {

	    WebDriverManager.chromedriver().setup();	
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
	    opt.addArguments("start-maximized");
	    driver = new ChromeDriver(opt);
	    driver.get("https://www.flipkart.com/");
	}
	
	public static void productsearch() throws InterruptedException {

		WebElement serachbar = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		serachbar.sendKeys("samsung a12");
	
//		searchkey.click();
//		Actions act = new Actions(driver);
//		act.click(searchkey).build().perform();
		
		Thread.sleep(2000);
		WebElement crossbutt = driver.findElement(By.xpath("//button[text()='✕']"));
//		crossbutt.click();	
		Actions act = new Actions(driver);
		act.click(crossbutt).build().perform();
		Thread.sleep(2000);
		WebElement searchkey = driver.findElement(By.xpath("//button[@type='submit']"));
		searchkey.click();
		
		Thread.sleep(2000);
		WebElement firstprod = driver.findElement(By.xpath("((//a[text()='Mobiles'])[2]/following::div/following::Div/descendant::div/child::div/child::Div/child::div/following::Div/following::Div/following::div/child::div/child::div)[1]"));
//		firstprod.click();
//		Actions act = new Actions(driver);
		act.click(firstprod).build().perform();
		
		String Parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String childs : child) {
			if(!Parent.equals(childs)) {
				driver.switchTo().window(childs);
			}
			
		}
		
		WebElement addtocart = driver.findElement(By.xpath("//button[text()='Add to cart']/parent::li"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", addtocart);
		Thread.sleep(2000);
		addtocart.click();
		
		Thread.sleep(3000);
		WebElement placingorder = driver.findElement(By.xpath("//span[text()='Place Order']/parent::button"));
		placingorder.click();
		
		driver.find
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public static void main(String[] args) throws InterruptedException {
	flipk fil = new flipk();
	browserlaunch();
	productsearch();
}
}
