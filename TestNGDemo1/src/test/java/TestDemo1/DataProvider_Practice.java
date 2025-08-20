package TestDemo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Practice {
	WebDriver driver;
	WebDriverWait wait;
	@Test 
	public void ALaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void BOpenWebsite() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(dataProvider = "LoginData")
	public void login(String userName,String Password) throws InterruptedException {
	wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Username']")))
	      .sendKeys(userName);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
	}
	
	@DataProvider(name = "LoginData")
	public Object[][] LoginInData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] ="admin123";
		data[0][0] = "Admin";
		data[0][0] = "Admin";
		return data;
	}
	

}
