package FirstMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class aaa  {
	
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","E:\\java selenium all\\gecko\\geckodriver.exe");
	    driver = new FirefoxDriver();
		driver.get("http://www.google.ca");
		
}
	@Test(priority=1,groups="Title")                      // groups is the keyword to make group of test cases -- here is Title and Click are Groups
	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void teardown()  {
		
		System.out.println("done");
		driver.quit();
		System.out.println("All done  All");
	}

}
