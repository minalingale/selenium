//assignmenet4
package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass04_Amazon_search_Id {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("mobile" + Keys.ENTER);
		//WebElement e3=driver.findElement(By.id("twotabsearchtextbox"));
		//e1.sendKeys(Keys.ENTER);
	}

}
