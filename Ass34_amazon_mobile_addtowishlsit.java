package Assignment_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass34_amazon_mobile_addtowishlsit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
	    e1.sendKeys("mobile"+Keys.ENTER);
	   //WebElement e3= driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height'][1]"));
		 WebElement e3= driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));

	    e3.click();
	   Thread.sleep(3000);
	   Set<String>s1=driver.getWindowHandles();
	    Iterator<String> i1= s1.iterator();
	    String parentid =i1.next();
	    String childid=i1.next();
	    driver.switchTo().window(childid);
	 //   WebElement e4=driver.findElement(By.name("submit.add-to-registry.wishlist.unrecognized"));
	    WebElement e4= driver.findElement(By.xpath("//a[.=' Add to Wish List '][1]"));
	    e4.click();
Thread.sleep(5000);
	   //e4.click();
	}

}
