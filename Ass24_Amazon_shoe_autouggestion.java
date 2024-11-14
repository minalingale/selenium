package Assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass24_Amazon_shoe_autouggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("shoes");
	Thread.sleep(6000);
    List<WebElement>lo=	driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
    int count=lo.size();
    System.out.println(count);
    Thread.sleep(4000);
    for(int i=0;i<lo.size();i++)
    {
    	WebElement e3= lo.get(i);
    String a1=	e3.getText();
        System.out.println(a1);

	}

}
}
