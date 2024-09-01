package Assesment;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import connection.DriverConnection;


public class P004_gurutest {
	

	public class gurutest {
		
		WebDriver driver=null;
		
		String url="https://demo.guru99.com/";
		
		@Test
		public void titaleTest() {
			driver=DriverConnection.getDriver(url);
			String actualTitle=driver.getTitle();
			
			System.out.println(actualTitle);
			String expectedTitle="selenium";
//			assertEquals(actualTitle, expectedTitle);
			
		}
		@Test
		public void loginTest(ITestContext con) {
			driver=DriverConnection.getDriver(url);
			con.setAttribute("selenium", driver);
			WebElement  ename=driver.findElement(By.name("emailid"));
			ename.sendKeys("juli@gmail.com");
			assertFalse(true);
		}

	}


}
