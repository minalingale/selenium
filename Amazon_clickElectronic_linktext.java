//assignment6
package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_clickElectronic_linktext {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com.au/?ref_=mr_referred_us_au_au");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.linkText("Electronics"));
	e1.click();
		
		
	}

}
