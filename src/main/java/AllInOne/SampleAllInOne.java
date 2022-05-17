package AllInOne;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleAllInOne {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Tuna@123");
		driver.findElement(By.id("Login")).click();
		
		
//		New Lead
		
		try {
			TimeUnit.SECONDS.sleep(30);
			
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		driver.findElement(By.xpath("//div//lightning-primitive-icon/*[@class='slds-icon slds-icon_x-small']")).click();
		driver.findElement(By.xpath("(//span[@class='actionLabel'])[7]")).click();
		WebElement none = driver.findElement(By.xpath("//a[text()='--None--']"));
		none.click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Mr.']")).click();
		Thread.sleep(5000);

		driver.findElement(By.className(" input"));
		
	}

}
