package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass17_grotechmind_drag_drop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("drag11"));
	WebElement e3=	driver.findElement(By.id("div2"));
	Actions a1= new Actions(driver);
	a1.dragAndDrop(e1, e3).perform();
	
	

	

	}

}
