package Tamil_TestCases_DryRun;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC001_CreateIndividuals_SalesForce {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("sureshsudan95@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Suresh@26");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		//clicking the Individuals Link
		
		WebElement individuals = driver.findElement(By.xpath("//p[text()='Individuals']"));
		
		 JavascriptExecutor j = (JavascriptExecutor) driver;
	     j.executeScript("arguments[0].click();", individuals);
	     //clicking the Individuals tab
	     
	     driver.findElement(By.xpath("//a[contains(@title,'Individuals')]/following::*[name()='svg' and @data-key='chevrondown']")).click();
	     
	     //clicking the create new inviduals
	     
	     
	     driver.findElement(By.xpath("//div[@title='New']")).click();
//	   
//	     WebElement newindividual = driver.findElement(By.xpath("//span[text()='New Individual']"));
//	     Thread.sleep(5000);
//	     j.executeScript("arguments[0].click();", newindividual);
	     
	     //send last name
	     driver.findElement(By.xpath("//input[contains(@class,'lastName')]")).sendKeys("Catherine");
	     
	     //click on save button
	     driver.findElement(By.xpath("//button[@title='Save']")).click();
	     
	     //get the last name and Verify
	     Thread.sleep(5000);
	    String lastname =  driver.findElement(By.xpath("(//span[text()='Kumar'])[2]")).getText();
	    
	    	System.out.println(lastname.equals("Catherine"));
	     
	   
			
	}
	

}