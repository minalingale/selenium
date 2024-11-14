package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass16_Amazon_language_hoverover {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.xpath("//span[@class='nav-line-2']"));
	Actions a1=new Actions(driver);//create the object of action class
	a1.moveToElement(e1).perform();
	WebElement e2=  driver.findElement(By.xpath("//a[@class='-link                                    nav-item'][4]"));
	e2.click();
	
}
}