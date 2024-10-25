package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteAccountSalesforce extends BaseClassSalesforce {
	
	@Test
	public void runDeleteAccountSalesforce() throws InterruptedException {
		 
	        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Search this list...']"));
	        element.sendKeys("Gokul");
	        element.sendKeys(Keys.ENTER);
	        Thread.sleep(2000);
	        String noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
	        String[] s = noOfItems.split(" ");
	        int countBeforeDelete = Integer.parseInt(s[0]);
	        driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).click();
	        driver.findElement(By.xpath("(//li[@role='presentation']//a)[2]")).click();
	        driver.findElement(By.xpath("//button[@title='Delete']")).click();
	        Thread.sleep(2000);
	        noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
	        s = noOfItems.split(" ");
	        int countAfterDelete = Integer.parseInt(s[0]);

	        Assert.assertTrue(countBeforeDelete==(countAfterDelete+1),"Verify the account has deleted");

	}

}
