package Selenium_DryRun;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SalesforceAutomation {
	public ChromeDriver driver;
	By login_Username= By.xpath("//input[@id='username']");
	By login_password= By.xpath("//input[@id='password']");
	By login_click= By.xpath("//input[@id='Login']");
	By home_AppLaucherIcon = By.xpath("//button[@data-aura-class='forceHeaderButton salesforceIdentityAppLauncherHeader']");
	By home_ViewAll = By.xpath("//button[text()='View All']");
	By home_AppLauncherSearch = By.xpath("//input[@placeholder='Search apps or items...']");
	By home_worktype = By.xpath("//*[text()='Work Types']");
	By WorkTypes_new = By.xpath("//a[@title='New']/div");
	By WorkType_alert = By.xpath("//div[@data-aura-class='forceDetailPanelDesktop']");
	By WorkType_alert_WorkTypeName = By.xpath("//div[@class='uiInput uiInputText uiInput--default uiInput--input']/input");
	By WorkType_alert_description= By.xpath("//textarea[@role='textbox']");
	By WorkType_operatinghours= By.xpath("//input[@role='combobox']");
	By WorkType_newoperatinghours = By.xpath("//div[@class='createNew itemContainer slds-lookup__item-action--label slds-text-link--reset slds-grid slds-grid--vertical-align-center slds-truncate forceSearchInputLookupDesktopActionItem lookup__footer']");
	By WorkType_newoperatinghoursAlert = By.xpath(" //h2[text()='New Operating Hours']");
	By WorkType_newoperatinghoursAlert_Name = By.xpath("(//div[@class='uiInput uiInputText uiInput--default uiInput--input']//input[@class=' input'])[2]");
	By WorkType_newoperatinghoursAlert_save = By.xpath("//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton forceActionButton']");
	By WorkType_newoperatingestimateduration = By.xpath("(//div[@class='uiInput uiInputNumber uiInput--default uiInput--input']//*[@data-aura-class='uiInputSmartNumber'])[1]");
	By WorkType_cancelbutton = By.xpath("//button[@title='Cancel']");
	By WorkType_newoperatingsave = By.xpath("//button[@title='Save']");
	By WorkType_displayheader = By.xpath("//button[@class='slds-button test-id__section-header-button slds-section__title-action']");
	By WorkType_displayWorkTypeName = By.xpath("//*[@class='slds-form-element slds-form-element_readonly slds-form-element_edit slds-grow slds-hint-parent override--slds-form-element']//span[@class='uiOutputText']");
	By WorkType_displayWorkTypeOperatingHours = By.xpath("//span[@class='test-id__field-value slds-form-element__static slds-grow ']/div[@class='outputLookupContainer forceOutputLookupWithPreview']");
	By WorkType_displayWorkTypeEstimatedduration = By.xpath("(//span[@class='test-id__field-value slds-form-element__static slds-grow ']//span[@data-aura-class='uiOutputNumber'])[1]");
	By WorkType_editArrow = By.xpath("//tbody/tr[1]/td[5]//div/a");
	By WorkType_editbutton = By.xpath("//a[@Title='Edit']");
	By WorkType_editstarttime = By.xpath("(//*[@data-aura-class='uiInput uiInputNumber uiInput--default uiInput--input']//input)[4]");
	By WorkType_editendtime = By.xpath("(//*[@data-aura-class='uiInput uiInputNumber uiInput--default uiInput--input']//input)[5]");
	By WorkType_errormsg = By.xpath("//div[@class='genericNotification']");
	By WorkType_sucessmsg = By.xpath("//div[@role='alertdialog']");
	By WorkType_deletelink = By.xpath("//a[@data-target-selection-name='sfdc:StandardButton.WorkType.Delete']");
	By WorkType_deletebutton = By.xpath("//button[@title='Delete']");
	By WorkType_deletemsg = By.xpath("//div[@class='slds-align-middle slds-hyphenate']");


	By LegalEntitylink = By.xpath("//p[text()='Legal Entities']");
	By Applauncheralert= By.xpath("//a[@data-label='Legal Entities']");
	By LegalEntitylink1= By.xpath("//*[text()='Legal Entities']");








	public void sendkeysMethod(WebDriver driver,By name,String value) {
		Wait<WebDriver>wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(1000))
				.pollingEvery(Duration.ofMillis(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(name)));
		driver.findElement(name).clear();
		driver.findElement(name).sendKeys(value);
	}



	public void waitforElementMethod(WebDriver driver,By name) {
		Wait<WebDriver>wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(1000))
				.pollingEvery(Duration.ofMillis(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(name)));

	}

	@BeforeClass
	public void setup(){
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
		driver.get("https://d5g000007pmtgeai-dev-ed.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		sendkeysMethod(driver,login_Username,"sureshsudan95@gmail.com");
		sendkeysMethod(driver,login_password,"Suresh@26");
		clickMethod(driver,login_click);
	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}

	public void scrolldown(WebDriver driver,String name) {
		EventFiringWebDriver event = new EventFiringWebDriver(driver);
		event.executeScript("document.querySelector'("+name+").scrollBy(0,100)");
	}
	public void clickMethod(WebDriver driver,By name) {
		Wait<WebDriver>wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(1000))
				.pollingEvery(Duration.ofMillis(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(name)));
		driver.findElement(name).click();
	}

	@Test(priority=1)
	public void createWorkType() throws InterruptedException{
		clickMethod(driver,home_AppLaucherIcon);
		Thread.sleep(1000);
		try {
			clickMethod(driver,home_ViewAll);
		} catch (Exception e) {
			clickMethod(driver,home_ViewAll);
		}
		Thread.sleep(1000);
		sendkeysMethod(driver,home_AppLauncherSearch,"Work Types");
		clickMethod(driver,home_worktype);
		Thread.sleep(1000);
		try {
			clickMethod(driver, WorkTypes_new);
		} catch (Exception e) {
			clickMethod(driver, WorkTypes_new);
		}
		Thread.sleep(2000);
		waitforElementMethod(driver,WorkType_alert_WorkTypeName);
		sendkeysMethod(driver,WorkType_alert_WorkTypeName,"Salesforce Project");
		sendkeysMethod(driver,WorkType_alert_description,"Specimen");
		clickMethod(driver,WorkType_operatinghours);
		clickMethod(driver,WorkType_newoperatinghours);
		waitforElementMethod(driver,WorkType_newoperatinghoursAlert);
		Thread.sleep(2000);
		sendkeysMethod(driver,WorkType_newoperatinghoursAlert_Name,"UK Shift");
		clickMethod(driver,WorkType_newoperatinghoursAlert_save);
		sendkeysMethod(driver,WorkType_newoperatingestimateduration,"7");
		clickMethod(driver,WorkType_newoperatingsave);
		waitforElementMethod(driver,WorkType_displayheader);
		Assert.assertEquals("Salesforce Project",driver.findElement(WorkType_displayWorkTypeName).getText());
		Assert.assertEquals("UK Shift",driver.findElement(WorkType_displayWorkTypeOperatingHours).getText());
		Assert.assertEquals("7.00", driver.findElement(WorkType_displayWorkTypeEstimatedduration).getText());
	}

	@Test(priority=2)
	public void EditLegalEntity() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-show']")).click();
		try {
			clickMethod(driver,home_ViewAll);
		} catch (Exception e) {
			clickMethod(driver,home_ViewAll);
		}
		Thread.sleep(1000);
		sendkeysMethod(driver,home_AppLauncherSearch,"Work Types");
		driver.findElement(By.xpath(" //a[@data-label='Work Types']//p")).click();
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.xpath("//tbody/tr[1]/td[5]//div/a"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", dropdown);
		clickMethod(driver,WorkType_editbutton);
		waitforElementMethod(driver,WorkType_alert_WorkTypeName);
		sendkeysMethod(driver,WorkType_editstarttime,"9");
		sendkeysMethod(driver,WorkType_editendtime,"6");
		clickMethod(driver,WorkType_newoperatingsave);
		Assert.assertEquals("Review the errors on this page.",driver.findElement(WorkType_errormsg).getText());
		clickMethod(driver,WorkType_cancelbutton);
	}

	@Test(priority=3)
	public void updateLegalEntity() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-show']")).click();
		try {
			clickMethod(driver,home_ViewAll);
		} catch (Exception e) {
			clickMethod(driver,home_ViewAll);
		}
		Thread.sleep(1000);
		sendkeysMethod(driver,home_AppLauncherSearch,"Work Types");
		driver.findElement(By.xpath(" //a[@data-label='Work Types']//p")).click();
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.xpath("//tbody/tr[1]/td[5]//div/a"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", dropdown);
		clickMethod(driver,WorkType_editbutton);
		Thread.sleep(1000);
		waitforElementMethod(driver,WorkType_alert_WorkTypeName);
		Thread.sleep(1000);
		sendkeysMethod(driver,WorkType_editstarttime,"9");
		sendkeysMethod(driver,WorkType_editendtime,"18");
		clickMethod(driver,WorkType_newoperatingsave);
		Assert.assertTrue(driver.findElement(WorkType_sucessmsg).getText().contains("Work Type \"Salesforce Project\" was saved."));
	}
	
	@Test(priority=4)
	public void deleteLegalEntity() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-show']")).click();
		try {
			clickMethod(driver,home_ViewAll);
		} catch (Exception e) {
			clickMethod(driver,home_ViewAll);
		}
		Thread.sleep(1000);
		sendkeysMethod(driver,home_AppLauncherSearch,"Work Types");
		driver.findElement(By.xpath(" //a[@data-label='Work Types']//p")).click();
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.xpath("//tbody/tr[1]/td[5]//div/a"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", dropdown);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@data-target-selection-name='sfdc:StandardButton.WorkType.Delete'])[2]")).click();
		Thread.sleep(1000);
		clickMethod(driver,WorkType_deletebutton);
		waitforElementMethod(driver,WorkType_deletemsg);
		Assert.assertTrue(driver.findElement(WorkType_deletemsg).getText().contains("Work Type \"Salesforce Project\" was deleted."));
	}
	
	@Test(priority=5)
	public void errorLegalEntity() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-show']")).click();
		Thread.sleep(1000);
		try {
			clickMethod(driver,home_ViewAll);
		} catch (Exception e) {
			clickMethod(driver,home_ViewAll);
		}
		Thread.sleep(1000);
		sendkeysMethod(driver,home_AppLauncherSearch,"Work Types");
		//clickMethod(driver,home_worktype);
		driver.findElement(By.xpath(" //a[@data-label='Work Types']//p")).click();
		Thread.sleep(1000);
		try {
			clickMethod(driver, WorkTypes_new);
		} catch (Exception e) {
			clickMethod(driver, WorkTypes_new);
		}
		Thread.sleep(2000);
		waitforElementMethod(driver,WorkType_alert_WorkTypeName);
		sendkeysMethod(driver,WorkType_alert_WorkTypeName,"Bootcamp");
		clickMethod(driver,WorkType_newoperatingsave);
		Assert.assertEquals("Review the errors on this page.",driver.findElement(WorkType_errormsg).getText());
		clickMethod(driver,WorkType_cancelbutton);
	}

}