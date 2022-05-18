package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.DeleteOpportunity;
import pageObjects.LogInPage;
import resources.BaseClass;

public class TestCasesForDeleteOpportunity extends BaseClass{
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void testCases() throws InterruptedException {
		
		LogInPage lip = new LogInPage(driver);
		lip.getEmail().sendKeys("hari.radhakrishnan@qeagle.com");
		lip.getPasword().sendKeys("Tuna@123");
		lip.clickLoginButton().click();
		
		DeleteOpportunity dO = new DeleteOpportunity(driver);
		dO.getMenuButton().click();
		dO.getMenuOptions().click();
		dO.getOpportunityButton();
		dO.getSearchField().sendKeys("New2");
		Thread.sleep(5000);
		dO.getScopeRemover().click();
		Thread.sleep(5000);
		dO.getDropdownButton().click();
		Thread.sleep(3000);
		dO.getDeleteButton().click(); 
		
	}
}
