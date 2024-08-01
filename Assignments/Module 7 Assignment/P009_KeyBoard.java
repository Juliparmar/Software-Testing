package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverConnection.Driverconnection;

public class P009_KeyBoard {
  public static void main(String[] args) {
	String url ="https://demo.guru99.com/test/newtours/register.php";
	WebDriver driver = Driverconnection.getDriver(url);
	
	
	 driver.findElement(By.name("firstName")).click();
	
	
	Actions action = new Actions(driver);
	action.keyDown(Keys.SHIFT)
	      .sendKeys("solanki ")
	      .keyUp(Keys.SHIFT)
	      .build()
	      .perform();
	
	driver .findElement(By.name("lastName")).click();
	action.keyDown(Keys.SHIFT)
	      .sendKeys("juli")
	      .keyUp(Keys.SHIFT)
	      .build()
	      .perform();
	
	WebElement phone =driver.findElement(By.name("phone"));
	phone.click();
	phone.sendKeys("9429547357");
	
	driver.findElement(By.id("userName")).click();
	action.keyDown(Keys.SHIFT)
	      .sendKeys("solankijuli@gmail")
	      .keyUp(Keys.SHIFT)
	      .sendKeys(".")
	      .keyDown(Keys.SHIFT)
	      .sendKeys("com")
	      .keyUp(Keys.SHIFT)
	      .build()
	      .perform();
	     
	driver.findElement(By.name("address1")).click();
	action.keyDown(Keys.SHIFT)
	      .sendKeys("Maninagar")
	      .keyUp(Keys.SHIFT)
	      .build()
	      .perform();
	
	driver.findElement(By.name("city")).click();
	action.keyDown(Keys.SHIFT)
	      .sendKeys("Ahemdabad")
	      .keyUp(Keys.SHIFT)
	      .build()
	      .perform();
	
	
	driver.findElement(By.name("state")).click();
	action.keyDown(Keys.SHIFT)
	      .sendKeys("gujarat")
	      .keyUp(Keys.SHIFT)
	      .build()
	      .perform();
	
	WebElement code= driver.findElement(By.name("postalCode"));
	code.sendKeys("361160");
	
    WebElement country =driver.findElement(By.name("country"));
	country.click();
	country.sendKeys("india");
	country.click();
	
	driver.findElement(By.id("email")).click();
	action.keyDown(Keys.SHIFT)
	      .sendKeys("solanki juli")
	      .keyUp(Keys.SHIFT)
	      .build()
	      .perform();
	
	driver.findElement(By.name("password")).click();
	action.keyDown(Keys.SHIFT)
	      .sendKeys("solanki juli")
	      .keyUp(Keys.SHIFT)
	      .build()
	      .perform();
	
	driver.findElement(By.name("confirmPassword")).click();
	action.keyDown(Keys.SHIFT)
	      .sendKeys("solanki juli")
	      .keyUp(Keys.SHIFT)
	      .build()
	      .perform();
	
}
}
