package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class P002_webbrowser1 {
	
	

	
		public static void main(String[] args) {
		String url = "https://www.instagram.com/";
	        WebDriver driver = connection.DriverConnection.getDriver(null);
	        WebElement username = driver.findElement(By.name("username"));
	        username.sendKeys("juli");
	        WebElement Password = driver.findElement(By.name("password"));
	        Password.sendKeys("juli1234");
	        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
	        driver.quit();
	   
	   
	   
	   
	   
	}
	}


