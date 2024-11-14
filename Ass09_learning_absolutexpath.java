package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass09_learning_absolutexpath {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Minal%20Ingale/Desktop/learning.html");
		driver.manage().window().maximize();
		//WebElement un=	driver.findElement(By.xpath("(/html/body/input)[1]"));
		WebElement un=driver.findElement(By.xpath("(//input)[1]"));//relative xpath

		un.sendKeys("minal");
		WebElement hint=   driver.findElement(By.xpath("(/html/body/input)[2]"));
	    hint.sendKeys("ved");
	    WebElement pwd=   driver.findElement(By.xpath("(/html/body/input)[3]"));
	    pwd.sendKeys("minal11");
	    //WebElement ufname=    driver.findElement(By.xpath("(/html/body/form[1]/input)[1]"));
	   WebElement ufname= driver.findElement(By.xpath("//input[@name='fname']"));
	    ufname.sendKeys("minal767");
	    WebElement boy=    driver.findElement(By.xpath("(/html/body/form[2]/input)[1]"));
	    boy.click();
	    WebElement gender=    driver.findElement(By.xpath("(/html/body/input)[5]"));
	    gender.click();
	    WebElement reallocation=    driver.findElement(By.xpath("(/html/body/input)[6]"));
	    reallocation.click();
	    
	}

}
