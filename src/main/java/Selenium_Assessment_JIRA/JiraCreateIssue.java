package Selenium_Assessment_JIRA;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JiraCreateIssue {
	
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://api-training.atlassian.net/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com ");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.name("password")).sendKeys("India@123");
		driver.findElement(By.id("login-submit")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.xpath("//p[text()='SDET-5']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='createGlobalItem']"))).click();
		driver.findElement(By.name("summary")).sendKeys("Create Issue by Annie");
		driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Backlog']"))).click();
		String summary = "Create Issue by Annie";
		driver.findElement(By.xpath("//input[@aria-label='Search backlog']")).sendKeys(summary);
		WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a//mark[text()='"+summary+"']")));
		if(result.isDisplayed()){
			System.out.println("Test Case Passed");
		}
		
		
		
	}

}
