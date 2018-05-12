package mypkg;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class test06 {
	
	WebDriver driver;
	
	@Before
	
	public void lunchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
	}
	
	@Test
	
	public void testcase(){
		
		driver.findElement(By.id("qsbClick")).click();
		
		driver.findElement(By.name("qp")).sendKeys("java");
		
		driver.findElement(By.name("ql")).sendKeys("Noida");
		
	    driver.findElement(By.name("ql")).sendKeys(Keys.TAB);
		
		//new Select(driver.findElement(By.xpath("//input[@class = 'sdTxt w85']"))).selectByIndex(5);
		
		for(int i = 1; i<=5; i++){
			
			driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		}
		
		
	}
	
	@After

	public void quittestcase(){
		
		//driver.quit();
	}

}
