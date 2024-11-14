package Assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass23_Google_autosuggetion_Printall {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore");
		Thread.sleep(1000);
		List<WebElement>lo=	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	int count=lo.size();
	System.out.println(count);
	Thread.sleep(5000);
	for(int i=0;i<lo.size();i++)
	{
		WebElement auto=	lo.get(i);
		String a1=auto.getText();
		System.out.println(a1);

	}
	
	
	}


	}


