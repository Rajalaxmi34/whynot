package mypkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstselenium {
	
	WebDriver driver;
	
	@Before
	
	public void lunchdriver(){
		
		//System.setProperty("webdriver.gecko.driver","D:\\newcode\\startagain\\lib\\geckodriver\\geckodriver.exe");
		
		//System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com");
	}
		
	@Test
	
	public void testcase(){
		
		driver.findElement(By.id("qsbClick")).click();
	
		driver.findElement(By.name("qp")).sendKeys("selenium");
		
		driver.findElement(By.name("ql")).sendKeys("Noida");
		
		driver.findElement(By.id("qsbFormBtn")).click();
		
	}
	
	@After
	
	public void quitbrowser(){
		 driver.quit();
	}
	
	
	
	

}
