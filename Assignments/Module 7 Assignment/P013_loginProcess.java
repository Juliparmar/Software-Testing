package assignment;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P012_loginProcess {
	static WebDriver driver = null; 
	
	@BeforeClass
	public static void beforeclass() {
		String url ="https://www.instagram.com/accounts/login/?hl=en";
		driver = DriverConnection.getDriver(url);
	}
		@Test
		public void loginTest() throws InterruptedException {
			WebElement usernameEle = driver.findElement(By.name("username"));
			usernameEle.sendKeys("solankiJuli");
			WebElement passEle = driver.findElement(By.name("password"));
			passEle.sendKeys("solanki@123");
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
	        Thread.sleep(5000);
		}
				
		@AfterClass
		public static void closeBrowser() {
			driver.quit();
	}
}

