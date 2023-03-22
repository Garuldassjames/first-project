package maven_pack.maven01;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_cd {

	public static WebDriver driver;
	public static String gettitle2;

	@BeforeClass 
	private void browserlaunch() {
//		driver.manage().window().maximize(); to maximize the chrome 
//      WebDriverManager.chromedriver().setup(); browser launch

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
        System.getProperty(("user.dir")+"gettitle3\\driver1\\chromedriver.exe");
//   	System.getProperty(("user.dir") + "gettitle3\\driver1\\chromedriver.exe");
		driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public static void searchbox() {

		WebElement SearchCat = driver.findElement(By.id("searchDropdownBox"));
		
		
		Select menu = new Select(SearchCat);
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

	@Test(dependsOnMethods = "searchbox",groups ="search")
	public void searchkey() throws InterruptedException {

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

	@Test(priority = 3,dependsOnMethods = "searchkey",groups ="search")
	public static void title() throws InterruptedException {
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

				if (gettitle2.equalsIgnoreCase(GetTitle1)) {
					WebElement findElement3 = driver.findElement(By.id("add-to-cart-button"));
					findElement3.click();
				}
			}
		}
	}

	@Test(priority = 4,dependsOnGroups="search")
	public void go_to_cart() {
		WebElement findElement = driver.findElement(By.linkText("Go to Cart"));
		findElement.click();
	}

	@Test(priority = 5)
	public void comparison() throws IOException {
		WebElement gettitle3 = driver.findElement(By.xpath(
				"//div[@class='a-row sc-cart-header sc-compact-bottom']/following-sibling::div/following-sibling::form/child::div/child::div/following-sibling::div/following-sibling::div/child::div/following-sibling::div/following-sibling::div[2]//descendant::span[@class='a-truncate-cut']"));
		String Title3 = gettitle3.getText();

		if (Title3.equalsIgnoreCase(gettitle2)) {
			WebElement findElement4 = driver.findElement(By.name("proceedToRetailCheckout"));
			findElement4.click(); 
		}
			}

	public static void main(String[] args) {

	}
}
