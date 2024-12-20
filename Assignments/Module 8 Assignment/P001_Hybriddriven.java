package Assesment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Basic.ExcellReader;
import Connection.DriverConnection;
import Guru99.ExcelReader;

public class P001_Hybriddriven {

	public class Hybriddriven {
		WebDriver driver;
		 @BeforeClass
		 
		 public void openBrowser() {
			 driver = connection.DriverConnection.getDriver("https://www.demo.guru99.com/V4/");	 
		 }
		 @Test
		 public void Logintest(String UserID , String Password) {
		  System.out.println("UserId");
			WebElement Userid = driver.findElement(By.name("uid"));
			Userid.sendKeys("solankijuli");
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("solanki123"); 
		 
		 }
		 @DataProvider(name="dp")
		 public static Object[][] data() {
			 ExcellReader ex=new ExcellReader("C:\\Users\\ONE STEP IT SOLUTION\\OneDrive\\Documents\\Guru99.xlsx","login");
			 int row = ex.rowCount();
			 System.out.println("row : "+row);
			 int column = ex.colCount();
			 System.out.println("column :"+column);
			 
			 Object obj[][]= new Object [row - 1][column];
			 for (int i =1 ;i<row; i++) {
				 for (int j=0; j<column;j++) {
					 String data=ex.getData(i,j);
						System.out.println(data+" : "+i+" : "+j);
						obj[i -1][j]=data;
						 
				 }
			 }
			    return obj;
		 }
		 
		 
		}



}
