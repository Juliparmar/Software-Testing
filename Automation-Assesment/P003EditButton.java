package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.Driverconnection;

public class P003EditButton {
	public static void main(String[] args) throws InterruptedException {
		String url = " https://demoqa.com/webtables";

		WebDriver driver = Driverconnection.getDriver(url);


        WebElement btn = driver.findElement(By.id("edit-record-1"));
        btn.click();
        WebElement FirstName = driver.findElement(By.id("firstName"));
        FirstName.clear();
        FirstName.sendKeys("Chandni");
        
        WebElement LastName = driver.findElement(By.id("lastName"));
        LastName.clear();
        LastName.sendKeys("solanki");
        
        WebElement Email = driver.findElement(By.id("userEmail"));
        Email.clear();
        Email.sendKeys("solanki@123gmail.com");
  
        WebElement Age = driver.findElement(By.id("age"));
        Age.clear();
        Age.sendKeys("25");
        
        WebElement Salary = driver.findElement(By.id("salary"));
        Salary.clear();
        Salary.sendKeys("20000");
        
        WebElement Department = driver.findElement(By.id("department"));
        Department.clear();
        Department.sendKeys("Bank");
        
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        
        Thread.sleep(5000);
        
        WebElement btn2 = driver.findElement(By.id("edit-record-2"));
        btn2.click();
        WebElement FirstName2 = driver.findElement(By.id("firstName"));
        FirstName2.clear();
        FirstName2.sendKeys("juli");
        
        WebElement LastName2 = driver.findElement(By.id("lastName"));
        LastName2.clear();
        LastName2.sendKeys("solanki");
        
        WebElement Email2 = driver.findElement(By.id("userEmail"));
        Email2.clear();
        Email2.sendKeys("solanki@123gmail.com");
  
        WebElement Age2 = driver.findElement(By.id("age"));
        Age2.clear();
        Age2.sendKeys("25");
        
        WebElement Salary2 = driver.findElement(By.id("salary"));
        Salary2.clear();
        Salary2.sendKeys("230000");
        
        WebElement Department2 = driver.findElement(By.id("department"));
        Department2.clear();
        Department2.sendKeys("Account");
        
        WebElement submit2 = driver.findElement(By.id("submit"));
        submit2.click();
        
        Thread.sleep(5000);
        
        
        WebElement btn3 = driver.findElement(By.id("edit-record-3"));
        btn3.click();
        WebElement FirstName3 = driver.findElement(By.id("firstName"));
        FirstName3.clear();
        FirstName3.sendKeys("tejal");
        
        WebElement LastName3 = driver.findElement(By.id("lastName"));
        LastName3.clear();
        LastName3.sendKeys("solanki");
        
        WebElement Email3 = driver.findElement(By.id("userEmail"));
        Email3.clear();
        Email3.sendKeys("solanki@123gmail.com");
  
        WebElement Age3 = driver.findElement(By.id("age"));
        Age3.clear();
        Age3.sendKeys("25");
        
        WebElement Salary3 = driver.findElement(By.id("salary"));
        Salary3.clear();
        Salary3.sendKeys("730000");
        
        WebElement Department3 = driver.findElement(By.id("department"));
        Department3.clear();
        Department3.sendKeys("IT");
        
        WebElement submit3 = driver.findElement(By.id("submit"));
        submit3.click();
        
        Thread.sleep(1000);
        
        
        
        
	}

}
