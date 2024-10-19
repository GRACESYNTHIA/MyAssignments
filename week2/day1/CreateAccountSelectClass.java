package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectClass {

	public static void main(String[] args) throws InterruptedException {
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
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
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on the CRM/SFA link
		driver.findElement(By.partialLinkText("RM/SF")).click();
		//Click on create accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		//click on the create button
		driver.findElement(By.partialLinkText("Create")).click();
		//Enter the account name
		driver.findElement(By.id("accountName")).sendKeys("AlvinXavier");
		//enter description as Selenium automation tester
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Select computer software on industry
	   WebElement dd= driver.findElement(By.name("industryEnumId"));
	   Select obj=new Select(dd);
	   obj.selectByVisibleText("Computer Software");
	   //Select "S-Corporation" as ownership using SelectByVisibleText.
	   WebElement dd1= driver.findElement(By.name("ownershipEnumId"));
	   Select obj1=new Select(dd1);
	   obj1.selectByVisibleText("S-Corporation");
	   //Select "Employee" as the source using SelectByValue.
	   WebElement dd2= driver.findElement(By.name("dataSourceId"));
	   Select obj2=new Select(dd2);
	   obj2.selectByValue("LEAD_EMPLOYEE");
	   //Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
	   WebElement dd3= driver.findElement(By.name("marketingCampaignId"));
	   Select obj3=new Select(dd3);
	   obj3.selectByIndex(6);
	   // Select "Texas" as the state/province using SelectByValue.
	   WebElement dd4= driver.findElement(By.name("generalStateProvinceGeoId"));
	   Select obj4=new Select(dd4);
	   obj4.selectByValue("TX");
	   //Click the "Create Account" button. 
	   driver.findElement(By.className("smallSubmit")).click();
	   //Verify the account name
	   String accountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
	   System.out.println(accountName);
	   if(accountName.contains("AlvinXavier")) {
		   System.out.println("Account name is verified");
	   }
	   else {
		   System.out.println("Account name is not verified");
	   }
	   Thread.sleep(5000);
	   //Close the browser window.
		driver.close();
	   
	   
	   
	   
	   
		
		
		

	}

}
