package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AJIOlistInterface {

	public static void main(String[] args) {
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--disable-notifications");
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		driver.get("https://www.ajio.com/");
		// Maximize the web page
		driver.manage().window().maximize();
		// Initialize implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// in search box type bags and click
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		// in gender click 'men'
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"))
				.click();
		// refresh
		driver.navigate().refresh();
		// in category click 'fashion bags'
		driver.findElement(By.xpath(
				"//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']"))
				.click();
		// refresh
		driver.navigate().refresh();
		// print the count of items
		String count = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		System.out.println("The count of items in the resulting page is " + count);
		// print the brands of the products
		System.out.println("The brands of the displayed products:");
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		for (int i = 0; i < brands.size(); i++) {
			String brandnames = brands.get(i).getText();
			System.out.println(brandnames);
		}
		// print the names of the diplayed bags
		System.out.println("The names of the bags displayed");
		List<WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (int j = 0; j < bags.size(); j++) {
			String bagnames = bags.get(j).getText();
			System.out.println(bagnames);
		}
	}

}
