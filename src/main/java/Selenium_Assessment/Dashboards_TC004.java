package Selenium_Assessment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboards_TC004 {
	
	public static void main(String args[]) {
		
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
		
		//sorting
		driver.findElement(By.xpath("//span[@title='Dashboard Name']/parent::a")).click();
		List <WebElement> names = driver.findElements(By.xpath("//th[@data-label='Dashboard Name']//a"));
		List<String> extractedNames = new ArrayList<>();
		for(WebElement name : names) {
			extractedNames.add(name.getText());
		}
		
		System.out.println(extractedNames);
		
		//manual sorting for verfication
		List<String> sortedNames = new ArrayList<>(extractedNames);
		Collections.sort(extractedNames);
		
		//compare the sorted names to verify the order
		boolean isSorted = extractedNames.equals(sortedNames);
		if(isSorted) System.out.println("Test Case Passed :  Names are displaying in the sorted order");
		else System.out.println("Test case failed :  error in sorting");
	}

}
