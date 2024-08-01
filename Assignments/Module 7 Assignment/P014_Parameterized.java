package assignment;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;
@RunWith(Parameterized.class)
public class P013_Parameterized {
	String email;
	String password;
	
	public P013_Parameterized(String email,String password) {
		this.email = email;
		this.password = password;
		
	}
	
	static WebDriver driver = null ;
	@Before
	public void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}
	@Test
	public void loginTest() throws InterruptedException {
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.clear();
		passEle.sendKeys(password);
		Thread.sleep(2000);
	}
	@Parameters
	public static List<Object[]>data(){
		Object[][] obj = new Object[4][2];
		
		obj[0][0] ="juli@gmail.com";
		obj[0][1] ="juli";
		
		obj[1][0] = "juli@gmail.com";
		obj[1][1] = "solanki";
		
		obj[2][0] = "solanki@gmail.com";
		obj[2][1] = "juli";
		
		obj[3][0] = "solanki@gmail.com";
		obj[3][1] = "solanki";
		
		return Arrays.asList(obj);
	}
	
}
