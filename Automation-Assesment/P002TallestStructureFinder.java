package Assessment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import driverConnection.Driverconnection;

public class P002TallestStructureFinder {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html " ;
		WebDriver driver = Driverconnection.getDriver(url);
	
		  WebElement Height = driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/thead/tr/th[4]"));
	        System.out.println(Height.getText());
	        System.out.println();
	        
	        List<Integer> list = new ArrayList<Integer> ();
	        list.add(829);
	        list.add(601);
	        list.add(501);
	        list.add(492);
	        Iterator<Integer> itr = list.iterator();
	        while (itr.hasNext())
	        {
	        	System.out.println(itr.next());
	        }
	        
	        int MaxHeightValue = list.get(0);
	        for (int i = 1 ; i < list.size(); i++ )
	        {
	        	if (MaxHeightValue < list.get(i))
	        	{
	        		MaxHeightValue = list.get(i);
	        	}
	        	
	        }
	        System.out.println ("Maximum Tallest Structure Value is" + MaxHeightValue + " m " ) ;
		    Thread.sleep(4000);
		    driver.quit();
		}
		}


