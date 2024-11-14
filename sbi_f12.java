package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sbi_f12 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e1.click();
		WebElement e3=	driver.findElement(By.id("username"));
		e3.sendKeys("minal143");
		WebElement e4=	driver.findElement(By.id("label2"));
		e4.sendKeys("label2");
		WebElement e5=driver.findElement(By.id("loginCaptchaValue"));
		e5.sendKeys("nvjhgf");
		WebElement e6=	driver.findElement(By.id("Button2"));
		e6.click();
		
		

	}

}
