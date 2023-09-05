package Selenium_Assessment;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboards_TC002 {
	
	public static void main(String[] args) throws InterruptedException {
		
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
		
		//Search
		String name = "geetha";
		//driver.findElement(By.xpath("(//a[@title='"+name+"']/ancestor::span/../../following-sibling::td/lightning-primitive-cell-factory/span/following::button)[1]")).click();
		driver.findElement(By.xpath("//a[@title='" +name+"']/ancestor::th/following-sibling::td//button")).click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='dashboard']")));
		driver.findElement(By.xpath("//button[@title='Edit Dashboard Properties']")).click();
		driver.findElement(By.id("dashboardDescriptionInput")).clear();
		driver.findElement(By.id("dashboardDescriptionInput")).sendKeys("SalesForce");
		driver.findElement(By.id("submitBtn")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.switchTo().defaultContent();
		WebElement ele = driver.findElement(By.xpath("//a[@title='Dashboards']"));
		jse.executeScript("arguments[0].click();", ele);
		String desc = driver.findElement(By.xpath("(//a[text()='"+name+"']/ancestor::th/following-sibling::td[@data-label='Description'])[1]//lightning-base-formatted-text")).getText();
		if(desc.equals("SalesForce")) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Edit Dashboard got failed");
		}
				
				
		
	}

}
