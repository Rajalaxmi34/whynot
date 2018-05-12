package mypkg;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test05 {
	
	WebDriver driver;
	
	@Before
	
	public void lunchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
	}
	
	@Test
	
	public void testcase(){
		
		new Select(driver.findElement(By.id("day"))).selectByIndex(24);
		
		new Select(driver.findElement(By.id("month"))).selectByValue("7");
		
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1994");
		
		
	}
	
	@After
	
	public void quittest(){
		
		//driver.quit();
	}
	

}
