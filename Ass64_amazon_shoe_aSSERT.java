package Assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class  Ass64_amazon_shoe_aSSERT {
	@Test
	public void testcase1() throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
e1.sendKeys("shoes");
Thread.sleep(6000);
List<WebElement>lo=	driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
int count=lo.size();
System.out.println(count);
Assert.assertEquals(count>1, true ,"sorry tc got failed pls chk again ");

}
}