package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ass53_Dataprovider_MTC_MIP {

	@Test(dataProvider="set1")
	public void search(String input)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	    WebElement e1=	driver.findElement(By.name("q"));
		e1.sendKeys(input+ Keys.ENTER);
	}
	
	@DataProvider(name="set1")
	public Object[][] method()
	{
		return new Object[][] {{"India"},{"Srilanka"},{"Bangladesh"}};
		
	}
	@DataProvider(name="set2")
	public Object[][] method1()
	{
		return new Object[][] {{"Modi"},{"SRK"},{"Ratan TATA"}};
		
	}
	

	}


