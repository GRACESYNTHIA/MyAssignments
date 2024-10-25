package marathon3.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class DeleteAccount {

	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        ChromeDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get("https://login.salesforce.com/");
	        driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
	        driver.findElement(By.id("password")).sendKeys("Leaf@123");
	        driver.findElement(By.id("Login")).click();
	        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	        driver.findElement(By.xpath("//button[text()='View All']")).click();
	        WebElement element1 = driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a"));
	        driver.executeScript("arguments[0].click();",element1);
	        WebElement accountsTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
	        driver.executeScript("arguments[0].click()",accountsTab);
	        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search this list...']"));
	        element.sendKeys("Gokul");
	        element.sendKeys(Keys.ENTER);
	        Thread.sleep(2000);
	        String noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
	        String[] s = noOfItems.split(" ");
	        int countBeforeDelete = Integer.parseInt(s[0]);
	        driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).click();
	        driver.findElement(By.xpath("(//li[@role='presentation']//a)[2]")).click();
	        driver.findElement(By.xpath("//button[@title='Delete']")).click();
	        Thread.sleep(2000);
	        noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
	        s = noOfItems.split(" ");
	        int countAfterDelete = Integer.parseInt(s[0]);

	        Assert.assertTrue(countBeforeDelete==(countAfterDelete+1),"Verify the account has deleted");


	}

}
