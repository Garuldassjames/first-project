import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class amazon_cd {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Jav selenium\\driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement SearchCat = driver.findElement(By.id("searchDropdownBox"));

		Select SearchList = new Select(SearchCat);

		List<WebElement> allSelectedOptions = SearchList.getOptions();

		ListIterator<WebElement> listIterator = allSelectedOptions.listIterator();
		String Expect = "Music";
		while (listIterator.hasNext()) {
//			WebElement Each = (WebElement) listIterator.next();
        
			WebElement Each = listIterator.next();
			String Actual = Each.getText();
			if (Expect.equalsIgnoreCase(Actual)) {

				SearchList.selectByVisibleText(Actual);
				break;
			}

			WebElement SearchBar = driver.findElement(By.id("twotabsearchtextbox"));
			String SearchBarKey = "cd";
			SearchBar.sendKeys(SearchBarKey);
			Thread.sleep(3000);

			List<WebElement> SearchSuggestions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div/div[1]"));

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
					Suggestions.click();
//					driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

					break;
				}

			}

			WebElement GetTitle = driver.findElement(
					By.xpath("//span[(text()='RESULTS')]//ancestor::div[4]//following-sibling::div[1]//child::h2"));
			String GetTitle1 = GetTitle.getText();
			String windowHandle1 = driver.getWindowHandle();
			System.out.println(GetTitle1);

			driver.findElement(
					By.xpath("//span[(text()='RESULTS')]//ancestor::div[4]//following-sibling::div[1]//child::h2/a"))
					.click();

			Set<String> windowHandles = driver.getWindowHandles();

			for (String string2 : windowHandles) {

				if (!windowHandle1.equalsIgnoreCase(string2)) {

					driver.switchTo().window(string2);

				}

				WebElement Title2 = driver.findElement(By.xpath("//span[@id='productTitle']"));

				String gettitle2 = Title2.getText();

				System.out.println(GetTitle1);

				System.out.println(gettitle2);

				if (gettitle2.equalsIgnoreCase(GetTitle1)) {

				}
			}

		}
		WebElement findElement = driver.findElement(By.id("add-to-cart-button"));
		findElement.click();
		
		

	}

}
