package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed_isenabled {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Minal%20Ingale/Desktop/learning.html");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("121"));//fname is disabled
		boolean b1=e1.isDisplayed();//particular component is avavilable  on the particular  page 
		System.out.println(b1);
		boolean b3=e1.isEnabled();//particiuar componenet is enabled or not
		System.out.println(b3);
		if(b1&&b3)
		{
           e1.sendKeys("minal11");
		}
		else
		{
			System.out.println("can't perform");
		}

	}



	}


