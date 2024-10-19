package week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		 //Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		// Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Maximize the web page
		driver.manage().window().maximize();
		// Initialize implicit wait		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter the user name
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Switch to alert
		//Alert alert = driver.switchTo().alert();
		//accept alert
		//alert.accept();
		//click on the CRM/SFA link
		driver.findElement(By.partialLinkText("RM/SF")).click();
		//click on the accounts tab
		driver.findElement(By.linkText("Contacts")).click();
		//click on merge contacts tab
		driver.findElement(By.linkText("Merge Contacts")).click();
		//click on widget of the "From Contact"
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdFrom']/following-sibling::a")).click();
	    //Handling windows
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		//convert set into list
		List<String> childWindow1 =new ArrayList<String>(allWindows);
		//switch from parent window to immediate child window
		driver.switchTo().window(childWindow1.get(1));	
		//click on first resulting contact
		driver.findElement(By.linkText("dp1a1contact1")).click();
		//switch back to parent window
		driver.switchTo().window(childWindow1.get(0));
		//click on widget of the "To Contact"
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdTo']/following-sibling::a")).click();
		//convert set into list
		Set<String> allWindows1 = driver.getWindowHandles();
		System.out.println(allWindows1);
		List<String> childWindow2 =new ArrayList<String>(allWindows1);
		//switch from parent window to immediate child window
		driver.switchTo().window(childWindow2.get(1));	
		//click on first resulting contact
		driver.findElement(By.linkText("dp1a1contact2")).click();
		//switch back to parent window
		driver.switchTo().window(childWindow2.get(0));
		//click on merge button
		driver.findElement(By.linkText("Merge")).click();
		//switch to alert
		Alert alert = driver.switchTo().alert();
		//accept alert
		alert.accept();
		//get title
		//print title of page
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
	}

}
