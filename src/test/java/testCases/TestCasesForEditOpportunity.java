package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.EditOpportunity;
import pageObjects.LogInPage;
import resources.BaseClass;

public class TestCasesForEditOpportunity extends BaseClass{

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
		
		EditOpportunity eo = new EditOpportunity(driver);
		eo.getMenuButton().click();
		eo.getMenuOptions().click();
		eo.getOpportunityButton();
		eo.getSearchField().sendKeys("New2");
		Thread.sleep(5000);
		eo.getScopeRemover().click();
		Thread.sleep(5000);
		eo.getDropdownButton().click();
		Thread.sleep(3000);
		eo.getEditButton().click(); 
	}
}
