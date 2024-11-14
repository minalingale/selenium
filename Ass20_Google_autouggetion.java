package Assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass20_Google_autouggetion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore");
		Thread.sleep(1000);
		List<WebElement>lo=	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		//List<WebElement>lo=	driver.findElements(By.xpath("//div[@class='aajZCb']/div/div/div/ul/li"));//both xpath working

	int count=lo.size();
	System.out.println(count);
	Thread.sleep(5000);
	lo.get(3).click();
	
}
}