package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ass19_Amazon_AcctnLit_HOverover {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	     WebElement e1=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	     Actions a1=new Actions(driver);
	     a1.moveToElement(e1).perform();
	     WebElement e3=driver.findElement(By.linkText("Sign in"));
	     e3.click();
	     
	}

}
