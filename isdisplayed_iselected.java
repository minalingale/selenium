package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed_iselected {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Minal%20Ingale/Desktop/learning.html");
		driver.manage().window().maximize();
		WebElement boy=	driver.findElement(By.id("123"));
		boolean b1=boy.isDisplayed();
		System.out.println(b1);
		boolean b3=boy.isSelected();
		System.out.println(b3);
		if(b3==true)
		{
			System.out.println("it is already selected");

		}
		else
		{
			boy.click();
		}

	}

}