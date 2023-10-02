package Selenium_Assessment_JIRA;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeScreenshot {
	public static void main(String args[]) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://login.salesforce.com");
		TakesScreenshot screenshort = (TakesScreenshot) driver;
		
		File screenshotFile = screenshort.getScreenshotAs(OutputType.FILE);
		File destination = new File("./src/main/resources/screenshot.jpg");
		FileUtils.copyFile(screenshotFile, destination);
		driver.quit();
		
		
	}

}
