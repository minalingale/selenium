package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass28_Google_rightclick_gmail {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	    WebElement e1=	driver.findElement(By.linkText("Gmail"));
	    Actions a1=new Actions(driver);//Actons class
	    a1.contextClick(e1).perform();
	}

}
