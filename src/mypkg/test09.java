package mypkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test09 {
	
	WebDriver driver;
	
	@Before
	
	public void lunchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.recruit.naukri.com/");
		
		driver.navigate().back();
		
		//driver.navigate().to("http://www.google.com");
		
		//driver.navigate().forward();
		
		driver.navigate().refresh();
		
	}
	
	@Test
	
	public void testcase(){
		
	}
	
	@After
	
	public void quittest(){
		
	}
	


}
