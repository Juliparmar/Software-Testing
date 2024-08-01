package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverConnection.Driverconnection;

public class P002_Dropdown {
	public static void main(String[] args) throws InterruptedException		 {
		String url = "https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker";
		WebDriver driver = Driverconnection.getDriver(url);
		
		driver.findElement(By.id("DropDown DatePicker")).click();
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[2]/p/iframe"));
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);
	    
		driver.findElement(By.id("datepicker")).click();
		WebElement Year = driver.findElement(By.className("ui-datepicker-year"));
		Select year = new Select(Year);
		year.selectByVisibleText("2015");
		
		
		WebElement months = driver.findElement(By.className("ui-datepicker-month"));
		Select month = new Select(months);
		month.selectByValue("10");	
		
		List<WebElement> date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement ele : date) {
			if (ele.getText().equals("15")) {
				ele.click();
	}

}
}

	}


