package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.Driverconnection;

public class P003DeleteButton {
	public static void main(String[] args) throws InterruptedException   {
		String url = " https://demoqa.com/webtables";
		WebDriver driver = Driverconnection.getDriver(url);
		
		WebElement btn = driver.findElement(By.id("delete-record-1"));
		btn.click();
		
		Thread.sleep(2000);
		
		WebElement btn2 = driver.findElement(By.id("delete-record-2"));
		btn2.click();
		
		Thread.sleep(2000);
		
		WebElement btn3 = driver.findElement(By.id("delete-record-3"));
		btn3.click();
		
	}

}
