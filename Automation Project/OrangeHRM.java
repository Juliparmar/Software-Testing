package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Driverconnection.Driverconnection;

public class OrangeHRM {
	static WebDriver driver = null;
	
	@BeforeClass
	    public static void login() {
		      String url = "https://www.orangehrm.com/";
		      driver = Driverconnection.getDriver(url);
	
	}	
	  @Test
	     public void Test1() {
		        WebElement email = driver.findElement(By.name("EmailHomePage"));
		        email.sendKeys("solankijuli@gmail.com");
		        WebElement btn1 = driver.findElement(By.name("action_request"));
		        btn1.click();
	   }
	@Test
	     public void test2() throws InterruptedException {
			
			WebElement username = driver.findElement(By.name("subdomain"));
			username.sendKeys("solankijuli");
			
			WebElement fullname = driver.findElement(By.name("Name"));
			fullname.sendKeys("solankijuli");
			
			WebElement email = driver.findElement(By.name("Email"));
			email.sendKeys("parmarjuligmail.com");
		
			WebElement phoneNumber = driver.findElement(By.name("Contact"));
			phoneNumber.sendKeys("7016113677");
			
			WebElement country = driver.findElement(By.id("Form_getForm_Country"));
			country.sendKeys("India");
			
			WebElement Demo = driver.findElement(By.name("action_submitForm"));
			Demo.click();
			Thread.sleep(3000);

		}
	 @Test
	      public void test3() throws InterruptedException {
		   
		        WebElement ESbtn = driver.findElement(By.name("locale"));
		        ESbtn.click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("/html/body/nav/div/div[1]/select/option[2]")).click();
		        Thread.sleep(2000);

		        WebElement username = driver.findElement(By.name("subdomain"));
			username.sendKeys("solankijuli");
			Thread.sleep(2000);
		
			WebElement fullname = driver.findElement(By.name("Name"));
			fullname.sendKeys("solankijuli");
			Thread.sleep(2000);
			
			WebElement email = driver.findElement(By.name("Email"));
			email.sendKeys("parmarjuligmail.com");
			Thread.sleep(2000);
	
			WebElement phoneNumber = driver.findElement(By.name("Contact"));
			phoneNumber.sendKeys("7016113677");
			Thread.sleep(2000);

			WebElement country = driver.findElement(By.id("Form_getForm_Country"));
			country.sendKeys("India");
			
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,650)","");
			System.out.println("scrollle");
			WebElement btn = driver.findElement(By.className("btn-toolbar"));
			btn.click();
	 }
	
	 }
	 
		
	
	


