package Assessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import driverConnection.Driverconnection;

public class P002Task1 {
	public static void main(String[] args) throws InterruptedException {
		
		
		 
		
			String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html " ;
	        WebDriver driver = Driverconnection.getDriver(url);
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver ;
	        js.executeScript("window.scrollBy(0,1185)", " ");
	        
	        WebElement Structure = driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/thead/tr/th[1]"));      
	        System.out.println(Structure.getText());
	        System.out.println();
	        
	        WebElement SecondTable = driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table"));  
	        {
	    	 List<WebElement> columns = SecondTable.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody//tr[position()>=1 and position()<=5]/th[1]"));
	    	    for(WebElement Value : columns )
	    	    {
	    	        System.out.println(Value.getText() + " ");
	    	    }
	    	    System.out.println();
	        }  
		}
	}