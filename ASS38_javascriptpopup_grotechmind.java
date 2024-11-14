package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ASS38_javascriptpopup_grotechmind {

	public static void main(String[] args) throws InterruptedException 
	{
		
ChromeDriver driver=new ChromeDriver();
driver.get("https://grotechminds.com/registration/");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.id("fname"));
e1.sendKeys("Minal");
WebElement e2=driver.findElement(By.id("lname"));
e2.sendKeys("Ingale");
WebElement e3=driver.findElement(By.id("email"));
e3.sendKeys("minaljangale1992@gmail.com");
WebElement e4=driver.findElement(By.id("password"));
e4.sendKeys("minal67");
WebElement e5=driver.findElement(By.id("Female"));
e5.click();
WebElement e6=	driver.findElement(By.id("Skills"));
Select a1=new Select(e6);
a1.selectByIndex(1);
WebElement e7=	driver.findElement(By.id("Country"));
Select a3=new Select(e7);
a3.selectByIndex(4);
WebElement e8=	driver.findElement(By.id("Present-Address"));
e8.sendKeys("Pune");
WebElement e9=driver.findElement(By.id("Permanent-Address"));
e9.sendKeys("Faizpur");
WebElement e10=	driver.findElement(By.id("Pincode"));
e10.sendKeys("400089");
WebElement e11=	driver.findElement(By.id("Relegion"));
Select a2=new Select(e11);
a2.selectByIndex(7);
WebElement e12=driver.findElement(By.id("relocate"));
e12.click();
WebElement e13=	driver.findElement(By.id("file"));
e13.sendKeys("C:\\Users\\Minal Ingale\\Documents\\arrays.java");
WebElement e14=driver.findElement(By.name("Submit"));
e14.click();
Thread.sleep(4000);
driver.switchTo().alert().accept();


}

}