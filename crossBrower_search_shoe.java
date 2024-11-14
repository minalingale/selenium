package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrower_search_shoe 
{
	WebDriver driver;
	@Test
    @Parameters("browser")
	public void login_to_Amazon (String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome"))
    	{
    		driver=new ChromeDriver();
    	}
    	if(nameofbrowser.equals("edge"))
    	{
    		driver=new EdgeDriver();
    	}
    	if(nameofbrowser.equals("Firefox"))
    	{
    		driver=new FirefoxDriver();
    	}
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes" + Keys.ENTER);
	}

}
