package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/*
 * Day_2 Assignment
=============
"Test Steps to Create New Dashboard:
1. Login to https://login.salesforce.com
Username :hari.radhakrishnan@qeagle.com
Password :Leaf$1234
2. Click on the toggle menu button from the left corner
3. Click View All and click Dashboards from App Launcher
4. Click on the New Dashboard option
5. Enter Name as 'Salesforce Automation by Your Name ' and Click on Create.
6.Click on Save.
 */

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class week1day2 {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com");
		driver.findElement(By.xpath("//div[contains(@id,'username_')]//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		WebElement AppLauncher = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,\"salesforceIdentityAppLauncherHeader\")]")));
		AppLauncher.click();
		driver.findElement(By.xpath("//div[contains(@part,'input-')]/input[@type='search']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement dashboards = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text() = 'Dashboards']")));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",dashboards);
		dashboards.click();
		WebElement newDashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text() ='New Dashboard']")));
		newDashboard.click();
		WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dashboardNameInput")));
		name.sendKeys("Salesforce Automation by Annie");
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		WebElement verifyName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'slds-form-')]/span")));
		if(verifyName.getText()=="Salesforce Automation by Annie") {
			System.out.println("Test Case Passed");
		}
		
		
		
	}
	

}
