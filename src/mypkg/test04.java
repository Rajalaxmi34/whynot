package mypkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test04 {
	
	WebDriver driver;
	
	@Before
	
	public void lunchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
	}
		
	@Test
	
	public void mouseover() throws Exception{
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//div[text()='More']")));
		act.build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title ='MCA']")).click();
		
		
	}
	
	@After
	
	public void quittest(){
		
		driver.quit();
		

}
}
