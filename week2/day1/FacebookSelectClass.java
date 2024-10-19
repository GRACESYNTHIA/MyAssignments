package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectClass {

	public static void main(String[] args) {
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Load facebook URL
		driver.get("https://en-gb.facebook.com/");
		//Maximize the webpage
		driver.manage().window().maximize();
		//Initialize implicit wait		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on create new button
		driver.findElement(By.linkText("Create new account")).click();
		//Enter the Firstname
		driver.findElement(By.name("firstname")).sendKeys("Test");
		//Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("Leafbird");
		//Select date dropdown in DOB
		WebElement webelementdriver=driver.findElement(By.name("birthday_day"));
		Select objForDate=new Select(webelementdriver);
		objForDate.selectByValue("5");
		//Select Month dropdown in DOB
		WebElement webelementdriver1=driver.findElement(By.name("birthday_month"));
		Select objForMonth=new Select(webelementdriver1);
		objForMonth.selectByVisibleText("May");
		//Select Year dropdown in DOB
		WebElement webelementdriver2=driver.findElement(By.name("birthday_year"));
		Select objForYear=new Select(webelementdriver2);
		objForYear.selectByVisibleText("2000");
		//select radiobuttons for gender-female
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
		//enter mobile number or email id
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		//enter new password
		driver.findElement(By.name("reg_passwd__")).sendKeys("evergreen");
		//click sign up button
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
			
	}

}
