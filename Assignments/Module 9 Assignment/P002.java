package Appium;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class Assignment2 {

		   public static void main(String[] args) throws Exception {
		        // Set up desired capabilities
		        Desired capabilities = new DesiredCapabilities();
		        capabilities.setCapability("app", "C:\\Users\\Admin\\Downloads\\your-app.apk");
		        capabilities.setCapability("deviceName", "Redmi Note 9 Pro Max");
		        capabilities.setCapability("platformName", "Android");
		        capabilities.setCapability("platformVersion", "12");
		        capabilities.setCapability("udid", "44adb24c");
		        URL url=new URL("http://127.0.0.1:4723/wd/hub");

		        // Start Appium session
//		        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		       AppiumDriver driver = new AppiumDriver(url, capabilities);
		        // Add your test steps here

		        // Quit the driver after testing
		        driver.quit();
		    }

	}


