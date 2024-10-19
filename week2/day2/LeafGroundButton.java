package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		   //Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		// Load URL
		driver.get("https://leafground.com/button.xhtml");
		// Maximize the webpage
		driver.manage().window().maximize();
		// Initialize implicit wait		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//get title
		String title=driver.getTitle();
		System.out.println(title);
		//verify the title
		  if(title.contains("Dashboard")) {
			  System.out.println("Title is verified");
		  }
		  else {
			  System.out.println("Title is not verified");
		  }
		  //navigate back
		  driver.navigate().back();
		  
		  //Check if the button with the text ‘Confirm if the button is disabled’ is disabled.  
		  WebElement checkbutton=driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following-sibling::button"));
		  boolean enabled=checkbutton.isEnabled();
		  if(enabled==true) {
			  System.out.println("confirm button is enabled");
		  }
		  else {
			  System.out.println("confirm button is disabled");
		  }
		//Find and print the position of the button with the text ‘Submit.’ 
		  WebElement submitButton=driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		  Point PositionOfButton = submitButton.getLocation();
		  System.out.println("Position is "+PositionOfButton);
		  String text = submitButton.getText();
		  System.out.println(text);
		  submitButton.click();
		  //Find and print the background color of the button with the text ‘Find the Save button color.’
		  WebElement buttonColor=driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-save']//parent::button"));
		  String color=buttonColor.getCssValue("background-color");
		  System.out.println(color);
		  //Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		  WebElement size=driver.findElement(By.xpath("(//span[text()='Submit'])[2]//parent::button"));
		  int height=size.getSize().getHeight();
		  System.out.println("Height of the button:" + height);
		  int width=size.getSize().getWidth();
		  System.out.println("Width of the button:" +width);
		  //close the browser
		  driver.close();
		  
		  
		  
		  
		  
	}

}
