package Appium;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;


public class calculator {

	
		static Appiumdriver driver=null;
		public static void main(String[] args) throws InterruptedException 
		{
			try {
				opencalculator();
			} catch (MalformedURLException e) {
				System.out.println(e.getCause());
				System.out.println(e.getMessage());
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void opencalculator() throws MalformedURLException, InterruptedException
		{
			DesiredCapabilities cap =new DesiredCapabilities();
			cap.setCapability("deviceName", "Redmi Note 9 Pro max");
			cap.setCapability("udid", "44adb24c");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "12");
			cap.setCapability("appPackage", "uk.co.aifactory.chessfree");
			cap.setCapability("appActivity", "uk.co.aifactory.chessfree.ChessFreeActivity");
			cap.setCapability("automationName", "UiAutomator2");
			URL url=new URL("http://127.0.0.1:4723/wd/hub");
			
			driver=new AppiumDriver(url,cap);
			Thread.sleep(2000);
			driver.findElement(By.id("com.miui.calculator:id/btn_9_s")).click();
			// num9.click()
			Thread.sleep(1000);
			WebElement num0 = driver.findElement(By.id("com.miui.calculator:id/btn_0_s"));
			num0.click();
			Thread.sleep(1000);
			WebElement Add = driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
			Add.click();
			Thread.sleep(1000);
			WebElement nine = driver.findElement(By.id("com.miui.calculator:id/btn_9_s"));
			nine.click();
			Thread.sleep(1000);
			WebElement zero = driver.findElement(By.id("com.miui.calculator:id/btn_0_s"));
			zero.click();
			Thread.sleep(1000);
			WebElement equal = driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
			equal.click();
			Thread.sleep(1000);
	    	System.out.println("done");
			//
			String value = driver.findElement(By.id("com.miui.calculator:id/expression")).getText();
			System.out.println("My output is ....." + value);
	

			
		}
	}



