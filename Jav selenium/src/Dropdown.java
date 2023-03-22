import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	private static WebElement webElement;
	private static WebElement webElement2;
	private static WebElement WebElement;
	private static org.openqa.selenium.WebElement WebElement1;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Jav selenium\\driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
//        driver.findElement(By.xpath("//*[@aria-label='Kebab menu']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.name("emailMobile")).sendKeys("9566220866");
//        Thread.sleep(3000);
//        driver.findElement(By.id("submitVerification")).click();
//        Thread.sleep(10000);
//        
//        
    Actions a = new Actions(driver);
        
        
        WebElement aa= driver.findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[7]/a"));
        a.moveToElement(aa).build().perform();
        WebElement aaa = driver.findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[7]/ul/li/div/div[1]/div/ul/li[2]/a"));
        a.moveToElement(aaa).click().build().perform();
        
        JavascriptExecutor js= (JavascriptExecutor)driver;
        WebElement aaaa = driver.findElement(By.linkText("Himalaya Baby Massage Oil"));
        js.executeScript("arguments[0].scrollintoview(true);",aaaa);
        
	    System.out.println(aaaa.getText());
	    
	    ArrayList<String> tab1 =new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tab1.get(1));
	    
	    JavascriptExecutor je= (JavascriptExecutor)driver;
	    WebElement himalayanoil= driver.findElement(By.xpath("(//div[@class='css-xrzmfa']) [11]"));
	    je.executeScript("window.scrollBy(500,0);", "");
	    Thread.sleep(3000);
	    himalayanoil.click();
	    
	    ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tab2.get(2));
	    Thread.sleep(3000);
	    WebElement mrp500ml = driver.findElement(By.xpath("//span[@class='css-1jczs19'])[1]"));
	    System.out.println("MRP for 500ml:"+mrp500ml.getText());
	    WebElement size = driver.findElement(By.xpath("//select[@title='size']"));
	    
	    Select s = new Select(size);
	    s.selectByVisibleText("200ml");
	    driver.findElement(By.xpath("(//button[@class=' css-12z4fj0'])[1]")).click();
	    Thread.sleep(3000);
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//div[@class='css-15vhhhd e251f6d4']")).click();
	    
	}

}
