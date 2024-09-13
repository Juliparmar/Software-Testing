package assignment;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Connection.DriverConnection;


public class P002_webbrowser3 {
	

	public class WebBrowser3 {
		 static WebDriver driver = null;
		 @BeforeClass
		 public static void OpenBrowser() {
		 String url = "https://www.instagram.com/";
		 driver = DriverConnection.getDriver(url);
		 }
		
		@Test
		public void loginTest(ITestContext con) throws InterruptedException {
			WebElement Username = driver.findElement(By.name("username"));
			Username.sendKeys("solanki juli");
			WebElement Password = driver.findElement(By.name("password"));
			Password.sendKeys("juli1234");
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
			Thread.sleep(2000);
		}

	}



}
