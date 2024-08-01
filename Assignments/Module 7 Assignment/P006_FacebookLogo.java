package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.Driverconnection;

public class P006_FacebookLogo {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = Driverconnection.getDriver(url);
		
        WebElement iframe = driver.findElement(By.id("frame1"));
	    
	    driver.switchTo().frame(iframe);
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
		logo.click();
	}

}
