package mypkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test02 {
	
	WebDriver driver;
	
	@Before
	
	public void lunchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.amazon.in/");	
		
	}
	
	@Test
	
	public void testcase() throws Exception{
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Shop by']")));
		
		act.build().perform();
		Thread.sleep(2000);
		
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Amazon Prime Video']")));
		
		act.build().perform();
		Thread.sleep(2000);
        
	   driver.findElement(By.xpath("//span[text()='All Videos']")).click();
		
	}
	
	@After
	
	public void quittest(){
		
     //driver.quit();
	
	}

}
