package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Driverconnection.Driverconnection;

public class OrangeHRMTest {
	static WebDriver driver = null;

	@BeforeClass
	public static void login() {
		String url = "https://www.orangehrm.com/";
		driver = Driverconnection.getDriver(url);

	}

	@Test
	public void test4() throws InterruptedException {

		WebElement Solutions = driver.findElement(By.linkText("Solutions"));
		System.out.println(Solutions);
		Actions action = new Actions(driver);
		action.moveToElement(Solutions).build().perform();
		Thread.sleep(2000);

		

		WebElement pm = driver.findElement(By.linkText("People Management"));
		System.out.println(pm);
		action.moveToElement(pm).build().perform();
		Thread.sleep(2000);

		WebElement hr = driver.findElement(By.linkText("HR Administration"));
		System.out.println(hr);
		action.moveToElement(hr).build().perform();
		hr.click();
		Thread.sleep(2000);



		WebElement Solutions2 = driver.findElement(By.linkText("Solutions"));

		action.moveToElement(Solutions2).build().perform();
		Thread.sleep(2000);

		WebElement TalentManagement = driver.findElement(By.linkText("Talent Management"));
		action.moveToElement(TalentManagement).build().perform();
		TalentManagement.click();
		Thread.sleep(2000);

		WebElement Recruitment = driver.findElement(By.linkText("Recruitment (ATS)"));
		action.moveToElement(Recruitment).build().perform();
		Recruitment.click();
		Thread.sleep(2000);

		WebElement Solutions3 = driver.findElement(By.linkText("Solutions"));
		System.out.println(Solutions);
		action.moveToElement(Solutions).build().perform();
		Thread.sleep(2000);

		WebElement Compensation = driver.findElement(By.linkText("Compensation"));
		System.out.println(Compensation);
		action.moveToElement(Compensation).build().perform();
		Thread.sleep(2000);
		
		WebElement PayrollConnector = driver.findElement(By.linkText("Payroll Connector"));
		action.moveToElement(PayrollConnector).build().perform();
		PayrollConnector.click();
		Thread.sleep(2000);
		
		WebElement Solutions4 = driver.findElement(By.linkText("Solutions"));
		System.out.println(Solutions);
		action.moveToElement(Solutions).build().perform();
		Thread.sleep(2000);


		WebElement Culture = driver.findElement(By.linkText("Culture"));
		System.out.println(Culture);
		action.moveToElement(Culture).build().perform();
		Thread.sleep(2000);

		WebElement PerformanceManagement = driver.findElement(By.linkText("Performance Management"));
		action.moveToElement(PerformanceManagement).build().perform();
		PerformanceManagement.click();
		Thread.sleep(2000);
	}

