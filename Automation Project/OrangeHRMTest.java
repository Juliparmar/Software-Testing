package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Driverconnection.Driverconnection;

public class OrangeHRMTest {
static WebDriver driver = null;
	
	@BeforeClass
	  public static void login() {
		     String url = "https://www.orangehrm.com/";
		     driver = Driverconnection.getDriver(url);
	
	}	

	  @Test(priority = 2)
	  public void test4() throws InterruptedException {
		    WebElement Solutions =driver.findElement(By.linkText("Solutions"));
                    Actions action = new Actions(driver);
		    action.moveToElement(Solutions).build().perform();
		    Thread.sleep(2000);
		    
		  
		    WebElement PeopleManagement = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/div/div/div/div/ul/li[1]"));
		    Thread.sleep(2000);

		    action.moveToElement(PeopleManagement).build().perform();
		    Thread.sleep(2000);
		    
		    
	            WebElement WhyOrangeHRM = driver.findElement(By.linkText("Why OrangeHRM"));
		    action.moveToElement(WhyOrangeHRM).build().perform();
		    Thread.sleep(2000);
		    
		    WebElement OurCustomers =driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/div/div/div/div/ul/li[1]"));
		    action.moveToElement(OurCustomers).build().perform();
		    Thread.sleep(2000);
		  
		    WebElement Resources = driver.findElement(By.linkText("Resources"));
		    action.moveToElement(Resources).build().perform();
		    Thread.sleep(2000);
		    
		    WebElement ebooks = driver.findElement(By.linkText("eBooks"));
		    action.moveToElement(ebooks).build().perform();
		    Thread.sleep(2000);
		    
		    WebElement Company = driver.findElement(By.linkText("Company"));
		    action.moveToElement(Company).build().perform();
		    Thread.sleep(2000);
		    
		    WebElement AboutUs = driver.findElement(By.linkText("About Us"));
		    action.moveToElement(AboutUs).build().perform();
		    Thread.sleep(2000);
		    
		    WebElement Pricing =driver.findElement(By.linkText("Pricing"));
		    Pricing.click();
		    Thread.sleep(2000);
		    
		    WebElement fullname = driver.findElement(By.name("FullName"));
		    fullname.sendKeys("juli");
		    Thread.sleep(2000);
		    
		    WebElement Email = driver.findElement(By.name("Email"));
		    Email.sendKeys("solankijuli@gmail.com");
		    Thread.sleep(2000);
		    
		    WebElement Companyname = driver.findElement(By.name("CompanyName"));
		    Companyname.sendKeys("jjparmar");
		    Thread.sleep(2000);
		    
		    WebElement phn = driver.findElement(By.name("Contact"));
		    phn.sendKeys("9429543358");
		    Thread.sleep(2000);
		    
		    WebElement NumOfEmployee =driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		    NumOfEmployee.sendKeys("100-150");
		    Thread.sleep(2000);
		    
		    WebElement Country = driver.findElement(By.id("Form_getForm_Country"));
		    Country.sendKeys("India");
		    Thread.sleep(2000);
		    
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,350)","");
		    WebElement submit = driver.findElement(By.id("Form_getForm_action_submitForm"));
		    submit.click();
		    Thread.sleep(2000);
		  
		    
		    
	  }
	  @Test
             public void test5() throws InterruptedException {
	            WebElement btn = driver.findElement(By.linkText("Book a Free Demo"));
	            btn.click();
	            Thread.sleep(2000);
	        
	            WebElement btn2 = driver.findElement(By.linkText("Contact Sales"));
	            btn2.click();
	            Thread.sleep(2000);
	        
   }
	  
}	    
		    
	  

		    
