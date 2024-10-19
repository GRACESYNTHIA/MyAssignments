package week4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndAlerts {

	public static void main(String[] args) throws InterruptedException {
		 //Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		// Load URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		// Maximize the web page
		driver.manage().window().maximize();
		// Initialize implicit wait		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Switch to frame
		driver.switchTo().frame(1);
		//now click Try It
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		//switch to alert
		Alert alert = driver.switchTo().alert();
		//read text alert box
		String text = alert.getText();
		System.out.println(text);	
		//Enter text and accept alert
		alert.sendKeys("Synthia");
		alert.accept();
		Thread.sleep(500);
		//print the text appeared after accepting alert
		WebElement element1=driver.findElement(By.xpath("//p[@id='demo']"));
		String text1 = element1.getText();
		System.out.println(text1);

		
		
		

	}

}
