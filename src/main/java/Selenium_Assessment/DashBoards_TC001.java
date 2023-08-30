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

public class DashBoards_TC001 {
	
	public static void main(String args[]) {
		//initial browser setup
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
		
		//javascript executor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		
		//launch url
		driver.get("https://login.salesforce.com");
		//login
		driver.findElement(By.id("username")).sendKeys("geethakalaiselvan2303@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Unicorn@123");
		driver.findElement(By.id("Login")).click();
		
		//App Luncher
		driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
		WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", viewAll);
		viewAll.click();
		
		//Search
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Search app')]")));
		search.sendKeys("Dashboards");
		driver.findElement(By.xpath("//mark[text() = 'Dashboards']")).click();
		WebElement newDashBoard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='New Dashboard']")));
		newDashBoard.click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title = 'dashboard']")));
		WebElement dashboardName = driver.findElement(By.xpath("//input[@id='dashboardNameInput']"));
		String name = "Automation by Annie";
		dashboardName.sendKeys(name);
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dashboard-properties']//span"))).isDisplayed();
		driver.switchTo().defaultContent();
		//validation
		WebElement dashboard = driver.findElement(By.xpath("//a[@title='Dashboards']"));
		jse.executeScript("arguments[0].click();", dashboard);
		WebElement dashboardSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Search recent')]")));
		dashboardSearch.sendKeys(name);
		String dashboardName1 = driver.findElement(By.xpath("//th[@data-label='Dashboard Name']//a")).getText();
		
		if(dashboardName1.equals(name)){
			System.out.println("Test case passed");
		}
		
		else
			System.out.println("Dashboard Creation got failed");	
	}	
}
