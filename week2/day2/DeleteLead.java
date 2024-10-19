package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		// Load URL
		driver.get("http://leaftaps.com/opentaps/");
		// Maximize the webpage
		driver.manage().window().maximize();
		// Initialize implicit wait		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter the username
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on the CRM/SFA link
		driver.findElement(By.partialLinkText("RM/SF")).click();
		//click on leads link
		driver.findElement(By.linkText("Leads")).click();
		//click on find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//click on phone tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter the phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
		//click on find leads tab
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//capture id of first resulting lead
		WebElement captureid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String leadID=captureid.getText();
		System.out.println("the captured first id is"+ leadID);
		//click on first resulting lead
		captureid.click();
		//click on delete button
		driver.findElement(By.linkText("Delete")).click();
		//click on find leads tab again
		driver.findElement(By.linkText("Find Leads")).click();
		//enter captured lead id
		driver.findElement(By.name("id")).sendKeys(leadID);
		//click on find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Deletion is successful");
		} else {
			System.out.println("Deletion is not successful");
		}
		Thread.sleep(3000);
		driver.close();
		}

}
