package maven_pack.maven01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven001 {


	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//	    System.setProperty("Webdriver.edge.driver", "\\src\\test\\java\\maven_pack\\maven01\\maven001.java");
	   WebDriverManager.chromedriver().setup();
	   List<String> l= new ArrayList<String>();
		ChromeOptions ch = new ChromeOptions();
	    ch.addArguments("Incognito");
	    ch.addArguments(l);
	    
	    WebDriver driver=new ChromeDriver(ch);
	    driver.get("https://www.amazon.in/");
//	    driver.manage().window().maximize();

	    Thread.sleep(4000);

	    WebElement searchbar = driver.findElement(By.xpath("//[@id='twotabsearchtextbox']"));
	    searchbar.sendKeys("Smart TV");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.findElement(By.xpath("//span[text()='AmazonBasics 127 cm (50 inches) 4K Ultra HD Smart LED Fire TV with Dolby Atmos and Dolby Vision (Black)'"));
	    
	    Thread.sleep(3000);
	    Set<String> allTab = driver.getWindowHandles();
	    Iterator<String> itr = allTab.iterator();
	    while (itr.hasNext()) {
	    	String newtab = itr.next();
	    	driver.switchTo().window(newtab);
	    }
	    driver.findElement(By.id("add-to-cart-button")).click();
	    
	    Thread.sleep(8000);
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination = new File ("C:\\Users\\Dell\\eclipse-workspace\\maven01\\screenshots\\maventv.png");
	    FileUtils.copyFile(source,destination);
	}

}
