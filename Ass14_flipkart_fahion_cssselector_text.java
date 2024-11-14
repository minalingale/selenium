package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ass14_flipkart_fahion_cssselector_text
{

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.in");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.xpath("//a[.='Fashion']"));
		//WebElement e1=driver.findElement(By.cssSelector("//span[.='Fashion'][3]"));
		e1.click();
	}
}