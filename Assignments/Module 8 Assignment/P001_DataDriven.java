package Assesment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Basic.ExcellReader;
import connection.DriverConnection;
import net.bytebuddy.asm.Advice.Return;

public class P001_DataDriven {

	public class DataDriven {
		
		WebDriver driver;
		@BeforeClass
		public void opebbrowser() {
			driver = DriverConnection.getDriver("https://www.facebook.com/");
			
			
		}
		@Test(dataProvider ="dp")
		public void logintest(String email,String pass) throws InterruptedException {
			System.out.println(email+""+pass);
			WebElement username = driver.findElement(By.id("email"));
			username.clear();
			username.sendKeys(email);
			WebElement password = driver.findElement(By.id("pass"));
			password.clear();
			password.sendKeys(pass);
			Thread.sleep(3000);
		}

		@DataProvider(name="dp")
		public static Object[][] data(){
			ExcellReader ex = new ExcellReader("C:\\Users\\Admin\\Desktop","Sheet1");
			int row = ex.rowCount();
			System.out.println("row :"+row);
			int col = ex.colCount();
			System.out.println("col :"+col);
			
			Object obj [][] = new Object[row-1][col];
			
			for (int i =1;i < row; i++) {
				for (int j = 0; j < col; j++) {
				String data = ex.getData(i, j);
				System.out.println(data+":"+i+":"+j);
				obj[i-1][j] =data;
			}
		}
		
		return obj;
	}
	}


}
