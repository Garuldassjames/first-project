package maven_pack.maven01;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.flipkart.com/");
		

			
		
		WebElement xbutton = driver.findElement(By.xpath("//button[contains (text(),'✕')]"));
		
		if (xbutton.isDisplayed()==true) {	
			xbutton.click();
		}
	    
		WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys("iphone 12 red");
		
		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    submit.click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Login']/ancestor::div[7]/following-sibling::div/following-sibling::div/descendant::div/child::div//div//div[@class='MIXNux']//following::div[@class='gUuXy-']//preceding-sibling::div")).click();
	    
	    Set<String> childtab = driver.getWindowHandles();
        String parenttab = driver.getWindowHandle();	
        
        for (String child1 : childtab) {
			if (!parenttab.equals(childtab)) {
				driver.switchTo().window(child1);
				
			}
		}
        
        Thread.sleep(2000);
    	WebElement butt =   driver.findElement(By.xpath("//button[text()='Add to cart']"));

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView();", butt);
        butt.click();
        
        
   
//	   Set<String> addtocartp = driver.getWindowHandles();
//	  for (String child2 : addtocartp) {
//	  if (!parenttab.equals(child2)) {
//		  
//		  
//		  Set<String> addtocart = driver.getWindowHandles();
//		  String cartpage = driver.getWindowHandle();
//		  
//		  Thread.sleep(2000);
////	  driver.switchTo().window(parenttab);

	  driver.close();			
Thread.sleep(2000);  
//		}
		
//	}
	 
	 driver.quit(); 
	
	}	
}

