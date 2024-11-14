//Assignment2
package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass02_Google_India {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	
	//	driver.findElement(By.tagName("textarea")).sendKeys("India");
	driver.findElement(By.name("q")).sendKeys("India"+ Keys.ENTER);

	}

}
