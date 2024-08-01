package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.Driverconnection;

public class P005_RadioButton {
	public static void main(String[] args) throws InterruptedException {
	 String url = "https://demo.guru99.com/test/radio.html";
	 WebDriver driver = Driverconnection.getDriver(url);
	 
	
	 WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
	 radio1.click();
	 
	 Thread.sleep(2000);
	 
	 WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
	 radio2.click();
	 
	 Thread.sleep(2000);
	 
	 WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
	 radio3.click();
	 
	 
	 
	}

}
