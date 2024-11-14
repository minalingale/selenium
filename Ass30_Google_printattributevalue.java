package Assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass30_Google_printattributevalue {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement>e1=	driver.findElements(By.tagName("a"));
        int count=	e1.size();
        System.out.println(count);
        for(int i=0;i<count;i++)
        {
	     WebElement l1=e1.get(i);
	     String a1=l1.getAttribute("href");
	     System.out.println(a1);
        }

	}

}