	   @Test
		public void test5() throws InterruptedException {    
		    
			 Actions action = new Actions(driver);
	        WebElement WhyOrangeHRM = driver.findElement(By.linkText("Why OrangeHRM"));
	        System.out.println(WhyOrangeHRM);
		    action.moveToElement(WhyOrangeHRM).build().perform();
		    Thread.sleep(2000);
		    
		    WebElement OurCustomers =driver.findElement(By.xpath("//div[@class='secondary secondary-menu-3']/div/div/div/ul/li[1]"));
		    System.out.println(OurCustomers);
		    action.moveToElement(OurCustomers).build().perform();
		    Thread.sleep(2000);
		    
		    WebElement CaseStudies = driver.findElement(By.linkText("Case Studies"));
		    System.out.println(CaseStudies);
		    action.moveToElement(CaseStudies).build().perform();
		    Thread.sleep(2000);
		    
		    WebElement WhyOrangeHRM1 = driver.findElement(By.linkText("Why OrangeHRM"));
	        System.out.println(WhyOrangeHRM);
		    action.moveToElement(WhyOrangeHRM).build().perform();
		    Thread.sleep(2000);
		    
		    
            WebElement Partners = driver.findElement(By.xpath("//div[@class='secondary secondary-menu-3']/div/div/div/ul/li[2]"));
            System.out.println(Partners);
            action.moveToElement(Partners).build().perform();
            Thread.sleep(2000);
            
		    
		    WebElement PartnerPrograms = driver.findElement(By.linkText("Partner Programs"));
		    System.out.println(PartnerPrograms);
		    action.moveToElement(PartnerPrograms).build().perform();
		    PartnerPrograms.click();
		    Thread.sleep(2000);
		    
		    WebElement WhyOrangeHRM2 = driver.findElement(By.linkText("Why OrangeHRM"));
	        System.out.println(WhyOrangeHRM);
		    action.moveToElement(WhyOrangeHRM).build().perform();
		    Thread.sleep(2000);
		    
		    
		    
		    WebElement Stakeholder = driver.findElement(By.xpath("//div[@class='secondary secondary-menu-3']/div/div/div/ul/li[3]"));
		    System.out.println(Stakeholder);
		    action.moveToElement(Stakeholder).build().perform();
		    Thread.sleep(2000);
		    
		    WebElement HRmanager =driver.findElement(By.linkText("HR Manager"));
		    System.out.println(HRmanager);
		    action.moveToElement(HRmanager).build().perform();
		    HRmanager.click();
		    Thread.sleep(2000);
		    
		    WebElement WhyOrangeHRM3 = driver.findElement(By.linkText("Why OrangeHRM"));
	        System.out.println(WhyOrangeHRM);
		    action.moveToElement(WhyOrangeHRM).build().perform();
		    Thread.sleep(2000);
		    
		    
		    WebElement SwitchtoOrangeHRM= driver.findElement(By.xpath("//div[@class='secondary secondary-menu-3']/div/div/div/ul/li[4]"));
		    action.moveToElement(SwitchtoOrangeHRM).build().perform();
            Thread.sleep(2000);
            
            WebElement HRForAll = driver.findElement(By.linkText("HR for All"));
            System.out.println(HRForAll);
            action.moveToElement(HRForAll).build().perform();
            Thread.sleep(2000);
            
            WebElement WhyOrangeHRM4 = driver.findElement(By.linkText("Why OrangeHRM"));
	        System.out.println(WhyOrangeHRM);
		    action.moveToElement(WhyOrangeHRM).build().perform();
		    Thread.sleep(2000);
		    
            
            WebElement FlexibleHosting = driver.findElement(By.linkText("Flexible Hosting"));
            System.out.println(FlexibleHosting);
            action.moveToElement(FlexibleHosting).build().perform();
            FlexibleHosting.click();
            Thread.sleep(2000);
            
   }
	
	   @Test
	   public void test6() throws InterruptedException {

		    Actions action = new Actions(driver);
		    WebElement Resources = driver.findElement(By.linkText("Resources"));
		    action.moveToElement(Resources).build().perform();
		    Thread.sleep(2000);
		    
		    WebElement ebooks = driver.findElement(By.linkText("eBooks"));
		    action.moveToElement(ebooks).build().perform();
		    ebooks.click();
		    Thread.sleep(2000);

		    WebElement Blog = driver.findElement(By.linkText("Blog"));
		    action.moveToElement(Blog).build().perform();
		    Blog.click();
		    Thread.sleep(2000);

		    WebElement LearninDepth = driver.findElement(By.linkText("Learn in Depth"));
		    action.moveToElement(LearninDepth).build().perform();
		    Thread.sleep(2000);
		    
		    WebElement HRsguide = driver.findElement(By.linkText("HR's Guide to Effective Career Development"));
		    action.moveToElement(HRsguide).build().perform();
		    HRsguide.click();
		    Thread.sleep(2000);
		    
		    WebElement ProductOverview = driver.findElement(By.linkText("Product Overview"));
		    action.moveToElement(ProductOverview).build().perform();
		    Thread.sleep(2000);

		    WebElement StarterOverview = driver.findElement(By.linkText("Starter Overview (Open Source)"));
		    action.moveToElement(StarterOverview).build().perform();
		    StarterOverview.click();
		    Thread.sleep(2000);
		    
		    WebElement TheHRDictionary = driver.findElement(By.linkText("The HR Dictionary"));
		    action.moveToElement(TheHRDictionary).build().perform();
		    TheHRDictionary.click();
		    Thread.sleep(2000);
		    
	   }
	   @Test
	   
