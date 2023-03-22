import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Jav selenium\\driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String title = driver.getTitle();
		String url1 = driver.getCurrentUrl();
		System.out.println(title + url1);

		if (title.contains("Facebook") == url1.contains("facebook")) {

			WebElement username = driver.findElement(By.id("email"));

			username.sendKeys("shakthiwerwew3");
			Thread.sleep(2000);
			WebElement password = driver.findElement(By.id("pass"));

			password.sendKeys("shakti22");

			driver.findElement(By.xpath("//button[@name='login']")).click();

			Thread.sleep(5000);

			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);

			File DestFile = new File("C:\\Users\\Dell\\eclipse-workspace\\Jav selenium\\screenshots\\1.png");

			FileUtils.copyFile(source, DestFile);

			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();

			WebElement FirstName = driver.findElement(By.name("firstname"));
			FirstName.sendKeys("shakthi");
			WebElement LastName = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
			LastName.sendKeys("ram");
			WebElement RegEmail = driver.findElement(By.name("reg_email__"));
			RegEmail.sendKeys("shakiireere");
		
			WebElement RegPass = driver.findElement(By.name("reg_passwd__"));
			RegPass.sendKeys("565a6s5s6");
			WebElement RegEmail2 = driver.findElement(By.name("reg_email_confirmation__"));
			RegEmail2.sendKeys("shakiireere533@ddd.com");
			
			
			WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
			Select s = new Select(day);
			s.selectByValue("15");
			
			
        	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			Select s1 = new Select(month);
			s1.selectByValue("4");
			
			
			WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
			Select s2 = new Select(year);
			s2.selectByValue("1999");
			
			driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
			
			WebElement createbut = driver.findElement(By.name("websubmit"));
			
			createbut.click();
			Thread.sleep(5000);
			
			TakesScreenshot ts2 = (TakesScreenshot) driver;

			File source2 = ts2.getScreenshotAs(OutputType.FILE);

			File DestFile2 = new File("C:\\Users\\Dell\\eclipse-workspace\\Jav selenium\\screenshots\\2.png");

			FileUtils.copyFile(source2, DestFile2);

		}

	}
}
