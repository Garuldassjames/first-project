import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_Actions {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Jav selenium\\driver1\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
//		
//        WebElement element = driver.findElement(By.xpath("//a[text()='Mobiles']"));
//        
//        Actions a= new Actions(driver);
//        a.contextClick(element).build().perform();
//        
//        Robot r = new Robot();
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
//        Thread.sleep(6000);
//        
//        r.keyPress(KeyEvent.VK_ENTER);
//        driver.getWindowHandle();
	    driver.navigate().to("https://www.flipkart.com/");
	    String title = driver.getTitle();
        System.out.println(title);	    
	    
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    
	    driver.navigate().to("https://www.amazon.in/");
	    String title2 = driver.getTitle();
	    System.out.println(title2);
	    String currentUrl2 = driver.getCurrentUrl();
	    System.out.println(currentUrl2);
	    
	    driver.navigate().to("https://www.flipkart.com/");

	    driver.navigate().to("https://www.facebook.com/");
	    WebElement emailid = driver.findElement(By.id("email"));
	    emailid.sendKeys("ishubeem16@gmail.com");
	    Thread.sleep(3000);
	    WebElement password = driver.findElement(By.id("pass"));
	    password.sendKeys("ishubeem16");
	    Thread.sleep(3000);
	    
	    WebElement log = driver.findElement(By.name("login"));
	    log.click();
	    
	    driver.quit();
	}

}
