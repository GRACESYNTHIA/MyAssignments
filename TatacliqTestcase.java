package marathon2.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TatacliqTestcase {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Load leaftaps URL
		driver.get("https://www.tatacliq.com/");
		//Maximize the webpage
		driver.manage().window().maximize();
		//Initialize implicit wait	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("wzrk-cancel")).click();
		//Create Object for Actions Class
		Actions act=new Actions(driver);
		//Find the element brand
		  WebElement mouseHoverElement1 = driver.findElement(By.xpath("//div[text()='Brands']"));
		//Mouse hover on brands
		//Use Actions class method to perform the action
		act.moveToElement(mouseHoverElement1).perform();
		//Find the element brand
		  WebElement mouseHoverElement2 = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		//Mouse hover on brands
		//Use Actions class method to perform the action
		act.moveToElement(mouseHoverElement2).perform();
		//click casio in featured brands
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		//Select sortby: New Arrivals
		WebElement webelementdriver=driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select objsortBy=new Select(webelementdriver);
		objsortBy.selectByVisibleText("New Arrivals");
		//choose men from catagories filter
		driver.findElement(By.className("CheckBox__base")).click();
		//refresh
		driver.navigate().refresh();
		//get the price of all watches
		List<WebElement> pricedetails = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		for(int i=0;i<pricedetails.size();i++) {
		String price=pricedetails.get(i).getText();
		System.out.println(price);
		}
		//click on first resulting watch
		driver.findElement(By.className("ProductModule__dummyDiv")).click();
		//Handling windows
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		//convert set into list
		List<String> childWindow1 =new ArrayList<String>(allWindows);
		//switch from parent window to immediate child window
		driver.switchTo().window(childWindow1.get(1));	
		//click on add to bag
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		//get count from bag cart icon
		String text = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("The count is "+text);
		//compare the price
		//price on My Bag cart page
		String text2 = driver.findElement(By.xpath("//h3[text()='MRP:  ₹3995']")).getText();
		System.out.println("price on My Bag page:"+text2);
		//price of first resulting watch
		String pricedetail=driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']/h3")).getText();
		System.out.println("price of first watch on new arrivals:"+pricedetail);
		//click on bag cart icon
		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
		Thread.sleep(500);
		//Take Screenshot of the entire page - Add Source
		  File source = driver.getScreenshotAs(OutputType.FILE);
		//Add Destination
		  File destination =new File("./snaps/MyBagpage.png");
		//Combine source and destination
        FileUtils.copyFile(source, destination);
        //close child window
        driver.close();
        Thread.sleep(3000);
      //switch back to parent window
      driver.switchTo().window(childWindow1.get(0));
      //close parent window
      driver.close();
     
      
        
		
	}

}
