package TestDemo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Parameter {
	WebDriver driver;
	WebDriverWait wait;
	
	public void launchBrowser(String browserName, String url) {
		switch(browserName) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "FireFox":
			driver = new FirefoxDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid Browser");
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public void Login() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']"))).click();
		driver.findElement(By.xpath("//div[@class='inputs']//input[@name='Email']")).sendKeys("wassup@gmail.com");
		driver.findElement(By.xpath("//div[@class='inputs']//input[@name='Password']")).sendKeys("wassup123");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Log in']"))).click();
	}
    public void CloseBrowser() {
    	if(driver!= null)
    		driver.quit();
    }

}
