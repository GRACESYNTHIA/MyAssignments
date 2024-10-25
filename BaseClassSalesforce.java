package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClassSalesforce {
	
	public ChromeDriver driver;
	@Parameters({"URL","username","password"})
	@BeforeMethod
	public void PreCondition(String URL, String username, String password) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(URL);
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        WebElement element1 = driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a"));
        driver.executeScript("arguments[0].click();",element1);
        WebElement accountsTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
        driver.executeScript("arguments[0].click();",accountsTab);
	}

}
