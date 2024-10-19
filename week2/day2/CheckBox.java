package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		        //Initialize ChromeDriver
				ChromeDriver driver=new ChromeDriver();
				// Load URL
				driver.get("https://leafground.com/checkbox.xhtml");
				// Maximize the webpage
				driver.manage().window().maximize();
				// Initialize implicit wait		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				// Click on the "Basic Checkbox"
				driver.findElement(By.xpath("//span[text()='Basic']")).click();
				// Click on the "Notification Checkbox" 
				driver.findElement(By.xpath("//span[text()='Ajax']")).click();	
				//Click on your favorite language
				driver.findElement(By.xpath("//label[text()='Java']")).click();
				// Click on the "Tri-State Checkbox.
				driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[3]")).click();
				//Click on the "Toggle Switch
				driver.findElement(By.className("ui-toggleswitch-slider")).click();
				//verify if checkbox is disabled
				//WebElement element=driver.findElement(By.xpath("//span[text()='Disabled']/preceding-sibling::div[2]"));
				//select multiple check boxes
				//driver.findElement(By.xpath("//li[@data-item-value='Miami']/div")).click();
				
				

	}

}
