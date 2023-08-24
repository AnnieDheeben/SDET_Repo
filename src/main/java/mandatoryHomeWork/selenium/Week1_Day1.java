package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Week1_Day1 {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//button[contains(@class,\"salesforceIdentityAppLauncherHeader\")]")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"View All\")]")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement accounts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span//p[contains(text(),\"Accounts\")]")));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", accounts);
		//accounts.click();
		WebElement btnNew = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),\"New\")]")));
		btnNew.click();
		driver.findElement(By.xpath("//input[@name=\"Name\"]")).sendKeys("Annie");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(1000);
		driver.close();

	}

}
