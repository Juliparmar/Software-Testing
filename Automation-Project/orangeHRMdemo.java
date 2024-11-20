package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Driverconnection.Driverconnection;

public class orangeHRMdemo {
	
		static WebDriver driver = null;
		
		@BeforeTest
		public static void login() {
			String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			driver = Driverconnection.getDriver(url);
		}
		@Test
		public void Test1() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement username = driver.findElement(By.name("username"));
			username.sendKeys("Admin");
			System.out.println(username);
			Thread.sleep(2000);
			
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("admin123");
			System.out.println(password);
			Thread.sleep(2000);
			
			WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			btn1.click();
			Thread.sleep(2000);
			
			
		}
		@Test
		public void Test2() throws InterruptedException {
			WebElement Admin = driver.findElement(By.linkText("Admin"));
			Admin.click();
			System.out.println(Admin);
			Thread.sleep(2000);
			
			WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
			username.sendKeys("juli");
			System.out.println(username);
			Thread.sleep(2000);
			
			WebElement select = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
			select.click();
			select.sendKeys("Admin");
			System.out.println(select);
			Thread.sleep(2000);
			
//			WebElement userRole = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/comment()"));
//		    Select Admin1 = new Select(userRole);
//			userRole.sendKeys("Admin1");	
//			Thread.sleep(2000);
			
			WebElement EmployeeName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input"));
			EmployeeName.sendKeys("aaaaa");
			System.out.println(EmployeeName);
			Thread.sleep(2000);
			
			WebElement status = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"));
			status.click();
			status.sendKeys("Enabled");
			System.out.println(status);
			Thread.sleep(2000);
			
			WebElement Add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
			Add.click();
			System.out.println();
			Thread.sleep(2000);
			
			
		}
	   @Test
		public void Test3() throws InterruptedException {
			WebElement userRole = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
			userRole.click();
			userRole.sendKeys("ESS");
			System.out.println(userRole);
			Thread.sleep(2000);
			
			WebElement EmployeeName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
			EmployeeName.sendKeys("joy smith");
			System.out.println();
			Thread.sleep(2000);
			
			WebElement status = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
			status.click();
			status.sendKeys("Enabled");
			System.out.println();
			Thread.sleep(2000);
			
			WebElement userName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
			userName.sendKeys("joy smith");
			System.out.println(userName);
			Thread.sleep(2000);
			
			WebElement Password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
			Password.sendKeys("abcde12345");
			System.out.println();
			Thread.sleep(2000);
			
			WebElement confirmPassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));
			confirmPassword.sendKeys("abcde12345");
			System.out.println();
			Thread.sleep(2000);
			
			WebElement button = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
			button.click();
			System.out.println();
			Thread.sleep(2000);
	   }
			
			
		@Test
	   public void test4 () throws InterruptedException {
		   JavascriptExecutor js = (JavascriptExecutor)driver;

			
			js.executeScript("window.scrollBy(0,350)","");
		
			
			WebElement delete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[1]"));
			delete.click();
			Thread.sleep(2000);
			
	        WebElement btn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
	        btn.click();
	        Thread.sleep(2000);
	   }
		@Test
		public void test5() throws InterruptedException {
			WebElement job = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
			job.click();
			Thread.sleep(2000);
			
			WebElement jobTitles = driver.findElement(By.linkText("Job Titles"));
			jobTitles.click();
			Thread.sleep(2000);
			
			WebElement Edit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[4]/div/button[2]/i"));
			Edit.click();
			Thread.sleep(2000);
			
			WebElement jobTitle = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
			jobTitle.clear();
			jobTitle.sendKeys("Account");
			Thread.sleep(2000);
			
			WebElement jobDescription =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea"));
			jobDescription.sendKeys("I am Accountant");
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,350)","");
			
			WebElement Note = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea"));
			Note.sendKeys("Account is very easy ");
			Thread.sleep(2000);
			
			WebElement btn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]"));
			btn.click();
			Thread.sleep(2000);
			
			WebElement delete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[4]/div/button[1]"));
			delete.click();
			Thread.sleep(2000);
			
			WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
			btn2.click();
			Thread.sleep(2000);
			
			
		}
		@Test
		public void test6() throws InterruptedException {
			WebElement job = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
			job.click();
			Thread.sleep(2000);
			
			WebElement payGrades =driver.findElement(By.linkText("Pay Grades"));
			payGrades.click();
			Thread.sleep(2000);
			
			WebElement delete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[4]/div/button[1]/i"));
			delete.click();
			Thread.sleep(2000);
			
			WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
			btn2.click();
			Thread.sleep(2000);
			
			WebElement Edit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[4]/div/button[2]/i"));
			Edit.click();
			Thread.sleep(2000);
			
			WebElement Name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div/form/div[1]/div/div/div/div[2]/input"));
			Name.clear();
			Name.sendKeys("Grade10");
			Thread.sleep(2000);
			
			WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div/form/div[2]/button[2]"));
			btn3.click();
			Thread.sleep(2000);
		}
		@Test
		public void test7() throws InterruptedException {
			
			WebElement job = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
			job.click();
			Thread.sleep(2000);
			
			WebElement Employment =driver.findElement(By.linkText("Employment Status"));
			Employment.click();
			Thread.sleep(2000);
			
			WebElement delete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[1]"));
			delete.click();
			Thread.sleep(2000);
			
			WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
			btn2.click();
			Thread.sleep(2000);
			
			WebElement Edit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[2]/i"));
			Edit.click();
			Thread.sleep(2000);
			
			WebElement Name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
			Name.clear();
			Name.sendKeys("juli");
			Thread.sleep(2000);
			
			WebElement btn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			btn.click();
			Thread.sleep(2000);
			
		}
		@Test
		public void test8() throws InterruptedException {
			WebElement job = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
			job.click();
			Thread.sleep(2000);
			
			WebElement jobCategories = driver.findElement(By.linkText("Job Categories"));
			jobCategories.click();
			Thread.sleep(2000);
			
			WebElement Edit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[2]"));
			Edit.click();
			Thread.sleep(2000);
			
			WebElement Name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
			Name.clear();
			Name.sendKeys("workers");
			Thread.sleep(2000);
			
			WebElement btn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			btn.click();
			Thread.sleep(2000);
			
			WebElement delete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[1]"));
			delete.click();
			Thread.sleep(2000);
			
			WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
			btn2.click();
			Thread.sleep(2000);
		}
		@Test
		public void test9() throws InterruptedException {
			WebElement job = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
			job.click();
			Thread.sleep(2000);
			
			WebElement workshift =driver.findElement(By.linkText("Work Shifts"));
			workshift.click();
			Thread.sleep(2000);
			
			WebElement Add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
			Add.click();
			Thread.sleep(2000);
			
			WebElement shiftName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input"));
			shiftName.sendKeys("Dayshift");
			Thread.sleep(2000);
			
			
			WebElement Assigned = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/div/div[1]/input"));
			Assigned.sendKeys("juli");
			Thread.sleep(2000);
			
			WebElement btn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]"));
			btn.click();
			Thread.sleep(2000);
			
			WebElement Edit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div/div[6]/div/button[2]/i"));
			Edit.click();
			Thread.sleep(2000);
			
			WebElement shiftName1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input"));
			shiftName1.clear();
			shiftName1.sendKeys("Day");
			Thread.sleep(2000);
			
			WebElement ass =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/div/div[1]/input"));
			ass.sendKeys("juli");
			Thread.sleep(2000);
			
			WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]"));
			btn1.click();
			Thread.sleep(2000);
			
			WebElement delete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div/div[6]/div/button[1]/i"));
			delete.click();
			Thread.sleep(2000);
			WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
			btn2.click();
			Thread.sleep(2000);
		}
		@Test
		public void test10() throws InterruptedException {
			WebElement org = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span"));
			org.click();
			Thread.sleep(2000);
			
			WebElement general = driver.findElement(By.linkText("General Information"));
			general.click();
			Thread.sleep(2000);
			
		}
		@Test
		public void test11() throws InterruptedException {
			WebElement org = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span"));
			org.click();
			Thread.sleep(2000);
			
			WebElement location = driver.findElement(By.linkText("Locations"));
			location.click();
			Thread.sleep(2000);
			
			WebElement Name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
			Name.sendKeys("juli");
			Thread.sleep(2000);
			
		}
		@Test
		public void test12() throws InterruptedException {
			WebElement org = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span"));
			org.click();
			Thread.sleep(2000);
			
			WebElement structure = driver.findElement(By.linkText("Structure"));
			structure.click();
			System.out.println();
			Thread.sleep(2000);
			
			WebElement Engineering = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/ul/li/ul/li[2]/div[1]/span/button/i"));
			Engineering.click();
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
				
			js.executeScript("window.scrollBy(0,350)","");
				
			
			WebElement sales = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/ul/li/ul/li[3]/div[1]/span/button/i"));
			sales.click();
			Thread.sleep(2000);
			
		
			
			js.executeScript("window.scrollBy(0,350)","");
			
			
			WebElement client = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/ul/li/ul/li[4]/div[1]/span/button/i"));
			client.click();
			Thread.sleep(2000);
			
		}
		@Test
		public void test13() throws InterruptedException {
			WebElement Qualification = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span"));
			Qualification.click();
			Thread.sleep(2000);
			
			WebElement skills = driver.findElement(By.xpath("Skills"));
			skills.click();
			Thread.sleep(2000);
			
			WebElement Add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button/i"));
			Add.click();
			Thread.sleep(2000);
			
			WebElement Name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
			Name.sendKeys("java");
			Thread.sleep(2000);
			
			WebElement description = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea"));
			description.sendKeys("core java");
			Thread.sleep(2000);
			
			WebElement btn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
			btn.click();
			Thread.sleep(2000);
		
			WebElement Edit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[4]/div/button[2]/i"));
			Edit.click();
			Thread.sleep(2000);
		
			WebElement Name1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
		    Name1.clear();
			Name1.sendKeys("juli");
			Thread.sleep(2000);
			
			WebElement des = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea"));
			des.clear();
			des.sendKeys("salesmenship");
			Thread.sleep(2000);
			
			WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
			btn1.click();
			Thread.sleep(2000);
			
			WebElement delete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div/div[4]/div/button[1]"));
			delete.click();
			Thread.sleep(2000);
			WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
			btn2.click();
			Thread.sleep(2000);
		}
		@Test
		public void test14() throws InterruptedException {
			WebElement Qualification = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span"));
			Qualification.click();
			Thread.sleep(2000);
			
			WebElement Education = driver.findElement(By.linkText("Education"));
			Education.click();
			Thread.sleep(2000);
			
			WebElement Add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
			Add.click();
			Thread.sleep(2000);
			
			WebElement level = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
			level.sendKeys("softwareTesting");
			Thread.sleep(2000);
			
			WebElement save = driver.findElement( By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			save.click();
			Thread.sleep(2000);
			
			WebElement Edit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[2]/i"));
			Edit.click();
			Thread.sleep(2000);
			
			WebElement level1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
			level1.sendKeys("B.com");
			Thread.sleep(2000);
			
			WebElement save1 = driver.findElement( By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			save1.click();
			Thread.sleep(2000);
			
			WebElement delete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[3]/div/button[1]/i"));
			delete.click();
			Thread.sleep(2000);
			WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
			btn2.click();
			Thread.sleep(2000);
			
		}
		@Test
		public void test15() throws InterruptedException {
			WebElement Qualification = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span"));
			Qualification.click();
			Thread.sleep(2000);
			
			WebElement Licenses = driver.findElement(By.linkText("Licenses"));
			Licenses.click();
			Thread.sleep(2000);
			
			WebElement Add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
			Add.click();
			Thread.sleep(2000);
			
			WebElement Name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
			Name.sendKeys("juli");
			Thread.sleep(2000);
			
			WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			save.click();
			Thread.sleep(2000);
			
			WebElement Edit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div/div[3]/div/button[2]/i"));
			Edit.click();
			Thread.sleep(2000);
			
			WebElement Name1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
			Name1.sendKeys("Manager");
			Thread.sleep(2000);
			
			WebElement save1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			save1.click();
			Thread.sleep(2000);
			
			WebElement delete =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[3]/div/button[1]"));
			delete.click();
			Thread.sleep(2000);
			WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
			btn2.click();
			Thread.sleep(2000);

		}
		@Test
		public void test16() throws InterruptedException {
			WebElement Qualification = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span"));
			Qualification.click();
			Thread.sleep(2000);
			
			WebElement Languages = driver.findElement(By.linkText("Languages"));
			Languages.click();
			Thread.sleep(2000);
			
			WebElement Add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
			Add.click();
			Thread.sleep(2000);
			
			WebElement Name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
			Name.sendKeys("juli");
			Thread.sleep(2000);
			
			WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			save.click();
			Thread.sleep(2000);
			
			WebElement Edit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[2]/i"));
			Edit.click();
			Thread.sleep(2000);
			
			WebElement Name1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
			Name1.sendKeys("Design");
			Thread.sleep(2000);
			
			WebElement save1 =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			save1.click();
			Thread.sleep(2000);
			
			WebElement delete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[3]/div/button[1]/i"));
			delete.click();
			Thread.sleep(2000);
			WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
			btn2.click();
			Thread.sleep(2000);
		
		}
        @Test
		public void test17() throws InterruptedException {
        	WebElement Qualification = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span"));
			Qualification.click();
			Thread.sleep(2000);
			
			WebElement Memberships = driver.findElement(By.linkText("Memberships"));
			Memberships.click();
			Thread.sleep(2000);
			
			WebElement Add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
			Add.click();
			Thread.sleep(2000);
			
			WebElement Name =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
			Name.sendKeys("solanki");
			Thread.sleep(2000);
			
			WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			save.click();
			Thread.sleep(2000);
			
			WebElement Edit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[2]"));
			Edit.click();
		    Thread.sleep(2000);
		    
		    WebElement Name1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
		    Name1.sendKeys("BCCA");
		    Thread.sleep(2000);
		    
		    WebElement save1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
		    save1.click();
		    Thread.sleep(2000);
		    
		    WebElement delete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[3]/div/button[1]/i"));
		    delete.click();
		    Thread.sleep(2000);
		    WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
			btn2.click();
			Thread.sleep(2000);
		}
		@Test	
        public void test18() throws InterruptedException {
        	WebElement Nationalities = driver.findElement(By.linkText("Nationalities"));
        	Nationalities.click();
        	Thread.sleep(2000);
        
        	WebElement Add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
        	Add.click();
        	Thread.sleep(2000);
        	
        	WebElement Name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
        	Name.sendKeys("Indian");
        	Thread.sleep(2000);
        	
        	WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
        	save.click();
        	Thread.sleep(2000);
        	
        	WebElement Edit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[2]/i"));
        	Edit.click();
        	Thread.sleep(2000);
        	
        	WebElement Name1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
        	Name1.sendKeys("Africa");
        	Thread.sleep(2000);
        	
        	WebElement save1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
        	save1.click();
        	Thread.sleep(2000);
        	
        	WebElement delete = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div[3]/div/button[1]/i"));
        	delete.click();
        	Thread.sleep(2000);
        	   WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
   			btn2.click();
   			Thread.sleep(2000);
		}
		@Test
		public void test19() throws InterruptedException {
			WebElement CorporateBranding = driver.findElement(By.linkText("Corporate Branding"));
			CorporateBranding.click();
			Thread.sleep(2000);
			
			WebElement Browse = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div/div[2]/div/div[1]"));
			
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
		
			js.executeScript("arguments[0].scrollIntoView();",Browse);
			
			Thread.sleep(1000);
			Browse.sendKeys("C:\\Users\\Admin\\Downloads\\WhatsApp Image 2024-11-12 at 6.04.33 PM");
			
			Thread.sleep(2000);
			
            WebElement Browse1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div[1]"));
			
			Thread.sleep(2000);
			
			
			Browse.sendKeys("C:\\Users\\Admin\\Downloads\\WhatsApp Image 2024-11-12 at 6.30.25 PM");
			
			Thread.sleep(2000);
			
           WebElement Browse2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div/div[2]/div/div[1]"));
			
			Thread.sleep(2000);
			
			js.executeScript("arguments[0].scrollIntoView();",Browse);
			Browse.sendKeys("C:\\Users\\Admin\\Downloads\\WhatsApp Image 2024-11-12 at 7.10.35 PM");
			
			Thread.sleep(2000);
			
			WebElement publish = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/button[3]"));
			publish.click();
			
			Thread.sleep(2000);
			
		}
		@Test
		public void test20 () throws InterruptedException {
			WebElement more = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[7]/span"));
			more.click();
			
			WebElement Configuration = driver.findElement(By.linkText("Configuration "));
			Configuration.click();
			
			WebElement EmailConfiguration = driver.findElement(By.linkText("Email Configuration"));
			EmailConfiguration.click();
			
			WebElement mailSentAs = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/input"));
			mailSentAs.clear();
			mailSentAs.sendKeys("juli@mail.com");
			
			Thread.sleep(2000);
			
			WebElement btn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]"));
			btn.click();
			
			
		}
		@Test
		public void test21() throws InterruptedException  {
			WebElement more = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[7]/span"));
			more.click();
			
			WebElement Configuration = driver.findElement(By.linkText("Configuration "));
			Configuration.click();
			
			WebElement EmailSub = driver.findElement(By.linkText("Email Subscriptions"));
			EmailSub.click();
			
			WebElement Action = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button"));
			Action.click();
			
			WebElement Add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
			Add.click();
			
			WebElement Name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div/div/form/div[1]/div/div[2]/input"));
			Name.sendKeys("julie");
			
			Thread.sleep(2000);
			
			WebElement Email = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div/div/form/div[2]/div/div[2]/input"));
			Email.sendKeys("solamki@mail.com");
			
			Thread.sleep(2000);
			
			WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div/div/form/div[3]/button[2]"));
			save.click();
		}
		@Test
		public void test22() throws InterruptedException {
			WebElement more = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[7]/span"));
			more.click();
			
			WebElement Configuration = driver.findElement(By.linkText("Configuration "));
			Configuration.click();
			
			WebElement Localization = driver.findElement(By.linkText("Localization"));
			Localization.click();
			Thread.sleep(2000);
			
			WebElement language = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/div[2]/i"));
			WebElement Date = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[2]/i"));
			
			WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button"));
			save.click();
			
		}
		@Test
		public void test23() {
			WebElement more = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[7]/span"));
			more.click();
			
			WebElement Configuration = driver.findElement(By.linkText("Configuration "));
			Configuration.click();
			
			WebElement Modules = driver.findElement(By.linkText("Modules"));
			Modules.click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,350)","");
			
			WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button"));
			save.click();
		}
	    @Test	
		public void test24() {
			WebElement more = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[7]/span"));
			more.click();
			
			WebElement Configuration = driver.findElement(By.linkText("Configuration "));
			Configuration.click();
			
			WebElement SocialMediaAuthentication = driver.findElement(By.linkText("Social Media Authentication"));
			SocialMediaAuthentication.click();
			
			WebElement Add = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
			Add.click();
			
			WebElement Name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/input"));
			Name.sendKeys("chandni");
			
			WebElement pro = driver.findElement( By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/input"));
			pro.sendKeys("https://careercenter.tops-int.com/");
			
			WebElement clientId = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/input"));
			clientId.sendKeys("solankichandni@123");
			
			WebElement clientSecert = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
			clientSecert.sendKeys("solankichandni");
			
			WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
			save.click();
		}
		@Test
		public void test25() {
			WebElement more = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[7]/span"));
			more.click();
			
			WebElement Configuration = driver.findElement(By.linkText("Configuration "));
			Configuration.click();
			
			 
		}
			
		
		
			
		
        	
		
		
			
		
			
			
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
			
		
	   
}
	


