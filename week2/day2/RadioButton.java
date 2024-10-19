package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		// Load URL
		driver.get("https://www.leafground.com/radio.xhtml");
		// Maximize the webpage
		driver.manage().window().maximize();
		// Initialize implicit wait		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Select 'Your most favorite browser' from the radio buttons
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		//select anyone radio button from Unselectble
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		//again click on selected radio button
		WebElement radiobutton = driver.findElement(By.xpath("//label[text()='Chennai']"));
		radiobutton.click();
		//verify that it is unselected
		System.out.println(radiobutton.isSelected());
		if(radiobutton.isSelected()) {
			System.out.println("radio button is selected");
		}
		else {
			System.out.println("radio button is not selected");
		}
		//verify that radio button is selected by default
		WebElement defaultradiobutton = driver.findElement(By.xpath("//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active']"));
				System.out.println(defaultradiobutton.isEnabled());
		if(defaultradiobutton.isEnabled()) {
			System.out.println("radio button is selected by default");
		}
		else {
			System.out.println("radio button is not selected by default");
		}
		//verify the select age radio button is already selected else need to select 21-40yrs
		WebElement ageradiobutton = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active'])[5]"));
		if(ageradiobutton.isEnabled()) {
			System.out.println("radiobutton is already selected");
		}
		else{
			ageradiobutton.click();
			}
		
	}

}
