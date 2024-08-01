package Assignment;

import java.time.Year;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverConnection.Driverconnection;

public class P004_GmailRegister {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/&dsh=S-603623913:1721731589766034&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&theme=glif&TL=ALoj5ApoWmsLN8jEng5c8TA0Des5JK42DBhOor-foLUqh97R2pnZs7OXbjw3Jopa";
		WebDriver driver = Driverconnection.getDriver(url);
		
		driver .findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div/div/div/button/span")).click();
		
		WebElement  Firstname = driver.findElement(By.name("firstName"));
		Firstname.sendKeys("parmar");
		
		WebElement Lastname = driver.findElement(By.name("lastName"));
		Lastname.sendKeys("juli");
		
		WebElement button = driver .findElement(By.xpath("//*[@id=\"vfb-7-2yDmH0d\"]/c-wiz/div/div[3]/div/div/div/div/button/span"));
		button.click();
		
		
		Thread.sleep(5000);
		
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
	    month.selectByValue("10");
	    
	    WebElement days = driver.findElement(By.id("day"));
		days.sendKeys("17");
	    
	    WebElement years = driver.findElement(By.id("year"));
	    years.sendKeys("1994");
	    
	    
	    WebElement genders = driver.findElement(By.id("gender"));
	    genders.click();
	    Select gender = new Select(genders);
	    gender.selectByVisibleText("Female");
	    
	    WebElement button2 = driver .findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div/div/div/button/span"));
		button2.click();
		
		WebElement CreateGmailAddress = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[3]/div[1]/div[2]/div[1]/div[1]"));
		CreateGmailAddress.click();
		
		Thread.sleep(3000);
		
	}

}
