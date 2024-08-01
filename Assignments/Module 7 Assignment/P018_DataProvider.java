package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Driverconnection.Driverconnection;

public class P018_DataProvider {

	
	static WebDriver driver = null;
	   @BeforeClass
		public static void openBrowser() {
			driver = Driverconnection.getDriver("https://www.instagram.com/");
		}
		@Parameters("dp")
		@Test(dataProvider = "dp")
		public void test (String email,String password) {
			
			WebElement emailEle = driver.findElement(By.name("email"));
			emailEle.clear();
			emailEle.sendKeys(email);
			WebElement passEle = driver.findElement(By.name("pass"));
			passEle.clear();
			passEle.sendKeys(password);
			
		}
		@DataProvider(name="dp")
		 public static Object[][]data(){
		 
			 
			 Object[][] obj = new Object[4][2];
			 obj[0][0] = "juli@gmail";
			 obj[0][1] = "juli";
			 
			 obj[1][0] = "juli@gmail";
			 obj[1][1] = "solanki";
			 
			 obj[2][0] = "solanki@gmail";
			 obj[2][2] = "juli";
			 
			 obj[3][0] = "solanki@gmail";
			 obj[3][3] = "solanki";
			 
	       return obj;
	}
	}



