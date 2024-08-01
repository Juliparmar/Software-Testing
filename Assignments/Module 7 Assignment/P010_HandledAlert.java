package Assignment;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.Driverconnection;

public class P010_HandledAlert {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/test/delete_customer.php";
		WebDriver driver = Driverconnection.getDriver(url);
		
		WebElement btn = driver.findElement(By.name("cusid"));
		btn .click();
		btn.sendKeys("1234");
		
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
		alert.accept();
			}
			
			
			
		
		
		
		
	}


