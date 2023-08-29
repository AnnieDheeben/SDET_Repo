package mandatoryHomeWork.selenium;
/*
 * Day_3 Assignment:
"Test Steps for Create Campaign:
1. Login to https://login.salesforce.com
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Campaigns tab 
5. Click on New button
6. Enter Campaign name as 'Bootcamp'
7. Choose Start date as Tomorrow
8. End date as Tomorrow+1
9. click Save and Verify the newly created Campaign"
 */

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Week1_Day3 {
	
	public static void main(String[] args) {
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	driver.get("https://login.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf$1234");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
	driver.findElement(By.xpath("//button[contains(text(),'View All']")).click();
	WebElement sales = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Sales']")));
	sales.click();
	try {
		WebElement capaigns = driver.findElement(By.xpath("//a[@title='Campaigns']"));
		capaigns.click();
	} catch(StaleElementReferenceException e){
		WebElement capaigns = driver.findElement(By.xpath("//a[@title='Campaigns']"));
		capaigns.click();
	}
	
	WebElement btnNew = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='New']")));
	btnNew.click();
	WebElement campName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Campaign Name'])[2]")));
	campName.click();
	driver.findElement(By.xpath("(//span[text()='Campaign Name'])[2]//following::input")).sendKeys("Bootcamp");
	driver.findElement(By.xpath("(//a[contains(@class,'datePicker-')])[1]")).click();
	WebElement stDate = driver.findElement(By.xpath("//td[contains(@class,'slds-is-today')]/following::td[1]"));
	String tomDate = stDate.getText();
	String[] tomDateArr = tomDate.split(",");
	int iTomDate =Integer.parseInt(tomDateArr[1]);
	driver.findElement(By.xpath("(//a[contains(@class,'datePicker-')])[2]")).click();
	
	
	}	

}
