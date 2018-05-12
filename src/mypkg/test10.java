package mypkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test10 {
	
	WebDriver driver;
	
	@Before
	
	public void lunchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.naukri.com");
	}
	
	@Test
	
	public void testcase() throws Exception{
		
		driver.findElement(By.id("qsbClick")).click();
		
		driver.findElement(By.name("qp")).sendKeys("Sel");
		
		Thread.sleep(3000);
		
		try{
			String a = "//html/body/div[4]/div[3]/div[3]/div[1]/form/div[1]/div/div[1]/div[2]/ul/li[";
			int i = 1;
			String b = "]/div";

			String xpSuggestionList = a + i + b;
			
			while(driver.findElement(By.xpath(xpSuggestionList)).isDisplayed()){
				xpSuggestionList = a + i + b;
				
				String suggestionListText = driver.findElement(By.xpath(xpSuggestionList)).getText();
				System.out.println(suggestionListText);
				
				if(suggestionListText.equalsIgnoreCase("Selenium")){
					driver.findElement(By.xpath(xpSuggestionList)).click();
					break;
				}
				
				i++;
			}

		}
		catch(Exception e){
			System.out.println("All elements has been read.");
		}
		
		
		
	}
	
	@After
	
	public void quittest(){
		
		
	}
	
	
	
	

}
