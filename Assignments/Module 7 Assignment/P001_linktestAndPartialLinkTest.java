package Assignment;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverConnection.Driverconnection;

public class P001_linktestAndPartialLinkTest {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = Driverconnection.getDriver(url);

		driver.findElement(By.linkText("Create new account")).click();

		Thread.sleep(2000);

		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("juli");
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("solanki");
		
		WebElement MO =  driver.findElement(By.name("reg_email__"));
		MO.sendKeys("98765321");
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("selenium@123");

	    WebElement days = driver.findElement(By.id("day"));
	    Select day = new Select(days);
	    day.selectByIndex(0);
	    
	    WebElement months = driver.findElement(By.id("month"));
	    Select month = new Select(months);
	    month.selectByValue("6");
	    
	    WebElement years = driver.findElement(By.id("year"));
	    Select year = new Select(years);
	    year.selectByVisibleText("2000");
	
	    List<WebElement> gender = driver.findElements(By.name("sex"));
	    gender.get(1).click();
	    
	    
	

}
}

