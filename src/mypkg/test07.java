package mypkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test07 {
	
	WebDriver driver;
	
	@Before
	
	public void lunchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com");
		
	}
		
	@Test
	
	public void  testcase() throws Exception{
		
		Actions act = new Actions(driver);
		
		//act.moveToElement(driver.findElement(By.xpath("//i[@class = 'sd-icon sd-icon-user']")));
		
		act.moveToElement(driver.findElement(By.xpath("//span[@class = 'accountUserName col-xs-12 reset-padding']")));
		
		act.build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text() = 'login']")).click();
		
		//Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.id("loginIframe")));
		driver.findElement(By.id("userName")).sendKeys("8763729363");
		
	}
	
	@After
	
	public void quittest(){
		
	}
	
	
	
	

}