	   public void test7() throws InterruptedException {
		   Actions action = new Actions(driver);
		    WebElement Company = driver.findElement(By.linkText("Company"));
		    System.out.println(Company);
		    action.moveToElement(Company).build().perform();
		    Thread.sleep(2000);
		    
		    WebElement AboutUs = driver.findElement(By.linkText("About Us"));
		    System.out.println(AboutUs);
		    action.moveToElement(AboutUs).build().perform();
		    AboutUs.click();
		    Thread.sleep(2000);
		    
		    WebElement ExecutiveProfiles = driver.findElement(By.linkText("Executive Profiles"));
		    System.out.println(ExecutiveProfiles);
		    action.moveToElement(ExecutiveProfiles).build().perform();
		    ExecutiveProfiles.click();
		    Thread.sleep(2000);

		    WebElement PressReleases = driver.findElement(By.linkText("Press Releases"));
		    System.out.println(PressReleases);
		    action.moveToElement(PressReleases).build().perform();
		    PressReleases.click();
		    Thread.sleep(2000);

            WebElement NewsArticles = driver.findElement(By.linkText("News Articles"));
            System.out.println(NewsArticles);
		    action.moveToElement(NewsArticles).build().perform();
		    NewsArticles.click();
		    Thread.sleep(2000);
		    
		    WebElement Careers = driver.findElement(By.linkText("Careers"));
		    System.out.println(Careers);
		    action.moveToElement(Careers).build().perform();
		    Careers.click();
		    Thread.sleep(2000);
		    
	   }
	   @Test
       public void test8 () throws InterruptedException {
		   
		   Actions action = new Actions(driver);
		    WebElement Pricing =driver.findElement(By.linkText("Pricing"));
		    action.moveToElement(Pricing).build().perform();
		    Pricing.click();
		    Thread.sleep(2000);
		    
		    WebElement fullname = driver.findElement(By.name("FullName"));
		    fullname.sendKeys("juli");
		    Thread.sleep(2000);
		    
		    WebElement Email = driver.findElement(By.name("Email"));
		    Email.sendKeys("solankijuli@gmail.com");
		    Thread.sleep(2000);
		    
		    WebElement Companyname = driver.findElement(By.name("CompanyName"));
		    Companyname.sendKeys("jjparmar");
		    Thread.sleep(2000);
		    
		    WebElement phn = driver.findElement(By.name("Contact"));
		    phn.sendKeys("9429543358");
		    Thread.sleep(2000);

		    WebElement NumOfEmployee =driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		    NumOfEmployee.sendKeys("100-150");
		    Thread.sleep(2000);
		    
		    WebElement Country = driver.findElement(By.id("Form_getForm_Country"));
		    Country.sendKeys("India");
		    Thread.sleep(2000);
		    
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,350)","");
		    WebElement submit = driver.findElement(By.id("Form_getForm_action_submitForm"));
		    submit.click();
		    Thread.sleep(2000);

	  }
	  @Test
        public void test9() throws InterruptedException  {
	        WebElement btn = driver.findElement(By.linkText("Book a Free Demo"));
	        btn.click();
	        Thread.sleep(2000);
	        
	        WebElement btn2 = driver.findElement(By.linkText("Contact Sales"));
	        btn2.click();
	        Thread.sleep(2000);
	        
   }
	  
}	    
