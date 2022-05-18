package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import resources.BaseClass;

public class EditOpportunity extends BaseClass{
	
	By selectMenu = By.xpath("//div[@class='slds-icon-waffle']"); 
	By selectSalesOption = By.xpath("//p[text()='Sales']");
	By searchField = By.xpath("//input[@class='slds-input']");
	By scopeRemover = By.xpath("//div[@class='slds-grid ']");
	By clickDropdown = By.xpath("//table/tbody/tr/td[8]/span/div/a/span/span");
	By clcikEditOption = By.xpath("(//div[@class='forceActionLink']/parent::a)[1]");
	
	public EditOpportunity(WebDriver driver) {
		this.driver = driver;
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
	
	public WebElement getDropdownButton() {
		return driver.findElement(clickDropdown);
	}
	
	public WebElement getEditButton() {
		return driver.findElement(clcikEditOption);
	}
}
