package mypkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test08 {
	
	WebDriver driver;
	
	@Before
	
	public void lunchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.indianrail.gov.in/enquiry/SCHEDULE/TrainSchedule.html?locale=en");
		
	}
	@Test
	
	public void testcase() throws Exception{
		
		driver.findElement(By.id("modal1")).click();
		
		Thread.sleep(1000);
		
		/*Alert alrt = driver.switchTo().alert();
		
		String alerttext = alrt.getText();
		
		System.out.println(alerttext);
		
		alrt.dismiss();*/
		
	}
	
	@After
	
	public void closeBrowser(){
		
		driver.quit();
		
	}
	

}
