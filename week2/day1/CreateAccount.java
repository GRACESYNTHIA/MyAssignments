package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load leaftaps URL
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the webpage
		driver.manage().window().maximize();
		//Initialize implicit wait	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter the user name
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the "Login" button. 
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the "CRM/SFA" link.
		driver.findElement(By.partialLinkText("RM/SF")).click();
		//Click on the "Leads" tab. 
		driver.findElement(By.linkText("Leads")).click();
		//Click on the "Create Lead" button
		driver.findElement(By.partialLinkText("Create")).click();
		//Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Workforce");
		//Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Grace");
		//Enter a LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Synthia");
		//Enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("ProjectLead");
		//Enter Phone no
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		//Click the "Create Lead" button
		driver.findElement(By.name("submitButton")).click();
		//print title of page
		String title=driver.getTitle();
		System.out.println(title);
		//verify title entered is displayed correctly
		String leadTitle = driver.findElement(By.xpath("//span[text()='ProjectLead']")).getText();
		System.out.println(leadTitle);
		if(leadTitle.contains("ProjectLead")) {
			System.out.println("Lead title is displayed correctly");
		}
		else {
			System.out.println("Lead title is not displayed correctly");
		}
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
