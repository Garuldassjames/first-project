import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class myntra {
	public static void main(String[] args) throws InterruptedException {
		
	ChromeOptions opt = new ChromeOptions();
//	opt.addArguments("start-maximized");
	opt  .addArguments("start-maximized");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Jav selenium\\driver1\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(opt);
//	WebDriverManager.chromedriver().setup();
    driver.get("https://www.myntra.com/");
//    driver.manage().window().maximize();
    
	WebElement kids = driver.findElement(By.xpath("//a[contains(text(),'Kids')]"));

    Actions a = new Actions(driver);
    a.moveToElement(kids).build().perform();
    
    WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/div/div/div/li[1]/ul/li[2]/a"));
    tshirt.click();
    Thread.sleep(3000);
    
 List<WebElement> allprobs = driver.findElements(By.xpath("//li[@class='product-base']"));
    int size = allprobs.size();
System.out.println("total no. of product="+""+size);

System.out.println();

for (WebElement webElement : allprobs) {
	System.out.println(webElement.getText());
	
	List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
	int size2 = findElements.size();
	System.out.println(size2);
	 ArrayList<Integer> priceamo = new ArrayList<Integer>();	
	for (WebElement webElement2 : findElements) {
		String k = webElement2.getText(); // RS. 765
		k= k.replaceAll("[^0-9]", "");//765
		int t=Integer.parseInt(k);//765

		
		
		//System.out.println(webElement2.getText());
		priceamo.add(t);
		
	}

	
	
	System.out.println("minimum value "+Collections.min(priceamo));
}}}

