package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass12_learning_tagname {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Minal%20Ingale/Desktop/learning.html");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.tagName("a"));
		e1.click();
		//WebElement e2=   driver.findElement(By.xpath("//a[.='Click to know about us']"));
		//e2.click();//both locator working
	}

}
