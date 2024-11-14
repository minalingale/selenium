package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google_Search_retry 
{
	@Test
	(retryAnalyzer=Assignment_selenium.Retry_logic.class)
	public void test()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	
	//	driver.findElement(By.tagName("textarea")).sendKeys("India");
	driver.findElement(By.name("qq")).sendKeys("India"+ Keys.ENTER);

	}

}
