package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("RM/SF")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("test");
		driver.findElement(By.name("departmentName")).sendKeys("testing");
		driver.findElement(By.name("description")).sendKeys("lead automation tester");
		driver.findElement(By.name("primaryEmail")).sendKeys("testlesf@gmail.com");
		  WebElement selectprovincedd= driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select selectprovince=new Select(selectprovincedd);
		 selectprovince.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.name("description")).clear();
		 driver.findElement(By.name("importantNote")).sendKeys("must be efficient and hard working");
		 driver.findElement(By.name("submitButton")).click();
		 Thread.sleep(3000);
		 String title=driver.getTitle();
		 System.out.println(title);
		 if(title.contains("View Lead")) {
			 System.out.println("Title is verified");
		 }
		 else {
			 System.out.println("Title is not verified");
		 }
		 Thread.sleep(3000);
		 driver.close();
	}
}

		
		
		
		
		


