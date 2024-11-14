package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass15_Amazon_book_poeof {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("searchDropdownBox"));
	Select a1=new Select(e1);
	//a1.selectByIndex(10);
	//a1.selectByValue("search-alias=stripbooks");
	a1.selectByVisibleText("Books");
	WebElement e3=driver.findElement(By.id("twotabsearchtextbox"));
	e3.sendKeys("power of mind vivekananda" +Keys.ENTER);
	
	
	
	}
}