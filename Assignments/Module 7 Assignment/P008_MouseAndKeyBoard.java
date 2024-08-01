package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverConnection.Driverconnection;

public class P008_MouseAndKeyBoard {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.ajio.com";
		
		WebDriver driver = Driverconnection.getDriver(url);
		
		WebElement MEN  = driver.findElement(By.linkText("MEN"));
		WebElement WOMEN= driver.findElement(By.linkText("WOMEN"));
		WebElement KIDS = driver.findElement(By.linkText("KIDS"));
		WebElement BEAUTY = driver.findElement(By.linkText("BEAUTY"));
		
		Actions action = new Actions(driver);
		action.moveToElement(MEN).build().perform();
		Thread.sleep(2000);
		action.moveToElement(WOMEN).build().perform();
		Thread.sleep(2000);
		action.moveToElement(KIDS).build().perform();
		Thread.sleep(2000);
		action.moveToElement(BEAUTY).build().perform();
		
		
		
		
		
	}

}
