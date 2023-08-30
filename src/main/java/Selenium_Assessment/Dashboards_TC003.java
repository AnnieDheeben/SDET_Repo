package Selenium_Assessment;

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

public class Dashboards_TC003 {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		//javascript executor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		//launch url
		driver.get("https://login.salesforce.com");

		driver.findElement(By.id("username")).sendKeys("geethakalaiselvan2303@gmail.com");   
		 driver.findElement(By.id("password")).sendKeys("Unicorn@123");
			driver.findElement(By.id("Login")).click();
				
		//App Luncher
		driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
		WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", viewAll);
		viewAll.click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search app')]")).sendKeys("Dashboards");
		driver.findElement(By.xpath("//mark[text() = 'Dashboards']")).click();
		
		//locate name and delete
		String name = "Automation by Annie";
		driver.findElement(By.xpath("(//a[@title='"+ name +"']/ancestor::span/../../following-sibling::td/lightning-primitive-cell-factory/span/following::button)[1]")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'modal-container')]//button[@title='Delete']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-aura-class='forceToastMessage']//span[contains(@class,'toastMessage')]"))).isDisplayed();
		
		//validation after delete
		WebElement ele = driver.findElement(By.xpath("//a[@title='Dashboards']"));
		jse.executeScript("arguments[0].click();", ele);
		driver.findElement(By.xpath("//input[contains(@placeholder,'recent dashboards')]")).sendKeys(name);
		boolean noResults = driver.findElement(By.xpath("//span[text()='No results found']")).isDisplayed();
		if(noResults) System.out.println("Test case passed - Dashboard name deleted successfully");
		else System.out.println("Test Case failes - error on deletion of Dashboard name");
		
	}

}
