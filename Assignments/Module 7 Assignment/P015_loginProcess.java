package Assignment;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Driverconnection.Driverconnection;

public class P015_loginProcess {
	
	static WebDriver driver = null;	
	@BeforeClass
	public static void login() {
		String url="https://www.facebook.com/";	
		 driver=Driverconnection.getDriver(url);
	}
	@Test
	public void test1() {
		
	WebElement t1=driver.findElement(By.name("email"));
	t1.sendKeys("juli@gmail.com");
	WebElement t2=driver.findElement(By.name("pass"));
	t2.sendKeys("juli@123");
		
	}
	@After
	public static void closeBrowser() {
		driver.quit();
	}
}



