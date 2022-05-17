package testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CreateNewOpportunity;
import pageObjects.LogInPage;
import resources.BaseClass;

public class TestCasesForNewOpportunity extends BaseClass{
	
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void testCases() throws InterruptedException {
		
		LogInPage loginPage = new LogInPage(driver);
		loginPage.getEmail().sendKeys("hari.radhakrishnan@qeagle.com");
		loginPage.getPasword().sendKeys("Tuna@123");
		loginPage.clickLoginButton().click();
		
//		Positive Scenario
		CreateNewOpportunity cno = new CreateNewOpportunity(driver);
		cno.getClickGlobalActionsBtn().click();
		cno.getSelectNewOpportunity().click();
		cno.getOpportunityName().sendKeys("New Oppo");
		cno.getDatePicker().click();
		cno.getDateFromCalender().click();
		cno.getStage().click();
		cno.getStageDropdownOptions().click();
		cno.getSaveButton().click();
		cno.getCrossButton().click();
		
//		Negative Scenario
		CreateNewOpportunity cno1 = new CreateNewOpportunity(driver);
		cno1.getClickGlobalActionsBtn().click();
		cno1.getSelectNewOpportunity().click();
		cno1.getOpportunityName().sendKeys("New Oppo1");
		cno1.getDatePicker().click();
		cno1.getDateFromCalender().click();
//		cno1.getStage().click();
//		cno1.getStageDropdownOptions().click();
		cno1.getSaveButton().click();
		Assert.assertEquals(driver.findElement(By.xpath("//ul[@class='errorsList']/li")).getText(), "These required fields must be completed: Stage");
		Thread.sleep(2000);
		cno1.getCrossButton().click();
		
	
	}

}
