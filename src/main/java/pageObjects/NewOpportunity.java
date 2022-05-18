package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.BaseClass;

public class NewOpportunity extends BaseClass {
	
	public NewOpportunity(WebDriver driver) {
		this.driver = driver;
	}
	
	By globalActionButton = By.xpath("//ul[@class='slds-global-actions']//child::li[3]");
	By selectNewOpportunity = By.linkText("New Opportunity");
	By opportunityName = By.xpath("(//input[@class=' input'])[1]");
	By datePicker = By.xpath("//a[@class='datePicker-openIcon display']");
	By dateSelector = By.xpath("//table/tbody/tr[3]/td[7]/span");
	By selectStage = By.xpath("//a[text()='--None--']");
	By selectdropdownOfStage = By.xpath("//a[text()='Qualification']");
	By selectSaveButton = By.xpath("//div[@class='bottomBarRight slds-col--bump-left']/button/span");
	By selectCrossButton = By.xpath("//button[@title='Close']/lightning-primitive-icon");
	By selectMenu = By.xpath("//div[@class='slds-icon-waffle']");
	By selectSalesOption = By.xpath("//p[text()='Sales']");
	By selectOpportunityButton = By.xpath("//a[@title='Opportunities']/span");
	By searchField = By.xpath("//input[@class='slds-input']");
	By scopeRemover = By.xpath("//div[@class='slds-grid ']");
	By createOpportunitytext = By.xpath("//table/tbody/tr/th/span/a");

	public WebElement getClickGlobalActionsBtn() {
		try {
			TimeUnit.SECONDS.sleep(30);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		return driver.findElement(globalActionButton);
	}
	
	public WebElement getSelectNewOpportunity() {
		return driver.findElement(selectNewOpportunity);
	}
	
	public WebElement getOpportunityName() {
		return driver.findElement(opportunityName);
	}
	
	public WebElement getDatePicker() {
		return driver.findElement(datePicker);
	}
	
	public WebElement getDateFromCalender() {
		return driver.findElement(dateSelector);
	}
	
	public WebElement getStage() {
		return driver.findElement(selectStage);
	}
	
	public WebElement getStageDropdownOptions() {
		 return driver.findElement(selectdropdownOfStage);
	}
	
	public WebElement getSaveButton() {
		return driver.findElement(selectSaveButton);
	}
	
	public WebElement getCrossButton() {
		return driver.findElement(selectCrossButton);
	}
	
	public WebElement getMenuButton() {
		return driver.findElement(selectMenu);
	}
	
	public WebElement getMenuOptions() {
		return driver.findElement(selectSalesOption);
	}
	
	public WebElement getOpportunityButton() {
		WebElement findElement = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		Actions builder3 = new Actions(driver);
		builder3.moveToElement(findElement).click().perform();
		
		return findElement;
	}
	
	public WebElement getSearchField() {
		return driver.findElement(searchField);
	}
	
	public WebElement getScopeRemover() {
		return driver.findElement(scopeRemover);
	}
	
	public String getCreatedOpportunityText() {
		
		return driver.findElement(createOpportunitytext).getText();
	}
	
}

