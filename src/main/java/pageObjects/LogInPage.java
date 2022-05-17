package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.BaseClass;

public class LogInPage extends BaseClass {
	
	public WebDriver driver;
	
	By email = By.id("username");
	By password = By.id("password");
	By loginBtnPath = By.xpath("//input[@class='button r4 wide primary']");
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPasword() {
		return driver.findElement(password);
	}
	
	public WebElement clickLoginButton() {
		return driver.findElement(loginBtnPath);
	}
}
