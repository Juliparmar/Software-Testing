package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Driverconnection.Driverconnection;

public class P016_MultipleParameter {
	@Parameters({"email","password"})
	@Test
	public void login(String email,String password) throws InterruptedException {
		String url = "https://www.Instagram.com";
		WebDriver driver = Driverconnection.getDriver(url);
		Thread.sleep(3000);
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.clear();
		emailEle.sendKeys("juli@gmail.com");
		
		WebElement passEle =driver.findElement(By.name("pass"));
		passEle.clear();
		passEle.sendKeys("juli@123");
		

}
}