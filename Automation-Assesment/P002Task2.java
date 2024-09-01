package Assessment;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.Driverconnection;

public class P002Task2 {
	public static void main(String[] args) {
String url = " https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";

WebDriver driver = Driverconnection.getDriver(url);
List <WebElement> SixthRowValue = driver.findElements(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tfoot/tr"));
for (WebElement S : SixthRowValue)
{
	System.out.print(S.getText() + " ");
}
System.out.println();

	}

}

