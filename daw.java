package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class daw {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=5g+mobile&crid=14IDMW0NHND2E&sprefix=5g+mobile%2Caps%2C243&ref=nb_sb_noss_2");
		driver.manage().window().maximize();
		
	WebElement e1=	driver.findElement(By.xpath("//span[@class='a-price-whole'][5]"));
	e1.click();
		
	}

}
