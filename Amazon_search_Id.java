//assignmenet4
package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_search_Id {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("mobile");
		WebElement e3=driver.findElement(By.id("twotabsearchtextbox"));
		e3.sendKeys(Keys.ENTER);
	}

}
