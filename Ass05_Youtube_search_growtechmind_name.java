//assignment5
package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass05_Youtube_search_growtechmind_name {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
WebElement e1=		driver.findElement(By.name("search_query"));
e1.sendKeys("growtechminds");
e1.sendKeys(Keys.ENTER);
//WebElement e3=		driver.findElement(By.name("search_query"));
//e3.sendKeys(Keys.ENTER);

}
}